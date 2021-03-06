/**
 * generated by Xtext 2.23.0
 */
package com.shark.lang.dd.impl;

import com.shark.lang.dd.ArraySize;
import com.shark.lang.dd.Attribute;
import com.shark.lang.dd.AttributeSize;
import com.shark.lang.dd.DataType;
import com.shark.lang.dd.DdPackage;
import com.shark.lang.dd.LineComment;
import com.shark.lang.dd.SharkExpression;
import com.shark.lang.dd.TrailComment;

import java.lang.Boolean;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#getExtraAttrDesc <em>Extra Attr Desc</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#getAttributeSize <em>Attribute Size</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#isPartitionKey <em>Partition Key</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link com.shark.lang.dd.impl.AttributeImpl#getAttrDesc <em>Attr Desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The cached value of the '{@link #getExtraAttrDesc() <em>Extra Attr Desc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraAttrDesc()
   * @generated
   * @ordered
   */
  protected EList<LineComment> extraAttrDesc;

  /**
   * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected static final DataType DATA_TYPE_EDEFAULT = DataType.STR;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected DataType dataType = DATA_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributeSize() <em>Attribute Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeSize()
   * @generated
   * @ordered
   */
  protected AttributeSize attributeSize;

  /**
   * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArraySize()
   * @generated
   * @ordered
   */
  protected ArraySize arraySize;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected SharkExpression defaultValue;

  /**
   * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrimaryKey()
   * @generated
   * @ordered
   */
  protected static final boolean PRIMARY_KEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrimaryKey()
   * @generated
   * @ordered
   */
  protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #isPartitionKey() <em>Partition Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartitionKey()
   * @generated
   * @ordered
   */
  protected static final boolean PARTITION_KEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartitionKey() <em>Partition Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartitionKey()
   * @generated
   * @ordered
   */
  protected boolean partitionKey = PARTITION_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected static final boolean MANDATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected boolean mandatory = MANDATORY_EDEFAULT;

  /**
   * The default value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeprecated()
   * @generated
   * @ordered
   */
  protected static final boolean DEPRECATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeprecated()
   * @generated
   * @ordered
   */
  protected boolean deprecated = DEPRECATED_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttrDesc() <em>Attr Desc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrDesc()
   * @generated
   * @ordered
   */
  protected TrailComment attrDesc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DdPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LineComment> getExtraAttrDesc()
  {
    if (extraAttrDesc == null)
    {
      extraAttrDesc = new EObjectContainmentEList<LineComment>(LineComment.class, this, DdPackage.ATTRIBUTE__EXTRA_ATTR_DESC);
    }
    return extraAttrDesc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataType getDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataType(DataType newDataType)
  {
    DataType oldDataType = dataType;
    dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeSize getAttributeSize()
  {
    return attributeSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeSize(AttributeSize newAttributeSize, NotificationChain msgs)
  {
    AttributeSize oldAttributeSize = attributeSize;
    attributeSize = newAttributeSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__ATTRIBUTE_SIZE, oldAttributeSize, newAttributeSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttributeSize(AttributeSize newAttributeSize)
  {
    if (newAttributeSize != attributeSize)
    {
      NotificationChain msgs = null;
      if (attributeSize != null)
        msgs = ((InternalEObject)attributeSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdPackage.ATTRIBUTE__ATTRIBUTE_SIZE, null, msgs);
      if (newAttributeSize != null)
        msgs = ((InternalEObject)newAttributeSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdPackage.ATTRIBUTE__ATTRIBUTE_SIZE, null, msgs);
      msgs = basicSetAttributeSize(newAttributeSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__ATTRIBUTE_SIZE, newAttributeSize, newAttributeSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArraySize getArraySize()
  {
    return arraySize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArraySize(ArraySize newArraySize, NotificationChain msgs)
  {
    ArraySize oldArraySize = arraySize;
    arraySize = newArraySize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__ARRAY_SIZE, oldArraySize, newArraySize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArraySize(ArraySize newArraySize)
  {
    if (newArraySize != arraySize)
    {
      NotificationChain msgs = null;
      if (arraySize != null)
        msgs = ((InternalEObject)arraySize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdPackage.ATTRIBUTE__ARRAY_SIZE, null, msgs);
      if (newArraySize != null)
        msgs = ((InternalEObject)newArraySize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdPackage.ATTRIBUTE__ARRAY_SIZE, null, msgs);
      msgs = basicSetArraySize(newArraySize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__ARRAY_SIZE, newArraySize, newArraySize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SharkExpression getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(SharkExpression newDefaultValue, NotificationChain msgs)
  {
    SharkExpression oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefaultValue(SharkExpression newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdPackage.ATTRIBUTE__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdPackage.ATTRIBUTE__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isPrimaryKey()
  {
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrimaryKey(boolean newPrimaryKey)
  {
    boolean oldPrimaryKey = primaryKey;
    primaryKey = newPrimaryKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isPartitionKey()
  {
    return partitionKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPartitionKey(boolean newPartitionKey)
  {
    boolean oldPartitionKey = partitionKey;
    partitionKey = newPartitionKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__PARTITION_KEY, oldPartitionKey, partitionKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMandatory(boolean newMandatory)
  {
    boolean oldMandatory = mandatory;
    mandatory = newMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__MANDATORY, oldMandatory, mandatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isDeprecated()
  {
    return deprecated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeprecated(boolean newDeprecated)
  {
    boolean oldDeprecated = deprecated;
    deprecated = newDeprecated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__DEPRECATED, oldDeprecated, deprecated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TrailComment getAttrDesc()
  {
    return attrDesc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttrDesc(TrailComment newAttrDesc, NotificationChain msgs)
  {
    TrailComment oldAttrDesc = attrDesc;
    attrDesc = newAttrDesc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__ATTR_DESC, oldAttrDesc, newAttrDesc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttrDesc(TrailComment newAttrDesc)
  {
    if (newAttrDesc != attrDesc)
    {
      NotificationChain msgs = null;
      if (attrDesc != null)
        msgs = ((InternalEObject)attrDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdPackage.ATTRIBUTE__ATTR_DESC, null, msgs);
      if (newAttrDesc != null)
        msgs = ((InternalEObject)newAttrDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdPackage.ATTRIBUTE__ATTR_DESC, null, msgs);
      msgs = basicSetAttrDesc(newAttrDesc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdPackage.ATTRIBUTE__ATTR_DESC, newAttrDesc, newAttrDesc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DdPackage.ATTRIBUTE__EXTRA_ATTR_DESC:
        return ((InternalEList<?>)getExtraAttrDesc()).basicRemove(otherEnd, msgs);
      case DdPackage.ATTRIBUTE__ATTRIBUTE_SIZE:
        return basicSetAttributeSize(null, msgs);
      case DdPackage.ATTRIBUTE__ARRAY_SIZE:
        return basicSetArraySize(null, msgs);
      case DdPackage.ATTRIBUTE__DEFAULT_VALUE:
        return basicSetDefaultValue(null, msgs);
      case DdPackage.ATTRIBUTE__ATTR_DESC:
        return basicSetAttrDesc(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DdPackage.ATTRIBUTE__EXTRA_ATTR_DESC:
        return getExtraAttrDesc();
      case DdPackage.ATTRIBUTE__DATA_TYPE:
        return getDataType();
      case DdPackage.ATTRIBUTE__ATTRIBUTE_SIZE:
        return getAttributeSize();
      case DdPackage.ATTRIBUTE__ARRAY_SIZE:
        return getArraySize();
      case DdPackage.ATTRIBUTE__NAME:
        return getName();
      case DdPackage.ATTRIBUTE__DEFAULT_VALUE:
        return getDefaultValue();
      case DdPackage.ATTRIBUTE__PRIMARY_KEY:
        return isPrimaryKey();
      case DdPackage.ATTRIBUTE__PARTITION_KEY:
        return isPartitionKey();
      case DdPackage.ATTRIBUTE__MANDATORY:
        return isMandatory();
      case DdPackage.ATTRIBUTE__DEPRECATED:
        return isDeprecated();
      case DdPackage.ATTRIBUTE__ATTR_DESC:
        return getAttrDesc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DdPackage.ATTRIBUTE__EXTRA_ATTR_DESC:
        getExtraAttrDesc().clear();
        getExtraAttrDesc().addAll((Collection<? extends LineComment>)newValue);
        return;
      case DdPackage.ATTRIBUTE__DATA_TYPE:
        setDataType((DataType)newValue);
        return;
      case DdPackage.ATTRIBUTE__ATTRIBUTE_SIZE:
        setAttributeSize((AttributeSize)newValue);
        return;
      case DdPackage.ATTRIBUTE__ARRAY_SIZE:
        setArraySize((ArraySize)newValue);
        return;
      case DdPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case DdPackage.ATTRIBUTE__DEFAULT_VALUE:
        setDefaultValue((SharkExpression)newValue);
        return;
      case DdPackage.ATTRIBUTE__PRIMARY_KEY:
        setPrimaryKey((Boolean)newValue);
        return;
      case DdPackage.ATTRIBUTE__PARTITION_KEY:
        setPartitionKey((Boolean)newValue);
        return;
      case DdPackage.ATTRIBUTE__MANDATORY:
        setMandatory((Boolean)newValue);
        return;
      case DdPackage.ATTRIBUTE__DEPRECATED:
        setDeprecated((Boolean)newValue);
        return;
      case DdPackage.ATTRIBUTE__ATTR_DESC:
        setAttrDesc((TrailComment)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DdPackage.ATTRIBUTE__EXTRA_ATTR_DESC:
        getExtraAttrDesc().clear();
        return;
      case DdPackage.ATTRIBUTE__DATA_TYPE:
        setDataType(DATA_TYPE_EDEFAULT);
        return;
      case DdPackage.ATTRIBUTE__ATTRIBUTE_SIZE:
        setAttributeSize((AttributeSize)null);
        return;
      case DdPackage.ATTRIBUTE__ARRAY_SIZE:
        setArraySize((ArraySize)null);
        return;
      case DdPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DdPackage.ATTRIBUTE__DEFAULT_VALUE:
        setDefaultValue((SharkExpression)null);
        return;
      case DdPackage.ATTRIBUTE__PRIMARY_KEY:
        setPrimaryKey(PRIMARY_KEY_EDEFAULT);
        return;
      case DdPackage.ATTRIBUTE__PARTITION_KEY:
        setPartitionKey(PARTITION_KEY_EDEFAULT);
        return;
      case DdPackage.ATTRIBUTE__MANDATORY:
        setMandatory(MANDATORY_EDEFAULT);
        return;
      case DdPackage.ATTRIBUTE__DEPRECATED:
        setDeprecated(DEPRECATED_EDEFAULT);
        return;
      case DdPackage.ATTRIBUTE__ATTR_DESC:
        setAttrDesc((TrailComment)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DdPackage.ATTRIBUTE__EXTRA_ATTR_DESC:
        return extraAttrDesc != null && !extraAttrDesc.isEmpty();
      case DdPackage.ATTRIBUTE__DATA_TYPE:
        return dataType != DATA_TYPE_EDEFAULT;
      case DdPackage.ATTRIBUTE__ATTRIBUTE_SIZE:
        return attributeSize != null;
      case DdPackage.ATTRIBUTE__ARRAY_SIZE:
        return arraySize != null;
      case DdPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DdPackage.ATTRIBUTE__DEFAULT_VALUE:
        return defaultValue != null;
      case DdPackage.ATTRIBUTE__PRIMARY_KEY:
        return primaryKey != PRIMARY_KEY_EDEFAULT;
      case DdPackage.ATTRIBUTE__PARTITION_KEY:
        return partitionKey != PARTITION_KEY_EDEFAULT;
      case DdPackage.ATTRIBUTE__MANDATORY:
        return mandatory != MANDATORY_EDEFAULT;
      case DdPackage.ATTRIBUTE__DEPRECATED:
        return deprecated != DEPRECATED_EDEFAULT;
      case DdPackage.ATTRIBUTE__ATTR_DESC:
        return attrDesc != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (dataType: ");
    result.append(dataType);
    result.append(", name: ");
    result.append(name);
    result.append(", primaryKey: ");
    result.append(primaryKey);
    result.append(", partitionKey: ");
    result.append(partitionKey);
    result.append(", mandatory: ");
    result.append(mandatory);
    result.append(", deprecated: ");
    result.append(deprecated);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
