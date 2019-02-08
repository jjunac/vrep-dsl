/*
 * generated by Xtext 2.14.0
 */
package org.robot.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.robot.dsl.ide.contentassist.antlr.internal.InternalRobotDslParser;
import org.robot.dsl.services.RobotDslGrammarAccess;

public class RobotDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RobotDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RobotDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getRobotAccess().getGroup(), "rule__Robot__Group__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_3(), "rule__Robot__Group_3__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_4(), "rule__Robot__Group_4__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getStatementBlockAccess().getGroup(), "rule__StatementBlock__Group__0");
			builder.put(grammarAccess.getStatementBlockAccess().getGroup_2(), "rule__StatementBlock__Group_2__0");
			builder.put(grammarAccess.getBallAheadConditionAccess().getGroup(), "rule__BallAheadCondition__Group__0");
			builder.put(grammarAccess.getForwardStatementAccess().getGroup(), "rule__ForwardStatement__Group__0");
			builder.put(grammarAccess.getPrintStatementAccess().getGroup(), "rule__PrintStatement__Group__0");
			builder.put(grammarAccess.getExecuteStatementAccess().getGroup(), "rule__ExecuteStatement__Group__0");
			builder.put(grammarAccess.getUntilStatementAccess().getGroup(), "rule__UntilStatement__Group__0");
			builder.put(grammarAccess.getRobotAccess().getNameAssignment_1(), "rule__Robot__NameAssignment_1");
			builder.put(grammarAccess.getRobotAccess().getConnectionAssignment_3_1(), "rule__Robot__ConnectionAssignment_3_1");
			builder.put(grammarAccess.getRobotAccess().getScenariiAssignment_4_2(), "rule__Robot__ScenariiAssignment_4_2");
			builder.put(grammarAccess.getRobotAccess().getScenariiAssignment_4_3(), "rule__Robot__ScenariiAssignment_4_3");
			builder.put(grammarAccess.getRobotAccess().getGlobalAssignment_6(), "rule__Robot__GlobalAssignment_6");
			builder.put(grammarAccess.getRobotAccess().getInitialAssignment_8(), "rule__Robot__InitialAssignment_8");
			builder.put(grammarAccess.getConnectionAccess().getIpAssignment_1(), "rule__Connection__IpAssignment_1");
			builder.put(grammarAccess.getConnectionAccess().getPortAssignment_3(), "rule__Connection__PortAssignment_3");
			builder.put(grammarAccess.getScenarioAccess().getNameAssignment_2(), "rule__Scenario__NameAssignment_2");
			builder.put(grammarAccess.getScenarioAccess().getStatementBlockAssignment_3(), "rule__Scenario__StatementBlockAssignment_3");
			builder.put(grammarAccess.getStatementBlockAccess().getStatementsAssignment_2_0(), "rule__StatementBlock__StatementsAssignment_2_0");
			builder.put(grammarAccess.getStatementBlockAccess().getStatementsAssignment_2_1(), "rule__StatementBlock__StatementsAssignment_2_1");
			builder.put(grammarAccess.getPrintStatementAccess().getTextAssignment_2(), "rule__PrintStatement__TextAssignment_2");
			builder.put(grammarAccess.getExecuteStatementAccess().getDestinationAssignment_2(), "rule__ExecuteStatement__DestinationAssignment_2");
			builder.put(grammarAccess.getUntilStatementAccess().getConditionAssignment_2(), "rule__UntilStatement__ConditionAssignment_2");
			builder.put(grammarAccess.getUntilStatementAccess().getStatementBlockAssignment_3(), "rule__UntilStatement__StatementBlockAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RobotDslGrammarAccess grammarAccess;

	@Override
	protected InternalRobotDslParser createParser() {
		InternalRobotDslParser result = new InternalRobotDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RobotDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RobotDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
