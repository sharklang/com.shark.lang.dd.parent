package com.shark.lang.validation

import com.google.inject.Inject
import com.shark.lang.dd.AddExpression
import com.shark.lang.dd.AndExpression
import com.shark.lang.dd.AttributeSize
import com.shark.lang.dd.BinaryExpression
import com.shark.lang.dd.BinaryOperator
import com.shark.lang.dd.BoolValue
import com.shark.lang.dd.CatExpression
import com.shark.lang.dd.ChrValue
import com.shark.lang.dd.CstValue
import com.shark.lang.dd.DataType
import com.shark.lang.dd.DecValue
import com.shark.lang.dd.IdentifierExpression
import com.shark.lang.dd.IntValue
import com.shark.lang.dd.ListExpression
import com.shark.lang.dd.MultExpression
import com.shark.lang.dd.OrExpression
import com.shark.lang.dd.SharkExpression
import com.shark.lang.dd.StrValue
import com.shark.lang.dd.UnaryExpression
import com.shark.lang.dd.UnaryOperator
import com.shark.lang.dd.UnsetValue
import com.shark.lang.dd.impl.DdFactoryImpl
import java.util.regex.Pattern

/**
 * The class focuses on validating expression in check and initialization expressions and of the dd grammar
 * It does the type validation of expressions and validate operators
 * To process Expressions EObjects only once in this recursive expression validation process, boolean were added 
 * to SharkExpression objects in the model to be used here. They use synthetic never instanciated tokens just to create members.
 * There might be a more elegant solution to that but it works well. These booleans flags allow to keep Expression state. 
 * These flags indicate if the expression EObject was already processed/checked and also store the type. 
 * 
 */
class DdExpressionHelper {

	@Inject
	DdFactoryImpl ddFactory

	static val zero = "0".charAt(0)
	static val one = "1".charAt(0)
	static val matcher = Pattern.compile("\\\\(t|n|r|\\\\)") //matches one escape
	static val matcher2 = Pattern.compile("\\\\u(\\d|[A-F]){4}") //matches one unicode escape


	// to manage the different subtypes of list as well as the case of a variable/Constant and return the information
	protected def boolean isListExpression(SharkExpression binExpr) {
		if(binExpr instanceof IdentifierExpression) {
			val ident = binExpr as IdentifierExpression
			((ident.value.arraySize !== null) && (ident.index===null)) //an array identifier without index specified
		} else if(binExpr instanceof CstValue) {
			val cst = binExpr as CstValue
			((cst.value.arraySize !== null) && (cst.index===null)) //an array constant without index specified
		} else if(binExpr instanceof ListExpression) {
			true
		} else
			false
	}

//controls that a string bits has only zero and ones inside
	def boolean checkStringBitsFormat(String bits) {
		val trimmedBits = bits.substring(1, bits.length - 1)
		for (char c : trimmedBits.toCharArray) {
			if((c != one) && (c != zero)) {
				return false
			}
		}
		true
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
				try {
					binExpr.setPrecision(Integer.parseInt(calculateExpression(binExpr.right)))
				} catch(NumberFormatException e) {
					// set precision to left as if no round
					binExpr.setPrecision(attrSizeLeft.precision)
				}
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
		val attrSizeLeft = getExpressionSize(binExpr.left)
		if(op === BinaryOperator.OP_CAT) {
			val attrSizeRight = getExpressionSize(binExpr.right)
			binExpr.setLength(attrSizeLeft.length + attrSizeRight.length)
		} else if(op === BinaryOperator.OP_STXT) {
			// check was done already that stxt is followed by a list but to avoid exception:
			if(isListExpression(binExpr.right)) {
				try {
					val lengthStxt = (binExpr.right as ListExpression).listElts.get(0).right
					binExpr.setLength(Integer.parseInt(calculateExpression(lengthStxt)))
				} catch(Exception e) {
				// TODO  find a better way? expression evaluation would be an endless problem
				// so lets assume worsecase and so:
				binExpr.setLength(attrSizeLeft.length)
				}
			}
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
				var strValue = (expr as StrValue).value.substring(1)
				strValue = strValue.substring(0,strValue.length-1)
				length = strValue.length 
				//if the string contains simple escapes like \n we need to remove 1 count for each
				var m = matcher.matcher(strValue)
				while (m.find){
						length=length - 1
				}
				//if the string contains unicode escapes like \u00AF we need to remove 5 count for each
				m=matcher2.matcher(strValue)
				while (m.find){
						length=length - 5
				}
			}
			ChrValue: {
				//empty string is an empty char... So here can return 1 or 0
				var chrValue = (expr as ChrValue).value.substring(1)
				chrValue = chrValue.substring(0,chrValue.length-1)
				length = chrValue.length
				if (length==2) {
					// verifies \n \r \\ \t 
					if (matcher.matcher(chrValue).matches){
						length=1
					}
				} else if (length==6) {
					// verifies \u1234 
					if (matcher2.matcher(chrValue).matches){
						length=1
					}
				}
			}
			IntValue: {
				length = (expr as IntValue).value.integerLength
			}
			DecValue: {
				length = (expr as DecValue).value.intValue.integerLength
				precision = (expr as DecValue).value.scale
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
			CatExpression: {
				// gets it from the expression where it was stored during the checktype pass
				length = (expr as CatExpression).getLength()
			}
			ListExpression: {
				// For a list we get the max size of its components
				val list = expr as ListExpression
				var exprSize = list.left.getExpressionSize
				length = exprSize.getLength()
				precision = exprSize.getPrecision()
				for(elt:list.listElts) {
					exprSize = elt.right.getExpressionSize
					val newlength=exprSize.getLength()
					length = length>newlength?length:newlength
					val newprecision=exprSize.getPrecision()
					precision = precision>newprecision?precision:newprecision
				} 
			}
		}
		attrSize.setLength(length)
		attrSize.setPrecision(precision)
		attrSize
	}

