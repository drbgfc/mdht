/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.RelatedSubject;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.operations.SubjectOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.impl.ParticipationImpl;
import org.openhealthtools.mdht.uml.hl7.vocab.ContextControl;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetSubject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectImpl#getAwarenessCode <em>Awareness Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectImpl#getRelatedSubject <em>Related Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectImpl#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectImpl#getContextControlCode <em>Context Control Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectImpl extends ParticipationImpl implements Subject {
	/**
	 * The cached value of the '{@link #getRealmCodes() <em>Realm Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CS> realmCodes;

	/**
	 * The cached value of the '{@link #getTypeId() <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureRootTypeId typeId;

	/**
	 * The cached value of the '{@link #getTemplateIds() <em>Template Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> templateIds;

	/**
	 * The cached value of the '{@link #getAwarenessCode() <em>Awareness Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwarenessCode()
	 * @generated
	 * @ordered
	 */
	protected CE awarenessCode;

	/**
	 * The cached value of the '{@link #getRelatedSubject() <em>Related Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSubject()
	 * @generated
	 * @ordered
	 */
	protected RelatedSubject relatedSubject;

	/**
	 * The default value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final NullFlavor NULL_FLAVOR_EDEFAULT = NullFlavor.ASKU;

	/**
	 * The cached value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected NullFlavor nullFlavor = NULL_FLAVOR_EDEFAULT;

	/**
	 * This is true if the Null Flavor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullFlavorESet;

	/**
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final ParticipationTargetSubject TYPE_CODE_EDEFAULT = ParticipationTargetSubject.SBJ;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected ParticipationTargetSubject typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * This is true if the Type Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCodeESet;

	/**
	 * The default value of the '{@link #getContextControlCode() <em>Context Control Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextControlCode()
	 * @generated
	 * @ordered
	 */
	protected static final ContextControl CONTEXT_CONTROL_CODE_EDEFAULT = ContextControl.OP;

	/**
	 * The cached value of the '{@link #getContextControlCode() <em>Context Control Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextControlCode()
	 * @generated
	 * @ordered
	 */
	protected ContextControl contextControlCode = CONTEXT_CONTROL_CODE_EDEFAULT;

	/**
	 * This is true if the Context Control Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextControlCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.SUBJECT__REALM_CODE);
		}
		return realmCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureRootTypeId getTypeId() {
		return typeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeId(InfrastructureRootTypeId newTypeId, NotificationChain msgs) {
		InfrastructureRootTypeId oldTypeId = typeId;
		typeId = newTypeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT__TYPE_ID, oldTypeId, newTypeId);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeId(InfrastructureRootTypeId newTypeId) {
		if (newTypeId != typeId) {
			NotificationChain msgs = null;
			if (typeId != null) {
				msgs = ((InternalEObject) typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT__TYPE_ID, newTypeId, newTypeId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SUBJECT__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getAwarenessCode() {
		return awarenessCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwarenessCode(CE newAwarenessCode, NotificationChain msgs) {
		CE oldAwarenessCode = awarenessCode;
		awarenessCode = newAwarenessCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT__AWARENESS_CODE, oldAwarenessCode, newAwarenessCode);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwarenessCode(CE newAwarenessCode) {
		if (newAwarenessCode != awarenessCode) {
			NotificationChain msgs = null;
			if (awarenessCode != null) {
				msgs = ((InternalEObject) awarenessCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT__AWARENESS_CODE, null, msgs);
			}
			if (newAwarenessCode != null) {
				msgs = ((InternalEObject) newAwarenessCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT__AWARENESS_CODE, null, msgs);
			}
			msgs = basicSetAwarenessCode(newAwarenessCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT__AWARENESS_CODE, newAwarenessCode, newAwarenessCode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSubject getRelatedSubject() {
		return relatedSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedSubject(RelatedSubject newRelatedSubject, NotificationChain msgs) {
		RelatedSubject oldRelatedSubject = relatedSubject;
		relatedSubject = newRelatedSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT__RELATED_SUBJECT, oldRelatedSubject, newRelatedSubject);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSubject(RelatedSubject newRelatedSubject) {
		if (newRelatedSubject != relatedSubject) {
			NotificationChain msgs = null;
			if (relatedSubject != null) {
				msgs = ((InternalEObject) relatedSubject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT__RELATED_SUBJECT, null, msgs);
			}
			if (newRelatedSubject != null) {
				msgs = ((InternalEObject) newRelatedSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT__RELATED_SUBJECT, null, msgs);
			}
			msgs = basicSetRelatedSubject(newRelatedSubject, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT__RELATED_SUBJECT, newRelatedSubject, newRelatedSubject));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullFlavor getNullFlavor() {
		return nullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullFlavor(NullFlavor newNullFlavor) {
		NullFlavor oldNullFlavor = nullFlavor;
		nullFlavor = newNullFlavor == null
				? NULL_FLAVOR_EDEFAULT
				: newNullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavorESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullFlavor() {
		NullFlavor oldNullFlavor = nullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavor = NULL_FLAVOR_EDEFAULT;
		nullFlavorESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SUBJECT__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT,
				oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullFlavor() {
		return nullFlavorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipationTargetSubject getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(ParticipationTargetSubject newTypeCode) {
		ParticipationTargetSubject oldTypeCode = typeCode;
		typeCode = newTypeCode == null
				? TYPE_CODE_EDEFAULT
				: newTypeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT__TYPE_CODE, oldTypeCode, typeCode, !oldTypeCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCode() {
		ParticipationTargetSubject oldTypeCode = typeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCode = TYPE_CODE_EDEFAULT;
		typeCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SUBJECT__TYPE_CODE, oldTypeCode, TYPE_CODE_EDEFAULT,
				oldTypeCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCode() {
		return typeCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextControl getContextControlCode() {
		return contextControlCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextControlCode(ContextControl newContextControlCode) {
		ContextControl oldContextControlCode = contextControlCode;
		contextControlCode = newContextControlCode == null
				? CONTEXT_CONTROL_CODE_EDEFAULT
				: newContextControlCode;
		boolean oldContextControlCodeESet = contextControlCodeESet;
		contextControlCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT__CONTEXT_CONTROL_CODE, oldContextControlCode,
				contextControlCode, !oldContextControlCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextControlCode() {
		ContextControl oldContextControlCode = contextControlCode;
		boolean oldContextControlCodeESet = contextControlCodeESet;
		contextControlCode = CONTEXT_CONTROL_CODE_EDEFAULT;
		contextControlCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SUBJECT__CONTEXT_CONTROL_CODE, oldContextControlCode,
				CONTEXT_CONTROL_CODE_EDEFAULT, oldContextControlCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextControlCode() {
		return contextControlCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectOperations.validateTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextControlCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectOperations.validateContextControlCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.SUBJECT__REALM_CODE:
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBJECT__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.SUBJECT__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBJECT__AWARENESS_CODE:
				return basicSetAwarenessCode(null, msgs);
			case CDAPackage.SUBJECT__RELATED_SUBJECT:
				return basicSetRelatedSubject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.SUBJECT__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.SUBJECT__TYPE_ID:
				return getTypeId();
			case CDAPackage.SUBJECT__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.SUBJECT__AWARENESS_CODE:
				return getAwarenessCode();
			case CDAPackage.SUBJECT__RELATED_SUBJECT:
				return getRelatedSubject();
			case CDAPackage.SUBJECT__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.SUBJECT__TYPE_CODE:
				return getTypeCode();
			case CDAPackage.SUBJECT__CONTEXT_CONTROL_CODE:
				return getContextControlCode();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.SUBJECT__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.SUBJECT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.SUBJECT__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.SUBJECT__AWARENESS_CODE:
				setAwarenessCode((CE) newValue);
				return;
			case CDAPackage.SUBJECT__RELATED_SUBJECT:
				setRelatedSubject((RelatedSubject) newValue);
				return;
			case CDAPackage.SUBJECT__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.SUBJECT__TYPE_CODE:
				setTypeCode((ParticipationTargetSubject) newValue);
				return;
			case CDAPackage.SUBJECT__CONTEXT_CONTROL_CODE:
				setContextControlCode((ContextControl) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CDAPackage.SUBJECT__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.SUBJECT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.SUBJECT__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.SUBJECT__AWARENESS_CODE:
				setAwarenessCode((CE) null);
				return;
			case CDAPackage.SUBJECT__RELATED_SUBJECT:
				setRelatedSubject((RelatedSubject) null);
				return;
			case CDAPackage.SUBJECT__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.SUBJECT__TYPE_CODE:
				unsetTypeCode();
				return;
			case CDAPackage.SUBJECT__CONTEXT_CONTROL_CODE:
				unsetContextControlCode();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDAPackage.SUBJECT__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.SUBJECT__TYPE_ID:
				return typeId != null;
			case CDAPackage.SUBJECT__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.SUBJECT__AWARENESS_CODE:
				return awarenessCode != null;
			case CDAPackage.SUBJECT__RELATED_SUBJECT:
				return relatedSubject != null;
			case CDAPackage.SUBJECT__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.SUBJECT__TYPE_CODE:
				return isSetTypeCode();
			case CDAPackage.SUBJECT__CONTEXT_CONTROL_CODE:
				return isSetContextControlCode();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) {
			result.append(nullFlavor);
		} else {
			result.append("<unset>");
		}
		result.append(", typeCode: ");
		if (typeCodeESet) {
			result.append(typeCode);
		} else {
			result.append("<unset>");
		}
		result.append(", contextControlCode: ");
		if (contextControlCodeESet) {
			result.append(contextControlCode);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // SubjectImpl
