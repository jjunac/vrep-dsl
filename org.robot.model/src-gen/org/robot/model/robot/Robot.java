/**
 */
package org.robot.model.robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.robot.model.robot.Robot#getScenarii <em>Scenarii</em>}</li>
 *   <li>{@link org.robot.model.robot.Robot#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.robot.model.robot.Robot#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.robot.model.robot.Robot#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see org.robot.model.robot.RobotPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Scenarii</b></em>' containment reference list.
	 * The list contents are of type {@link org.robot.model.robot.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarii</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarii</em>' containment reference list.
	 * @see org.robot.model.robot.RobotPackage#getRobot_Scenarii()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarii();

	/**
	 * Returns the value of the '<em><b>Global</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' containment reference.
	 * @see #setGlobal(StatementBlock)
	 * @see org.robot.model.robot.RobotPackage#getRobot_Global()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatementBlock getGlobal();

	/**
	 * Sets the value of the '{@link org.robot.model.robot.Robot#getGlobal <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' containment reference.
	 * @see #getGlobal()
	 * @generated
	 */
	void setGlobal(StatementBlock value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(Scenario)
	 * @see org.robot.model.robot.RobotPackage#getRobot_Initial()
	 * @model
	 * @generated
	 */
	Scenario getInitial();

	/**
	 * Sets the value of the '{@link org.robot.model.robot.Robot#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(Scenario value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference.
	 * @see #setConnection(Connection)
	 * @see org.robot.model.robot.RobotPackage#getRobot_Connection()
	 * @model containment="true"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link org.robot.model.robot.Robot#getConnection <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' containment reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

} // Robot
