/**
 */
package org.robot.model.robot.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.robot.model.robot.Condition;
import org.robot.model.robot.ConditionalStatement;
import org.robot.model.robot.Connection;
import org.robot.model.robot.ControlStatement;
import org.robot.model.robot.ExecuteStatement;
import org.robot.model.robot.ForwardStatement;
import org.robot.model.robot.IfStatement;
import org.robot.model.robot.NamedElement;
import org.robot.model.robot.ObjectAheadCondition;
import org.robot.model.robot.PrintStatement;
import org.robot.model.robot.RightStatement;
import org.robot.model.robot.Robot;
import org.robot.model.robot.RobotFactory;
import org.robot.model.robot.RobotPackage;
import org.robot.model.robot.Scenario;
import org.robot.model.robot.Statement;
import org.robot.model.robot.StatementBlock;
import org.robot.model.robot.TrueCondition;
import org.robot.model.robot.UntilStatement;
import org.robot.model.robot.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotPackageImpl extends EPackageImpl implements RobotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAheadConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untilStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementBlockEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.robot.model.robot.RobotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobotPackageImpl() {
		super(eNS_URI, RobotFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RobotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobotPackage init() {
		if (isInited)
			return (RobotPackage) EPackage.Registry.INSTANCE.getEPackage(RobotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRobotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RobotPackageImpl theRobotPackage = registeredRobotPackage instanceof RobotPackageImpl
				? (RobotPackageImpl) registeredRobotPackage
				: new RobotPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRobotPackage.createPackageContents();

		// Initialize created meta-data
		theRobotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobotPackage.eNS_URI, theRobotPackage);
		return theRobotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Scenarii() {
		return (EReference) robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Global() {
		return (EReference) robotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Initial() {
		return (EReference) robotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Connection() {
		return (EReference) robotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_StatementBlock() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Ip() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Port() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAheadCondition() {
		return objectAheadConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueCondition() {
		return trueConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalStatement() {
		return conditionalStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStatement_Condition() {
		return (EReference) conditionalStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStatement_StatementBlock() {
		return (EReference) conditionalStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlStatement() {
		return controlStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlStatement_Value() {
		return (EAttribute) controlStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecuteStatement() {
		return executeStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecuteStatement_Destination() {
		return (EReference) executeStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForwardStatement() {
		return forwardStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintStatement() {
		return printStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintStatement_Text() {
		return (EAttribute) printStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightStatement() {
		return rightStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUntilStatement() {
		return untilStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStatement() {
		return whileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementBlock() {
		return statementBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementBlock_Statements() {
		return (EReference) statementBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotFactory getRobotFactory() {
		return (RobotFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		robotEClass = createEClass(ROBOT);
		createEReference(robotEClass, ROBOT__SCENARII);
		createEReference(robotEClass, ROBOT__GLOBAL);
		createEReference(robotEClass, ROBOT__INITIAL);
		createEReference(robotEClass, ROBOT__CONNECTION);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__STATEMENT_BLOCK);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__IP);
		createEAttribute(connectionEClass, CONNECTION__PORT);

		objectAheadConditionEClass = createEClass(OBJECT_AHEAD_CONDITION);

		trueConditionEClass = createEClass(TRUE_CONDITION);

		conditionEClass = createEClass(CONDITION);

		conditionalStatementEClass = createEClass(CONDITIONAL_STATEMENT);
		createEReference(conditionalStatementEClass, CONDITIONAL_STATEMENT__CONDITION);
		createEReference(conditionalStatementEClass, CONDITIONAL_STATEMENT__STATEMENT_BLOCK);

		controlStatementEClass = createEClass(CONTROL_STATEMENT);
		createEAttribute(controlStatementEClass, CONTROL_STATEMENT__VALUE);

		executeStatementEClass = createEClass(EXECUTE_STATEMENT);
		createEReference(executeStatementEClass, EXECUTE_STATEMENT__DESTINATION);

		forwardStatementEClass = createEClass(FORWARD_STATEMENT);

		ifStatementEClass = createEClass(IF_STATEMENT);

		printStatementEClass = createEClass(PRINT_STATEMENT);
		createEAttribute(printStatementEClass, PRINT_STATEMENT__TEXT);

		rightStatementEClass = createEClass(RIGHT_STATEMENT);

		statementEClass = createEClass(STATEMENT);

		statementBlockEClass = createEClass(STATEMENT_BLOCK);
		createEReference(statementBlockEClass, STATEMENT_BLOCK__STATEMENTS);

		untilStatementEClass = createEClass(UNTIL_STATEMENT);

		whileStatementEClass = createEClass(WHILE_STATEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		robotEClass.getESuperTypes().add(this.getNamedElement());
		scenarioEClass.getESuperTypes().add(this.getNamedElement());
		objectAheadConditionEClass.getESuperTypes().add(this.getCondition());
		trueConditionEClass.getESuperTypes().add(this.getCondition());
		conditionalStatementEClass.getESuperTypes().add(this.getStatement());
		controlStatementEClass.getESuperTypes().add(this.getStatement());
		executeStatementEClass.getESuperTypes().add(this.getStatement());
		forwardStatementEClass.getESuperTypes().add(this.getControlStatement());
		ifStatementEClass.getESuperTypes().add(this.getConditionalStatement());
		printStatementEClass.getESuperTypes().add(this.getStatement());
		rightStatementEClass.getESuperTypes().add(this.getControlStatement());
		untilStatementEClass.getESuperTypes().add(this.getConditionalStatement());
		whileStatementEClass.getESuperTypes().add(this.getConditionalStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobot_Scenarii(), this.getScenario(), null, "scenarii", null, 0, -1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_Global(), this.getStatementBlock(), null, "global", null, 1, 1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_Initial(), this.getScenario(), null, "initial", null, 0, 1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRobot_Connection(), this.getConnection(), null, "connection", null, 0, 1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_StatementBlock(), this.getStatementBlock(), null, "statementBlock", null, 1, 1,
				Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Ip(), ecorePackage.getEString(), "ip", null, 1, 1, Connection.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Port(), ecorePackage.getEInt(), "port", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectAheadConditionEClass, ObjectAheadCondition.class, "ObjectAheadCondition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trueConditionEClass, TrueCondition.class, "TrueCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalStatementEClass, ConditionalStatement.class, "ConditionalStatement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStatement_Condition(), this.getCondition(), null, "condition", null, 1, 1,
				ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStatement_StatementBlock(), this.getStatementBlock(), null, "statementBlock", null,
				1, 1, ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlStatementEClass, ControlStatement.class, "ControlStatement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlStatement_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ControlStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executeStatementEClass, ExecuteStatement.class, "ExecuteStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecuteStatement_Destination(), this.getScenario(), null, "destination", null, 1, 1,
				ExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forwardStatementEClass, ForwardStatement.class, "ForwardStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(printStatementEClass, PrintStatement.class, "PrintStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrintStatement_Text(), ecorePackage.getEString(), "text", null, 0, 1, PrintStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightStatementEClass, RightStatement.class, "RightStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementBlockEClass, StatementBlock.class, "StatementBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1,
				StatementBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(untilStatementEClass, UntilStatement.class, "UntilStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RobotPackageImpl
