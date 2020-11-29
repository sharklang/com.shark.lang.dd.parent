package com.shark.lang.validation

import com.shark.lang.dd.AddExpression
import com.shark.lang.dd.AddExpressionElt
import com.shark.lang.dd.AndExpression
import com.shark.lang.dd.AndExpressionElt
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
import org.eclipse.xtext.validation.AbstractDeclarativeValidator
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar

/**
 * The class focuses on validating expression in check expression of the dd grammar
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

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

// flags cover only bool,str,num,date so 'str' 'dec' 'date' 'time' 'chr' 'int' 'stamp'
//indeed bits are not allowed in expressions
//attribute types are
//'str' 'dec' 'date' 'time' 'chr' 'int' 'stamp' 'bits' 'bool' unset
//lists are also processed: their type needs to be homogeneous and special cases in, stxt.. are managed
//checks type consistency and operator validity
	@Check
	def checkBinaryExpressionType(BinaryExpression binExpr) {
		// means that this binary expression was never processed.otherwise nothing to do as already done.
		if (!binExpr.boolType && !binExpr.dateType && !binExpr.strType && !binExpr.numType) {
			var isLeftList=isListExpression(binExpr.left) 
			var isRightList=isListExpression(binExpr.right)
			if (isLeftList) {
				error("Incorrect expression: list can only be used on the right of a binary expression", binExpr,
					DdPackage.Literals.BINARY_EXPRESSION__LEFT)
			}
			var leftType = getExpressionType(binExpr.left)
			var rightType = getExpressionType(binExpr.right)
			if (leftType.value != rightType.value) {
				// check the few built in functions as operator that require non homogeneous types and lists: stxt
				// TODO: check that code gen rounds the list items to integer as it is not controlled here
				if ((binExpr.op.value == BinaryOperator.OP_STXT_VALUE)) {
					// first stxt
					if ((binExpr.op.value == BinaryOperator.OP_STXT_VALUE) && (
							  (leftType.value != DataType.STR_VALUE) || (rightType.value != DataType.DEC_VALUE) ||
						!(isRightList) 
							  )) {
						error(
							"Type Mismatch: substring operator requires string on the left and integer list on the right",
							binExpr, DdPackage.Literals.BINARY_EXPRESSION__LEFT)
					// in case of stxt the expression type is a string like left type
					} else {
						setFlagsFromType(binExpr, leftType) // store the result in flags to avoid reprocessing, for stxt the expression is of type str like left
					}
				} else {
					error("Type Mismatch: all the members of the binary expression should be of same type", binExpr,
						DdPackage.Literals.BINARY_EXPRESSION__LEFT)
					setFlagsFromType(binExpr, leftType) // store the result in flags to avoid reprocessing and make it inconsistent
					setFlagsFromType(binExpr, rightType) // with 2 trues set getTypeFrom flag will return UNSET
				}
			} else {
				// ALL GOOD: no error we check the operator compatibility with the type and store the type returned (here leftType)
				// into the entity flags for future use in recursive calls
				checkOperator(binExpr, leftType) // errors generated in case of operator mismatch with type
				setFlagsFromType(binExpr, leftType) // store the result in flags to avoid reprocessing
			}
		}
	}
	
	protected def boolean isListExpression(SharkExpression binExpr) {
		if (binExpr instanceof IdentifierExpression) {
			val ident=binExpr as IdentifierExpression
			ident.value.arraySize!==null
		} else if (binExpr instanceof CstValue) {
			val cst=binExpr as CstValue
			cst.value.arraySize!==null
		} else if (binExpr instanceof ListExpression) {
			true
			} else false
	}

// checks type and operator consistency
	@Check
	def checkUnaryExpressionType(UnaryExpression unExpr) {
		// means that this unary expression was never processed.otherwise nothing to do as already done.
		if (!unExpr.boolType && !unExpr.dateType && !unExpr.strType && !unExpr.numType) {
			if (isListExpression(unExpr.left)) {
				error(ERR_LIST_NOT_ALLOWED, unExpr,
					DdPackage.Literals.UNARY_EXPRESSION__LEFT)
			}
			var leftType = getExpressionType(unExpr.left)
			checkOperator(unExpr, leftType) // errors generated in case of operator mismatch with type
			setFlagsFromType(unExpr, leftType) // store the result in flags to avoid reprocessing
		}
	}

// checks type and operator consistency
	@Check
	def checkAddExpressionType(AddExpression addExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if (!addExpr.checked) {
			if (isListExpression(addExpr.left)) {
				error(ERR_LIST_NOT_ALLOWED,
					addExpr, DdPackage.Literals.ADD_EXPRESSION__LEFT)
			}
			addExpr.checked = true // no reprocessing beyond this one
			val leftType = getExpressionType(addExpr.left)
			if (leftType.value != DataType.DEC_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_ADD, addExpr, DdPackage.Literals.ADD_EXPRESSION__LEFT)
			} else {
				val rightType = getExpressionType(addExpr.right)
				if (isListExpression(addExpr.right)) {
					error(ERR_LIST_NOT_ALLOWED,
						addExpr, DdPackage.Literals.ADD_EXPRESSION__RIGHT)
				}
				if (rightType.value != DataType.DEC_VALUE) {
					error(DdExpressionValidator.ERROR_MSG_ADD, addExpr, DdPackage.Literals.ADD_EXPRESSION__RIGHT)
				} else { // first 2 are ok we process the rest of the list
					for (AddExpressionElt addElt : addExpr.addElts) {
						val e = addElt.right
						if (isListExpression(e )) {
							error(
								ERR_LIST_NOT_ALLOWED,
								addExpr, DdPackage.Literals.ADD_EXPRESSION__ADD_ELTS)
						}
						val type = getExpressionType(e)
						if (type.value != DataType.DEC_VALUE) {
							error(DdExpressionValidator.ERROR_MSG_ADD, addExpr,
								DdPackage.Literals.ADD_EXPRESSION__ADD_ELTS)
						}
					}
				}
			}
		}
	}

// checks type and operator consistency
	@Check
	def checkMultExpressionType(MultExpression multExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if (!multExpr.checked) {
			if (isListExpression(multExpr.left)) {
				error(ERR_LIST_NOT_ALLOWED,
					multExpr, DdPackage.Literals.MULT_EXPRESSION__LEFT)
			}
			multExpr.checked = true // no reprocessing beyond this one
			val leftType = getExpressionType(multExpr.left)
			if (leftType.value != DataType.DEC_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_MULT, multExpr, DdPackage.Literals.MULT_EXPRESSION__LEFT)
			} else {
				val rightType = getExpressionType(multExpr.right)
				if (isListExpression(multExpr.right)) {
					error(ERR_LIST_NOT_ALLOWED,
						multExpr, DdPackage.Literals.MULT_EXPRESSION__RIGHT)
				}
				if (rightType.value != DataType.DEC_VALUE) {
					error(DdExpressionValidator.ERROR_MSG_MULT, multExpr, DdPackage.Literals.MULT_EXPRESSION__RIGHT)
				} else { // first 2 are ok we process the rest of the list
					for (MultExpressionElt multElt : multExpr.multElts) {
						val e = multElt.right
						if (isListExpression(e)) {
							error(
								ERR_LIST_NOT_ALLOWED,
								multExpr, DdPackage.Literals.MULT_EXPRESSION__MULT_ELTS)
						}
						val type = getExpressionType(e)
						if (type.value != DataType.DEC_VALUE) {
							error(DdExpressionValidator.ERROR_MSG_MULT, multExpr,
								DdPackage.Literals.MULT_EXPRESSION__MULT_ELTS)
						}
					}
				}
			}
		}
	}

// checks type and operator consistency
	@Check
	def checkAndExpressionType(AndExpression andExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if (!andExpr.checked) {
			if (isListExpression(andExpr.left)) {
				error(ERR_LIST_NOT_ALLOWED,
					andExpr, DdPackage.Literals.AND_EXPRESSION__LEFT)
			}
			andExpr.checked = true // no reprocessing beyond this one
			val leftType = getExpressionType(andExpr.left)
			if (leftType.value != DataType.BOOL_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_AND, andExpr, DdPackage.Literals.AND_EXPRESSION__LEFT)
			} else {
				if (isListExpression(andExpr.right)) {
					error(ERR_LIST_NOT_ALLOWED,
						andExpr, DdPackage.Literals.AND_EXPRESSION__RIGHT)
				}
				val rightType = getExpressionType(andExpr.right)
				if (rightType.value != DataType.BOOL_VALUE) {
					error(DdExpressionValidator.ERROR_MSG_AND, andExpr, DdPackage.Literals.AND_EXPRESSION__RIGHT)
				} else { // first 2 are ok we process the rest of the list
					for (AndExpressionElt andElt : andExpr.andElts) {
						val e = andElt.right
						if (isListExpression(e)) {
							error(
								ERR_LIST_NOT_ALLOWED,
								andExpr, DdPackage.Literals.AND_EXPRESSION__AND_ELTS)
						}
						val type = getExpressionType(e)
						if (type.value != DataType.BOOL_VALUE) {
							error(DdExpressionValidator.ERROR_MSG_AND, andExpr,
								DdPackage.Literals.AND_EXPRESSION__AND_ELTS)
						}
					}
				}
			}
		}
	}


// checks type and operator consistency
	@Check
	def checkOrExpressionType(OrExpression orExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if (!orExpr.checked) {
			orExpr.checked = true // no reprocessing beyond this one
			if (isListExpression(orExpr.left)) {
				error(ERR_LIST_NOT_ALLOWED, orExpr, DdPackage.Literals.OR_EXPRESSION__LEFT)
			}
			val leftType = getExpressionType(orExpr.left)
			if (leftType.value != DataType.BOOL_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_OR, orExpr, DdPackage.Literals.OR_EXPRESSION__LEFT)
			} else {
				if (isListExpression(orExpr.right)) {
					error(ERR_LIST_NOT_ALLOWED, orExpr, DdPackage.Literals.OR_EXPRESSION__RIGHT)
				}
				val rightType = getExpressionType(orExpr.right)
				if (rightType.value != DataType.BOOL_VALUE) {
					error(DdExpressionValidator.ERROR_MSG_OR, orExpr, DdPackage.Literals.OR_EXPRESSION__RIGHT)
				} else { // first 2 are ok we process the rest of the list
					for (OrExpressionElt orElt : orExpr.orElts) {
						val e = orElt.right
						if (isListExpression(e)) {
							error(ERR_LIST_NOT_ALLOWED, orExpr, DdPackage.Literals.OR_EXPRESSION__OR_ELTS)
						}
						val type = getExpressionType(e)
						if (type.value != DataType.BOOL_VALUE) {
							error(DdExpressionValidator.ERROR_MSG_OR, orExpr, DdPackage.Literals.OR_EXPRESSION__OR_ELTS)
						}
					}
				}
			}
		}
	}

// checks type and operator consistency
	@Check
	def checkCatExpressionType(CatExpression catExpr) {
		// means that this add expression was never processed.otherwise nothing to do as already done.
		if (!catExpr.checked) {
			catExpr.checked = true // no reprocessing beyond this one
			val leftType = getExpressionType(catExpr.left)
			if (leftType.value != DataType.STR_VALUE) {
				error(DdExpressionValidator.ERROR_MSG_CAT, catExpr, DdPackage.Literals.CAT_EXPRESSION__LEFT)
			} else {
				val rightType = getExpressionType(catExpr.right)
				if (rightType.value != DataType.STR_VALUE) {
					error(DdExpressionValidator.ERROR_MSG_CAT, catExpr, DdPackage.Literals.CAT_EXPRESSION__RIGHT)
				} else { // first 2 are ok we process the rest of the list
					for (CatExpressionElt catElt : catExpr.catElts) {
						val e = catElt.right
						val type = getExpressionType(e)
						if (type.value != DataType.STR_VALUE) {
							error(DdExpressionValidator.ERROR_MSG_CAT, catExpr,
								DdPackage.Literals.CAT_EXPRESSION__CAT_ELTS)
						}
					}
				}
			}
		}
	}

	@Check
// checks homogeneity of a list and returns its type
	def checkListExpressionType(ListExpression listExpr) {
		// means that this unary expression was never processed.otherwise nothing to do as already done.
		if (!listExpr.boolType && !listExpr.dateType && !listExpr.strType && !listExpr.numType) {
			var leftType= DataType.INT //by default set as a range of ints
			if (listExpr.left !== null) { //in that case it means it is a list not a range
				leftType = listExpr.left.expressionType
				for (ListExpressionElt listElt : listExpr.listElts) {
					val rightType = listElt.right.expressionType
					if (rightType.value != leftType.value) {
						error("Types of elements in a list should all be the same", listExpr,
							DdPackage.Literals.LIST_EXPRESSION__LIST_ELTS)
						setFlagsFromType(listExpr, leftType)
						setFlagsFromType(listExpr, rightType) // with two different value that will be considered as UNSET
					}
				}
			}
			setFlagsFromType(listExpr, leftType) // store the result in flags to avoid reprocessing
		}
	}

// returns the type and also calls the check type function recursively if required, so generates errors too
// note that bits are not allowed
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
				if (cst.value.dataType.value == DataType.BITS_VALUE) {
					error(ERR_BITS_NOT_ALLOWED, cst, DdPackage.Literals.CST_VALUE__VALUE)
				}
				mergeCompatibleDataTypes(cst.value.dataType)
			}
			IdentifierExpression: {
				val identExpr = e as IdentifierExpression
				if (identExpr.value.dataType.value == DataType.BITS_VALUE) {
					error(ERR_BITS_NOT_ALLOWED, identExpr, DdPackage.Literals.IDENTIFIER_EXPRESSION__VALUE)
				}
				mergeCompatibleDataTypes(identExpr.value.dataType)
			}
			BinaryExpression: { // triggers recursive call of the check method, hence the flags to avoid reprocess
				val binExpr = e as BinaryExpression
				checkBinaryExpressionType(binExpr)
				getTypeFromFlags(binExpr.boolType, binExpr.dateType, binExpr.strType, binExpr.numType)
			}
			UnaryExpression: {
				val unExpr = e as UnaryExpression
				checkUnaryExpressionType(unExpr) // triggers recursive call of the check method, hence the flags to avoid reprocess
				getTypeFromFlags(unExpr.boolType, unExpr.dateType, unExpr.strType, unExpr.numType)
			}
			AddExpression: {
				val addExpr = e as AddExpression
				checkAddExpressionType(addExpr) // triggers recursive call of the check method, hence the flags to avoid reprocess
				DataType.DEC // even if the underlying generates error return the theoretical type of a correct one. avoid error cascade.
			}
			MultExpression: {
				val multExpr = e as MultExpression
				checkMultExpressionType(multExpr) // triggers recursive call of the check method, hence the flags to avoid reprocess
				DataType.DEC // even if the underlying generates error return the theoretical type of a correct one. avoid error cascade.
			}
			AndExpression: {
				val andExpr = e as AndExpression
				checkAndExpressionType(andExpr) // triggers recursive call of the check method, hence the flags to avoid reprocess
				DataType.BOOL
			}
			OrExpression: {
				val orExpr = e as OrExpression
				checkOrExpressionType(orExpr) // triggers recursive call of the check method, hence the flags to avoid reprocess
				DataType.BOOL
			}
			CatExpression: {
				val catExpr = e as CatExpression
				checkCatExpressionType(catExpr) // triggers recursive call of the check method, hence the flags to avoid reprocess
				DataType.STR
			}
			ListExpression: {
				val listExpr = e as ListExpression
				checkListExpressionType(listExpr) // triggers recursive call of the check method, hence the flags to avoid reprocess
				getTypeFromFlags(listExpr.boolType, listExpr.dateType, listExpr.strType, listExpr.numType)
			}
		}
	}

// returns the type from the flag structure
	def DataType getTypeFromFlags(boolean boolType, boolean dateType, boolean strType, boolean numType) {
		if (!boolType && !dateType && !strType && !numType) {
			DataType.UNSET
		} else if (strType) {
			if (boolType || dateType || numType) {
				DataType.UNSET
			} else {
				DataType.STR
			}
		} else if (numType) {
			if (boolType || dateType || strType) {
				DataType.UNSET
			} else {
				DataType.DEC
			}
		} else if (dateType) {
			if (boolType || strType || numType) {
				DataType.UNSET
			} else {
				DataType.DATE
			}
		} else if (boolType) {
			if (strType || dateType || numType) {
				DataType.UNSET
			} else {
				DataType.BOOL
			}
		}
	}

// sets the flags from the type, and also converts types too for bool like for cast in unary
// DataTypes: 'str' 'dec' 'date' 'time' 'chr' 'int' 'stamp' 'bits' 'bool' unset
// manages the conversion of binary operations from (type 'bool operator' type) to Bool
	def setFlagsFromType(BinaryExpression e, DataType t) {
		var type = t
		val opValue = e.op.value

		if ((opValue == BinaryOperator.OP_DIF_VALUE ) || (opValue == BinaryOperator.OP_GT_VALUE ) ||
			(opValue == BinaryOperator.OP_EQ_VALUE ) || (opValue == BinaryOperator.OP_GTE_VALUE ) ||
			(opValue == BinaryOperator.OP_LTE_VALUE ) || (opValue == BinaryOperator.OP_LT_VALUE ) ||
			(opValue == BinaryOperator.OP_LIKE_VALUE)) {
			type = DataType.BOOL
		}
		// special case for IN on two strings (no list) that returns a dec (the position of the found string)
		if ((opValue == BinaryOperator.OP_IN_VALUE)) {
			if ((!(isListExpression(e.right))) && (type.value == DataType.STR_VALUE)) {
				type = DataType.DEC
			} else { // otherwise in is a boolean
				type = DataType.BOOL
			}
		}

		val typeValue = type.value
		switch (typeValue ) {
			case typeValue == DataType.STR_VALUE || typeValue == DataType.CHR_VALUE:
				e.strType = true
			case typeValue == DataType.DEC_VALUE || typeValue == DataType.INT_VALUE:
				e.numType = true
			case typeValue == DataType.TIME_VALUE || typeValue == DataType.DATE_VALUE ||
				typeValue == DataType.STAMP_VALUE:
				e.dateType = true
			case typeValue == DataType.BOOL_VALUE:
				e.boolType = true
			default: {
			}
		}
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

	// set the flags in the Expression EObject from the Datatype given
	// manages the cast conversion too
	def setFlagsFromType(UnaryExpression e, DataType t) {
		var type = t
		val opValue = e.op.value
		// first convert the type in case of a cast operator
		switch (opValue ) {
			case opValue == UnaryOperator.DATE_CAST_VALUE:
				type = DataType.DATE
			case opValue == UnaryOperator.STAMP_CAST_VALUE:
				type = DataType.STAMP
			case opValue == UnaryOperator.STR_CAST_VALUE:
				type = DataType.STR
			case opValue == UnaryOperator.DEC_CAST_VALUE:
				type = DataType.DEC
			case opValue == UnaryOperator.INT_CAST_VALUE:
				type = DataType.INT
			case opValue == UnaryOperator.TIME_CAST_VALUE:
				type = DataType.TIME
			case opValue == UnaryOperator.OP_LEN_VALUE:
				type = DataType.INT
			default: {
			}
		}
		// and then merges types by setting/returning the right flag
		val typeValue = type.value
		switch (typeValue) {
			case typeValue == DataType.STR_VALUE || typeValue == DataType.CHR_VALUE:
				e.strType = true
			case typeValue == DataType.DEC_VALUE || typeValue == DataType.INT_VALUE:
				e.numType = true
			case typeValue == DataType.TIME_VALUE || typeValue == DataType.DATE_VALUE ||
				typeValue == DataType.STAMP_VALUE:
				e.dateType = true
			case typeValue == DataType.BOOL_VALUE:
				e.boolType = true
			default: {
			}
		}
	}

	// sets the flags from the type
	def setFlagsFromType(ListExpression e, DataType t) {
		val typeValue = t.value
		switch (typeValue ) {
			case typeValue == DataType.STR_VALUE || typeValue == DataType.CHR_VALUE:
				e.strType = true
			case typeValue == DataType.DEC_VALUE || typeValue == DataType.INT_VALUE:
				e.numType = true
			case typeValue == DataType.TIME_VALUE || typeValue == DataType.DATE_VALUE ||
				typeValue == DataType.STAMP_VALUE:
				e.dateType = true
			case typeValue == DataType.BOOL_VALUE:
				e.boolType = true
			default: {
			}
		}
	}

	// check operator and type compatibility, called after the type was identified for the expression
	// so only on homogeneous expression with same type at that point. Sends error otherwise.
	def checkOperator(SharkExpression e, DataType t) {
		switch (e) {
			BinaryExpression: {
				val binExpr = e as BinaryExpression
				val op = binExpr.op
				val opValue = op.value
				val type = t.value
				val isRightList = isListExpression(e.right)
				switch (type) {
					case isRightList: {
						// stxt and round are non homogeneous so not managed here but in caller CheckBinaryExpression
						if (opValue != BinaryOperator.OP_IN_VALUE) {
							error("Invalid Operator: only in operator can be used on a list, here it is " + op.literal,
								binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
						}
					}
					// > and < operators compare string in alpha order, as there is the len function otherwise to easily use
					case type == DataType.STR_VALUE && !isRightList: {
						if ((opValue != BinaryOperator.OP_CAT_VALUE) && (opValue != BinaryOperator.OP_EQ_VALUE ) &&
							(opValue != BinaryOperator.OP_DIF_VALUE ) && (opValue != BinaryOperator.OP_LIKE_VALUE ) &&
							(opValue != BinaryOperator.OP_IN_VALUE ) && (opValue != BinaryOperator.OP_GTE_VALUE ) &&
							(opValue != BinaryOperator.OP_LTE_VALUE ) && (opValue != BinaryOperator.OP_GT_VALUE ) &&
							(opValue != BinaryOperator.OP_LT_VALUE ))
							error(
								"Invalid Operator: String and character types can only use &, ==, != and like operators, here it is " +
									op.literal, binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
					}
					case type == DataType.DEC_VALUE && !isRightList: {
						if ((opValue != BinaryOperator.OP_ADD_VALUE ) && (opValue != BinaryOperator.OP_MULT_VALUE ) &&
							(opValue != BinaryOperator.OP_MOD_VALUE ) && (opValue != BinaryOperator.OP_POW_VALUE ) &&
							(opValue != BinaryOperator.OP_EQ_VALUE ) && (opValue != BinaryOperator.OP_DIF_VALUE ) &&
							(opValue != BinaryOperator.OP_GTE_VALUE ) && (opValue != BinaryOperator.OP_LTE_VALUE ) &&
							(opValue != BinaryOperator.OP_GT_VALUE ) && (opValue != BinaryOperator.OP_LT_VALUE ) &&
							(opValue != BinaryOperator.OP_MIN_VALUE ) && (opValue != BinaryOperator.OP_DIV_VALUE ) &&
							(opValue != BinaryOperator.OP_ROUND_VALUE ))
							error(
								"Invalid Operator: Numeric type can only use +,*,%,^,==,!=,<=,>=,<,>,-,/ operators, here it is " +
									op.literal, binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
					}
					// plus minus date operations are allowed
					case type == DataType.DATE_VALUE && !isRightList: {
						if ((opValue != BinaryOperator.OP_ADD_VALUE ) && (opValue != BinaryOperator.OP_MIN_VALUE) &&
							(opValue != BinaryOperator.OP_EQ_VALUE ) && (opValue != BinaryOperator.OP_DIF_VALUE ) &&
							(opValue != BinaryOperator.OP_GTE_VALUE ) && (opValue != BinaryOperator.OP_LTE_VALUE ) &&
							(opValue != BinaryOperator.OP_GT_VALUE ) && (opValue != BinaryOperator.OP_LT_VALUE ))
							error(
								"Invalid Operator: type Date can only use +,-,==,!=,<=,>=,<,> operators, here it is " +
									op.literal, binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
					}
					case type == DataType.BOOL_VALUE && !isRightList: {
						if ((opValue != BinaryOperator.OP_EQ_VALUE ) && (opValue != BinaryOperator.OP_DIF_VALUE ) &&
							(opValue != BinaryOperator.OP_GT_VALUE ) && (opValue != BinaryOperator.OP_LT_VALUE ) &&
							(opValue != BinaryOperator.OP_GTE_VALUE ) && (opValue != BinaryOperator.OP_LTE_VALUE ) &&
							(opValue != BinaryOperator.OP_AND_VALUE ) && (opValue != BinaryOperator.OP_OR_VALUE ))
							error("Invalid Operator: type Boolean can only use ==,!=,<=,>=,<,> operators, here it is " +
								op.literal, binExpr, DdPackage.Literals.BINARY_EXPRESSION__OP)
					}
					default: {
						error("Unexpected error during operator validation", binExpr,
							DdPackage.Literals.BINARY_EXPRESSION__OP)
					}
				}
			}
			UnaryExpression: {
				val unExpr = e as UnaryExpression
				val op = unExpr.op
				val opValue = op.value
				val typeValue = t.value
				switch (typeValue) {
					case typeValue == DataType.STR_VALUE: {
						if ((opValue != UnaryOperator.DATE_CAST_VALUE) && (opValue != UnaryOperator.INT_CAST_VALUE) &&
							(opValue != UnaryOperator.DEC_CAST_VALUE) && (opValue != UnaryOperator.OP_LEN_VALUE) &&
							(opValue != UnaryOperator.TIME_CAST_VALUE) && (opValue != UnaryOperator.STAMP_CAST_VALUE))
							error(
								"Invalid Operator: String and character types can only use stxt(),int(),dec(),len(),date() and time() functions, here it is " +
									op.literal, unExpr, DdPackage.Literals.UNARY_EXPRESSION__OP)
					}
					case typeValue == DataType.DEC_VALUE: {
						if ((opValue != UnaryOperator.OP_NEG_VALUE) && (opValue != UnaryOperator.STR_CAST_VALUE))
							error("Invalid Operator: Numeric types can only use - operator, here it is " + op.literal,
								unExpr, DdPackage.Literals.UNARY_EXPRESSION__OP)
					}
					case typeValue == DataType.DATE_VALUE: {
						error("Invalid Operator: Date types cannot use unary operator, here it is " + op.literal,
							unExpr, DdPackage.Literals.UNARY_EXPRESSION__OP)
					}
					case typeValue == DataType.BOOL_VALUE: {
						if (opValue != UnaryOperator.OP_NOT_VALUE)
							error(
								"Invalid Operator: Boolean types can only use not() function, here it is " + op.literal,
								unExpr, DdPackage.Literals.UNARY_EXPRESSION__OP)
					}
					default: {
					}
				}
			}
		}
	}
}
