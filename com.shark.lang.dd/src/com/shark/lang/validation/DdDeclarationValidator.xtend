package com.shark.lang.validation

import com.google.inject.Inject
import com.shark.lang.dd.AddExpression
import com.shark.lang.dd.AddExpressionElt
import com.shark.lang.dd.AndExpression
import com.shark.lang.dd.AndExpressionElt
import com.shark.lang.dd.ArraySize
import com.shark.lang.dd.Attribute
import com.shark.lang.dd.AttributeSize
import com.shark.lang.dd.BinaryExpression
import com.shark.lang.dd.BinaryOperator
import com.shark.lang.dd.BoolValue
import com.shark.lang.dd.CatExpression
import com.shark.lang.dd.CatExpressionElt
import com.shark.lang.dd.CheckExpression
import com.shark.lang.dd.ChrValue
import com.shark.lang.dd.Constant
import com.shark.lang.dd.CstValue
import com.shark.lang.dd.DataType
import com.shark.lang.dd.DdPackage
import com.shark.lang.dd.DecValue
import com.shark.lang.dd.IdentifierExpression
import com.shark.lang.dd.IntValue
import com.shark.lang.dd.ListExpression
import com.shark.lang.dd.ListExpressionElt
import com.shark.lang.dd.MultExpression
import com.shark.lang.dd.MultExpressionElt
import com.shark.lang.dd.OrExpression
import com.shark.lang.dd.OrExpressionElt
import com.shark.lang.dd.SharkExpression
import com.shark.lang.dd.StrValue
import com.shark.lang.dd.UnaryExpression
import com.shark.lang.dd.UnaryOperator
import com.shark.lang.dd.UnsetValue
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.AbstractDeclarativeValidator
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar

/**
 * The class focuses on validating the declaration and initialization to default value of
 * constants and attributes in a dd file. 
 * It does so by also validating fully the expressions used to init the declarations
 */
class DdDeclarationValidator extends AbstractDeclarativeValidator {

// error messages: dev tool only available in english for now
	static val DEC_PRECISION_MANDATORY = "Dec types have a size and precision (n,p) and precision is not zero, or you should use an INT"
	static val ERR_STR_INT_MAX_MANDATORY = "A size is required for these data types to indicate at least max size or if possible min and max"
	static val ERR_INVALID_DATE_ARRAY_INIT = "Invalid date array init: it should be a list of simple date strings"
	static val ERR_INVALID_TIME_ARRAY_INIT = "Invalid Time Format: it should be HHMNSS"
	static val ERR_INVALID_STAMP_ARRAY_INIT = "Invalid Timestamp Array Init: it should be a list of simple Timestamp strings"
	static val ERR_DATE_BAD_FORMAT = "Invalid Date Format: it should be YYYYMMDD"
	static val ERR_TIME_BAD_FORMAT = "Invalid Time Format: it should be HHMNSS"
	static val ERR_STAMP_BAD_FORMAT = "Invalid Timestamp Format: it should be YYYYMMDD.HHMMSS.ssss"
	static val ERR_MSG_ADD = "Type Mismatch: all the members of the addition should be of numeric type"
	static val ERR_MSG_MULT = "Type Mismatch: all the members of the multiplication should be of numeric type"
	static val ERR_MSG_AND = "Type Mismatch: all the members of the logical And expression should be of boolean type"
	static val ERR_MSG_OR = "Type Mismatch: all the members of the logical Or expression should be of boolean type"
	static val ERR_MSG_CAT = "Type Mismatch: all the members of the concat expression should be of string type"
	static val ERR_BITS_NOT_ALLOWED = "Bits types are not allowed in expressions"
	static val ERR_LIST_NOT_ALLOWED = "Incorrect expression: list can only be used in a binary expression as the right operand"
	static val ERR_MSG_BITS = "Invalid Bits Format: it should be only 0 and 1"
	static val ERR_EXPRESSION_LENGTH_INCORRECT = "Expression length is incompatible with the declaration length, it is "
	static val ERR_STXT_SYNTAX = "Type Mismatch: substring operator requires string on the left and integer list on the right"

