package com.shark.lang.validation

import com.google.inject.Inject
import com.shark.lang.dd.AddExpression
import com.shark.lang.dd.AddExpressionElt
import com.shark.lang.dd.AndExpression
import com.shark.lang.dd.AndExpressionElt
import com.shark.lang.dd.AttributeSize
import com.shark.lang.dd.BinaryExpression
import com.shark.lang.dd.BinaryOperator
import com.shark.lang.dd.BoolValue
import com.shark.lang.dd.CatExpression
import com.shark.lang.dd.CatExpressionElt
import com.shark.lang.dd.ChrValue
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
import com.shark.lang.dd.impl.DdFactoryImpl
import org.eclipse.xtext.validation.AbstractDeclarativeValidator
import org.eclipse.xtext.validation.EValidatorRegistrar

/**
 * The class focuses on validating expression in check and initialization expressions and of the dd grammar
 * It does the type validation of expressions and validate operators
 * To process Expressions EObjects only once in this recursive expression validation process, boolean were added 
 * to SharkExpression objects in the model to be used here. They use synthetic never instanciated tokens just to create members.
 * There might be a more elegant solution to that but it works well. These booleans flags allow to keep Expression state. 
 * These flags indicate if the expression EObject was already processed/checked and also store the type. 
 * 
 */
class DdExpressionValidator extends AbstractDeclarativeValidator {

	static val ERROR_MSG_ADD = "Type Mismatch: all the members of the addition should be of numeric type"
	static val ERROR_MSG_MULT = "Type Mismatch: all the members of the multiplication should be of numeric type"
	static val ERROR_MSG_AND = "Type Mismatch: all the members of the logical And expression should be of boolean type"
	static val ERROR_MSG_OR = "Type Mismatch: all the members of the logical Or expression should be of boolean type"
	static val ERROR_MSG_CAT = "Type Mismatch: all the members of the concat expression should be of string type"
	static val ERR_BITS_NOT_ALLOWED = "Bits types are not allowed in expressions"
	static val ERR_LIST_NOT_ALLOWED = "Incorrect expression: list can only be used in a binary expression as the right operand"

	@Inject
	DdFactoryImpl ddFactory

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

//deducted type cover only bool,str,num,date 
//indeed 'str' and 'chr' are compatible and set to str. 'dec' and 'int' same. 'date' 'time' and 'stamp' too
//bits are not allowed in expressions so no validation
//attribute types are in the grammar can be:
//'str' 'dec' 'date' 'time' 'chr' 'int' 'stamp' 'bits' 'bool' 
//lists are also processed: their type needs to be homogeneous and special cases in, stxt.. are managed
//checks type consistency and operator validity
	def checkBinaryExpressionType(BinaryExpression binExpr) {
		var isLeftList = isListExpression(binExpr.left)
		if(isLeftList) {
			error("Incorrect expression: list can only be used on the right of a binary expression", binExpr,
				DdPackage.Literals.BINARY_EXPRESSION__LEFT)
		}
		var leftType = getExpressionType(binExpr.left)
		var rightType = getExpressionType(binExpr.right)
		if(leftType.value != rightType.value) {
			// check the few built in functions as operator that require non homogeneous types and lists: stxt
			if((binExpr.op.value == BinaryOperator.OP_STXT_VALUE)) {
				// first stxt
				var isRightList = isListExpression(binExpr.right)
				if((binExpr.op.value == BinaryOperator.OP_STXT_VALUE) && (
					(leftType.value != DataType.STR_VALUE) || (rightType.value != DataType.DEC_VALUE) || !(isRightList))) {
					error("Type Mismatch: substring operator requires string on the left and integer list on the right", binExpr,
						DdPackage.Literals.BINARY_EXPRESSION__LEFT)
				// in case of stxt the expression type is a string like left type
				} // no else, in this case the left type is string and is returned
			} else {
				error("Type Mismatch: all the members of the binary expression should be of same type", binExpr,
					DdPackage.Literals.BINARY_EXPRESSION__LEFT)
			}
			DataType.UNSET
		} else {
			// ALL GOOD: no error on types now we check the operator compatibility with the type 
			// and the size and precision is computed when relevant
			checkOperator(binExpr, leftType) // errors generated in case of operator mismatch with type
			// some operator convert type to bool, if not remains unchangd
			convertToBool(binExpr, leftType)
		}
	}

