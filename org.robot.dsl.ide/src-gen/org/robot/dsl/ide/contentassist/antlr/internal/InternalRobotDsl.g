/*
 * generated by Xtext 2.14.0
 */
grammar InternalRobotDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.robot.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.robot.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.robot.dsl.services.RobotDslGrammarAccess;

}
@parser::members {
	private RobotDslGrammarAccess grammarAccess;

	public void setGrammarAccess(RobotDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleRobot
entryRuleRobot
:
{ before(grammarAccess.getRobotRule()); }
	 ruleRobot
{ after(grammarAccess.getRobotRule()); } 
	 EOF 
;

// Rule Robot
ruleRobot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRobotAccess().getGroup()); }
		(rule__Robot__Group__0)
		{ after(grammarAccess.getRobotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConnection
entryRuleConnection
:
{ before(grammarAccess.getConnectionRule()); }
	 ruleConnection
{ after(grammarAccess.getConnectionRule()); } 
	 EOF 
;

// Rule Connection
ruleConnection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConnectionAccess().getGroup()); }
		(rule__Connection__Group__0)
		{ after(grammarAccess.getConnectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario
entryRuleScenario
:
{ before(grammarAccess.getScenarioRule()); }
	 ruleScenario
{ after(grammarAccess.getScenarioRule()); } 
	 EOF 
;

// Rule Scenario
ruleScenario 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenarioAccess().getGroup()); }
		(rule__Scenario__Group__0)
		{ after(grammarAccess.getScenarioAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCondition
entryRuleCondition
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionAccess().getBallAheadConditionParserRuleCall()); }
		ruleBallAheadCondition
		{ after(grammarAccess.getConditionAccess().getBallAheadConditionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBallAheadCondition
entryRuleBallAheadCondition
:
{ before(grammarAccess.getBallAheadConditionRule()); }
	 ruleBallAheadCondition
{ after(grammarAccess.getBallAheadConditionRule()); } 
	 EOF 
;

// Rule BallAheadCondition
ruleBallAheadCondition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBallAheadConditionAccess().getGroup()); }
		(rule__BallAheadCondition__Group__0)
		{ after(grammarAccess.getBallAheadConditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatement
entryRuleStatement
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementAccess().getAlternatives()); }
		(rule__Statement__Alternatives)
		{ after(grammarAccess.getStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleForwardStatement
entryRuleForwardStatement
:
{ before(grammarAccess.getForwardStatementRule()); }
	 ruleForwardStatement
{ after(grammarAccess.getForwardStatementRule()); } 
	 EOF 
;

// Rule ForwardStatement
ruleForwardStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getForwardStatementAccess().getGroup()); }
		(rule__ForwardStatement__Group__0)
		{ after(grammarAccess.getForwardStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrintStatement
entryRulePrintStatement
:
{ before(grammarAccess.getPrintStatementRule()); }
	 rulePrintStatement
{ after(grammarAccess.getPrintStatementRule()); } 
	 EOF 
;

// Rule PrintStatement
rulePrintStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrintStatementAccess().getGroup()); }
		(rule__PrintStatement__Group__0)
		{ after(grammarAccess.getPrintStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExecuteStatement
entryRuleExecuteStatement
:
{ before(grammarAccess.getExecuteStatementRule()); }
	 ruleExecuteStatement
{ after(grammarAccess.getExecuteStatementRule()); } 
	 EOF 
;

// Rule ExecuteStatement
ruleExecuteStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExecuteStatementAccess().getGroup()); }
		(rule__ExecuteStatement__Group__0)
		{ after(grammarAccess.getExecuteStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConditionalStatement
entryRuleConditionalStatement
:
{ before(grammarAccess.getConditionalStatementRule()); }
	 ruleConditionalStatement
{ after(grammarAccess.getConditionalStatementRule()); } 
	 EOF 
;

// Rule ConditionalStatement
ruleConditionalStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getUntilStatementParserRuleCall()); }
		ruleUntilStatement
		{ after(grammarAccess.getConditionalStatementAccess().getUntilStatementParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUntilStatement
entryRuleUntilStatement
:
{ before(grammarAccess.getUntilStatementRule()); }
	 ruleUntilStatement
{ after(grammarAccess.getUntilStatementRule()); } 
	 EOF 
;

// Rule UntilStatement
ruleUntilStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUntilStatementAccess().getGroup()); }
		(rule__UntilStatement__Group__0)
		{ after(grammarAccess.getUntilStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getForwardStatementParserRuleCall_0()); }
		ruleForwardStatement
		{ after(grammarAccess.getStatementAccess().getForwardStatementParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getExecuteStatementParserRuleCall_1()); }
		ruleExecuteStatement
		{ after(grammarAccess.getStatementAccess().getExecuteStatementParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_2()); }
		rulePrintStatement
		{ after(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_3()); }
		ruleConditionalStatement
		{ after(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__0__Impl
	rule__Robot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getRobotKeyword_0()); }
	'Robot'
	{ after(grammarAccess.getRobotAccess().getRobotKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__1__Impl
	rule__Robot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getNameAssignment_1()); }
	(rule__Robot__NameAssignment_1)
	{ after(grammarAccess.getRobotAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__2__Impl
	rule__Robot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__3__Impl
	rule__Robot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getGroup_3()); }
	(rule__Robot__Group_3__0)?
	{ after(grammarAccess.getRobotAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__4__Impl
	rule__Robot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getGroup_4()); }
	(rule__Robot__Group_4__0)?
	{ after(grammarAccess.getRobotAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__5__Impl
	rule__Robot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getGlobalKeyword_5()); }
	'global'
	{ after(grammarAccess.getRobotAccess().getGlobalKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__6__Impl
	rule__Robot__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getGlobalAssignment_6()); }
	(rule__Robot__GlobalAssignment_6)
	{ after(grammarAccess.getRobotAccess().getGlobalAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__7__Impl
	rule__Robot__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getInitialKeyword_7()); }
	'initial'
	{ after(grammarAccess.getRobotAccess().getInitialKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__8__Impl
	rule__Robot__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getInitialAssignment_8()); }
	(rule__Robot__InitialAssignment_8)
	{ after(grammarAccess.getRobotAccess().getInitialAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Robot__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group_3__0__Impl
	rule__Robot__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getConnect_toKeyword_3_0()); }
	'connect_to'
	{ after(grammarAccess.getRobotAccess().getConnect_toKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getConnectionAssignment_3_1()); }
	(rule__Robot__ConnectionAssignment_3_1)
	{ after(grammarAccess.getRobotAccess().getConnectionAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Robot__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group_4__0__Impl
	rule__Robot__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getScenariiKeyword_4_0()); }
	'scenarii'
	{ after(grammarAccess.getRobotAccess().getScenariiKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group_4__1__Impl
	rule__Robot__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group_4__2__Impl
	rule__Robot__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getScenariiAssignment_4_2()); }
	(rule__Robot__ScenariiAssignment_4_2)
	{ after(grammarAccess.getRobotAccess().getScenariiAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group_4__3__Impl
	rule__Robot__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getScenariiAssignment_4_3()); }
	(rule__Robot__ScenariiAssignment_4_3)*
	{ after(grammarAccess.getRobotAccess().getScenariiAssignment_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__0__Impl
	rule__Connection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getConnectionAction_0()); }
	()
	{ after(grammarAccess.getConnectionAccess().getConnectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__1__Impl
	rule__Connection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getIpAssignment_1()); }
	(rule__Connection__IpAssignment_1)
	{ after(grammarAccess.getConnectionAccess().getIpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__2__Impl
	rule__Connection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getConnectionAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getPortAssignment_3()); }
	(rule__Connection__PortAssignment_3)
	{ after(grammarAccess.getConnectionAccess().getPortAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__0__Impl
	rule__Scenario__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getScenarioAction_0()); }
	()
	{ after(grammarAccess.getScenarioAccess().getScenarioAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__1__Impl
	rule__Scenario__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); }
	'Scenario'
	{ after(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__2__Impl
	rule__Scenario__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getNameAssignment_2()); }
	(rule__Scenario__NameAssignment_2)
	{ after(grammarAccess.getScenarioAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__3__Impl
	rule__Scenario__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__4__Impl
	rule__Scenario__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getGroup_4()); }
	(rule__Scenario__Group_4__0)?
	{ after(grammarAccess.getScenarioAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group_4__0__Impl
	rule__Scenario__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getStatementsAssignment_4_0()); }
	(rule__Scenario__StatementsAssignment_4_0)
	{ after(grammarAccess.getScenarioAccess().getStatementsAssignment_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getStatementsAssignment_4_1()); }
	(rule__Scenario__StatementsAssignment_4_1)*
	{ after(grammarAccess.getScenarioAccess().getStatementsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BallAheadCondition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BallAheadCondition__Group__0__Impl
	rule__BallAheadCondition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BallAheadCondition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBallAheadConditionAccess().getBallAheadConditionAction_0()); }
	()
	{ after(grammarAccess.getBallAheadConditionAccess().getBallAheadConditionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BallAheadCondition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BallAheadCondition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BallAheadCondition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBallAheadConditionAccess().getBall_aheadKeyword_1()); }
	'ball_ahead'
	{ after(grammarAccess.getBallAheadConditionAccess().getBall_aheadKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ForwardStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForwardStatement__Group__0__Impl
	rule__ForwardStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForwardStatementAccess().getForwardStatementAction_0()); }
	()
	{ after(grammarAccess.getForwardStatementAccess().getForwardStatementAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForwardStatement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForwardStatementAccess().getForwardKeyword_1()); }
	'forward'
	{ after(grammarAccess.getForwardStatementAccess().getForwardKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrintStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrintStatement__Group__0__Impl
	rule__PrintStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintStatementAccess().getPrintStatementAction_0()); }
	()
	{ after(grammarAccess.getPrintStatementAccess().getPrintStatementAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrintStatement__Group__1__Impl
	rule__PrintStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintStatementAccess().getPrintKeyword_1()); }
	'print'
	{ after(grammarAccess.getPrintStatementAccess().getPrintKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrintStatement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintStatementAccess().getTextAssignment_2()); }
	(rule__PrintStatement__TextAssignment_2)
	{ after(grammarAccess.getPrintStatementAccess().getTextAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExecuteStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecuteStatement__Group__0__Impl
	rule__ExecuteStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecuteStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecuteStatementAccess().getExecuteStatementAction_0()); }
	()
	{ after(grammarAccess.getExecuteStatementAccess().getExecuteStatementAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecuteStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecuteStatement__Group__1__Impl
	rule__ExecuteStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecuteStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecuteStatementAccess().getExecuteKeyword_1()); }
	'execute'
	{ after(grammarAccess.getExecuteStatementAccess().getExecuteKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecuteStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecuteStatement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecuteStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecuteStatementAccess().getDestinationAssignment_2()); }
	(rule__ExecuteStatement__DestinationAssignment_2)
	{ after(grammarAccess.getExecuteStatementAccess().getDestinationAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UntilStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UntilStatement__Group__0__Impl
	rule__UntilStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUntilStatementAccess().getUntilStatementAction_0()); }
	()
	{ after(grammarAccess.getUntilStatementAccess().getUntilStatementAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UntilStatement__Group__1__Impl
	rule__UntilStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUntilStatementAccess().getUntilKeyword_1()); }
	'until'
	{ after(grammarAccess.getUntilStatementAccess().getUntilKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UntilStatement__Group__2__Impl
	rule__UntilStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUntilStatementAccess().getConditionAssignment_2()); }
	(rule__UntilStatement__ConditionAssignment_2)
	{ after(grammarAccess.getUntilStatementAccess().getConditionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UntilStatement__Group__3__Impl
	rule__UntilStatement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUntilStatementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getUntilStatementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UntilStatement__Group__4__Impl
	rule__UntilStatement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUntilStatementAccess().getStatementsAssignment_4()); }
	(rule__UntilStatement__StatementsAssignment_4)
	{ after(grammarAccess.getUntilStatementAccess().getStatementsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UntilStatement__Group__5__Impl
	rule__UntilStatement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUntilStatementAccess().getStatementsAssignment_5()); }
	(rule__UntilStatement__StatementsAssignment_5)*
	{ after(grammarAccess.getUntilStatementAccess().getStatementsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UntilStatement__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUntilStatementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getUntilStatementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Robot__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__ConnectionAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getConnectionConnectionParserRuleCall_3_1_0()); }
		ruleConnection
		{ after(grammarAccess.getRobotAccess().getConnectionConnectionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__ScenariiAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_4_2_0()); }
		ruleScenario
		{ after(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__ScenariiAssignment_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_4_3_0()); }
		ruleScenario
		{ after(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__GlobalAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getGlobalScenarioParserRuleCall_6_0()); }
		ruleScenario
		{ after(grammarAccess.getRobotAccess().getGlobalScenarioParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__InitialAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getInitialScenarioCrossReference_8_0()); }
		(
			{ before(grammarAccess.getRobotAccess().getInitialScenarioEStringParserRuleCall_8_0_1()); }
			ruleEString
			{ after(grammarAccess.getRobotAccess().getInitialScenarioEStringParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getRobotAccess().getInitialScenarioCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__IpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getIpEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getConnectionAccess().getIpEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__PortAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getPortINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getConnectionAccess().getPortINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getScenarioAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__StatementsAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0_0()); }
		ruleStatement
		{ after(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__StatementsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_1_0()); }
		ruleStatement
		{ after(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintStatement__TextAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrintStatementAccess().getTextEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getPrintStatementAccess().getTextEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecuteStatement__DestinationAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExecuteStatementAccess().getDestinationScenarioCrossReference_2_0()); }
		(
			{ before(grammarAccess.getExecuteStatementAccess().getDestinationScenarioEStringParserRuleCall_2_0_1()); }
			ruleEString
			{ after(grammarAccess.getExecuteStatementAccess().getDestinationScenarioEStringParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getExecuteStatementAccess().getDestinationScenarioCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__ConditionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUntilStatementAccess().getConditionConditionParserRuleCall_2_0()); }
		ruleCondition
		{ after(grammarAccess.getUntilStatementAccess().getConditionConditionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__StatementsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUntilStatementAccess().getStatementsStatementParserRuleCall_4_0()); }
		ruleStatement
		{ after(grammarAccess.getUntilStatementAccess().getStatementsStatementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilStatement__StatementsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUntilStatementAccess().getStatementsStatementParserRuleCall_5_0()); }
		ruleStatement
		{ after(grammarAccess.getUntilStatementAccess().getStatementsStatementParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
