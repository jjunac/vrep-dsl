/**
 */
package org.robot.model.robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.robot.model.robot.Scenario#getStatementBlock <em>Statement Block</em>}</li>
 * </ul>
 *
 * @see org.robot.model.robot.RobotPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statement Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Block</em>' containment reference.
	 * @see #setStatementBlock(StatementBlock)
	 * @see org.robot.model.robot.RobotPackage#getScenario_StatementBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatementBlock getStatementBlock();

	/**
	 * Sets the value of the '{@link org.robot.model.robot.Scenario#getStatementBlock <em>Statement Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Block</em>' containment reference.
	 * @see #getStatementBlock()
	 * @generated
	 */
	void setStatementBlock(StatementBlock value);

} // Scenario
