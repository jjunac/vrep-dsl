/**
 */
package org.robot.model.robot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.robot.model.robot.Connection;
import org.robot.model.robot.Robot;
import org.robot.model.robot.RobotPackage;
import org.robot.model.robot.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.robot.model.robot.impl.RobotImpl#getScenarii <em>Scenarii</em>}</li>
 *   <li>{@link org.robot.model.robot.impl.RobotImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.robot.model.robot.impl.RobotImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.robot.model.robot.impl.RobotImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends NamedElementImpl implements Robot {
	/**
	 * The cached value of the '{@link #getScenarii() <em>Scenarii</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarii()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarii;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected Scenario global;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected Scenario initial;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarii() {
		if (scenarii == null) {
			scenarii = new EObjectContainmentEList<Scenario>(Scenario.class, this, RobotPackage.ROBOT__SCENARII);
		}
		return scenarii;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobal(Scenario newGlobal, NotificationChain msgs) {
		Scenario oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotPackage.ROBOT__GLOBAL,
					oldGlobal, newGlobal);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobal(Scenario newGlobal) {
		if (newGlobal != global) {
			NotificationChain msgs = null;
			if (global != null)
				msgs = ((InternalEObject) global).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.ROBOT__GLOBAL, null, msgs);
			if (newGlobal != null)
				msgs = ((InternalEObject) newGlobal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.ROBOT__GLOBAL, null, msgs);
			msgs = basicSetGlobal(newGlobal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.ROBOT__GLOBAL, newGlobal, newGlobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getInitial() {
		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject) initial;
			initial = (Scenario) eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotPackage.ROBOT__INITIAL, oldInitial,
							initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(Scenario newInitial) {
		Scenario oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.ROBOT__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection(Connection newConnection, NotificationChain msgs) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotPackage.ROBOT__CONNECTION, oldConnection, newConnection);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Connection newConnection) {
		if (newConnection != connection) {
			NotificationChain msgs = null;
			if (connection != null)
				msgs = ((InternalEObject) connection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.ROBOT__CONNECTION, null, msgs);
			if (newConnection != null)
				msgs = ((InternalEObject) newConnection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.ROBOT__CONNECTION, null, msgs);
			msgs = basicSetConnection(newConnection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.ROBOT__CONNECTION, newConnection,
					newConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotPackage.ROBOT__SCENARII:
			return ((InternalEList<?>) getScenarii()).basicRemove(otherEnd, msgs);
		case RobotPackage.ROBOT__GLOBAL:
			return basicSetGlobal(null, msgs);
		case RobotPackage.ROBOT__CONNECTION:
			return basicSetConnection(null, msgs);
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
		case RobotPackage.ROBOT__SCENARII:
			return getScenarii();
		case RobotPackage.ROBOT__GLOBAL:
			return getGlobal();
		case RobotPackage.ROBOT__INITIAL:
			if (resolve)
				return getInitial();
			return basicGetInitial();
		case RobotPackage.ROBOT__CONNECTION:
			return getConnection();
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
		case RobotPackage.ROBOT__SCENARII:
			getScenarii().clear();
			getScenarii().addAll((Collection<? extends Scenario>) newValue);
			return;
		case RobotPackage.ROBOT__GLOBAL:
			setGlobal((Scenario) newValue);
			return;
		case RobotPackage.ROBOT__INITIAL:
			setInitial((Scenario) newValue);
			return;
		case RobotPackage.ROBOT__CONNECTION:
			setConnection((Connection) newValue);
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
		case RobotPackage.ROBOT__SCENARII:
			getScenarii().clear();
			return;
		case RobotPackage.ROBOT__GLOBAL:
			setGlobal((Scenario) null);
			return;
		case RobotPackage.ROBOT__INITIAL:
			setInitial((Scenario) null);
			return;
		case RobotPackage.ROBOT__CONNECTION:
			setConnection((Connection) null);
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
		case RobotPackage.ROBOT__SCENARII:
			return scenarii != null && !scenarii.isEmpty();
		case RobotPackage.ROBOT__GLOBAL:
			return global != null;
		case RobotPackage.ROBOT__INITIAL:
			return initial != null;
		case RobotPackage.ROBOT__CONNECTION:
			return connection != null;
		}
		return super.eIsSet(featureID);
	}

} //RobotImpl
