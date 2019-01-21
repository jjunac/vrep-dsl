/**
 */
package org.robot.model.robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.robot.model.robot.State#getActions <em>Actions</em>}</li>
 *   <li>{@link org.robot.model.robot.State#getDestinations <em>Destinations</em>}</li>
 * </ul>
 *
 * @see org.robot.model.robot.RobotPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link org.robot.model.robot.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see org.robot.model.robot.RobotPackage#getState_Actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Destinations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinations</em>' attribute.
	 * @see #setDestinations(String)
	 * @see org.robot.model.robot.RobotPackage#getState_Destinations()
	 * @model
	 * @generated
	 */
	String getDestinations();

	/**
	 * Sets the value of the '{@link org.robot.model.robot.State#getDestinations <em>Destinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destinations</em>' attribute.
	 * @see #getDestinations()
	 * @generated
	 */
	void setDestinations(String value);

} // State
