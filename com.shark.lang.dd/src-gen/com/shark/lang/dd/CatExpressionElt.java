/**
 * generated by Xtext 2.23.0
 */
package com.shark.lang.dd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cat Expression Elt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.shark.lang.dd.CatExpressionElt#getOp <em>Op</em>}</li>
 *   <li>{@link com.shark.lang.dd.CatExpressionElt#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.shark.lang.dd.DdPackage#getCatExpressionElt()
 * @model
 * @generated
 */
public interface CatExpressionElt extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.shark.lang.dd.DdPackage#getCatExpressionElt_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.shark.lang.dd.CatExpressionElt#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SharkExpression)
   * @see com.shark.lang.dd.DdPackage#getCatExpressionElt_Right()
   * @model containment="true"
   * @generated
   */
  SharkExpression getRight();

  /**
   * Sets the value of the '{@link com.shark.lang.dd.CatExpressionElt#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SharkExpression value);

} // CatExpressionElt
