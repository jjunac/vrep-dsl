/*
 * generated by Xtext 2.14.0
 */
grammar InternalRobotDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.robot.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.robot.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.robot.dsl.services.RobotDslGrammarAccess;

}

@parser::members {

 	private RobotDslGrammarAccess grammarAccess;

    public InternalRobotDslParser(TokenStream input, RobotDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Robot";
   	}

   	@Override
   	protected RobotDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRobot
entryRuleRobot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRobotRule()); }
	iv_ruleRobot=ruleRobot
	{ $current=$iv_ruleRobot.current; }
	EOF;

// Rule Robot
ruleRobot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Robot'
		{
			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRobotRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.robot.dsl.RobotDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='connect_to'
			{
				newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getConnect_toKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotAccess().getConnectionConnectionParserRuleCall_3_1_0());
					}
					lv_connection_4_0=ruleConnection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotRule());
						}
						set(
							$current,
							"connection",
							lv_connection_4_0,
							"org.robot.dsl.RobotDsl.Connection");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='scenarii'
			{
				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getScenariiKeyword_4_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_4_2_0());
					}
					lv_scenarii_7_0=ruleScenario
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotRule());
						}
						add(
							$current,
							"scenarii",
							lv_scenarii_7_0,
							"org.robot.dsl.RobotDsl.Scenario");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_4_3_0());
					}
					lv_scenarii_8_0=ruleScenario
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotRule());
						}
						add(
							$current,
							"scenarii",
							lv_scenarii_8_0,
							"org.robot.dsl.RobotDsl.Scenario");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='global'
		{
			newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getGlobalKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRobotAccess().getGlobalStatementBlockParserRuleCall_6_0());
				}
				lv_global_11_0=ruleStatementBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRobotRule());
					}
					set(
						$current,
						"global",
						lv_global_11_0,
						"org.robot.dsl.RobotDsl.StatementBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='initial'
		{
			newLeafNode(otherlv_12, grammarAccess.getRobotAccess().getInitialKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRobotRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRobotAccess().getInitialScenarioCrossReference_8_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleConnection
entryRuleConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectionRule()); }
	iv_ruleConnection=ruleConnection
	{ $current=$iv_ruleConnection.current; }
	EOF;

// Rule Connection
ruleConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getConnectionAccess().getConnectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getIpEStringParserRuleCall_1_0());
				}
				lv_ip_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					set(
						$current,
						"ip",
						lv_ip_1_0,
						"org.robot.dsl.RobotDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getColonKeyword_2());
		}
		(
			(
				lv_port_3_0=RULE_INT
				{
					newLeafNode(lv_port_3_0, grammarAccess.getConnectionAccess().getPortINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectionRule());
					}
					setWithLastConsumed(
						$current,
						"port",
						lv_port_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	iv_ruleScenario=ruleScenario
	{ $current=$iv_ruleScenario.current; }
	EOF;

// Rule Scenario
ruleScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getScenarioAccess().getScenarioAction_0(),
					$current);
			}
		)
		otherlv_1='Scenario'
		{
			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.robot.dsl.RobotDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getStatementBlockStatementBlockParserRuleCall_3_0());
				}
				lv_statementBlock_3_0=ruleStatementBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"statementBlock",
						lv_statementBlock_3_0,
						"org.robot.dsl.RobotDsl.StatementBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatementBlock
entryRuleStatementBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementBlockRule()); }
	iv_ruleStatementBlock=ruleStatementBlock
	{ $current=$iv_ruleStatementBlock.current; }
	EOF;

// Rule StatementBlock
ruleStatementBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStatementBlockAccess().getStatementBlockAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0_0());
					}
					lv_statements_2_0=ruleStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementBlockRule());
						}
						add(
							$current,
							"statements",
							lv_statements_2_0,
							"org.robot.dsl.RobotDsl.Statement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_1_0());
					}
					lv_statements_3_0=ruleStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementBlockRule());
						}
						add(
							$current,
							"statements",
							lv_statements_3_0,
							"org.robot.dsl.RobotDsl.Statement");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getConditionAccess().getObjectAheadConditionParserRuleCall());
	}
	this_ObjectAheadCondition_0=ruleObjectAheadCondition
	{
		$current = $this_ObjectAheadCondition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleObjectAheadCondition
entryRuleObjectAheadCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectAheadConditionRule()); }
	iv_ruleObjectAheadCondition=ruleObjectAheadCondition
	{ $current=$iv_ruleObjectAheadCondition.current; }
	EOF;

