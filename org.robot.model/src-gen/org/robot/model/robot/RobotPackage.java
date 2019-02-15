/**
 */
package org.robot.model.robot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.robot.model.robot.RobotFactory
 * @model kind="package"
 * @generated
 */
public interface RobotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/robot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotPackage eINSTANCE = org.robot.model.robot.impl.RobotPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.NamedElementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.RobotImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Scenarii</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__SCENARII = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__GLOBAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__INITIAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__CONNECTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.ScenarioImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statement Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STATEMENT_BLOCK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.ConnectionImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IP = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PORT = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.ConditionImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 5;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.ObjectAheadConditionImpl <em>Object Ahead Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.ObjectAheadConditionImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getObjectAheadCondition()
	 * @generated
	 */
	int OBJECT_AHEAD_CONDITION = 4;

	/**
	 * The number of structural features of the '<em>Object Ahead Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_AHEAD_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Ahead Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_AHEAD_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.StatementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 12;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.ConditionalStatementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getConditionalStatement()
	 * @generated
	 */
	int CONDITIONAL_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__STATEMENT_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.ControlStatementImpl <em>Control Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.ControlStatementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getControlStatement()
	 * @generated
	 */
	int CONTROL_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.ExecuteStatementImpl <em>Execute Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.ExecuteStatementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getExecuteStatement()
	 * @generated
	 */
	int EXECUTE_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_STATEMENT__DESTINATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execute Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execute Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.ForwardStatementImpl <em>Forward Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.ForwardStatementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getForwardStatement()
	 * @generated
	 */
	int FORWARD_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_STATEMENT__VALUE = CONTROL_STATEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Forward Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_STATEMENT_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forward Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_STATEMENT_OPERATION_COUNT = CONTROL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.PrintStatementImpl <em>Print Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.PrintStatementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getPrintStatement()
	 * @generated
	 */
	int PRINT_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT__TEXT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Print Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.RightStatementImpl <em>Right Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.RightStatementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getRightStatement()
	 * @generated
	 */
	int RIGHT_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_STATEMENT__VALUE = CONTROL_STATEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Right Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_STATEMENT_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_STATEMENT_OPERATION_COUNT = CONTROL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.UntilStatementImpl <em>Until Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.UntilStatementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getUntilStatement()
	 * @generated
	 */
	int UNTIL_STATEMENT = 14;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.WhileStatementImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 15;

	/**
	 * The meta object id for the '{@link org.robot.model.robot.impl.StatementBlockImpl <em>Statement Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.robot.model.robot.impl.StatementBlockImpl
	 * @see org.robot.model.robot.impl.RobotPackageImpl#getStatementBlock()
	 * @generated
	 */
	int STATEMENT_BLOCK = 13;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_STATEMENT__CONDITION = CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Statement Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_STATEMENT__STATEMENT_BLOCK = CONDITIONAL_STATEMENT__STATEMENT_BLOCK;

	/**
	 * The number of structural features of the '<em>Until Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_STATEMENT_FEATURE_COUNT = CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Until Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_STATEMENT_OPERATION_COUNT = CONDITIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Statement Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__STATEMENT_BLOCK = CONDITIONAL_STATEMENT__STATEMENT_BLOCK;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = CONDITIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see org.robot.model.robot.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.robot.model.robot.Robot#getScenarii <em>Scenarii</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarii</em>'.
	 * @see org.robot.model.robot.Robot#getScenarii()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Scenarii();

	/**
	 * Returns the meta object for the containment reference '{@link org.robot.model.robot.Robot#getGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global</em>'.
	 * @see org.robot.model.robot.Robot#getGlobal()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Global();

	/**
	 * Returns the meta object for the reference '{@link org.robot.model.robot.Robot#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see org.robot.model.robot.Robot#getInitial()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Initial();

	/**
	 * Returns the meta object for the containment reference '{@link org.robot.model.robot.Robot#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection</em>'.
	 * @see org.robot.model.robot.Robot#getConnection()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Connection();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.robot.model.robot.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference '{@link org.robot.model.robot.Scenario#getStatementBlock <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement Block</em>'.
	 * @see org.robot.model.robot.Scenario#getStatementBlock()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_StatementBlock();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.robot.model.robot.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.robot.model.robot.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.robot.model.robot.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.robot.model.robot.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.robot.model.robot.Connection#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see org.robot.model.robot.Connection#getIp()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Ip();

	/**
	 * Returns the meta object for the attribute '{@link org.robot.model.robot.Connection#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.robot.model.robot.Connection#getPort()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Port();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.ObjectAheadCondition <em>Object Ahead Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ahead Condition</em>'.
	 * @see org.robot.model.robot.ObjectAheadCondition
	 * @generated
	 */
	EClass getObjectAheadCondition();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.robot.model.robot.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.ConditionalStatement <em>Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Statement</em>'.
	 * @see org.robot.model.robot.ConditionalStatement
	 * @generated
	 */
	EClass getConditionalStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.robot.model.robot.ConditionalStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.robot.model.robot.ConditionalStatement#getCondition()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.robot.model.robot.ConditionalStatement#getStatementBlock <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement Block</em>'.
	 * @see org.robot.model.robot.ConditionalStatement#getStatementBlock()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_StatementBlock();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.ControlStatement <em>Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Statement</em>'.
	 * @see org.robot.model.robot.ControlStatement
	 * @generated
	 */
	EClass getControlStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.robot.model.robot.ControlStatement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.robot.model.robot.ControlStatement#getValue()
	 * @see #getControlStatement()
	 * @generated
	 */
	EAttribute getControlStatement_Value();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.ExecuteStatement <em>Execute Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute Statement</em>'.
	 * @see org.robot.model.robot.ExecuteStatement
	 * @generated
	 */
	EClass getExecuteStatement();

	/**
	 * Returns the meta object for the reference '{@link org.robot.model.robot.ExecuteStatement#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.robot.model.robot.ExecuteStatement#getDestination()
	 * @see #getExecuteStatement()
	 * @generated
	 */
	EReference getExecuteStatement_Destination();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.ForwardStatement <em>Forward Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward Statement</em>'.
	 * @see org.robot.model.robot.ForwardStatement
	 * @generated
	 */
	EClass getForwardStatement();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.PrintStatement <em>Print Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Statement</em>'.
	 * @see org.robot.model.robot.PrintStatement
	 * @generated
	 */
	EClass getPrintStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.robot.model.robot.PrintStatement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.robot.model.robot.PrintStatement#getText()
	 * @see #getPrintStatement()
	 * @generated
	 */
	EAttribute getPrintStatement_Text();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.RightStatement <em>Right Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Statement</em>'.
	 * @see org.robot.model.robot.RightStatement
	 * @generated
	 */
	EClass getRightStatement();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.robot.model.robot.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.UntilStatement <em>Until Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Until Statement</em>'.
	 * @see org.robot.model.robot.UntilStatement
	 * @generated
	 */
	EClass getUntilStatement();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see org.robot.model.robot.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for class '{@link org.robot.model.robot.StatementBlock <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Block</em>'.
	 * @see org.robot.model.robot.StatementBlock
	 * @generated
	 */
	EClass getStatementBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.robot.model.robot.StatementBlock#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.robot.model.robot.StatementBlock#getStatements()
	 * @see #getStatementBlock()
	 * @generated
	 */
	EReference getStatementBlock_Statements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotFactory getRobotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.RobotImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Scenarii</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__SCENARII = eINSTANCE.getRobot_Scenarii();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__GLOBAL = eINSTANCE.getRobot_Global();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__INITIAL = eINSTANCE.getRobot_Initial();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__CONNECTION = eINSTANCE.getRobot_Connection();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.ScenarioImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Statement Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__STATEMENT_BLOCK = eINSTANCE.getScenario_StatementBlock();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.NamedElementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.ConnectionImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__IP = eINSTANCE.getConnection_Ip();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PORT = eINSTANCE.getConnection_Port();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.ObjectAheadConditionImpl <em>Object Ahead Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.ObjectAheadConditionImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getObjectAheadCondition()
		 * @generated
		 */
		EClass OBJECT_AHEAD_CONDITION = eINSTANCE.getObjectAheadCondition();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.ConditionImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.ConditionalStatementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getConditionalStatement()
		 * @generated
		 */
		EClass CONDITIONAL_STATEMENT = eINSTANCE.getConditionalStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__CONDITION = eINSTANCE.getConditionalStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Statement Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__STATEMENT_BLOCK = eINSTANCE.getConditionalStatement_StatementBlock();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.ControlStatementImpl <em>Control Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.ControlStatementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getControlStatement()
		 * @generated
		 */
		EClass CONTROL_STATEMENT = eINSTANCE.getControlStatement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_STATEMENT__VALUE = eINSTANCE.getControlStatement_Value();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.ExecuteStatementImpl <em>Execute Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.ExecuteStatementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getExecuteStatement()
		 * @generated
		 */
		EClass EXECUTE_STATEMENT = eINSTANCE.getExecuteStatement();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTE_STATEMENT__DESTINATION = eINSTANCE.getExecuteStatement_Destination();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.ForwardStatementImpl <em>Forward Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.ForwardStatementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getForwardStatement()
		 * @generated
		 */
		EClass FORWARD_STATEMENT = eINSTANCE.getForwardStatement();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.PrintStatementImpl <em>Print Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.PrintStatementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getPrintStatement()
		 * @generated
		 */
		EClass PRINT_STATEMENT = eINSTANCE.getPrintStatement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_STATEMENT__TEXT = eINSTANCE.getPrintStatement_Text();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.RightStatementImpl <em>Right Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.RightStatementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getRightStatement()
		 * @generated
		 */
		EClass RIGHT_STATEMENT = eINSTANCE.getRightStatement();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.StatementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.UntilStatementImpl <em>Until Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.UntilStatementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getUntilStatement()
		 * @generated
		 */
		EClass UNTIL_STATEMENT = eINSTANCE.getUntilStatement();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.WhileStatementImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '{@link org.robot.model.robot.impl.StatementBlockImpl <em>Statement Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.robot.model.robot.impl.StatementBlockImpl
		 * @see org.robot.model.robot.impl.RobotPackageImpl#getStatementBlock()
		 * @generated
		 */
		EClass STATEMENT_BLOCK = eINSTANCE.getStatementBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_BLOCK__STATEMENTS = eINSTANCE.getStatementBlock_Statements();

	}

} //RobotPackage
