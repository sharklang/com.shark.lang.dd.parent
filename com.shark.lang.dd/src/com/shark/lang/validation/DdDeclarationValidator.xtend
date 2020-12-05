package com.shark.lang.validation

import com.google.inject.Inject
import com.shark.lang.dd.ArraySize
import com.shark.lang.dd.Attribute
import com.shark.lang.dd.AttributeSize
import com.shark.lang.dd.Constant
import com.shark.lang.dd.DataType
import com.shark.lang.dd.DdPackage
import com.shark.lang.dd.ListExpression
import com.shark.lang.dd.SharkExpression
import com.shark.lang.dd.StrValue
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.AbstractDeclarativeValidator
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar

/**
 * The class focuses on validating the declaration and initialization to default value of
 * constants and attributes in a dd file
 */
class DdDeclarationValidator extends AbstractDeclarativeValidator {

	static val DEC_PRECISION_MANDATORY = "Dec types have a size and precision (n,p) and precision is not zero, or you should use an INT"
	static val ERR_MSG_BITS = "Invalid Bits Format: it should be only 0 and 1"
	static val STR_INT_MAX_MANDATORY = "A size is required for these data types to indicate at least max size or if possible min and max"
	static val INVALID_DATE_ARRAY_INIT = "Invalid Date Array Init: it should be a list of simple date strings"

	static val zero = "0".charAt(0)
	static val one = "1".charAt(0)

	@Inject
	DdExpressionValidator exprValidator;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	// check that declared type are aligned to expression used for declaration
//on attribute and constant defaultValue
	@Check
	def checkTypes(Attribute attr) {
		val attrDataType = attr.dataType
		val attrDefaultValue = attr.defaultValue
		// checks that the expression in default value is of same type as the attribute
		// and enriches the expression with size as it descends the tree
		checkTypes(attrDefaultValue, attrDataType, attr, DdPackage.Literals.ATTRIBUTE__ATTRIBUTE_SIZE)
		// check size mandatory by type and controls the size of default value
		// checks the size between bracket, not the array size
		checkSize(attrDataType.value, attr.attributeSize, attrDefaultValue, attr, DdPackage.Literals.ATTRIBUTE__ATTRIBUTE_SIZE)
		// check that if the variable is an array it has a list of smaller size as a default
		checkArray(attr.arraySize, attr, attr.defaultValue, DdPackage.Literals.ATTRIBUTE__DEFAULT_VALUE)
	}

	// used for both constants and attribute default values
	// calls the expression type parser and manages bits and dates
	// the type checking with getexpressiontype function also gathers sizes and precisions
	def checkTypes(SharkExpression defaultValue, DataType dataType, EObject ctxt, EReference ref) {
		// this first call here ensures all expressions are recursively checked
		val exprType = exprValidator.getExpressionType(defaultValue)
		if(exprType != exprValidator.mergeCompatibleDataTypes(dataType)) {
			// manage the init of bits and dates which is done by strings and raise error otherwise
			if((defaultValue == DataType.BITS_VALUE) && (exprType.value == DataType.STR_VALUE)) {
				// could be ok despite the difference of type if bits or date, unless it is not the right format
				if(!((defaultValue instanceof StrValue) && (checkStringBitsFormat((defaultValue as StrValue).value)))) {
					error(ERR_MSG_BITS, ctxt, ref)
				}
			} else {
				// last possible correct cases with date and time are checked in below function
				// the final error message if types are different is in the manage date function
				manageDateTimeFormats(dataType.value, exprType.value, ctxt, defaultValue, ref)
			}
		}
	}

