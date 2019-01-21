/**
 */
package org.robot.model.robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.robot.model.robot.Scenario#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see org.robot.model.robot.RobotPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.robot.model.robot.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.robot.model.robot.RobotPackage#getScenario_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // Scenario
