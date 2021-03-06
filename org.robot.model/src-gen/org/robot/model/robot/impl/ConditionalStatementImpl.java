/**
 */
package org.robot.model.robot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.robot.model.robot.Condition;
import org.robot.model.robot.ConditionalStatement;
import org.robot.model.robot.RobotPackage;
import org.robot.model.robot.StatementBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.robot.model.robot.impl.ConditionalStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.robot.model.robot.impl.ConditionalStatementImpl#getStatementBlock <em>Statement Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionalStatementImpl extends StatementImpl implements ConditionalStatement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getStatementBlock() <em>Statement Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementBlock()
	 * @generated
	 * @ordered
	 */
	protected StatementBlock statementBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.CONDITIONAL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotPackage.CONDITIONAL_STATEMENT__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.CONDITIONAL_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.CONDITIONAL_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.CONDITIONAL_STATEMENT__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementBlock getStatementBlock() {
		return statementBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatementBlock(StatementBlock newStatementBlock, NotificationChain msgs) {
		StatementBlock oldStatementBlock = statementBlock;
		statementBlock = newStatementBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotPackage.CONDITIONAL_STATEMENT__STATEMENT_BLOCK, oldStatementBlock, newStatementBlock);
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
	public void setStatementBlock(StatementBlock newStatementBlock) {
		if (newStatementBlock != statementBlock) {
			NotificationChain msgs = null;
			if (statementBlock != null)
				msgs = ((InternalEObject) statementBlock).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.CONDITIONAL_STATEMENT__STATEMENT_BLOCK, null, msgs);
			if (newStatementBlock != null)
				msgs = ((InternalEObject) newStatementBlock).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.CONDITIONAL_STATEMENT__STATEMENT_BLOCK, null, msgs);
			msgs = basicSetStatementBlock(newStatementBlock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.CONDITIONAL_STATEMENT__STATEMENT_BLOCK,
					newStatementBlock, newStatementBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotPackage.CONDITIONAL_STATEMENT__CONDITION:
			return basicSetCondition(null, msgs);
		case RobotPackage.CONDITIONAL_STATEMENT__STATEMENT_BLOCK:
			return basicSetStatementBlock(null, msgs);
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
		case RobotPackage.CONDITIONAL_STATEMENT__CONDITION:
			return getCondition();
		case RobotPackage.CONDITIONAL_STATEMENT__STATEMENT_BLOCK:
			return getStatementBlock();
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
		case RobotPackage.CONDITIONAL_STATEMENT__CONDITION:
			setCondition((Condition) newValue);
			return;
		case RobotPackage.CONDITIONAL_STATEMENT__STATEMENT_BLOCK:
			setStatementBlock((StatementBlock) newValue);
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
		case RobotPackage.CONDITIONAL_STATEMENT__CONDITION:
			setCondition((Condition) null);
			return;
		case RobotPackage.CONDITIONAL_STATEMENT__STATEMENT_BLOCK:
			setStatementBlock((StatementBlock) null);
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
		case RobotPackage.CONDITIONAL_STATEMENT__CONDITION:
			return condition != null;
		case RobotPackage.CONDITIONAL_STATEMENT__STATEMENT_BLOCK:
			return statementBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalStatementImpl
