/**
 */
package miml.situation.influence.impl;

import miml.core.impl.MimlNamedElementImpl;

import miml.pattern.MethodPattern;
import miml.pattern.PatternPackage;
import miml.situation.concept.Concept;
import miml.situation.concept.ConceptPackage;

import miml.situation.influence.AppliedMethodPattern;
import miml.situation.influence.InfluencePackage;
import miml.situation.influence.MethodPatternAlternative;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applied Method Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miml.situation.influence.impl.AppliedMethodPatternImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link miml.situation.influence.impl.AppliedMethodPatternImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link miml.situation.influence.impl.AppliedMethodPatternImpl#getChosen <em>Chosen</em>}</li>
 *   <li>{@link miml.situation.influence.impl.AppliedMethodPatternImpl#getInstantiatedMethodPattern <em>Instantiated Method Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppliedMethodPatternImpl extends MimlNamedElementImpl implements AppliedMethodPattern {
	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChosen() <em>Chosen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosen()
	 * @generated
	 * @ordered
	 */
	protected MethodPatternAlternative chosen;

	/**
	 * The cached value of the '{@link #getInstantiatedMethodPattern() <em>Instantiated Method Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedMethodPattern()
	 * @generated
	 * @ordered
	 */
	protected MethodPattern instantiatedMethodPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppliedMethodPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfluencePackage.Literals.APPLIED_METHOD_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPatternAlternative getChosen() {
		if (chosen != null && chosen.eIsProxy()) {
			InternalEObject oldChosen = (InternalEObject)chosen;
			chosen = (MethodPatternAlternative)eResolveProxy(oldChosen);
			if (chosen != oldChosen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN, oldChosen, chosen));
			}
		}
		return chosen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPatternAlternative basicGetChosen() {
		return chosen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChosen(MethodPatternAlternative newChosen, NotificationChain msgs) {
		MethodPatternAlternative oldChosen = chosen;
		chosen = newChosen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN, oldChosen, newChosen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChosen(MethodPatternAlternative newChosen) {
		if (newChosen != chosen) {
			NotificationChain msgs = null;
			if (chosen != null)
				msgs = ((InternalEObject)chosen).eInverseRemove(this, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN, MethodPatternAlternative.class, msgs);
			if (newChosen != null)
				msgs = ((InternalEObject)newChosen).eInverseAdd(this, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN, MethodPatternAlternative.class, msgs);
			msgs = basicSetChosen(newChosen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN, newChosen, newChosen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPattern getInstantiatedMethodPattern() {
		if (instantiatedMethodPattern != null && instantiatedMethodPattern.eIsProxy()) {
			InternalEObject oldInstantiatedMethodPattern = (InternalEObject)instantiatedMethodPattern;
			instantiatedMethodPattern = (MethodPattern)eResolveProxy(oldInstantiatedMethodPattern);
			if (instantiatedMethodPattern != oldInstantiatedMethodPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfluencePackage.APPLIED_METHOD_PATTERN__INSTANTIATED_METHOD_PATTERN, oldInstantiatedMethodPattern, instantiatedMethodPattern));
			}
		}
		return instantiatedMethodPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPattern basicGetInstantiatedMethodPattern() {
		return instantiatedMethodPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatedMethodPattern(MethodPattern newInstantiatedMethodPattern, NotificationChain msgs) {
		MethodPattern oldInstantiatedMethodPattern = instantiatedMethodPattern;
		instantiatedMethodPattern = newInstantiatedMethodPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfluencePackage.APPLIED_METHOD_PATTERN__INSTANTIATED_METHOD_PATTERN, oldInstantiatedMethodPattern, newInstantiatedMethodPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedMethodPattern(MethodPattern newInstantiatedMethodPattern) {
		if (newInstantiatedMethodPattern != instantiatedMethodPattern) {
			NotificationChain msgs = null;
			if (instantiatedMethodPattern != null)
				msgs = ((InternalEObject)instantiatedMethodPattern).eInverseRemove(this, PatternPackage.METHOD_PATTERN__APPLIED_METHOD_PATTERN, MethodPattern.class, msgs);
			if (newInstantiatedMethodPattern != null)
				msgs = ((InternalEObject)newInstantiatedMethodPattern).eInverseAdd(this, PatternPackage.METHOD_PATTERN__APPLIED_METHOD_PATTERN, MethodPattern.class, msgs);
			msgs = basicSetInstantiatedMethodPattern(newInstantiatedMethodPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfluencePackage.APPLIED_METHOD_PATTERN__INSTANTIATED_METHOD_PATTERN, newInstantiatedMethodPattern, newInstantiatedMethodPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfluencePackage.APPLIED_METHOD_PATTERN__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getConcept() {
		if (eContainerFeatureID() != InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT) return null;
		return (Concept)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcept(Concept newConcept, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConcept, InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(Concept newConcept) {
		if (newConcept != eInternalContainer() || (eContainerFeatureID() != InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT && newConcept != null)) {
			if (EcoreUtil.isAncestor(this, newConcept))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConcept != null)
				msgs = ((InternalEObject)newConcept).eInverseAdd(this, ConceptPackage.CONCEPT__APPLIED_METHOD_PATTERN, Concept.class, msgs);
			msgs = basicSetConcept(newConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT, newConcept, newConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConcept((Concept)otherEnd, msgs);
			case InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN:
				if (chosen != null)
					msgs = ((InternalEObject)chosen).eInverseRemove(this, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN, MethodPatternAlternative.class, msgs);
				return basicSetChosen((MethodPatternAlternative)otherEnd, msgs);
			case InfluencePackage.APPLIED_METHOD_PATTERN__INSTANTIATED_METHOD_PATTERN:
				if (instantiatedMethodPattern != null)
					msgs = ((InternalEObject)instantiatedMethodPattern).eInverseRemove(this, PatternPackage.METHOD_PATTERN__APPLIED_METHOD_PATTERN, MethodPattern.class, msgs);
				return basicSetInstantiatedMethodPattern((MethodPattern)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT:
				return basicSetConcept(null, msgs);
			case InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN:
				return basicSetChosen(null, msgs);
			case InfluencePackage.APPLIED_METHOD_PATTERN__INSTANTIATED_METHOD_PATTERN:
				return basicSetInstantiatedMethodPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT:
				return eInternalContainer().eInverseRemove(this, ConceptPackage.CONCEPT__APPLIED_METHOD_PATTERN, Concept.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfluencePackage.APPLIED_METHOD_PATTERN__RATIONALE:
				return getRationale();
			case InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT:
				return getConcept();
			case InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN:
				if (resolve) return getChosen();
				return basicGetChosen();
			case InfluencePackage.APPLIED_METHOD_PATTERN__INSTANTIATED_METHOD_PATTERN:
				if (resolve) return getInstantiatedMethodPattern();
				return basicGetInstantiatedMethodPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfluencePackage.APPLIED_METHOD_PATTERN__RATIONALE:
				setRationale((String)newValue);
				return;
			case InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT:
				setConcept((Concept)newValue);
				return;
			case InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN:
				setChosen((MethodPatternAlternative)newValue);
				return;
			case InfluencePackage.APPLIED_METHOD_PATTERN__INSTANTIATED_METHOD_PATTERN:
				setInstantiatedMethodPattern((MethodPattern)newValue);
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
			case InfluencePackage.APPLIED_METHOD_PATTERN__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT:
				setConcept((Concept)null);
				return;
			case InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN:
				setChosen((MethodPatternAlternative)null);
				return;
			case InfluencePackage.APPLIED_METHOD_PATTERN__INSTANTIATED_METHOD_PATTERN:
				setInstantiatedMethodPattern((MethodPattern)null);
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
			case InfluencePackage.APPLIED_METHOD_PATTERN__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case InfluencePackage.APPLIED_METHOD_PATTERN__CONCEPT:
				return getConcept() != null;
			case InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN:
				return chosen != null;
			case InfluencePackage.APPLIED_METHOD_PATTERN__INSTANTIATED_METHOD_PATTERN:
				return instantiatedMethodPattern != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rationale: ");
		result.append(rationale);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public String getName()
	{	
		if (getChosen() != null && getConcept() != null)
			return getChosen().getType().toString() + " (" + getConcept().getName() + ")";
		else if (getChosen() != null)
			return getChosen().getType().toString();
		
		return "Undefined";
	}
} //AppliedMethodPatternImpl
