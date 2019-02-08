/**
 */
package org.robot.model.robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.robot.model.robot.ConditionalStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.robot.model.robot.ConditionalStatement#getStatementBlock <em>Statement Block</em>}</li>
 * </ul>
 *
 * @see org.robot.model.robot.RobotPackage#getConditionalStatement()
 * @model abstract="true"
 * @generated
 */
public interface ConditionalStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see org.robot.model.robot.RobotPackage#getConditionalStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.robot.model.robot.ConditionalStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

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
	 * @see org.robot.model.robot.RobotPackage#getConditionalStatement_StatementBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatementBlock getStatementBlock();

	/**
	 * Sets the value of the '{@link org.robot.model.robot.ConditionalStatement#getStatementBlock <em>Statement Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Block</em>' containment reference.
	 * @see #getStatementBlock()
	 * @generated
	 */
	void setStatementBlock(StatementBlock value);

} // ConditionalStatement