	// check that declared type are aligned to expression used for declaration
	// on attribute and constant defaultValue
	@Check
	def checkTypes(Constant cst) {
		val cstDataType = cst.dataType
		val cstDefaultValue = cst.defaultValue
		// checks that the expression in default value is of same type as the attribute
		// and enriches the expression with size as it descends the tree
		checkTypes(cstDefaultValue, cstDataType, cst, DdPackage.Literals.CONSTANT__ATTRIBUTE_SIZE)
		// check size mandatory and if size is correct
		checkSize(cstDataType.value, cst.attributeSize, cstDefaultValue, cst, DdPackage.Literals.CONSTANT__ATTRIBUTE_SIZE)
		// check that if the variable is an array it has a list of smaller size as a default
		checkArray(cst.arraySize, cst, cst.defaultValue, DdPackage.Literals.CONSTANT__DEFAULT_VALUE)
	}

	// when used, the types are checked already, only size is verified of array
	def checkArray(ArraySize array, EObject context, SharkExpression defaultValue, EReference eRef) {
		if(array !== null) {
			if(!(exprValidator.isListExpression(defaultValue))) {
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

	// full size with precision mandatory for dec
	// at least size for int str, and can be with n,p in which case it is min max
	// not size for date time and chr
	// verifies if length and expression content is consistent
	def checkSize(int type, AttributeSize size, SharkExpression expr, EObject context, EReference eRef) {
		// then checks the size of the expression. at that stage types are assumed compatibles
		val exprSize = exprValidator.getExpressionSize(expr)
		// first checks the mandatory sizes in the declaration left side depending on type and then the length/precision
		switch (type) {
			case type == DataType.STR_VALUE || type == DataType.INT_VALUE:
				if(size === null) {
					error(STR_INT_MAX_MANDATORY, context, eRef)
				} else {
					if(size.length < exprSize.length) {
						error("Expression length is incompatible with the declaration length, it is " + exprSize.length + " and not " +
							size.length, context, eRef)
					}
					// non mandatory min size is present we use it (min size is stored in precision...)
					if(size.precision != 0) {
						if(size.precision > size.length) {
							error(
								"for str and int declarations when specified min length should be smaller or equal to max length", context, eRef)

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
							error("Expression length is incompatible with the declaration length, it is " + exprSize.length + " and not " +
								size.length, context, eRef)
						}
						if(size.precision != exprSize.precision) {
							error(
								"Expression precision is incompatible with the declaration precision, it is " + exprSize.precision +
									" and not " + size.precision, context, eRef)
						}

					}
				}
			case type == DataType.TIME_VALUE || type == DataType.DATE_VALUE || type == DataType.STAMP_VALUE ||
				type == DataType.BOOL_VALUE || type == DataType.CHR_VALUE:
				// length and precision not mandatory for these
				if(size !== null) {
					error("Date, Time, Stamp, Bool and Char types have no size", context, eRef)
				}
		}

	}

//used in the verification of initializations for constants and attribute to control the specific date and time string format
//allowed to init date and time attributes and constants
	def manageDateTimeFormats(int mainDataType, int exprType, EObject context, SharkExpression defaultValue, EReference eRef) {
		if((mainDataType == DataType.DATE_VALUE) && (exprType == DataType.STR_VALUE)) {
			// could be ok despite the difference of type, unless it is not the right format 
			// at that stage it can either be a list of strings to init an array of dates or a single date and a string
			if(defaultValue instanceof StrValue) { // case of a simple date=string
				if(!checkStringDateFormat((defaultValue as StrValue).value)) {
					error("Invalid Date Format: it should be YYYYMMDD", context, eRef)
				}
			} else if(defaultValue instanceof ListExpression) { // case of a list
				var firstExprElt = (defaultValue as ListExpression).getLeft
				if(firstExprElt instanceof StrValue) {
					// continue to check date validity of first
					if(!checkStringDateFormat((firstExprElt as StrValue).value)) {
						error("Invalid Date Format: it should be YYYYMMDD", context, eRef)
					}
					// and then the list
					for (exprElt : (defaultValue as ListExpression).getListElts) {
						val right = exprElt.right
						if(right instanceof StrValue) {
							// continue to check date validity of first
							if(!checkStringDateFormat((right as StrValue).value)) {
								error("Invalid Date Format: it should be YYYYMMDD", context, eRef)
							}
						} else { // this would cover all other types of lists, like list of strings
							error(INVALID_DATE_ARRAY_INIT, context, eRef)
						}
					}
				} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
					error(INVALID_DATE_ARRAY_INIT, context, eRef)
				}
			} else {
				error(INVALID_DATE_ARRAY_INIT, context, eRef)
			}
		} else {
			if((mainDataType == DataType.TIME_VALUE) && (exprType == DataType.STR_VALUE)) {
				// could be ok despite the difference of type, unless it is not the right format 
				// at that stage it can either be a list of strings to init an array of Times or a single Time and a string
				if(defaultValue instanceof StrValue) { // case of a simple Time=string
					if(!checkStringTimeFormat((defaultValue as StrValue).value)) {
						error("Invalid Time Format: it should be HHMNSS", context, eRef)
					}
				} else if(defaultValue instanceof ListExpression) { // case of a list
					var firstExprElt = (defaultValue as ListExpression).getLeft
					if(firstExprElt instanceof StrValue) {
						// continue to check Time validity of first
						if(!checkStringTimeFormat((firstExprElt as StrValue).value)) {
							error("Invalid Time Format: it should be HHMNSS", context, eRef)
						}
						// and then the list
						for (exprElt : (defaultValue as ListExpression).getListElts) {
							val right = exprElt.right
							if(right instanceof StrValue) {
								// continue to check Time validity of first
								if(!checkStringTimeFormat((right as StrValue).value)) {
									error("Invalid Time Format: it should be HHMNSS", context, eRef)
								}
							} else { // this would cover all other types of lists, like list of strings
								error("Invalid Time Array Init: it should be a list of simple Time strings", context, eRef)
							}
						}
					} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
						error("Invalid Time Array Init: it should be a list of simple Time strings", context, eRef)
					}
				} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
					error("Invalid Time Array Init: it should be a list of simple Time strings", context, eRef)
				}
			} else {
				if((mainDataType == DataType.STAMP_VALUE) && (exprType == DataType.STR_VALUE)) {
					// could be ok despite the difference of type, unless it is not the right format 
					// at that stage it can either be a list of strings to init an array of Times or a single Timestamp and a string
					if(defaultValue instanceof StrValue) { // case of a simple Timestamp=string
						if(!checkStringTimestampFormat((defaultValue as StrValue).value)) {
							error("Invalid Timestamp Format: it should be YYYYMMDD.HHMMSS.ssss", context, eRef)
						}
					} else if(defaultValue instanceof ListExpression) { // case of a list
						var firstExprElt = (defaultValue as ListExpression).getLeft
						if(firstExprElt instanceof StrValue) {
							// continue to check Timestamp validity of first
							if(!checkStringTimestampFormat((firstExprElt as StrValue).value)) {
								error("Invalid Timestamp Format: it should be YYYYMMDD.HHMMSS.ssss", context, eRef)
							}
							// and then the list
							for (exprElt : (defaultValue as ListExpression).getListElts) {
								val right = exprElt.right
								if(right instanceof StrValue) {
									// continue to check Timestamp validity of first
									if(!checkStringTimestampFormat((right as StrValue).value)) {
										error("Invalid Timestamp Format: it should be YYYYMMDD.HHMMSS.ssss", context, eRef)
									}
								} else { // this would cover all other types of lists, like list of strings
									error("Invalid Timestamp Array Init: it should be a list of simple Timestamp strings", context, eRef)
								}
							}
						} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
							error("Invalid Timestamp Array Init: it should be a list of simple Timestamp strings", context, eRef)
						}
					} else { // this would cover all other types of list with numbers or ranges (in which case left is null)
						error("Invalid Timestamp Array Init: it should be a list of simple Timestamp strings", context, eRef)
					}
				} else {
					// in that case we are sure this is a type error, not a date time or timestamp init
					error("Invalid initialization: expression type mismatch with attribute or constant", context, eRef)
				}
			}
		}

	}

//YYYMMDD format verification
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

//"YYYYMMDD.HHMMSS.ssss" format verification
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


}