	// to manage the different subtypes of list as well as the case of a variable/Constant and return the information
	protected def boolean isListExpression(SharkExpression binExpr) {
		if(binExpr instanceof IdentifierExpression) {
			val ident = binExpr as IdentifierExpression
			ident.value.arraySize !== null
		} else if(binExpr instanceof CstValue) {
			val cst = binExpr as CstValue
			cst.value.arraySize !== null
		} else if(binExpr instanceof ListExpression) {
			true
		} else
			false
	}

// checks type and operator consistency
// 'not' , '-'  or casts like 'str', 'int' , 'dec' , 'date' , 'time', stamp 
// or functions like 'len' 
	def checkUnaryExpressionType(UnaryExpression unExpr) {
		var leftType = getExpressionType(unExpr.left)

		checkOperator(unExpr, leftType) // errors generated in case of operator mismatch with type
		// if no mismatch type is deducted from operator and casts are managed
		// the order of the 2 calls here are important: in check operator the cast type change was not done yet so the check operator is done on the left type
		// not on the target type of the unary expression
		unExpr.getUnaryType
	}

// checks type and operator consistency
	def checkAddExpressionType(AddExpression addExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if(isListExpression(addExpr.left)) {
			error(ERR_LIST_NOT_ALLOWED, addExpr, DdPackage.Literals.ADD_EXPRESSION__LEFT)
		}
		val leftType = getExpressionType(addExpr.left)
		if(leftType.value != DataType.DEC_VALUE) {
			error(DdExpressionValidator.ERROR_MSG_ADD, addExpr, DdPackage.Literals.ADD_EXPRESSION__LEFT)
		} else {
			val rightType = getExpressionType(addExpr.right)
			if(isListExpression(addExpr.right)) {
				error(ERR_LIST_NOT_ALLOWED, addExpr, DdPackage.Literals.ADD_EXPRESSION__RIGHT)
			}
			if(rightType.value != DataType.DEC_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_ADD, addExpr, DdPackage.Literals.ADD_EXPRESSION__RIGHT)
			} else { // first 2 are ok we process the rest of the list
				for (AddExpressionElt addElt : addExpr.addElts) {
					val e = addElt.right
					if(isListExpression(e)) {
						error(ERR_LIST_NOT_ALLOWED, addExpr, DdPackage.Literals.ADD_EXPRESSION__ADD_ELTS)
					}
					val type = getExpressionType(e)
					if(type.value != DataType.DEC_VALUE) {
						error(DdExpressionValidator.ERROR_MSG_ADD, addExpr, DdPackage.Literals.ADD_EXPRESSION__ADD_ELTS)
					}
				}
			}
		}
	}

// checks type and operator consistency
	def checkMultExpressionType(MultExpression multExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if(isListExpression(multExpr.left)) {
			error(ERR_LIST_NOT_ALLOWED, multExpr, DdPackage.Literals.MULT_EXPRESSION__LEFT)
		}
		val leftType = getExpressionType(multExpr.left)
		if(leftType.value != DataType.DEC_VALUE) {
			error(DdExpressionValidator.ERROR_MSG_MULT, multExpr, DdPackage.Literals.MULT_EXPRESSION__LEFT)
		} else {
			val rightType = getExpressionType(multExpr.right)
			if(isListExpression(multExpr.right)) {
				error(ERR_LIST_NOT_ALLOWED, multExpr, DdPackage.Literals.MULT_EXPRESSION__RIGHT)
			}
			if(rightType.value != DataType.DEC_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_MULT, multExpr, DdPackage.Literals.MULT_EXPRESSION__RIGHT)
			} else { // first 2 are ok we process the rest of the list
				for (MultExpressionElt multElt : multExpr.multElts) {
					val e = multElt.right
					if(isListExpression(e)) {
						error(ERR_LIST_NOT_ALLOWED, multExpr, DdPackage.Literals.MULT_EXPRESSION__MULT_ELTS)
					}
					val type = getExpressionType(e)
					if(type.value != DataType.DEC_VALUE) {
						error(DdExpressionValidator.ERROR_MSG_MULT, multExpr, DdPackage.Literals.MULT_EXPRESSION__MULT_ELTS)
					}
				}
			}
		}
	}