	@Inject
	DdExpressionHelper exprHelper;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

// check that declared type are aligned to expression used for declaration
//on attribute and constant defaultValue
	@Check
	def checkTypes(Attribute attr) {
		val attrDataType = attr.dataType
		val attrDefaultValue = attr.defaultValue

		if(attrDefaultValue === null) return void

		// checks that the expression in default value is of same type as the attribute
		// and enriches the expression with size as it descends the tree
		checkTypes(attrDefaultValue, attrDataType, attr, DdPackage.Literals.ATTRIBUTE__DEFAULT_VALUE)
		// check size mandatory by type and controls the size of default value
		// checks the size between bracket, not the array size
		checkSize(attrDataType.value, attr.attributeSize, attrDefaultValue, attr, DdPackage.Literals.ATTRIBUTE__ATTRIBUTE_SIZE)
		// check that if the variable is an array it has a list of smaller size as a default
		checkArray(attr.arraySize, attr, attr.defaultValue, DdPackage.Literals.ATTRIBUTE__DEFAULT_VALUE)
	}

// check that declared type are aligned to expression used for declaration
// on attribute and constant defaultValue
	@Check
	def checkTypes(Constant cst) {
		val cstDataType = cst.dataType
		val cstDefaultValue = cst.defaultValue
		// checks that the expression in default value is of same type as the attribute
		// and enriches the expression with size as it descends the tree
		checkTypes(cstDefaultValue, cstDataType, cst, DdPackage.Literals.CONSTANT__DEFAULT_VALUE)
		// check size mandatory and if size is correct
		checkSize(cstDataType.value, cst.attributeSize, cstDefaultValue, cst, DdPackage.Literals.CONSTANT__ATTRIBUTE_SIZE)
		// check that if the variable is an array it has a list of smaller size as a default
		checkArray(cst.arraySize, cst, cst.defaultValue, DdPackage.Literals.CONSTANT__DEFAULT_VALUE)
	}

// check expression need to be of boolean type	
	@Check
	def checkConstraintsAreBoolean(CheckExpression checkExpr) {
		var type = getExpressionType(checkExpr.expr)
		if(type.value != DataType.BOOL_VALUE) {
			error("Invalid Check Expression: expression should be of type Boolean", checkExpr, DdPackage.Literals.CHECK_EXPRESSION__EXPR)
		} else {
			if(exprHelper.isListExpression(checkExpr.expr)) {
				error("ListExpression of Bool do not have an implicit bool value and cannot be used as a direct check constraint",
					checkExpr, DdPackage.Literals.CHECK_EXPRESSION__EXPR)
			}
		}

	}

// used for both constants and attribute default values
// calls the expression type parser and manages bits and dates
// the type checking with getexpressiontype function also gathers sizes and precisions
	def checkTypes(SharkExpression defaultValue, DataType dataType, EObject ctxt, EReference ref) {
		// this first call here ensures all expressions are recursively checked
		val exprType = getExpressionType(defaultValue)
		if(exprType != exprHelper.mergeCompatibleDataTypes(dataType)) {
			// manage the init of bits and dates which is done by strings and raise error otherwise
			if((dataType.value == DataType.BITS_VALUE) && (exprType.value == DataType.STR_VALUE)) {
				// could be ok despite the difference of type if bits or date, unless it is not the right format
				if(!((defaultValue instanceof StrValue) && (exprHelper.checkStringBitsFormat((defaultValue as StrValue).value)))) {
					error(ERR_MSG_BITS, ctxt, ref)
				}
			} else {
				// last possible correct cases with date and time are checked in below function
				// the final error message if types are different is in the manage date function
				manageDateTimeFormatsOrThrowError(dataType.value, exprType.value, ctxt, defaultValue, ref)
			}
		}
	}