// Rule ObjectAheadCondition
ruleObjectAheadCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getObjectAheadConditionAccess().getObjectAheadConditionAction_0(),
					$current);
			}
		)
		otherlv_1='object_ahead'
		{
			newLeafNode(otherlv_1, grammarAccess.getObjectAheadConditionAccess().getObject_aheadKeyword_1());
		}
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getForwardStatementParserRuleCall_0());
		}
		this_ForwardStatement_0=ruleForwardStatement
		{
			$current = $this_ForwardStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getExecuteStatementParserRuleCall_1());
		}
		this_ExecuteStatement_1=ruleExecuteStatement
		{
			$current = $this_ExecuteStatement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_2());
		}
		this_PrintStatement_2=rulePrintStatement
		{
			$current = $this_PrintStatement_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_3());
		}
		this_ConditionalStatement_3=ruleConditionalStatement
		{
			$current = $this_ConditionalStatement_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleForwardStatement
entryRuleForwardStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForwardStatementRule()); }
	iv_ruleForwardStatement=ruleForwardStatement
	{ $current=$iv_ruleForwardStatement.current; }
	EOF;

// Rule ForwardStatement
ruleForwardStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getForwardStatementAccess().getForwardStatementAction_0(),
					$current);
			}
		)
		otherlv_1='forward'
		{
			newLeafNode(otherlv_1, grammarAccess.getForwardStatementAccess().getForwardKeyword_1());
		}
	)
;

// Entry rule entryRulePrintStatement
entryRulePrintStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrintStatementRule()); }
	iv_rulePrintStatement=rulePrintStatement
	{ $current=$iv_rulePrintStatement.current; }
	EOF;

// Rule PrintStatement
rulePrintStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPrintStatementAccess().getPrintStatementAction_0(),
					$current);
			}
		)
		otherlv_1='print'
		{
			newLeafNode(otherlv_1, grammarAccess.getPrintStatementAccess().getPrintKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPrintStatementAccess().getTextEStringParserRuleCall_2_0());
				}
				lv_text_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrintStatementRule());
					}
					set(
						$current,
						"text",
						lv_text_2_0,
						"org.robot.dsl.RobotDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExecuteStatement
entryRuleExecuteStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExecuteStatementRule()); }
	iv_ruleExecuteStatement=ruleExecuteStatement
	{ $current=$iv_ruleExecuteStatement.current; }
	EOF;

// Rule ExecuteStatement
ruleExecuteStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExecuteStatementAccess().getExecuteStatementAction_0(),
					$current);
			}
		)
		otherlv_1='execute'
		{
			newLeafNode(otherlv_1, grammarAccess.getExecuteStatementAccess().getExecuteKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExecuteStatementRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getExecuteStatementAccess().getDestinationScenarioCrossReference_2_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleConditionalStatement
entryRuleConditionalStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionalStatementRule()); }
	iv_ruleConditionalStatement=ruleConditionalStatement
	{ $current=$iv_ruleConditionalStatement.current; }
	EOF;

// Rule ConditionalStatement
ruleConditionalStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getConditionalStatementAccess().getUntilStatementParserRuleCall());
	}
	this_UntilStatement_0=ruleUntilStatement
	{
		$current = $this_UntilStatement_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleUntilStatement
entryRuleUntilStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUntilStatementRule()); }
	iv_ruleUntilStatement=ruleUntilStatement
	{ $current=$iv_ruleUntilStatement.current; }
	EOF;

// Rule UntilStatement
ruleUntilStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUntilStatementAccess().getUntilStatementAction_0(),
					$current);
			}
		)
		otherlv_1='until'
		{
			newLeafNode(otherlv_1, grammarAccess.getUntilStatementAccess().getUntilKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUntilStatementAccess().getConditionConditionParserRuleCall_2_0());
				}
				lv_condition_2_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUntilStatementRule());
					}
					set(
						$current,
						"condition",
						lv_condition_2_0,
						"org.robot.dsl.RobotDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUntilStatementAccess().getStatementBlockStatementBlockParserRuleCall_3_0());
				}
				lv_statementBlock_3_0=ruleStatementBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUntilStatementRule());
					}
					set(
						$current,
						"statementBlock",
						lv_statementBlock_3_0,
						"org.robot.dsl.RobotDsl.StatementBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
