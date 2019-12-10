/**
 */
package miml.fragment.impl;

import miml.core.impl.MimlNamedElementImpl;

import miml.fragment.FragmentPackage;
import miml.fragment.MethodFragment;
import miml.pattern.PatternPackage;
import miml.pattern.PreparationPhaseFragment;
import miml.pattern.TransformationPhaseFragment;
import util.GuidMapper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miml.fragment.impl.MethodFragmentImpl#getProjectIndependentGUID <em>Project Independent GUID</em>}</li>
 *   <li>{@link miml.fragment.impl.MethodFragmentImpl#getProjectSpecificGuid <em>Project Specific Guid</em>}</li>
 *   <li>{@link miml.fragment.impl.MethodFragmentImpl#getPreparationphasefragment <em>Preparationphasefragment</em>}</li>
 *   <li>{@link miml.fragment.impl.MethodFragmentImpl#getTransformationphasefragment <em>Transformationphasefragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MethodFragmentImpl extends MimlNamedElementImpl implements MethodFragment {
	/**
	 * The default value of the '{@link #getProjectIndependentGUID() <em>Project Independent GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectIndependentGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_INDEPENDENT_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectIndependentGUID() <em>Project Independent GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectIndependentGUID()
	 * @generated
	 * @ordered
	 */
	protected String projectIndependentGUID = PROJECT_INDEPENDENT_GUID_EDEFAULT;

	/**
	 * This is true if the Project Independent GUID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectIndependentGUIDESet;

	/**
	 * The default value of the '{@link #getProjectSpecificGuid() <em>Project Specific Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectSpecificGuid()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_SPECIFIC_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectSpecificGuid() <em>Project Specific Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectSpecificGuid()
	 * @generated
	 * @ordered
	 */
	protected String projectSpecificGuid = PROJECT_SPECIFIC_GUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FragmentPackage.Literals.METHOD_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getProjectIndependentGUID() 
	{
		return GuidMapper.getProjectIndependentGuid(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectIndependentGUID(String newProjectIndependentGUID) {
		String oldProjectIndependentGUID = projectIndependentGUID;
		projectIndependentGUID = newProjectIndependentGUID;
		boolean oldProjectIndependentGUIDESet = projectIndependentGUIDESet;
		projectIndependentGUIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentPackage.METHOD_FRAGMENT__PROJECT_INDEPENDENT_GUID, oldProjectIndependentGUID, projectIndependentGUID, !oldProjectIndependentGUIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProjectIndependentGUID() {
		String oldProjectIndependentGUID = projectIndependentGUID;
		boolean oldProjectIndependentGUIDESet = projectIndependentGUIDESet;
		projectIndependentGUID = PROJECT_INDEPENDENT_GUID_EDEFAULT;
		projectIndependentGUIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FragmentPackage.METHOD_FRAGMENT__PROJECT_INDEPENDENT_GUID, oldProjectIndependentGUID, PROJECT_INDEPENDENT_GUID_EDEFAULT, oldProjectIndependentGUIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProjectIndependentGUID() {
		return projectIndependentGUIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectSpecificGuid() {
		return projectSpecificGuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectSpecificGuid(String newProjectSpecificGuid) {
		String oldProjectSpecificGuid = projectSpecificGuid;
		projectSpecificGuid = newProjectSpecificGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentPackage.METHOD_FRAGMENT__PROJECT_SPECIFIC_GUID, oldProjectSpecificGuid, projectSpecificGuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreparationPhaseFragment getPreparationphasefragment() {
		if (eContainerFeatureID() != FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT) return null;
		return (PreparationPhaseFragment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreparationphasefragment(PreparationPhaseFragment newPreparationphasefragment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreparationphasefragment, FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreparationphasefragment(PreparationPhaseFragment newPreparationphasefragment) {
		if (newPreparationphasefragment != eInternalContainer() || (eContainerFeatureID() != FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT && newPreparationphasefragment != null)) {
			if (EcoreUtil.isAncestor(this, newPreparationphasefragment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreparationphasefragment != null)
				msgs = ((InternalEObject)newPreparationphasefragment).eInverseAdd(this, PatternPackage.PREPARATION_PHASE_FRAGMENT__METHOD_FRAGMENT, PreparationPhaseFragment.class, msgs);
			msgs = basicSetPreparationphasefragment(newPreparationphasefragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT, newPreparationphasefragment, newPreparationphasefragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationPhaseFragment getTransformationphasefragment() {
		if (eContainerFeatureID() != FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT) return null;
		return (TransformationPhaseFragment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationphasefragment(TransformationPhaseFragment newTransformationphasefragment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransformationphasefragment, FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationphasefragment(TransformationPhaseFragment newTransformationphasefragment) {
		if (newTransformationphasefragment != eInternalContainer() || (eContainerFeatureID() != FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT && newTransformationphasefragment != null)) {
			if (EcoreUtil.isAncestor(this, newTransformationphasefragment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransformationphasefragment != null)
				msgs = ((InternalEObject)newTransformationphasefragment).eInverseAdd(this, PatternPackage.TRANSFORMATION_PHASE_FRAGMENT__METHOD_FRAGMENT, TransformationPhaseFragment.class, msgs);
			msgs = basicSetTransformationphasefragment(newTransformationphasefragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT, newTransformationphasefragment, newTransformationphasefragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreparationphasefragment((PreparationPhaseFragment)otherEnd, msgs);
			case FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransformationphasefragment((TransformationPhaseFragment)otherEnd, msgs);
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
			case FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT:
				return basicSetPreparationphasefragment(null, msgs);
			case FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT:
				return basicSetTransformationphasefragment(null, msgs);
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
			case FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT:
				return eInternalContainer().eInverseRemove(this, PatternPackage.PREPARATION_PHASE_FRAGMENT__METHOD_FRAGMENT, PreparationPhaseFragment.class, msgs);
			case FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT:
				return eInternalContainer().eInverseRemove(this, PatternPackage.TRANSFORMATION_PHASE_FRAGMENT__METHOD_FRAGMENT, TransformationPhaseFragment.class, msgs);
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
			case FragmentPackage.METHOD_FRAGMENT__PROJECT_INDEPENDENT_GUID:
				return getProjectIndependentGUID();
			case FragmentPackage.METHOD_FRAGMENT__PROJECT_SPECIFIC_GUID:
				return getProjectSpecificGuid();
			case FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT:
				return getPreparationphasefragment();
			case FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT:
				return getTransformationphasefragment();
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
			case FragmentPackage.METHOD_FRAGMENT__PROJECT_INDEPENDENT_GUID:
				setProjectIndependentGUID((String)newValue);
				return;
			case FragmentPackage.METHOD_FRAGMENT__PROJECT_SPECIFIC_GUID:
				setProjectSpecificGuid((String)newValue);
				return;
			case FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT:
				setPreparationphasefragment((PreparationPhaseFragment)newValue);
				return;
			case FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT:
				setTransformationphasefragment((TransformationPhaseFragment)newValue);
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
			case FragmentPackage.METHOD_FRAGMENT__PROJECT_INDEPENDENT_GUID:
				unsetProjectIndependentGUID();
				return;
			case FragmentPackage.METHOD_FRAGMENT__PROJECT_SPECIFIC_GUID:
				setProjectSpecificGuid(PROJECT_SPECIFIC_GUID_EDEFAULT);
				return;
			case FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT:
				setPreparationphasefragment((PreparationPhaseFragment)null);
				return;
			case FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT:
				setTransformationphasefragment((TransformationPhaseFragment)null);
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
			case FragmentPackage.METHOD_FRAGMENT__PROJECT_INDEPENDENT_GUID:
				return isSetProjectIndependentGUID();
			case FragmentPackage.METHOD_FRAGMENT__PROJECT_SPECIFIC_GUID:
				return PROJECT_SPECIFIC_GUID_EDEFAULT == null ? projectSpecificGuid != null : !PROJECT_SPECIFIC_GUID_EDEFAULT.equals(projectSpecificGuid);
			case FragmentPackage.METHOD_FRAGMENT__PREPARATIONPHASEFRAGMENT:
				return getPreparationphasefragment() != null;
			case FragmentPackage.METHOD_FRAGMENT__TRANSFORMATIONPHASEFRAGMENT:
				return getTransformationphasefragment() != null;
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
		result.append(" (projectIndependentGUID: ");
		if (projectIndependentGUIDESet) result.append(projectIndependentGUID); else result.append("<unset>");
		result.append(", projectSpecificGuid: ");
		result.append(projectSpecificGuid);
		result.append(')');
		return result.toString();
	}

} //MethodFragmentImpl