// checks type and operator consistency
	def checkAndExpressionType(AndExpression andExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if(isListExpression(andExpr.left)) {
			error(ERR_LIST_NOT_ALLOWED, andExpr, DdPackage.Literals.AND_EXPRESSION__LEFT)
		}
		val leftType = getExpressionType(andExpr.left)
		if(leftType.value != DataType.BOOL_VALUE) {
			error(DdExpressionValidator.ERROR_MSG_AND, andExpr, DdPackage.Literals.AND_EXPRESSION__LEFT)
		} else {
			if(isListExpression(andExpr.right)) {
				error(ERR_LIST_NOT_ALLOWED, andExpr, DdPackage.Literals.AND_EXPRESSION__RIGHT)
			}
			val rightType = getExpressionType(andExpr.right)
			if(rightType.value != DataType.BOOL_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_AND, andExpr, DdPackage.Literals.AND_EXPRESSION__RIGHT)
			} else { // first 2 are ok we process the rest of the list
				for (AndExpressionElt andElt : andExpr.andElts) {
					val e = andElt.right
					if(isListExpression(e)) {
						error(ERR_LIST_NOT_ALLOWED, andExpr, DdPackage.Literals.AND_EXPRESSION__AND_ELTS)
					}
					val type = getExpressionType(e)
					if(type.value != DataType.BOOL_VALUE) {
						error(DdExpressionValidator.ERROR_MSG_AND, andExpr, DdPackage.Literals.AND_EXPRESSION__AND_ELTS)
					}
				}
			}
		}
	}

// checks type and operator consistency
	def checkOrExpressionType(OrExpression orExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if(isListExpression(orExpr.left)) {
			error(ERR_LIST_NOT_ALLOWED, orExpr, DdPackage.Literals.OR_EXPRESSION__LEFT)
		}
		val leftType = getExpressionType(orExpr.left)
		if(leftType.value != DataType.BOOL_VALUE) {
			error(DdExpressionValidator.ERROR_MSG_OR, orExpr, DdPackage.Literals.OR_EXPRESSION__LEFT)
		} else {
			if(isListExpression(orExpr.right)) {
				error(ERR_LIST_NOT_ALLOWED, orExpr, DdPackage.Literals.OR_EXPRESSION__RIGHT)
			}
			val rightType = getExpressionType(orExpr.right)
			if(rightType.value != DataType.BOOL_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_OR, orExpr, DdPackage.Literals.OR_EXPRESSION__RIGHT)
			} else { // first 2 are ok we process the rest of the list
				for (OrExpressionElt orElt : orExpr.orElts) {
					val e = orElt.right
					if(isListExpression(e)) {
						error(ERR_LIST_NOT_ALLOWED, orExpr, DdPackage.Literals.OR_EXPRESSION__OR_ELTS)
					}
					val type = getExpressionType(e)
					if(type.value != DataType.BOOL_VALUE) {
						error(DdExpressionValidator.ERROR_MSG_OR, orExpr, DdPackage.Literals.OR_EXPRESSION__OR_ELTS)
					}
				}
			}
		}
	}

