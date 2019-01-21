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

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getGroup()); }
		(rule__Action__Group__0)
		{ after(grammarAccess.getActionAccess().getGroup()); }
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
	{ before(grammarAccess.getRobotAccess().getRobotAction_0()); }
	()
	{ after(grammarAccess.getRobotAccess().getRobotAction_0()); }
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
	{ before(grammarAccess.getRobotAccess().getRobotKeyword_1()); }
	'Robot'
	{ after(grammarAccess.getRobotAccess().getRobotKeyword_1()); }
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
	{ before(grammarAccess.getRobotAccess().getNameAssignment_2()); }
	(rule__Robot__NameAssignment_2)
	{ after(grammarAccess.getRobotAccess().getNameAssignment_2()); }
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
	{ before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_5()); }
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
	{ before(grammarAccess.getRobotAccess().getScenarioKeyword_4_0()); }
	'scenario'
	{ after(grammarAccess.getRobotAccess().getScenarioKeyword_4_0()); }
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
	{ before(grammarAccess.getRobotAccess().getScenarioAssignment_4_1()); }
	(rule__Robot__ScenarioAssignment_4_1)
	{ after(grammarAccess.getRobotAccess().getScenarioAssignment_4_1()); }
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
	{ before(grammarAccess.getScenarioAccess().getStatesKeyword_4_0()); }
	'states'
	{ after(grammarAccess.getScenarioAccess().getStatesKeyword_4_0()); }
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
	rule__Scenario__Group_4__2
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
	{ before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group_4__2__Impl
	rule__Scenario__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getStatesAssignment_4_2()); }
	(rule__Scenario__StatesAssignment_4_2)
	{ after(grammarAccess.getScenarioAccess().getStatesAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group_4__3__Impl
	rule__Scenario__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getGroup_4_3()); }
	(rule__Scenario__Group_4_3__0)*
	{ after(grammarAccess.getScenarioAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group_4_3__0__Impl
	rule__Scenario__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getScenarioAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getStatesAssignment_4_3_1()); }
	(rule__Scenario__StatesAssignment_4_3_1)
	{ after(grammarAccess.getScenarioAccess().getStatesAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateAction_0()); }
	()
	{ after(grammarAccess.getStateAccess().getStateAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_1()); }
	'State'
	{ after(grammarAccess.getStateAccess().getStateKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
	rule__State__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_2()); }
	(rule__State__NameAssignment_2)
	{ after(grammarAccess.getStateAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__3__Impl
	rule__State__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__4__Impl
	rule__State__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_4()); }
	(rule__State__Group_4__0)?
	{ after(grammarAccess.getStateAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__5__Impl
	rule__State__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_5()); }
	(rule__State__Group_5__0)?
	{ after(grammarAccess.getStateAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__0__Impl
	rule__State__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getDestinationKeyword_4_0()); }
	'destination'
	{ after(grammarAccess.getStateAccess().getDestinationKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getDestinationAssignment_4_1()); }
	(rule__State__DestinationAssignment_4_1)
	{ after(grammarAccess.getStateAccess().getDestinationAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__0__Impl
	rule__State__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getActionsKeyword_5_0()); }
	'actions'
	{ after(grammarAccess.getStateAccess().getActionsKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__1__Impl
	rule__State__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1()); }
	'{'
	{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__2__Impl
	rule__State__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getActionsAssignment_5_2()); }
	(rule__State__ActionsAssignment_5_2)
	{ after(grammarAccess.getStateAccess().getActionsAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__3__Impl
	rule__State__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_5_3()); }
	(rule__State__Group_5_3__0)*
	{ after(grammarAccess.getStateAccess().getGroup_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4()); }
	'}'
	{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5_3__0__Impl
	rule__State__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); }
	','
	{ after(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getActionsAssignment_5_3_1()); }
	(rule__State__ActionsAssignment_5_3_1)
	{ after(grammarAccess.getStateAccess().getActionsAssignment_5_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__0__Impl
	rule__Action__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getActionAction_0()); }
	()
	{ after(grammarAccess.getActionAccess().getActionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__1__Impl
	rule__Action__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getActionKeyword_1()); }
	'Action'
	{ after(grammarAccess.getActionAccess().getActionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getNameAssignment_2()); }
	(rule__Action__NameAssignment_2)
	{ after(grammarAccess.getActionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Robot__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__ScenarioAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getScenarioScenarioParserRuleCall_4_1_0()); }
		ruleScenario
		{ after(grammarAccess.getRobotAccess().getScenarioScenarioParserRuleCall_4_1_0()); }
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

rule__Scenario__StatesAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getStatesStateParserRuleCall_4_2_0()); }
		ruleState
		{ after(grammarAccess.getScenarioAccess().getStatesStateParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__StatesAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getStatesStateParserRuleCall_4_3_1_0()); }
		ruleState
		{ after(grammarAccess.getScenarioAccess().getStatesStateParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__DestinationAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getDestinationActionCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getStateAccess().getDestinationActionEStringParserRuleCall_4_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getStateAccess().getDestinationActionEStringParserRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getStateAccess().getDestinationActionCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__ActionsAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_2_0()); }
		ruleAction
		{ after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__ActionsAssignment_5_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_3_1_0()); }
		ruleAction
		{ after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); }
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