	def checkBinaryExpressionType(BinaryExpression binExpr) {
		var isLeftList = exprHelper.isListExpression(binExpr.left)
		if(isLeftList) {
			error("Incorrect expression: list can only be used on the right of a binary expression", binExpr,
				DdPackage.Literals.BINARY_EXPRESSION__LEFT)
		}
		var leftType = getExpressionType(binExpr.left)
		var rightType = getExpressionType(binExpr.right)

		// check the few built in functions as operator that require non homogeneous types and lists: stxt
		// only stxt for now. Could move to a sub function checkNonHomogenousOperator
		if((binExpr.op.value == BinaryOperator.OP_STXT_VALUE)) {
			// first stxt
			var isRightList = exprHelper.isListExpression(binExpr.right)
			if((leftType.value != DataType.STR_VALUE) || (rightType.value != DataType.DEC_VALUE) || !(isRightList)) {
				error(ERR_STXT_SYNTAX, binExpr, DdPackage.Literals.BINARY_EXPRESSION__LEFT)
				leftType = DataType.UNSET
			// in case of stxt the expression type is a string like left type
			} else {
				// check list of 2 items that are actually integer (other wise DEC works)
				val listSize = exprHelper.getExpressionSize(binExpr.right)
				if(listSize.precision != 0) {
					error(ERR_STXT_SYNTAX, binExpr, DdPackage.Literals.BINARY_EXPRESSION__RIGHT)
				}
				val list = binExpr.right as ListExpression
				if((list.listElts.length != 1) || (list.left === null)) {
					error(ERR_STXT_SYNTAX, binExpr, DdPackage.Literals.BINARY_EXPRESSION__RIGHT)
				}
				// ALL GOOD: now computes length
				exprHelper.computesSizeSTR(binExpr)
			}
		} else {
			if((leftType.value != rightType.value)) {
				error("Type Mismatch: all the members of the binary expression should be of same type", binExpr,
					DdPackage.Literals.BINARY_EXPRESSION__LEFT)
				leftType = DataType.UNSET
			} else {
				// ALL GOOD: no error on types now we check the operator compatibility with the type 
				// and the size and precision is computed when relevant
				checkHomogenousOperator(binExpr, leftType) // errors generated in case of operator mismatch with type
			}
		}
		// some operator convert type to bool, if not remains unchanged
		exprHelper.convertToBool(binExpr, leftType)
	}

// checks type and operator consistency
// 'not' , '-'  or casts like 'str', 'int' , 'dec' , 'date' , 'time', stamp 
// or functions like 'len' 
	def checkUnaryExpressionType(UnaryExpression unExpr) {
		var leftType = getExpressionType(unExpr.left)

		checkHomogenousOperator(unExpr, leftType) // errors generated in case of operator mismatch with type
		// if no mismatch type is deducted from operator and casts are managed
		// the order of the 2 calls here are important: in check operator the cast type change was not done yet so the check operator is done on the left type
		// not on the target type of the unary expression
		exprHelper.getUnaryType(unExpr)
	}

// checks type and operator consistency
	def checkAddExpressionType(AddExpression addExpr) {
		if(exprHelper.isListExpression(addExpr.left)) {
			error(ERR_LIST_NOT_ALLOWED, addExpr, DdPackage.Literals.ADD_EXPRESSION__LEFT)
		}
		if(exprHelper.isListExpression(addExpr.right)) {
			error(ERR_LIST_NOT_ALLOWED, addExpr, DdPackage.Literals.ADD_EXPRESSION__RIGHT)
		}
		val leftType = getExpressionType(addExpr.left)
		if(leftType.value != DataType.DEC_VALUE) {
			error(ERR_MSG_ADD, addExpr, DdPackage.Literals.ADD_EXPRESSION__LEFT)
		}
		val rightType = getExpressionType(addExpr.right)
		if(rightType.value != DataType.DEC_VALUE) {
			error(ERR_MSG_ADD, addExpr, DdPackage.Literals.ADD_EXPRESSION__RIGHT)
		}
		// note: getsize only works because it was calculated for underlying expression inside the checksize chain of calls
		var attrSize = exprHelper.getExpressionSize(addExpr.left)
		var attrSize2 = exprHelper.getExpressionSize(addExpr.right)
		// in additions we take max fsor size and precision
		attrSize.setLength((attrSize.length > attrSize2.length) ? attrSize.length : attrSize2.length)
		attrSize.setPrecision((attrSize.precision > attrSize2.precision) ? attrSize.precision : attrSize2.precision)

		for (AddExpressionElt addElt : addExpr.addElts) {
			val e = addElt.right
			if(exprHelper.isListExpression(e)) {
				error(ERR_LIST_NOT_ALLOWED, addElt, DdPackage.Literals.ADD_EXPRESSION_ELT__RIGHT)
			}
			val type = getExpressionType(e)
			if(type.value != DataType.DEC_VALUE) {
				error(ERR_MSG_ADD, addElt, DdPackage.Literals.ADD_EXPRESSION_ELT__RIGHT)
			}
			attrSize2 = exprHelper.getExpressionSize(e)
			// in additions we take max for size and precision
			attrSize.setLength((attrSize.length > attrSize2.length) ? attrSize.length : attrSize2.length)
			attrSize.setPrecision((attrSize.precision > attrSize2.precision) ? attrSize.precision : attrSize2.precision)
		}

		addExpr.setLength(attrSize.length)
		addExpr.setPrecision(attrSize.precision)

	}

// checks type and operator consistency
	def checkMultExpressionType(MultExpression multExpr) {
		if(exprHelper.isListExpression(multExpr.left)) {
			error(ERR_LIST_NOT_ALLOWED, multExpr, DdPackage.Literals.MULT_EXPRESSION__LEFT)
		}
		if(exprHelper.isListExpression(multExpr.right)) {
			error(ERR_LIST_NOT_ALLOWED, multExpr, DdPackage.Literals.MULT_EXPRESSION__RIGHT)
		}
		val leftType = getExpressionType(multExpr.left)
		if(leftType.value != DataType.DEC_VALUE) {
			error(ERR_MSG_MULT, multExpr, DdPackage.Literals.MULT_EXPRESSION__LEFT)
		}
		val rightType = getExpressionType(multExpr.right)
		if(rightType.value != DataType.DEC_VALUE) {
			error(ERR_MSG_MULT, multExpr, DdPackage.Literals.MULT_EXPRESSION__RIGHT)
		}

		var attrSize = exprHelper.getExpressionSize(multExpr.left)
		var attrSize2 = exprHelper.getExpressionSize(multExpr.right)
		// in multiplication we add size and precision
		attrSize.setLength(attrSize.length + attrSize2.length)
		attrSize.setPrecision(attrSize.precision + attrSize2.precision)

		for (MultExpressionElt multElt : multExpr.multElts) {
			val e = multElt.right
			if(exprHelper.isListExpression(e)) {
				error(ERR_LIST_NOT_ALLOWED, multElt, DdPackage.Literals.MULT_EXPRESSION_ELT__RIGHT)
			}
			val type = getExpressionType(e)
			if(type.value != DataType.DEC_VALUE) {
				error(ERR_MSG_MULT, multElt, DdPackage.Literals.MULT_EXPRESSION_ELT__RIGHT)
			}
			attrSize2 = exprHelper.getExpressionSize(e)
			attrSize.setLength(attrSize.length + attrSize2.length)
			attrSize.setPrecision(attrSize.precision + attrSize2.precision)
		}

		multExpr.setLength(attrSize.length)
		multExpr.setPrecision(attrSize.precision)

	}

// checks type and operator consistency
	def checkAndExpressionType(AndExpression andExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if(exprHelper.isListExpression(andExpr.left)) {
			error(ERR_LIST_NOT_ALLOWED, andExpr, DdPackage.Literals.AND_EXPRESSION__LEFT)
		}
		if(exprHelper.isListExpression(andExpr.right)) {
			error(ERR_LIST_NOT_ALLOWED, andExpr, DdPackage.Literals.AND_EXPRESSION__RIGHT)
		}
		val leftType = getExpressionType(andExpr.left)
		if(leftType.value != DataType.BOOL_VALUE) {
			error(ERR_MSG_AND, andExpr, DdPackage.Literals.AND_EXPRESSION__LEFT)
		}
		val rightType = getExpressionType(andExpr.right)
		if(rightType.value != DataType.BOOL_VALUE) {
			error(ERR_MSG_AND, andExpr, DdPackage.Literals.AND_EXPRESSION__RIGHT)
		}
		for (AndExpressionElt andElt : andExpr.andElts) {
			val e = andElt.right
			if(exprHelper.isListExpression(e)) {
				error(ERR_LIST_NOT_ALLOWED, andElt, DdPackage.Literals.AND_EXPRESSION_ELT__RIGHT)
			}
			val type = getExpressionType(e)
			if(type.value != DataType.BOOL_VALUE) {
				error(ERR_MSG_AND, andElt, DdPackage.Literals.AND_EXPRESSION_ELT__RIGHT)
			}
		}
	}

// checks type and operator consistency for or expression 
	def checkOrExpressionType(OrExpression orExpr) {
		if(exprHelper.isListExpression(orExpr.left)) {
			error(ERR_LIST_NOT_ALLOWED, orExpr, DdPackage.Literals.OR_EXPRESSION__LEFT)
		}
		val leftType = getExpressionType(orExpr.left)
		if(leftType.value != DataType.BOOL_VALUE) {
			error(ERR_MSG_OR, orExpr, DdPackage.Literals.OR_EXPRESSION__LEFT)
		}
		if(exprHelper.isListExpression(orExpr.right)) {
			error(ERR_LIST_NOT_ALLOWED, orExpr, DdPackage.Literals.OR_EXPRESSION__RIGHT)
		}
		val rightType = getExpressionType(orExpr.right)
		if(rightType.value != DataType.BOOL_VALUE) {
			error(ERR_MSG_OR, orExpr, DdPackage.Literals.OR_EXPRESSION__RIGHT)
		}
		for (OrExpressionElt orElt : orExpr.orElts) {
			val e = orElt.right
			if(exprHelper.isListExpression(e)) {
				error(ERR_LIST_NOT_ALLOWED, orElt, DdPackage.Literals.OR_EXPRESSION_ELT__RIGHT)
			}
			val type = getExpressionType(e)
			if(type.value != DataType.BOOL_VALUE) {
				error(ERR_MSG_OR, orElt, DdPackage.Literals.OR_EXPRESSION_ELT__RIGHT)
			}
		}
	}

// checks type and operator consistency for the concatenation expression
	def checkCatExpressionType(CatExpression catExpr) {
		if(exprHelper.isListExpression(catExpr.left)) {
			error(ERR_LIST_NOT_ALLOWED, catExpr, DdPackage.Literals.CAT_EXPRESSION__LEFT)
		}

		if(exprHelper.isListExpression(catExpr.right)) {
			error(ERR_LIST_NOT_ALLOWED, catExpr, DdPackage.Literals.CAT_EXPRESSION__RIGHT)
		}

		val leftType = getExpressionType(catExpr.left)
		if(leftType.value != DataType.STR_VALUE) {
			error(ERR_MSG_CAT, catExpr, DdPackage.Literals.CAT_EXPRESSION__LEFT)
		}

		val rightType = getExpressionType(catExpr.right)
		if(rightType.value != DataType.STR_VALUE) {
			error(ERR_MSG_CAT, catExpr, DdPackage.Literals.CAT_EXPRESSION__RIGHT)
		}

		var attrSize = exprHelper.getExpressionSize(catExpr.left)
		var attrSize2 = exprHelper.getExpressionSize(catExpr.right)
		catExpr.setLength(attrSize.length + attrSize2.length)

		for (CatExpressionElt catElt : catExpr.catElts) {
			val e = catElt.right
			val type = getExpressionType(e)
			if(exprHelper.isListExpression(catExpr.right)) {
				error(ERR_LIST_NOT_ALLOWED, catElt, DdPackage.Literals.CAT_EXPRESSION_ELT__RIGHT)
			}

			if(type.value != DataType.STR_VALUE) {
				error(ERR_MSG_CAT, catElt, DdPackage.Literals.CAT_EXPRESSION_ELT__RIGHT)
			}
			catExpr.setLength(catExpr.length + exprHelper.getExpressionSize(e).length)

		}
	}

// checks homogeneity of a list and returns its type
	def checkListExpressionType(ListExpression listExpr) {
		// means that this unary expression was never processed.otherwise nothing to do as already done.
		var leftType = DataType.DEC // by default set as a range of ints
		if(listExpr.left !== null) { // in that case it means it is a list not a range so leftType is INT for a range
			leftType = listExpr.left.expressionType
			for (ListExpressionElt listElt : listExpr.listElts) {
				val rightType = listElt.right.expressionType
				if(rightType.value != leftType.value) {
					error("Types of elements in a list should all be the same", listExpr, DdPackage.Literals.LIST_EXPRESSION__LIST_ELTS)
					return DataType.UNSET
				}
			}
		}
		leftType
	}

// returns the type and also calls the check type function recursively if required, so generates errors too
// note that bits are not allowed as there is not expressions with bits, only storage and string operations
	def DataType getExpressionType(SharkExpression e) {
		switch (e) {
			StrValue | ChrValue:
				DataType.STR
			IntValue:
				DataType.DEC
			DecValue: {
				DataType.DEC
			}
			BoolValue:
				DataType.BOOL
			CstValue: {
				val cst = e as CstValue
				// bits are stored only, notallowsed in expression. Strings are used to build them
				if(cst.value.dataType.value == DataType.BITS_VALUE) {
					error(ERR_BITS_NOT_ALLOWED, cst, DdPackage.Literals.CST_VALUE__VALUE)
				}
				exprHelper.mergeCompatibleDataTypes(cst.value.dataType)
			}
			IdentifierExpression: {
				val identExpr = e as IdentifierExpression
				if(identExpr.value.dataType.value == DataType.BITS_VALUE) {
					error(ERR_BITS_NOT_ALLOWED, identExpr, DdPackage.Literals.IDENTIFIER_EXPRESSION__VALUE)
				}
				exprHelper.mergeCompatibleDataTypes(identExpr.value.dataType)
			}
			BinaryExpression: { // triggers recursive call of the check method,
				val binExpr = e as BinaryExpression
				checkBinaryExpressionType(binExpr)
			}
			UnaryExpression: {
				val unExpr = e as UnaryExpression
				checkUnaryExpressionType(unExpr) // triggers recursive call of the check method,
			}
			AddExpression: {
				val addExpr = e as AddExpression
				checkAddExpressionType(addExpr) // triggers recursive call of the check method,
				DataType.DEC // even if the underlying generates error return the theoretical type of a correct one. avoid error cascade.
			}
			MultExpression: {
				val multExpr = e as MultExpression
				checkMultExpressionType(multExpr) // triggers recursive call of the check method,
				DataType.DEC // even if the underlying generates error return the theoretical type of a correct one. avoid error cascade.
			}
			AndExpression: {
				val andExpr = e as AndExpression
				checkAndExpressionType(andExpr) // triggers recursive call of the check method,
				DataType.BOOL
			}
			OrExpression: {
				val orExpr = e as OrExpression
				checkOrExpressionType(orExpr) // triggers recursive call of the check method,
				DataType.BOOL
			}
			CatExpression: {
				val catExpr = e as CatExpression
				checkCatExpressionType(catExpr) // triggers recursive call of the check method,
				DataType.STR
			}
			ListExpression: {
				val listExpr = e as ListExpression
				checkListExpressionType(listExpr) // triggers recursive call of the check method,
			}
			UnsetValue: {
				DataType.UNSET
			}
			default: {
				DataType.UNSET
			}
		}
	}

