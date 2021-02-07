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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.shark.lang.dd.DdPackage
 * @generated
 */
public class DdAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DdPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DdAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DdPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DdSwitch<Adapter> modelSwitch =
    new DdSwitch<Adapter>()
    {
      @Override
      public Adapter caseDataModelFragment(DataModelFragment object)
      {
        return createDataModelFragmentAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeSize(AttributeSize object)
      {
        return createAttributeSizeAdapter();
      }
      @Override
      public Adapter caseArraySize(ArraySize object)
      {
        return createArraySizeAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseEntitiesListElt(EntitiesListElt object)
      {
        return createEntitiesListEltAdapter();
      }
      @Override
      public Adapter caseCheckExpression(CheckExpression object)
      {
        return createCheckExpressionAdapter();
      }
      @Override
      public Adapter caseSharkExpression(SharkExpression object)
      {
        return createSharkExpressionAdapter();
      }
      @Override
      public Adapter caseBinaryExpression(BinaryExpression object)
      {
        return createBinaryExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseAddExpression(AddExpression object)
      {
        return createAddExpressionAdapter();
      }
      @Override
      public Adapter caseAddExpressionElt(AddExpressionElt object)
      {
        return createAddExpressionEltAdapter();
      }
      @Override
      public Adapter caseMultExpression(MultExpression object)
      {
        return createMultExpressionAdapter();
      }
      @Override
      public Adapter caseMultExpressionElt(MultExpressionElt object)
      {
        return createMultExpressionEltAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpressionElt(AndExpressionElt object)
      {
        return createAndExpressionEltAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpressionElt(OrExpressionElt object)
      {
        return createOrExpressionEltAdapter();
      }
      @Override
      public Adapter caseCatExpression(CatExpression object)
      {
        return createCatExpressionAdapter();
      }
      @Override
      public Adapter caseCatExpressionElt(CatExpressionElt object)
      {
        return createCatExpressionEltAdapter();
      }
      @Override
      public Adapter caseListExpression(ListExpression object)
      {
        return createListExpressionAdapter();
      }
      @Override
      public Adapter caseListExpressionElt(ListExpressionElt object)
      {
        return createListExpressionEltAdapter();
      }
      @Override
      public Adapter caseTerminalExpression(TerminalExpression object)
      {
        return createTerminalExpressionAdapter();
      }
      @Override
      public Adapter caseLineComment(LineComment object)
      {
        return createLineCommentAdapter();
      }
      @Override
      public Adapter caseTrailComment(TrailComment object)
      {
        return createTrailCommentAdapter();
      }
      @Override
      public Adapter caseStrValue(StrValue object)
      {
        return createStrValueAdapter();
      }
      @Override
      public Adapter caseIntValue(IntValue object)
      {
        return createIntValueAdapter();
      }
      @Override
      public Adapter caseDecValue(DecValue object)
      {
        return createDecValueAdapter();
      }
      @Override
      public Adapter caseChrValue(ChrValue object)
      {
        return createChrValueAdapter();
      }
      @Override
      public Adapter caseCstValue(CstValue object)
      {
        return createCstValueAdapter();
      }
      @Override
      public Adapter caseBoolValue(BoolValue object)
      {
        return createBoolValueAdapter();
      }
      @Override
      public Adapter caseUnsetValue(UnsetValue object)
      {
        return createUnsetValueAdapter();
      }
      @Override
      public Adapter caseAttributeValue(AttributeValue object)
      {
        return createAttributeValueAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.DataModelFragment <em>Data Model Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.DataModelFragment
   * @generated
   */
  public Adapter createDataModelFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.AttributeSize <em>Attribute Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.AttributeSize
   * @generated
   */
  public Adapter createAttributeSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.ArraySize <em>Array Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.ArraySize
   * @generated
   */
  public Adapter createArraySizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.EntitiesListElt <em>Entities List Elt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.EntitiesListElt
   * @generated
   */
  public Adapter createEntitiesListEltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.CheckExpression <em>Check Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.CheckExpression
   * @generated
   */
  public Adapter createCheckExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.SharkExpression <em>Shark Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.SharkExpression
   * @generated
   */
  public Adapter createSharkExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.BinaryExpression
   * @generated
   */
  public Adapter createBinaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.AddExpression <em>Add Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.AddExpression
   * @generated
   */
  public Adapter createAddExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.AddExpressionElt <em>Add Expression Elt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.AddExpressionElt
   * @generated
   */
  public Adapter createAddExpressionEltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.MultExpression <em>Mult Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.MultExpression
   * @generated
   */
  public Adapter createMultExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.MultExpressionElt <em>Mult Expression Elt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.MultExpressionElt
   * @generated
   */
  public Adapter createMultExpressionEltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.AndExpressionElt <em>And Expression Elt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.AndExpressionElt
   * @generated
   */
  public Adapter createAndExpressionEltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.OrExpressionElt <em>Or Expression Elt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.OrExpressionElt
   * @generated
   */
  public Adapter createOrExpressionEltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.CatExpression <em>Cat Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.CatExpression
   * @generated
   */
  public Adapter createCatExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.CatExpressionElt <em>Cat Expression Elt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.CatExpressionElt
   * @generated
   */
  public Adapter createCatExpressionEltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.ListExpression <em>List Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.ListExpression
   * @generated
   */
  public Adapter createListExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.ListExpressionElt <em>List Expression Elt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.ListExpressionElt
   * @generated
   */
  public Adapter createListExpressionEltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.TerminalExpression <em>Terminal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.TerminalExpression
   * @generated
   */
  public Adapter createTerminalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.LineComment <em>Line Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.LineComment
   * @generated
   */
  public Adapter createLineCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.TrailComment <em>Trail Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.TrailComment
   * @generated
   */
  public Adapter createTrailCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.StrValue <em>Str Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.StrValue
   * @generated
   */
  public Adapter createStrValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.IntValue
   * @generated
   */
  public Adapter createIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.DecValue <em>Dec Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.DecValue
   * @generated
   */
  public Adapter createDecValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.ChrValue <em>Chr Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.ChrValue
   * @generated
   */
  public Adapter createChrValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.CstValue <em>Cst Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.CstValue
   * @generated
   */
  public Adapter createCstValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.BoolValue <em>Bool Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.BoolValue
   * @generated
   */
  public Adapter createBoolValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.UnsetValue <em>Unset Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.UnsetValue
   * @generated
   */
  public Adapter createUnsetValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.AttributeValue
   * @generated
   */
  public Adapter createAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.shark.lang.dd.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.shark.lang.dd.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DdAdapterFactory
