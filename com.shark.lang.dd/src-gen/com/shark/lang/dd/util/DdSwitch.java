/**
 * generated by Xtext 2.23.0
 */
package com.shark.lang.dd.util;

import com.shark.lang.dd.AddExpression;
import com.shark.lang.dd.AddExpressionElt;
import com.shark.lang.dd.AndExpression;
import com.shark.lang.dd.AndExpressionElt;
import com.shark.lang.dd.ArraySize;
import com.shark.lang.dd.Attribute;
import com.shark.lang.dd.AttributeSize;
import com.shark.lang.dd.AttributeValue;
import com.shark.lang.dd.BinaryExpression;
import com.shark.lang.dd.BoolValue;
import com.shark.lang.dd.CatExpression;
import com.shark.lang.dd.CatExpressionElt;
import com.shark.lang.dd.CheckExpression;
import com.shark.lang.dd.ChrValue;
import com.shark.lang.dd.Comment;
import com.shark.lang.dd.Constant;
import com.shark.lang.dd.Constraint;
import com.shark.lang.dd.CstValue;
import com.shark.lang.dd.DataModelFragment;
import com.shark.lang.dd.DdPackage;
import com.shark.lang.dd.DecValue;
import com.shark.lang.dd.EntitiesListElt;
import com.shark.lang.dd.Entity;
import com.shark.lang.dd.IntValue;
import com.shark.lang.dd.LineComment;
import com.shark.lang.dd.ListExpression;
import com.shark.lang.dd.ListExpressionElt;
import com.shark.lang.dd.MultExpression;
import com.shark.lang.dd.MultExpressionElt;
import com.shark.lang.dd.OrExpression;
import com.shark.lang.dd.OrExpressionElt;
import com.shark.lang.dd.Relationship;
import com.shark.lang.dd.SharkExpression;
import com.shark.lang.dd.StrValue;
import com.shark.lang.dd.TerminalExpression;
import com.shark.lang.dd.TrailComment;
import com.shark.lang.dd.UnaryExpression;
import com.shark.lang.dd.UnsetValue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.shark.lang.dd.DdPackage
 * @generated
 */
