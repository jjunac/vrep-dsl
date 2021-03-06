/**
 */
package org.robot.model.robot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.robot.model.robot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotFactoryImpl extends EFactoryImpl implements RobotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotFactory init() {
		try {
			RobotFactory theRobotFactory = (RobotFactory) EPackage.Registry.INSTANCE.getEFactory(RobotPackage.eNS_URI);
			if (theRobotFactory != null) {
				return theRobotFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RobotPackage.ROBOT:
			return createRobot();
		case RobotPackage.SCENARIO:
			return createScenario();
		case RobotPackage.CONNECTION:
			return createConnection();
		case RobotPackage.OBJECT_AHEAD_CONDITION:
			return createObjectAheadCondition();
		case RobotPackage.TRUE_CONDITION:
			return createTrueCondition();
		case RobotPackage.CONDITION:
			return createCondition();
		case RobotPackage.EXECUTE_STATEMENT:
			return createExecuteStatement();
		case RobotPackage.FORWARD_STATEMENT:
			return createForwardStatement();
		case RobotPackage.IF_STATEMENT:
			return createIfStatement();
		case RobotPackage.PRINT_STATEMENT:
			return createPrintStatement();
		case RobotPackage.RIGHT_STATEMENT:
			return createRightStatement();
		case RobotPackage.STATEMENT_BLOCK:
			return createStatementBlock();
		case RobotPackage.UNTIL_STATEMENT:
			return createUntilStatement();
		case RobotPackage.WHILE_STATEMENT:
			return createWhileStatement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAheadCondition createObjectAheadCondition() {
		ObjectAheadConditionImpl objectAheadCondition = new ObjectAheadConditionImpl();
		return objectAheadCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueCondition createTrueCondition() {
		TrueConditionImpl trueCondition = new TrueConditionImpl();
		return trueCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteStatement createExecuteStatement() {
		ExecuteStatementImpl executeStatement = new ExecuteStatementImpl();
		return executeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardStatement createForwardStatement() {
		ForwardStatementImpl forwardStatement = new ForwardStatementImpl();
		return forwardStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintStatement createPrintStatement() {
		PrintStatementImpl printStatement = new PrintStatementImpl();
		return printStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightStatement createRightStatement() {
		RightStatementImpl rightStatement = new RightStatementImpl();
		return rightStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UntilStatement createUntilStatement() {
		UntilStatementImpl untilStatement = new UntilStatementImpl();
		return untilStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementBlock createStatementBlock() {
		StatementBlockImpl statementBlock = new StatementBlockImpl();
		return statementBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotPackage getRobotPackage() {
		return (RobotPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotPackage getPackage() {
		return RobotPackage.eINSTANCE;
	}

} //RobotFactoryImpl
