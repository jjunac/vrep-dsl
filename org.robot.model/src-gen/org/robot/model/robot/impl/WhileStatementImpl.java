/**
 */
package org.robot.model.robot.impl;

import org.eclipse.emf.ecore.EClass;

import org.robot.model.robot.RobotPackage;
import org.robot.model.robot.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WhileStatementImpl extends ConditionalStatementImpl implements WhileStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.WHILE_STATEMENT;
	}

} //WhileStatementImpl
