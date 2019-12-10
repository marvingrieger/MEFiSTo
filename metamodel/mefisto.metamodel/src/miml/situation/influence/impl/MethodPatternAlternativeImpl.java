/**
 */
package miml.situation.influence.impl;

import java.util.Collection;
import miml.core.impl.MimlNamedElementImpl;
import miml.situation.concept.Concept;
import miml.situation.concept.ConceptPackage;

import miml.situation.influence.AppliedMethodPattern;
import miml.situation.influence.InfluenceFactor;
import miml.situation.influence.InfluencePackage;
import miml.situation.influence.MethodPatternAlternative;
import miml.situation.influence.MethodPatternType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Pattern Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miml.situation.influence.impl.MethodPatternAlternativeImpl#getPros <em>Pros</em>}</li>
 *   <li>{@link miml.situation.influence.impl.MethodPatternAlternativeImpl#getCons <em>Cons</em>}</li>
 *   <li>{@link miml.situation.influence.impl.MethodPatternAlternativeImpl#getInfluenceFactor <em>Influence Factor</em>}</li>
 *   <li>{@link miml.situation.influence.impl.MethodPatternAlternativeImpl#getType <em>Type</em>}</li>
 *   <li>{@link miml.situation.influence.impl.MethodPatternAlternativeImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link miml.situation.influence.impl.MethodPatternAlternativeImpl#getChosen <em>Chosen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodPatternAlternativeImpl extends MimlNamedElementImpl implements MethodPatternAlternative {
	/**
	 * The default value of the '{@link #getPros() <em>Pros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPros()
	 * @generated
	 * @ordered
	 */
	protected static final String PROS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPros() <em>Pros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPros()
	 * @generated
	 * @ordered
	 */
	protected String pros = PROS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCons() <em>Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCons()
	 * @generated
	 * @ordered
	 */
	protected static final String CONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCons() <em>Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCons()
	 * @generated
	 * @ordered
	 */
	protected String cons = CONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInfluenceFactor() <em>Influence Factor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenceFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<InfluenceFactor> influenceFactor;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MethodPatternType TYPE_EDEFAULT = MethodPatternType.LANGUAGE_TRANSFORMATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MethodPatternType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChosen() <em>Chosen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosen()
	 * @generated
	 * @ordered
	 */
	protected AppliedMethodPattern chosen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodPatternAlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfluencePackage.Literals.METHOD_PATTERN_ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPros() {
		return pros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPros(String newPros) {
		String oldPros = pros;
		pros = newPros;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__PROS, oldPros, pros));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCons() {
		return cons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCons(String newCons) {
		String oldCons = cons;
		cons = newCons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONS, oldCons, cons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfluenceFactor> getInfluenceFactor() {
		if (influenceFactor == null) {
			influenceFactor = new EObjectWithInverseResolvingEList.ManyInverse<InfluenceFactor>(InfluenceFactor.class, this, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__INFLUENCE_FACTOR, InfluencePackage.INFLUENCE_FACTOR__INFLUENCED_METHOD_PATTERN);
		}
		return influenceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPatternType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MethodPatternType newType) {
		MethodPatternType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getConcept() {
		if (eContainerFeatureID() != InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT) return null;
		return (Concept)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcept(Concept newConcept, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConcept, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(Concept newConcept) {
		if (newConcept != eInternalContainer() || (eContainerFeatureID() != InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT && newConcept != null)) {
			if (EcoreUtil.isAncestor(this, newConcept))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConcept != null)
				msgs = ((InternalEObject)newConcept).eInverseAdd(this, ConceptPackage.CONCEPT__SUITABLE_METHOD_PATTERN, Concept.class, msgs);
			msgs = basicSetConcept(newConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT, newConcept, newConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedMethodPattern getChosen() {
		if (chosen != null && chosen.eIsProxy()) {
			InternalEObject oldChosen = (InternalEObject)chosen;
			chosen = (AppliedMethodPattern)eResolveProxy(oldChosen);
			if (chosen != oldChosen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN, oldChosen, chosen));
			}
		}
		return chosen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedMethodPattern basicGetChosen() {
		return chosen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChosen(AppliedMethodPattern newChosen, NotificationChain msgs) {
		AppliedMethodPattern oldChosen = chosen;
		chosen = newChosen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN, oldChosen, newChosen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChosen(AppliedMethodPattern newChosen) {
		if (newChosen != chosen) {
			NotificationChain msgs = null;
			if (chosen != null)
				msgs = ((InternalEObject)chosen).eInverseRemove(this, InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN, AppliedMethodPattern.class, msgs);
			if (newChosen != null)
				msgs = ((InternalEObject)newChosen).eInverseAdd(this, InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN, AppliedMethodPattern.class, msgs);
			msgs = basicSetChosen(newChosen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN, newChosen, newChosen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__INFLUENCE_FACTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfluenceFactor()).basicAdd(otherEnd, msgs);
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConcept((Concept)otherEnd, msgs);
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN:
				if (chosen != null)
					msgs = ((InternalEObject)chosen).eInverseRemove(this, InfluencePackage.APPLIED_METHOD_PATTERN__CHOSEN, AppliedMethodPattern.class, msgs);
				return basicSetChosen((AppliedMethodPattern)otherEnd, msgs);
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
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__INFLUENCE_FACTOR:
				return ((InternalEList<?>)getInfluenceFactor()).basicRemove(otherEnd, msgs);
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT:
				return basicSetConcept(null, msgs);
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN:
				return basicSetChosen(null, msgs);
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
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT:
				return eInternalContainer().eInverseRemove(this, ConceptPackage.CONCEPT__SUITABLE_METHOD_PATTERN, Concept.class, msgs);
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
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__PROS:
				return getPros();
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONS:
				return getCons();
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__INFLUENCE_FACTOR:
				return getInfluenceFactor();
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__TYPE:
				return getType();
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT:
				return getConcept();
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN:
				if (resolve) return getChosen();
				return basicGetChosen();
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
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__PROS:
				setPros((String)newValue);
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONS:
				setCons((String)newValue);
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__INFLUENCE_FACTOR:
				getInfluenceFactor().clear();
				getInfluenceFactor().addAll((Collection<? extends InfluenceFactor>)newValue);
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__TYPE:
				setType((MethodPatternType)newValue);
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT:
				setConcept((Concept)newValue);
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN:
				setChosen((AppliedMethodPattern)newValue);
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
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__PROS:
				setPros(PROS_EDEFAULT);
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONS:
				setCons(CONS_EDEFAULT);
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__INFLUENCE_FACTOR:
				getInfluenceFactor().clear();
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT:
				setConcept((Concept)null);
				return;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN:
				setChosen((AppliedMethodPattern)null);
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
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__PROS:
				return PROS_EDEFAULT == null ? pros != null : !PROS_EDEFAULT.equals(pros);
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONS:
				return CONS_EDEFAULT == null ? cons != null : !CONS_EDEFAULT.equals(cons);
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__INFLUENCE_FACTOR:
				return influenceFactor != null && !influenceFactor.isEmpty();
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__TYPE:
				return type != TYPE_EDEFAULT;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CONCEPT:
				return getConcept() != null;
			case InfluencePackage.METHOD_PATTERN_ALTERNATIVE__CHOSEN:
				return chosen != null;
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
		result.append(" (pros: ");
		result.append(pros);
		result.append(", cons: ");
		result.append(cons);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public String getName()
	{
		if (getConcept() != null)
			return getType().toString() + " (" + getConcept().getName() + ")";
		
		return getType().toString();
	}

} //MethodPatternAlternativeImpl
