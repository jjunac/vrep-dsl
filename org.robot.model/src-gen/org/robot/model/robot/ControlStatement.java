/**
 */
package org.robot.model.robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.robot.model.robot.ControlStatement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.robot.model.robot.RobotPackage#getControlStatement()
 * @model abstract="true"
 * @generated
 */
public interface ControlStatement extends Statement {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.robot.model.robot.RobotPackage#getControlStatement_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.robot.model.robot.ControlStatement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);
} // ControlStatement