// checks type and operator consistency
	def checkCatExpressionType(CatExpression catExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		val leftType = getExpressionType(catExpr.left)
		if(leftType.value != DataType.STR_VALUE) {
			error(DdExpressionValidator.ERROR_MSG_CAT, catExpr, DdPackage.Literals.CAT_EXPRESSION__LEFT)
		} else {
			val rightType = getExpressionType(catExpr.right)
			if(rightType.value != DataType.STR_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_CAT, catExpr, DdPackage.Literals.CAT_EXPRESSION__RIGHT)
			} else { // first 2 are ok we process the rest of the list
				for (CatExpressionElt catElt : catExpr.catElts) {
					val e = catElt.right
					val type = getExpressionType(e)
					if(type.value != DataType.STR_VALUE) {
						error(DdExpressionValidator.ERROR_MSG_CAT, catExpr, DdPackage.Literals.CAT_EXPRESSION__CAT_ELTS)
					}
				}
			}
		}
	}

// checks homogeneity of a list and returns its type
	def checkListExpressionType(ListExpression listExpr) {
		// means that this unary expression was never processed.otherwise nothing to do as already done.
		var leftType = DataType.INT // by default set as a range of ints
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
				mergeCompatibleDataTypes(cst.value.dataType)
			}
			IdentifierExpression: {
				val identExpr = e as IdentifierExpression
				if(identExpr.value.dataType.value == DataType.BITS_VALUE) {
					error(ERR_BITS_NOT_ALLOWED, identExpr, DdPackage.Literals.IDENTIFIER_EXPRESSION__VALUE)
				}
				mergeCompatibleDataTypes(identExpr.value.dataType)
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

// converts types too for bool like for cast in unary
// manages the conversion of binary operations from (type 'bool operator' type) to Bool
	def convertToBool(BinaryExpression e, DataType t) {
		var type = t
		val opValue = e.op.value

		if((opValue == BinaryOperator.OP_DIF_VALUE ) || (opValue == BinaryOperator.OP_GT_VALUE ) ||
			(opValue == BinaryOperator.OP_EQ_VALUE ) || (opValue == BinaryOperator.OP_GTE_VALUE ) ||
			(opValue == BinaryOperator.OP_LTE_VALUE ) || (opValue == BinaryOperator.OP_LT_VALUE ) ||
			(opValue == BinaryOperator.OP_LIKE_VALUE)) {
			type = DataType.BOOL
		}
		// special case for IN on two strings (no list) that returns a dec (the position of the found string)
		if((opValue == BinaryOperator.OP_IN_VALUE)) {
			if((!(isListExpression(e.right))) && (type.value == DataType.STR_VALUE)) {
				type = DataType.DEC
			} else { // otherwise in is a boolean
				type = DataType.BOOL
			}
		}
		type
	}

// returns DEC for num and STR for strings and DATE for all dates
//operation on datetime var: all is done on a time stamp and rounded/cut to keep only the interesting
//part like only the hours or the date... hence all date compatible
	def DataType mergeCompatibleDataTypes(DataType type) {
		val typeValue = type.value
		switch (typeValue ) {
			case typeValue == DataType.CHR_VALUE:
				DataType.STR
			case typeValue == DataType.INT_VALUE:
				DataType.DEC
			case typeValue == DataType.TIME_VALUE || typeValue == DataType.STAMP_VALUE:
				DataType.DATE
			default:
				type
		}
	}

	// manages the cast conversion too
	def getUnaryType(UnaryExpression e) {
		val opValue = e.op.value
		// first convert the type in case of a cast operator
		switch (opValue ) {
			case opValue == UnaryOperator.DATE_CAST_VALUE:
				DataType.DATE
			case opValue == UnaryOperator.STAMP_CAST_VALUE:
				DataType.STAMP
			case opValue == UnaryOperator.STR_CAST_VALUE:
				DataType.STR
			case opValue == UnaryOperator.DEC_CAST_VALUE:
				DataType.DEC
			case opValue == UnaryOperator.INT_CAST_VALUE:
				DataType.INT
			case opValue == UnaryOperator.TIME_CAST_VALUE:
				DataType.TIME
			case opValue == UnaryOperator.OP_LEN_VALUE:
				DataType.DEC
			case opValue == UnaryOperator.OP_NEG:
				DataType.DEC
			case opValue == UnaryOperator.OP_NOT:
				DataType.BOOL
			default: {
				DataType.UNSET
			}
		}
	// and then merges types by setting/returning the right flag
	}

	// check operator and type compatibility, called after the type was identified for the expression
	// so only on homogeneous expression with same type at that point. Sends error otherwise.
	def checkOperator(SharkExpression e, DataType t) {
		switch (e) {
			BinaryExpression: {
				val binExpr = e as BinaryExpression
				val op = binExpr.op
				val opValue = op.value
				// stxt and in are non homogeneous so not managed here but in caller CheckBinaryExpression
				if(isListExpression(binExpr.right) && (opValue != BinaryOperator.OP_IN_VALUE)) {
					error("Invalid Operator: only in and stxt operator can be used on a list, here it is " + op.literal, binExpr,
						DdPackage.Literals.BINARY_EXPRESSION__OP)
				}
				val type = t.value
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
							computesSizeSTR(binExpr)
						}
					}
					case DataType.DEC_VALUE: {
						if((opValue != BinaryOperator.OP_ADD_VALUE ) && (opValue != BinaryOperator.OP_MULT_VALUE ) &&
							(opValue != BinaryOperator.OP_MOD_VALUE ) && (opValue != BinaryOperator.OP_POW_VALUE ) &&
							(opValue != BinaryOperator.OP_EQ_VALUE ) && (opValue != BinaryOperator.OP_DIF_VALUE ) &&
							(opValue != BinaryOperator.OP_GTE_VALUE ) && (opValue != BinaryOperator.OP_LTE_VALUE ) &&
							(opValue != BinaryOperator.OP_GT_VALUE ) && (opValue != BinaryOperator.OP_LT_VALUE ) &&
							(opValue != BinaryOperator.OP_MIN_VALUE ) && (opValue != BinaryOperator.OP_DIV_VALUE ) &&
							(opValue != BinaryOperator.OP_ROUND_VALUE )) {
							error("Invalid Operator: Numeric type can only use +,*,%,^,==,!=,<=,>=,<,>,-,/ operators, here it is " +
								op.literal, binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
						} else {
							// computes the size/precision depending on operator of the binary expression
							computesSizeDEC(binExpr)
						}
					}
					// plus minus date operations are allowed
					case DataType.DATE_VALUE: {
						if((opValue != BinaryOperator.OP_ADD_VALUE ) && (opValue != BinaryOperator.OP_MIN_VALUE) &&
							(opValue != BinaryOperator.OP_EQ_VALUE ) && (opValue != BinaryOperator.OP_DIF_VALUE ) &&
							(opValue != BinaryOperator.OP_GTE_VALUE ) && (opValue != BinaryOperator.OP_LTE_VALUE ) &&
							(opValue != BinaryOperator.OP_GT_VALUE ) && (opValue != BinaryOperator.OP_LT_VALUE ))
							error("Invalid Operator: type Date can only use +,-,==,!=,<=,>=,<,> operators, here it is " + op.literal,
								binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
					}
					case DataType.BOOL_VALUE: {
						if((opValue != BinaryOperator.OP_EQ_VALUE ) && (opValue != BinaryOperator.OP_DIF_VALUE ) &&
							(opValue != BinaryOperator.OP_GT_VALUE ) && (opValue != BinaryOperator.OP_LT_VALUE ) &&
							(opValue != BinaryOperator.OP_GTE_VALUE ) && (opValue != BinaryOperator.OP_LTE_VALUE ) &&
							(opValue != BinaryOperator.OP_AND_VALUE ) && (opValue != BinaryOperator.OP_OR_VALUE ))
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
				if(isListExpression(unExpr.left)) {
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
							computesSizeSTR(unExpr)
						}
					}
					case typeValue == DataType.DEC_VALUE: {
						if((opValue != UnaryOperator.OP_NEG_VALUE) && (opValue != UnaryOperator.STR_CAST_VALUE)) {
							error("Invalid Operator: Numeric types can only use - operator, here it is " + op.literal, unExpr,
								DdPackage.Literals.UNARY_EXPRESSION__OP)
						} else {
							// computes the size/precision depending on operator of the binary expression
							computesSizeDEC(unExpr)
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

	// determines and stores the length and precision in case of a number type binary expression
	def computesSizeDEC(BinaryExpression binExpr) {
		val op = binExpr.op.value
		val attrSizeLeft = getExpressionSize(binExpr.left)
		val attrSizeRight = getExpressionSize(binExpr.right)
		// consistency with type is already done so one can deduce type
		switch (op) {
			// for numbers
			case ((op == BinaryOperator.OP_ADD_VALUE) || (op == BinaryOperator.OP_MIN_VALUE)): {
				binExpr.setLength((attrSizeLeft.length > attrSizeRight.length) ? attrSizeLeft.length : attrSizeRight.length)
				binExpr.setPrecision((attrSizeLeft.precision > attrSizeRight.precision) ? attrSizeLeft.precision : attrSizeRight.precision)
			}
			case BinaryOperator.OP_DIV_VALUE: {
				binExpr.setLength(attrSizeLeft.length - attrSizeRight.length)
				binExpr.setPrecision(attrSizeLeft.precision + attrSizeRight.length)
			}
			case BinaryOperator.OP_MULT_VALUE: {
				binExpr.setLength(attrSizeLeft.length + attrSizeRight.length)
				binExpr.setPrecision(attrSizeLeft.precision + attrSizeRight.precision)
			}
			case BinaryOperator.OP_POW_VALUE: { // would require evaluation of the value of the exposant, not possible
			// So that forces an overflow of the size and will create and error
			// TODO try and find a way to manage?
			// binExpr.setLength(attrSizeLeft.length*100)
				binExpr.setPrecision(attrSizeLeft.precision * 100)
			}
			case BinaryOperator.OP_MOD_VALUE: {
				// worse case
				binExpr.setLength(attrSizeLeft.length)
				binExpr.setPrecision(attrSizeLeft.precision)
			}
			case BinaryOperator.OP_ROUND_VALUE: {
				// worse case
				binExpr.setLength(attrSizeLeft.length)
				binExpr.setPrecision(Integer.parseInt(calculateExpression(binExpr.right)))
			}
			default: {
			}
		}
	}

	// determines and stores the length and precision in case of a number type unary expression
	def computesSizeDEC(UnaryExpression unExpr) {
		val op = unExpr.op
		val attrSizeLeft = getExpressionSize(unExpr.left)
		// consistency with type is already done so one can deduce type
		switch (op) {
			// for numbers
			case UnaryOperator.OP_NEG: {
				unExpr.setLength(attrSizeLeft.length)
				unExpr.setPrecision(attrSizeLeft.precision)
			}
			case UnaryOperator.STR_CAST: {
				unExpr.setLength(attrSizeLeft.length)
			}
			default: {
			}
		}
	}

	// determines and stores the length and precision in case of a str type binary expression
	def computesSizeSTR(BinaryExpression binExpr) {
		val op = binExpr.op
		// consistency with type is already done so one can deduce type
		if(op === BinaryOperator.OP_CAT) {
			val attrSizeLeft = getExpressionSize(binExpr.left)
			val attrSizeRight = getExpressionSize(binExpr.right)
			binExpr.setLength(attrSizeLeft.length + attrSizeRight.length)
		}
	}

	// determines and stores the length and precision in case of a str type unary expression
	def computesSizeSTR(UnaryExpression unExpr) {
		val op = unExpr.op
		// consistency with type is already done so one can deduce type
		if((op === UnaryOperator.INT_CAST) || (op === UnaryOperator.DEC_CAST)) {
			val attrSizeLeft = getExpressionSize(unExpr.left)
			unExpr.setLength(attrSizeLeft.length)
		}
	}

	// extracts the length and precision from the expression depending on type.
// the descending algo with checkType already did the analysis to store the precision
// and the length in the expression itself in length and precision members, that were added to the 
// Expressions EObject from the dd g xtext grammar (using NULL to ensure it is not parsing anything)
// length and preicision only matter for string and numerical attributes, zero for the rest
	def AttributeSize getExpressionSize(SharkExpression expr) {
		var attrSize = ddFactory.createAttributeSize()
		var length = 0
		var precision = 0
		switch (expr) {
			StrValue: {
				length = (expr as StrValue).value.length
			}
			IntValue: {
				length = (expr as IntValue).value.integerLength
			}
			DecValue: {
				length = (expr as DecValue).value.intValue.integerLength
			}
			CstValue: {
				length = ((expr as CstValue).value.attributeSize).getLength()
				precision = ((expr as CstValue).value.attributeSize).getPrecision()
			}
			IdentifierExpression: {
				length = ((expr as IdentifierExpression).value.attributeSize).getLength()
				precision = ((expr as IdentifierExpression).value.attributeSize).getPrecision()
			}
			BinaryExpression: {
				// gets it from the expression where it was stored during the checktype pass
				length = (expr as BinaryExpression).getLength()
				precision = (expr as BinaryExpression).getPrecision()
			}
			UnaryExpression: {
				// gets it from the expression where it was stored during the checktype pass
				length = (expr as UnaryExpression).getLength()
				precision = (expr as UnaryExpression).getPrecision()
			}
			AddExpression: {
				// gets it from the expression where it was stored during the checktype pass
				length = (expr as AddExpression).getLength()
				precision = (expr as AddExpression).getPrecision()
			}
			MultExpression: {
				// gets it from the expression where it was stored during the checktype pass
				length = (expr as MultExpression).getLength()
				precision = (expr as MultExpression).getPrecision()
			}
		}
		attrSize.setLength(length)
		attrSize.setPrecision(precision)
		attrSize
	}

	//fast calculation of the nbr of digits in an integ
	def integerLength(int integer) {
		// the "length" of 0 is 1:
		if(integer === 0) return 1

		var len = 0;
		var i = integer
		// and for numbers greater than 0:
		// we count how many times it can be divided by 10:
		for (; i > 0; len++) {
			i = i / 10;
		}
		
		len
	}

	// TODO, improve beyond simple literal cases
	def calculateExpression(SharkExpression expr) {
		switch (expr) {
			ChrValue: {
				val chr = expr as ChrValue
				String.valueOf((chr.value))
			}
			StrValue:{
				val str = expr as StrValue
				str.value
			}
			IntValue: {
				val integer = expr as IntValue
				String.valueOf(integer.value)
				}
			DecValue: {
				val dec = expr as DecValue
				dec.value.toPlainString()
			}
			BoolValue: {
				""
				}
			CstValue: {
				val cst = expr as CstValue
				""
			}
			IdentifierExpression: {
				val identExpr = expr as IdentifierExpression
				""
			}
			BinaryExpression: { 
				val binExpr = expr as BinaryExpression
				""
			}
			UnaryExpression: {
				val unExpr = expr as UnaryExpression
				"" 
			}
			AddExpression: {
				val addExpr = expr as AddExpression
				""
			}
			MultExpression: {
				val multExpr = expr as MultExpression
				""
			}
			AndExpression: {
				val andExpr = expr as AndExpression
				""
			}
			OrExpression: {
				val orExpr = expr as OrExpression
				""
			}
			CatExpression: {
				val catExpr = expr as CatExpression
				""
			}
			ListExpression: {
				val listExpr = expr as ListExpression
				""
			}
			UnsetValue: {
				""
			}
			default: {
				""
			}
		}

	}

}