	// check operator and type compatibility, called after the type was identified for the expression
	// so only on homogeneous expression with same type at that point. Sends error otherwise.
	def void checkHomogenousOperator(
		SharkExpression e,
		DataType t
	) {
		switch (e) {
			BinaryExpression: {
				val binExpr = e as BinaryExpression
				val op = binExpr.op
				val opValue = op.value
				val type = t.value
				// stxt is non homogeneous so not managed here but in caller CheckBinaryExpression
				if(exprHelper.isListExpression(binExpr.right) && (opValue != BinaryOperator.OP_IN_VALUE)) {
					error("Invalid Operator: only in and stxt operator can be used on a list, here it is " + op.literal, binExpr,
						DdPackage.Literals.BINARY_EXPRESSION__OP)
					return
				}
				// in can find in a list or can find a substring in a string
				if((opValue == BinaryOperator.OP_IN_VALUE) && !(exprHelper.isListExpression(binExpr.right)) &&
					(type !== DataType.STR_VALUE)) {
					error("Invalid Operator: in requires a list or a string on the right ", binExpr,
						DdPackage.Literals.BINARY_EXPRESSION__OP)
					return
				}
				switch (type) {
					// > and < operators compare string in alpha order, as there is the len function otherwise to easily use
					// in gives the positions of a str in another
					case DataType.STR_VALUE: {
						if((opValue != BinaryOperator.OP_CAT_VALUE) && (opValue != BinaryOperator.OP_EQ_VALUE ) &&
							(opValue != BinaryOperator.OP_DIF_VALUE ) && (opValue != BinaryOperator.OP_LIKE_VALUE ) &&
							(opValue != BinaryOperator.OP_IN_VALUE ) && (opValue != BinaryOperator.OP_GTE_VALUE ) &&
							(opValue != BinaryOperator.OP_LTE_VALUE ) && (opValue != BinaryOperator.OP_GT_VALUE ) &&
							(opValue != BinaryOperator.OP_LT_VALUE )) {
							error("Invalid Operator: String and character types can only use &, ==, != and like operators, here it is " +
								op.literal, binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
						} else {
							// computes the size/precision depending on operator of the binary expression
							exprHelper.computesSizeSTR(binExpr)
						}
					}
					case DataType.DEC_VALUE: {
						if((opValue != BinaryOperator.OP_ADD_VALUE ) && (opValue != BinaryOperator.OP_MULT_VALUE ) &&
							(opValue != BinaryOperator.OP_MOD_VALUE ) && (opValue != BinaryOperator.OP_POW_VALUE ) &&
							(opValue != BinaryOperator.OP_EQ_VALUE ) && (opValue != BinaryOperator.OP_DIF_VALUE ) &&
							(opValue != BinaryOperator.OP_GTE_VALUE ) && (opValue != BinaryOperator.OP_LTE_VALUE ) &&
							(opValue != BinaryOperator.OP_GT_VALUE ) && (opValue != BinaryOperator.OP_LT_VALUE ) &&
							(opValue != BinaryOperator.OP_MIN_VALUE ) && (opValue != BinaryOperator.OP_DIV_VALUE ) &&
							(opValue != BinaryOperator.OP_ROUND_VALUE ) && (opValue != BinaryOperator.OP_IN_VALUE )) {
							error("Invalid Operator: Numeric type can only use +,*,%,^,==,!=,<=,>=,<,>,-,/ operators, here it is " +
								op.literal, binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
						} else {
							// computes the size/precision depending on operator of the binary expression
							exprHelper.computesSizeDEC(binExpr)
						}
					}
					// plus minus date operations are allowed
					case DataType.DATE_VALUE: {
						if((opValue != BinaryOperator.OP_ADD_VALUE ) && (opValue != BinaryOperator.OP_MIN_VALUE) &&
							(opValue != BinaryOperator.OP_EQ_VALUE ) && (opValue != BinaryOperator.OP_DIF_VALUE ) &&
							(opValue != BinaryOperator.OP_GTE_VALUE ) && (opValue != BinaryOperator.OP_LTE_VALUE ) &&
							(opValue != BinaryOperator.OP_GT_VALUE ) && (opValue != BinaryOperator.OP_LT_VALUE ) &&
							(opValue != BinaryOperator.OP_IN_VALUE ))
							error("Invalid Operator: type Date can only use +,-,==,!=,<=,>=,<,> operators, here it is " + op.literal,
								binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
					}
					case DataType.BOOL_VALUE: {
						if((opValue != BinaryOperator.OP_EQ_VALUE ) && (opValue != BinaryOperator.OP_DIF_VALUE ) &&
							(opValue != BinaryOperator.OP_GT_VALUE ) && (opValue != BinaryOperator.OP_LT_VALUE ) &&
							(opValue != BinaryOperator.OP_GTE_VALUE ) && (opValue != BinaryOperator.OP_LTE_VALUE ) &&
							(opValue != BinaryOperator.OP_AND_VALUE ) && (opValue != BinaryOperator.OP_OR_VALUE ) &&
							(opValue != BinaryOperator.OP_IN_VALUE ))
							error("Invalid Operator: type Boolean can only use ==,!=,<=,>=,<,> operators, here it is " + op.literal,
								binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
					}
					default: {
						error("Unexpected error during operator validation", binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
					}
				}
			}
			UnaryExpression: {
				val unExpr = e as UnaryExpression
				val op = unExpr.op
				val opValue = op.value
				val typeValue = t.value
				// list not allowed on unary expressions
				if(exprHelper.isListExpression(unExpr.left)) {
					error("Invalid Expression: unary operator or function impossible on a list, here it is " + op.literal, unExpr,
						DdPackage.Literals.UNARY_EXPRESSION__OP)
				}
				switch (typeValue) {
					case typeValue == DataType.STR_VALUE: {
						if((opValue != UnaryOperator.DATE_CAST_VALUE) && (opValue != UnaryOperator.INT_CAST_VALUE) &&
							(opValue != UnaryOperator.DEC_CAST_VALUE) && (opValue != UnaryOperator.OP_LEN_VALUE) &&
							(opValue != UnaryOperator.TIME_CAST_VALUE) && (opValue != UnaryOperator.STAMP_CAST_VALUE)) {
							error(
								"Invalid Operator: String and character types can only use stxt(),int(),dec(),len(),date() and time() functions, here it is " +
									op.literal, unExpr, DdPackage.Literals.UNARY_EXPRESSION__OP)
						} else {
							// computes the size/precision depending on operator of the binary expression
							exprHelper.computesSizeSTR(unExpr)
						}
					}
					case typeValue == DataType.DEC_VALUE: {
						if((opValue != UnaryOperator.OP_NEG_VALUE) && (opValue != UnaryOperator.STR_CAST_VALUE)) {
							error("Invalid Operator: Numeric types can only use - operator, here it is " + op.literal, unExpr,
								DdPackage.Literals.UNARY_EXPRESSION__OP)
						} else {
							// computes the size/precision depending on operator of the binary expression
							exprHelper.computesSizeDEC(unExpr)
						}
					}
					case typeValue == DataType.DATE_VALUE: {
						error("Invalid Operator: Date types cannot use unary operator, here it is " + op.literal, unExpr,
							DdPackage.Literals.UNARY_EXPRESSION__OP)
					}
					case typeValue == DataType.BOOL_VALUE: {
						if(opValue != UnaryOperator.OP_NOT_VALUE)
							error("Invalid Operator: Boolean types can only use not() function, here it is " + op.literal, unExpr,
								DdPackage.Literals.UNARY_EXPRESSION__OP)
					}
					default: {
					}
				}
			}
		}
	}

	// when used, the types are checked already, only size is verified of array
	def checkArray(ArraySize array, EObject context, SharkExpression defaultValue, EReference eRef) {
		if(array !== null) {
			if(!(exprHelper.isListExpression(defaultValue))) {
				error("arrays require a list or range as default/init value", context, eRef)
			} else {
				val listExpr = defaultValue as ListExpression
				val leftSize = array.size
				var rightSize = 0

				if(listExpr.left === null) {
					// case of a range
					val String[] range = listExpr.range.split("..")
					val min = Integer.parseInt(range.get(0))
					val max = range.get(1) == "n" ? Integer.MAX_VALUE : Integer.parseInt(range.get(1))
					rightSize = max - min
				} else {
					// case of a list 
					rightSize = listExpr.listElts.length + 1
				}

				if(leftSize < rightSize) {
					error("array size is too small to store list size", context, eRef)
				}

				if(leftSize > rightSize) {
					warning("array size is too large for list size", context, eRef)
				}
			}
		}

	}

	// full size with precision mandatory for dec
	// at least size for int str, and can be with n,p in which case it is min max
	// not size for date time and chr
	// verifies if length and expression content is consistent
	def checkSize(int type, AttributeSize size, SharkExpression expr, EObject context, EReference eRef) {
		// then checks the size of the expression. at that stage types are assumed compatibles
		val exprSize = exprHelper.getExpressionSize(expr)
		// first checks the mandatory sizes in the declaration left side depending on type and then the length/precision
		switch (type) {
			case type == DataType.STR_VALUE || type == DataType.INT_VALUE:
				if(size === null) {
					error(ERR_STR_INT_MAX_MANDATORY, context, eRef)
				} else {
					if(size.length < exprSize.length) {
						error("Expression length is incompatible with the declaration length, it is " + exprSize.length + " and not " +
							size.length, context, eRef)
					}

					if(size.length > exprSize.length) {
						warning("Please note that the attribute has larger size than the expression", context, eRef)
					}

					// non mandatory min size is present we use it (min size is stored in precision...)
					if(size.precision != 0) {
						if(size.precision > size.length) {
							error("For str and int declarations, when specified, min length should be smaller or equal to max length",
								context, eRef)

						}
						if(size.precision > exprSize.length) {
							error(
								"Expression min size is incompatible with the declaration min size, it is " + exprSize.length +
									" and not " + size.precision, context, eRef)
						}
					}
				}
			case type == DataType.DEC_VALUE:
				if(size === null) {
					error(DEC_PRECISION_MANDATORY, context, eRef)
				} else {
					if(size.precision == 0) {
						error(DEC_PRECISION_MANDATORY, context, eRef)
					} else {
						if(size.length < exprSize.length) {
							error(ERR_EXPRESSION_LENGTH_INCORRECT + exprSize.length + " and not " + size.length, context, eRef)
						}
						if(size.precision < exprSize.precision) {
							error(
								"Expression precision is incompatible with the declaration precision, it is " + exprSize.precision +
									" and not " + size.precision, context, eRef)
						}

					}
				}
			case type == DataType.CHR_VALUE: {
				if(size !== null) {
					error("Chr types don't require size, they are of size 1", context, eRef)
				}
				if(exprSize.length != 1) {
					error(ERR_EXPRESSION_LENGTH_INCORRECT + exprSize.length + " and not 1", context, eRef)
				}
			}
			case type == DataType.TIME_VALUE || type == DataType.DATE_VALUE || type == DataType.STAMP_VALUE || type == DataType.BOOL_VALUE:
				// length and precision not mandatory for these
				// check is done already due to formats 
				if(size !== null) {
					error("Date, Time, Stamp and Bool types have no size", context, eRef)
				}
		}

	}

//used in the verification of initializations for constants and attribute to control the specific date and time string formats
//allowed to init date and time attributes and constants
//this is called at the end of the check sequence so here all types are homogenous already and operator is ok
	def manageDateTimeFormatsOrThrowError(int mainDataType, int exprType, EObject context, SharkExpression defaultValue, EReference eRef) {
		if((mainDataType == DataType.DATE_VALUE) && (exprType == DataType.STR_VALUE)) {
			// could be ok despite the difference of type, unless it is not the right format 
			// at that stage it can either be a list of strings to init an array of dates or a single date and a string
			if(defaultValue instanceof StrValue) { // case of a simple date=string
				if(!exprHelper.checkStringDateFormat((defaultValue as StrValue).value)) {
					error(ERR_DATE_BAD_FORMAT, context, eRef)
				}
			} else if(defaultValue instanceof ListExpression) { // case of a list
				var firstExprElt = (defaultValue as ListExpression).getLeft
				if(firstExprElt instanceof StrValue) {
					// continue to check date validity of first
					if(!exprHelper.checkStringDateFormat((firstExprElt as StrValue).value)) {
						error(ERR_DATE_BAD_FORMAT, context, eRef)
					}
					// and then the list
					for (exprElt : (defaultValue as ListExpression).getListElts) {
						val right = exprElt.right
						// continue to check date validity of other elt
						// no need to check cast because all list elt are of same type here
						if(!exprHelper.checkStringDateFormat((right as StrValue).value)) {
							error(ERR_DATE_BAD_FORMAT, context, eRef)
						}
					}
				} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
					error(ERR_INVALID_DATE_ARRAY_INIT, context, eRef)
				}
			} else {
				error(ERR_INVALID_DATE_ARRAY_INIT, context, eRef)
			}
		} else {
			if((mainDataType == DataType.TIME_VALUE) && (exprType == DataType.STR_VALUE)) {
				// could be ok despite the difference of type, unless it is not the right format 
				// at that stage it can either be a list of strings to init an array of Times or a single Time and a string
				if(defaultValue instanceof StrValue) { // case of a simple Time=string
					if(!exprHelper.checkStringTimeFormat((defaultValue as StrValue).value)) {
						error(ERR_TIME_BAD_FORMAT, context, eRef)
					}
				} else if(defaultValue instanceof ListExpression) { // case of a list
					var firstExprElt = (defaultValue as ListExpression).getLeft
					if(firstExprElt instanceof StrValue) {
						// continue to check Time validity of first
						if(!exprHelper.checkStringTimeFormat((firstExprElt as StrValue).value)) {
							error(ERR_TIME_BAD_FORMAT, context, eRef)
						}
						// and then the list
						for (exprElt : (defaultValue as ListExpression).getListElts) {
							val right = exprElt.right
							// continue to check Time validity of first
							if(!exprHelper.checkStringTimeFormat((right as StrValue).value)) {
								error(ERR_TIME_BAD_FORMAT, context, eRef)
							}
						}
					} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
						error(ERR_INVALID_TIME_ARRAY_INIT, context, eRef)
					}
				} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
					error(ERR_INVALID_TIME_ARRAY_INIT, context, eRef)
				}
			} else {
				if((mainDataType == DataType.STAMP_VALUE) && (exprType == DataType.STR_VALUE)) {
					// could be ok despite the difference of type, unless it is not the right format 
					// at that stage it can either be a list of strings to init an array of Times or a single Timestamp and a string
					if(defaultValue instanceof StrValue) { // case of a simple Timestamp=string
						if(!exprHelper.checkStringTimestampFormat((defaultValue as StrValue).value)) {
							error(ERR_STAMP_BAD_FORMAT, context, eRef)
						}
					} else if(defaultValue instanceof ListExpression) { // case of a list
						var firstExprElt = (defaultValue as ListExpression).getLeft
						if(firstExprElt instanceof StrValue) {
							// continue to check Timestamp validity of first
							if(!exprHelper.checkStringTimestampFormat((firstExprElt as StrValue).value)) {
								error(ERR_STAMP_BAD_FORMAT, context, eRef)
							}
							// and then the list
							for (exprElt : (defaultValue as ListExpression).getListElts) {
								val right = exprElt.right
								// continue to check Timestamp validity of first
								if(!exprHelper.checkStringTimestampFormat((right as StrValue).value)) {
									error(ERR_STAMP_BAD_FORMAT, context, eRef)
								}
							}
						} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
							error(ERR_INVALID_STAMP_ARRAY_INIT, context, eRef)
						}
					} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
						error(ERR_INVALID_STAMP_ARRAY_INIT, context, eRef)
					}
				} else {
					// in that case we are sure this is a type error, not a date time or timestamp init
					error("Invalid initialization: expression type mismatch with attribute or constant", context, eRef)
				}
			}
		}

	}

}