	// fast calculation of the nbr of digits in an integ
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

	// TODO, improve beyond simple literal cases. Can be done recursively at least a little for constants.
	def String calculateExpression(SharkExpression expr) {
		switch (expr) {
			ChrValue: {
				val chr = expr as ChrValue
				String.valueOf((chr.value))
			}
			StrValue: {
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
				calculateExpression(cst.value.defaultValue)
			}
			IdentifierExpression: {
				val identExpr = expr as IdentifierExpression
				calculateExpression(identExpr.value.defaultValue)
			}
			BinaryExpression: {
				//val binExpr = expr as BinaryExpression
				""
			}
			UnaryExpression: {
				//val unExpr = expr as UnaryExpression
				""
			}
			AddExpression: {
				//val addExpr = expr as AddExpression
				""
			}
			MultExpression: {
				//val multExpr = expr as MultExpression
				""
			}
			AndExpression: {
				//val andExpr = expr as AndExpression
				""
			}
			OrExpression: {
				//val orExpr = expr as OrExpression
				""
			}
			CatExpression: {
				//val catExpr = expr as CatExpression
				""
			}
			ListExpression: {
				//val listExpr = expr as ListExpression
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

	// "YYYYMMDD.HHMMSS.ssss" format verification
	def boolean checkStringTimestampFormat(String dateString) {

		// quotes of the original code are included
		if(dateString.length == 22) {
			val point = '.'.charAt(0)
			val point1 = dateString.charAt(9)
			val point2 = dateString.charAt(16)
			if((point1 == point) && (point2 == point)) {
				try {
					val millisec = Integer.parseInt(dateString.substring(17, 21))
					// var strValTime = DdFactory.eINSTANCE.createStrValue()
					val date = new StringBuilder(10)
					date.append('"').append(dateString.substring(1, 9)).append('"')
					val time = new StringBuilder(8)
					time.append('"').append(dateString.substring(10, 16)).append('"')
					// returns
					((millisec <= 9999) && (millisec >= 0) && checkStringDateFormat(date.toString) && checkStringTimeFormat(time.toString))
				} catch(NumberFormatException e) {
					false
				} catch(StringIndexOutOfBoundsException e) {
					false
				}
			} else {
				false
			}
		} else {
			false
		}
	}

	// YYYMMDD format verification
	def boolean checkStringDateFormat(String dateString) {
		if(dateString.length == 10) { // quotes of the original code are included
			try {
				val year = Integer.parseInt(dateString.substring(1, 5))
				val month = Integer.parseInt(dateString.substring(5, 7))
				val day = Integer.parseInt(dateString.substring(7, 9))
				if((year >= 0) && (year <= 9999) && (month > 0) && (month < 13) && (day > 0) && (day < 32)) {
					// TODO manage leap year (unlikely to use 2902 in a constant though...
					if((month == 2) && (day > 28)) {
						false
					} else {
						true
					}
				} else {
					false
				}
			} catch(NumberFormatException e) {
				false
			} catch(StringIndexOutOfBoundsException e) {
				false
			}
		} else {
			false
		}
	}

//HHMMSS format verification
	def boolean checkStringTimeFormat(String dateString) {
		if(dateString.length == 8) { // quotes of the original code are included
			try {
				val hour = Integer.parseInt(dateString.substring(1, 3))
				val min = Integer.parseInt(dateString.substring(3, 5))
				val sec = Integer.parseInt(dateString.substring(5, 7))
				if((hour >= 0) && (hour < 24) && (min >= 0) && (min < 60) && (sec >= 0) && (sec < 60)) {
					true
				} else {
					false
				}
			} catch(NumberFormatException e) {
				false
			} catch(StringIndexOutOfBoundsException e) {
				false
			}
		} else {
			false
		}
	}

}
