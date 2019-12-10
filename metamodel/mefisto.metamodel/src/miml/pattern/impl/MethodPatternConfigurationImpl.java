/**
 */
package miml.pattern.impl;

import miml.core.impl.MimlElementImpl;

import miml.pattern.MethodPattern;
import miml.pattern.MethodPatternConfiguration;
import miml.pattern.PatternPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Pattern Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#isDiscoverPlatform <em>Discover Platform</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#isDiscoverSystem <em>Discover System</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#isEnrichLPSM <em>Enrich LPSM</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#isRemoveCode <em>Remove Code</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#isEnrichFPIM <em>Enrich FPIM</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#isRestructureFPIM <em>Restructure FPIM</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#isEnrichAPIM <em>Enrich APIM</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getMethodpattern <em>Methodpattern</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getLegacyRealizationName <em>Legacy Realization Name</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getTargetRealizationName <em>Target Realization Name</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getDiscoverPlatformName <em>Discover Platform Name</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getDiscoverSystemName <em>Discover System Name</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getRemoveCodeName <em>Remove Code Name</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getEnrichLPSMName <em>Enrich LPSM Name</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getEnrichFPIMName <em>Enrich FPIM Name</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getEnrichAPIMName <em>Enrich APIM Name</em>}</li>
 *   <li>{@link miml.pattern.impl.MethodPatternConfigurationImpl#getRestructureFPIMName <em>Restructure FPIM Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodPatternConfigurationImpl extends MimlElementImpl implements MethodPatternConfiguration {
	/**
	 * The default value of the '{@link #isDiscoverPlatform() <em>Discover Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscoverPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCOVER_PLATFORM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDiscoverPlatform() <em>Discover Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscoverPlatform()
	 * @generated
	 * @ordered
	 */
	protected boolean discoverPlatform = DISCOVER_PLATFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #isDiscoverSystem() <em>Discover System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscoverSystem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCOVER_SYSTEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDiscoverSystem() <em>Discover System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscoverSystem()
	 * @generated
	 * @ordered
	 */
	protected boolean discoverSystem = DISCOVER_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnrichLPSM() <em>Enrich LPSM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnrichLPSM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENRICH_LPSM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnrichLPSM() <em>Enrich LPSM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnrichLPSM()
	 * @generated
	 * @ordered
	 */
	protected boolean enrichLPSM = ENRICH_LPSM_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoveCode() <em>Remove Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_CODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveCode() <em>Remove Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveCode()
	 * @generated
	 * @ordered
	 */
	protected boolean removeCode = REMOVE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnrichFPIM() <em>Enrich FPIM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnrichFPIM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENRICH_FPIM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnrichFPIM() <em>Enrich FPIM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnrichFPIM()
	 * @generated
	 * @ordered
	 */
	protected boolean enrichFPIM = ENRICH_FPIM_EDEFAULT;

	/**
	 * The default value of the '{@link #isRestructureFPIM() <em>Restructure FPIM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRestructureFPIM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESTRUCTURE_FPIM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRestructureFPIM() <em>Restructure FPIM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRestructureFPIM()
	 * @generated
	 * @ordered
	 */
	protected boolean restructureFPIM = RESTRUCTURE_FPIM_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnrichAPIM() <em>Enrich APIM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnrichAPIM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENRICH_APIM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnrichAPIM() <em>Enrich APIM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnrichAPIM()
	 * @generated
	 * @ordered
	 */
	protected boolean enrichAPIM = ENRICH_APIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegacyRealizationName() <em>Legacy Realization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyRealizationName()
	 * @generated
	 * @ordered
	 */
	protected static final String LEGACY_REALIZATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegacyRealizationName() <em>Legacy Realization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyRealizationName()
	 * @generated
	 * @ordered
	 */
	protected String legacyRealizationName = LEGACY_REALIZATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRealizationName() <em>Target Realization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRealizationName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_REALIZATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRealizationName() <em>Target Realization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRealizationName()
	 * @generated
	 * @ordered
	 */
	protected String targetRealizationName = TARGET_REALIZATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscoverPlatformName() <em>Discover Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoverPlatformName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVER_PLATFORM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoverPlatformName() <em>Discover Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoverPlatformName()
	 * @generated
	 * @ordered
	 */
	protected String discoverPlatformName = DISCOVER_PLATFORM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscoverSystemName() <em>Discover System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoverSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVER_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoverSystemName() <em>Discover System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoverSystemName()
	 * @generated
	 * @ordered
	 */
	protected String discoverSystemName = DISCOVER_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoveCodeName() <em>Remove Code Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveCodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVE_CODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoveCodeName() <em>Remove Code Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveCodeName()
	 * @generated
	 * @ordered
	 */
	protected String removeCodeName = REMOVE_CODE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnrichLPSMName() <em>Enrich LPSM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrichLPSMName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENRICH_LPSM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnrichLPSMName() <em>Enrich LPSM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrichLPSMName()
	 * @generated
	 * @ordered
	 */
	protected String enrichLPSMName = ENRICH_LPSM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnrichFPIMName() <em>Enrich FPIM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrichFPIMName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENRICH_FPIM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnrichFPIMName() <em>Enrich FPIM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrichFPIMName()
	 * @generated
	 * @ordered
	 */
	protected String enrichFPIMName = ENRICH_FPIM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnrichAPIMName() <em>Enrich APIM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrichAPIMName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENRICH_APIM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnrichAPIMName() <em>Enrich APIM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrichAPIMName()
	 * @generated
	 * @ordered
	 */
	protected String enrichAPIMName = ENRICH_APIM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestructureFPIMName() <em>Restructure FPIM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestructureFPIMName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTRUCTURE_FPIM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestructureFPIMName() <em>Restructure FPIM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestructureFPIMName()
	 * @generated
	 * @ordered
	 */
	protected String restructureFPIMName = RESTRUCTURE_FPIM_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodPatternConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.METHOD_PATTERN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDiscoverPlatform() {
		return discoverPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoverPlatform(boolean newDiscoverPlatform) {
		boolean oldDiscoverPlatform = discoverPlatform;
		discoverPlatform = newDiscoverPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM, oldDiscoverPlatform, discoverPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDiscoverSystem() {
		return discoverSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoverSystem(boolean newDiscoverSystem) {
		boolean oldDiscoverSystem = discoverSystem;
		discoverSystem = newDiscoverSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM, oldDiscoverSystem, discoverSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnrichLPSM() {
		return enrichLPSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrichLPSM(boolean newEnrichLPSM) {
		boolean oldEnrichLPSM = enrichLPSM;
		enrichLPSM = newEnrichLPSM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM, oldEnrichLPSM, enrichLPSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoveCode() {
		return removeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveCode(boolean newRemoveCode) {
		boolean oldRemoveCode = removeCode;
		removeCode = newRemoveCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE, oldRemoveCode, removeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnrichFPIM() {
		return enrichFPIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrichFPIM(boolean newEnrichFPIM) {
		boolean oldEnrichFPIM = enrichFPIM;
		enrichFPIM = newEnrichFPIM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM, oldEnrichFPIM, enrichFPIM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRestructureFPIM() {
		return restructureFPIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestructureFPIM(boolean newRestructureFPIM) {
		boolean oldRestructureFPIM = restructureFPIM;
		restructureFPIM = newRestructureFPIM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM, oldRestructureFPIM, restructureFPIM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnrichAPIM() {
		return enrichAPIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrichAPIM(boolean newEnrichAPIM) {
		boolean oldEnrichAPIM = enrichAPIM;
		enrichAPIM = newEnrichAPIM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM, oldEnrichAPIM, enrichAPIM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPattern getMethodpattern() {
		if (eContainerFeatureID() != PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN) return null;
		return (MethodPattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodpattern(MethodPattern newMethodpattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMethodpattern, PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodpattern(MethodPattern newMethodpattern) {
		if (newMethodpattern != eInternalContainer() || (eContainerFeatureID() != PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN && newMethodpattern != null)) {
			if (EcoreUtil.isAncestor(this, newMethodpattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMethodpattern != null)
				msgs = ((InternalEObject)newMethodpattern).eInverseAdd(this, PatternPackage.METHOD_PATTERN__METHOD_PATTERN_CONFIGURATION, MethodPattern.class, msgs);
			msgs = basicSetMethodpattern(newMethodpattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN, newMethodpattern, newMethodpattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLegacyRealizationName() {
		return legacyRealizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyRealizationName(String newLegacyRealizationName) {
		String oldLegacyRealizationName = legacyRealizationName;
		legacyRealizationName = newLegacyRealizationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__LEGACY_REALIZATION_NAME, oldLegacyRealizationName, legacyRealizationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRealizationName() {
		return targetRealizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRealizationName(String newTargetRealizationName) {
		String oldTargetRealizationName = targetRealizationName;
		targetRealizationName = newTargetRealizationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__TARGET_REALIZATION_NAME, oldTargetRealizationName, targetRealizationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscoverPlatformName() {
		return discoverPlatformName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoverPlatformName(String newDiscoverPlatformName) {
		String oldDiscoverPlatformName = discoverPlatformName;
		discoverPlatformName = newDiscoverPlatformName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM_NAME, oldDiscoverPlatformName, discoverPlatformName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscoverSystemName() {
		return discoverSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoverSystemName(String newDiscoverSystemName) {
		String oldDiscoverSystemName = discoverSystemName;
		discoverSystemName = newDiscoverSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM_NAME, oldDiscoverSystemName, discoverSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoveCodeName() {
		return removeCodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveCodeName(String newRemoveCodeName) {
		String oldRemoveCodeName = removeCodeName;
		removeCodeName = newRemoveCodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE_NAME, oldRemoveCodeName, removeCodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnrichLPSMName() {
		return enrichLPSMName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrichLPSMName(String newEnrichLPSMName) {
		String oldEnrichLPSMName = enrichLPSMName;
		enrichLPSMName = newEnrichLPSMName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM_NAME, oldEnrichLPSMName, enrichLPSMName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnrichFPIMName() {
		return enrichFPIMName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrichFPIMName(String newEnrichFPIMName) {
		String oldEnrichFPIMName = enrichFPIMName;
		enrichFPIMName = newEnrichFPIMName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM_NAME, oldEnrichFPIMName, enrichFPIMName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnrichAPIMName() {
		return enrichAPIMName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrichAPIMName(String newEnrichAPIMName) {
		String oldEnrichAPIMName = enrichAPIMName;
		enrichAPIMName = newEnrichAPIMName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM_NAME, oldEnrichAPIMName, enrichAPIMName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestructureFPIMName() {
		return restructureFPIMName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestructureFPIMName(String newRestructureFPIMName) {
		String oldRestructureFPIMName = restructureFPIMName;
		restructureFPIMName = newRestructureFPIMName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM_NAME, oldRestructureFPIMName, restructureFPIMName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMethodpattern((MethodPattern)otherEnd, msgs);
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
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN:
				return basicSetMethodpattern(null, msgs);
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
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN:
				return eInternalContainer().eInverseRemove(this, PatternPackage.METHOD_PATTERN__METHOD_PATTERN_CONFIGURATION, MethodPattern.class, msgs);
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
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM:
				return isDiscoverPlatform();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM:
				return isDiscoverSystem();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM:
				return isEnrichLPSM();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE:
				return isRemoveCode();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM:
				return isEnrichFPIM();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM:
				return isRestructureFPIM();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM:
				return isEnrichAPIM();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN:
				return getMethodpattern();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__LEGACY_REALIZATION_NAME:
				return getLegacyRealizationName();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__TARGET_REALIZATION_NAME:
				return getTargetRealizationName();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM_NAME:
				return getDiscoverPlatformName();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM_NAME:
				return getDiscoverSystemName();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE_NAME:
				return getRemoveCodeName();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM_NAME:
				return getEnrichLPSMName();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM_NAME:
				return getEnrichFPIMName();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM_NAME:
				return getEnrichAPIMName();
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM_NAME:
				return getRestructureFPIMName();
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
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM:
				setDiscoverPlatform((Boolean)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM:
				setDiscoverSystem((Boolean)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM:
				setEnrichLPSM((Boolean)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE:
				setRemoveCode((Boolean)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM:
				setEnrichFPIM((Boolean)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM:
				setRestructureFPIM((Boolean)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM:
				setEnrichAPIM((Boolean)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN:
				setMethodpattern((MethodPattern)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__LEGACY_REALIZATION_NAME:
				setLegacyRealizationName((String)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__TARGET_REALIZATION_NAME:
				setTargetRealizationName((String)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM_NAME:
				setDiscoverPlatformName((String)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM_NAME:
				setDiscoverSystemName((String)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE_NAME:
				setRemoveCodeName((String)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM_NAME:
				setEnrichLPSMName((String)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM_NAME:
				setEnrichFPIMName((String)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM_NAME:
				setEnrichAPIMName((String)newValue);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM_NAME:
				setRestructureFPIMName((String)newValue);
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
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM:
				setDiscoverPlatform(DISCOVER_PLATFORM_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM:
				setDiscoverSystem(DISCOVER_SYSTEM_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM:
				setEnrichLPSM(ENRICH_LPSM_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE:
				setRemoveCode(REMOVE_CODE_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM:
				setEnrichFPIM(ENRICH_FPIM_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM:
				setRestructureFPIM(RESTRUCTURE_FPIM_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM:
				setEnrichAPIM(ENRICH_APIM_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN:
				setMethodpattern((MethodPattern)null);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__LEGACY_REALIZATION_NAME:
				setLegacyRealizationName(LEGACY_REALIZATION_NAME_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__TARGET_REALIZATION_NAME:
				setTargetRealizationName(TARGET_REALIZATION_NAME_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM_NAME:
				setDiscoverPlatformName(DISCOVER_PLATFORM_NAME_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM_NAME:
				setDiscoverSystemName(DISCOVER_SYSTEM_NAME_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE_NAME:
				setRemoveCodeName(REMOVE_CODE_NAME_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM_NAME:
				setEnrichLPSMName(ENRICH_LPSM_NAME_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM_NAME:
				setEnrichFPIMName(ENRICH_FPIM_NAME_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM_NAME:
				setEnrichAPIMName(ENRICH_APIM_NAME_EDEFAULT);
				return;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM_NAME:
				setRestructureFPIMName(RESTRUCTURE_FPIM_NAME_EDEFAULT);
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
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM:
				return discoverPlatform != DISCOVER_PLATFORM_EDEFAULT;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM:
				return discoverSystem != DISCOVER_SYSTEM_EDEFAULT;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM:
				return enrichLPSM != ENRICH_LPSM_EDEFAULT;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE:
				return removeCode != REMOVE_CODE_EDEFAULT;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM:
				return enrichFPIM != ENRICH_FPIM_EDEFAULT;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM:
				return restructureFPIM != RESTRUCTURE_FPIM_EDEFAULT;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM:
				return enrichAPIM != ENRICH_APIM_EDEFAULT;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__METHODPATTERN:
				return getMethodpattern() != null;
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__LEGACY_REALIZATION_NAME:
				return LEGACY_REALIZATION_NAME_EDEFAULT == null ? legacyRealizationName != null : !LEGACY_REALIZATION_NAME_EDEFAULT.equals(legacyRealizationName);
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__TARGET_REALIZATION_NAME:
				return TARGET_REALIZATION_NAME_EDEFAULT == null ? targetRealizationName != null : !TARGET_REALIZATION_NAME_EDEFAULT.equals(targetRealizationName);
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_PLATFORM_NAME:
				return DISCOVER_PLATFORM_NAME_EDEFAULT == null ? discoverPlatformName != null : !DISCOVER_PLATFORM_NAME_EDEFAULT.equals(discoverPlatformName);
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__DISCOVER_SYSTEM_NAME:
				return DISCOVER_SYSTEM_NAME_EDEFAULT == null ? discoverSystemName != null : !DISCOVER_SYSTEM_NAME_EDEFAULT.equals(discoverSystemName);
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__REMOVE_CODE_NAME:
				return REMOVE_CODE_NAME_EDEFAULT == null ? removeCodeName != null : !REMOVE_CODE_NAME_EDEFAULT.equals(removeCodeName);
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_LPSM_NAME:
				return ENRICH_LPSM_NAME_EDEFAULT == null ? enrichLPSMName != null : !ENRICH_LPSM_NAME_EDEFAULT.equals(enrichLPSMName);
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_FPIM_NAME:
				return ENRICH_FPIM_NAME_EDEFAULT == null ? enrichFPIMName != null : !ENRICH_FPIM_NAME_EDEFAULT.equals(enrichFPIMName);
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__ENRICH_APIM_NAME:
				return ENRICH_APIM_NAME_EDEFAULT == null ? enrichAPIMName != null : !ENRICH_APIM_NAME_EDEFAULT.equals(enrichAPIMName);
			case PatternPackage.METHOD_PATTERN_CONFIGURATION__RESTRUCTURE_FPIM_NAME:
				return RESTRUCTURE_FPIM_NAME_EDEFAULT == null ? restructureFPIMName != null : !RESTRUCTURE_FPIM_NAME_EDEFAULT.equals(restructureFPIMName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		
		if (removeCode)
			result.append("+ Remove Code\n");
		if (discoverPlatform)
			result.append("+ Platform Discovery\n");
		if (discoverSystem)
			result.append("+ System Discovery\n");
		if (enrichLPSM)
			result.append("+ LPSM Enrichment\n");
		if (enrichFPIM)
			result.append("+ FPIM Enrichment\n");
		if (enrichAPIM)
			result.append("+ APIM Enrichment\n");
		if (restructureFPIM)
			result.append("+ FPIM Restructuring\n");

		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getDescription() 
	{
		StringBuffer result = new StringBuffer();
		
		if (removeCode)
			result.append("+ Remove Code\n");
		if (discoverPlatform)
			result.append("+ Platform Discovery\n");
		if (discoverSystem)
			result.append("+ System Discovery\n");
		if (enrichLPSM)
			result.append("+ LPSM Enrichment\n");
		if (enrichFPIM)
			result.append("+ FPIM Enrichment\n");
		if (enrichAPIM)
			result.append("+ APIM Enrichment\n");
		if (restructureFPIM)
			result.append("+ FPIM Restructuring\n");

		if (result.lastIndexOf("\n") == -1)
			result.append("Default Configuration\n");
		
		if (result.lastIndexOf("\n") != -1)
			result.replace(result.lastIndexOf("\n"), result.lastIndexOf("\n")+2, "");
		
		return result.toString();
	}

} //MethodPatternConfigurationImpl
