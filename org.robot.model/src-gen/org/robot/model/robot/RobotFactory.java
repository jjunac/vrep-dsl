/**
 */
package org.robot.model.robot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.robot.model.robot.RobotPackage
 * @generated
 */
public interface RobotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotFactory eINSTANCE = org.robot.model.robot.impl.RobotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Object Ahead Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Ahead Condition</em>'.
	 * @generated
	 */
	ObjectAheadCondition createObjectAheadCondition();

	/**
	 * Returns a new object of class '<em>True Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True Condition</em>'.
	 * @generated
	 */
	TrueCondition createTrueCondition();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Execute Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Statement</em>'.
	 * @generated
	 */
	ExecuteStatement createExecuteStatement();

	/**
	 * Returns a new object of class '<em>Forward Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forward Statement</em>'.
	 * @generated
	 */
	ForwardStatement createForwardStatement();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>Print Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Print Statement</em>'.
	 * @generated
	 */
	PrintStatement createPrintStatement();

	/**
	 * Returns a new object of class '<em>Right Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Statement</em>'.
	 * @generated
	 */
	RightStatement createRightStatement();

	/**
	 * Returns a new object of class '<em>Until Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Until Statement</em>'.
	 * @generated
	 */
	UntilStatement createUntilStatement();

	/**
	 * Returns a new object of class '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Statement</em>'.
	 * @generated
	 */
	WhileStatement createWhileStatement();

	/**
	 * Returns a new object of class '<em>Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Block</em>'.
	 * @generated
	 */
	StatementBlock createStatementBlock();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RobotPackage getRobotPackage();

} //RobotFactory