public class DdSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DdPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DdSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DdPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DdPackage.DATA_MODEL_FRAGMENT:
      {
        DataModelFragment dataModelFragment = (DataModelFragment)theEObject;
        T result = caseDataModelFragment(dataModelFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.ATTRIBUTE_SIZE:
      {
        AttributeSize attributeSize = (AttributeSize)theEObject;
        T result = caseAttributeSize(attributeSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.ARRAY_SIZE:
      {
        ArraySize arraySize = (ArraySize)theEObject;
        T result = caseArraySize(arraySize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.RELATIONSHIP:
      {
        Relationship relationship = (Relationship)theEObject;
        T result = caseRelationship(relationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.ENTITIES_LIST_ELT:
      {
        EntitiesListElt entitiesListElt = (EntitiesListElt)theEObject;
        T result = caseEntitiesListElt(entitiesListElt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.CHECK_EXPRESSION:
      {
        CheckExpression checkExpression = (CheckExpression)theEObject;
        T result = caseCheckExpression(checkExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.SHARK_EXPRESSION:
      {
        SharkExpression sharkExpression = (SharkExpression)theEObject;
        T result = caseSharkExpression(sharkExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.BINARY_EXPRESSION:
      {
        BinaryExpression binaryExpression = (BinaryExpression)theEObject;
        T result = caseBinaryExpression(binaryExpression);
        if (result == null) result = caseSharkExpression(binaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = caseSharkExpression(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.ADD_EXPRESSION:
      {
        AddExpression addExpression = (AddExpression)theEObject;
        T result = caseAddExpression(addExpression);
        if (result == null) result = caseSharkExpression(addExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.ADD_EXPRESSION_ELT:
      {
        AddExpressionElt addExpressionElt = (AddExpressionElt)theEObject;
        T result = caseAddExpressionElt(addExpressionElt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.MULT_EXPRESSION:
      {
        MultExpression multExpression = (MultExpression)theEObject;
        T result = caseMultExpression(multExpression);
        if (result == null) result = caseSharkExpression(multExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.MULT_EXPRESSION_ELT:
      {
        MultExpressionElt multExpressionElt = (MultExpressionElt)theEObject;
        T result = caseMultExpressionElt(multExpressionElt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseSharkExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.AND_EXPRESSION_ELT:
      {
        AndExpressionElt andExpressionElt = (AndExpressionElt)theEObject;
        T result = caseAndExpressionElt(andExpressionElt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseSharkExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.OR_EXPRESSION_ELT:
      {
        OrExpressionElt orExpressionElt = (OrExpressionElt)theEObject;
        T result = caseOrExpressionElt(orExpressionElt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.CAT_EXPRESSION:
      {
        CatExpression catExpression = (CatExpression)theEObject;
        T result = caseCatExpression(catExpression);
        if (result == null) result = caseSharkExpression(catExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.CAT_EXPRESSION_ELT:
      {
        CatExpressionElt catExpressionElt = (CatExpressionElt)theEObject;
        T result = caseCatExpressionElt(catExpressionElt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.LIST_EXPRESSION:
      {
        ListExpression listExpression = (ListExpression)theEObject;
        T result = caseListExpression(listExpression);
        if (result == null) result = caseSharkExpression(listExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.LIST_EXPRESSION_ELT:
      {
        ListExpressionElt listExpressionElt = (ListExpressionElt)theEObject;
        T result = caseListExpressionElt(listExpressionElt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.TERMINAL_EXPRESSION:
      {
        TerminalExpression terminalExpression = (TerminalExpression)theEObject;
        T result = caseTerminalExpression(terminalExpression);
        if (result == null) result = caseSharkExpression(terminalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.LINE_COMMENT:
      {
        LineComment lineComment = (LineComment)theEObject;
        T result = caseLineComment(lineComment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.TRAIL_COMMENT:
      {
        TrailComment trailComment = (TrailComment)theEObject;
        T result = caseTrailComment(trailComment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.STR_VALUE:
      {
        StrValue strValue = (StrValue)theEObject;
        T result = caseStrValue(strValue);
        if (result == null) result = caseTerminalExpression(strValue);
        if (result == null) result = caseSharkExpression(strValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.INT_VALUE:
      {
        IntValue intValue = (IntValue)theEObject;
        T result = caseIntValue(intValue);
        if (result == null) result = caseTerminalExpression(intValue);
        if (result == null) result = caseSharkExpression(intValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.DEC_VALUE:
      {
        DecValue decValue = (DecValue)theEObject;
        T result = caseDecValue(decValue);
        if (result == null) result = caseTerminalExpression(decValue);
        if (result == null) result = caseSharkExpression(decValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.CHR_VALUE:
      {
        ChrValue chrValue = (ChrValue)theEObject;
        T result = caseChrValue(chrValue);
        if (result == null) result = caseTerminalExpression(chrValue);
        if (result == null) result = caseSharkExpression(chrValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.CST_VALUE:
      {
        CstValue cstValue = (CstValue)theEObject;
        T result = caseCstValue(cstValue);
        if (result == null) result = caseTerminalExpression(cstValue);
        if (result == null) result = caseSharkExpression(cstValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.BOOL_VALUE:
      {
        BoolValue boolValue = (BoolValue)theEObject;
        T result = caseBoolValue(boolValue);
        if (result == null) result = caseTerminalExpression(boolValue);
        if (result == null) result = caseSharkExpression(boolValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.UNSET_VALUE:
      {
        UnsetValue unsetValue = (UnsetValue)theEObject;
        T result = caseUnsetValue(unsetValue);
        if (result == null) result = caseTerminalExpression(unsetValue);
        if (result == null) result = caseSharkExpression(unsetValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.ATTRIBUTE_VALUE:
      {
        AttributeValue attributeValue = (AttributeValue)theEObject;
        T result = caseAttributeValue(attributeValue);
        if (result == null) result = caseTerminalExpression(attributeValue);
        if (result == null) result = caseSharkExpression(attributeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DdPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseLineComment(comment);
        if (result == null) result = caseTrailComment(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Model Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Model Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataModelFragment(DataModelFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeSize(AttributeSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArraySize(ArraySize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationship(Relationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entities List Elt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entities List Elt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntitiesListElt(EntitiesListElt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckExpression(CheckExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shark Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shark Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSharkExpression(SharkExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpression(BinaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpression(UnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddExpression(AddExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Expression Elt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Expression Elt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddExpressionElt(AddExpressionElt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultExpression(MultExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult Expression Elt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult Expression Elt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultExpressionElt(MultExpressionElt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression Elt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression Elt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpressionElt(AndExpressionElt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression Elt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression Elt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpressionElt(OrExpressionElt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cat Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cat Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCatExpression(CatExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cat Expression Elt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cat Expression Elt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCatExpressionElt(CatExpressionElt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListExpression(ListExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Expression Elt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Expression Elt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListExpressionElt(ListExpressionElt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalExpression(TerminalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineComment(LineComment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trail Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trail Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrailComment(TrailComment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Str Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Str Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrValue(StrValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValue(IntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dec Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dec Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecValue(DecValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chr Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chr Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChrValue(ChrValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cst Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cst Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCstValue(CstValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolValue(BoolValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unset Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unset Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnsetValue(UnsetValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeValue(AttributeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DdSwitch
