package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.robot.k3project.ConditionAspect;
import org.robot.k3project.ConditionalStatementAspect;
import org.robot.k3project.StatementAspect;
import org.robot.k3project.UntilStatementAspectUntilStatementAspectProperties;
import org.robot.model.robot.Scenario;
import org.robot.model.robot.Statement;
import org.robot.model.robot.UntilStatement;

@Aspect(className = UntilStatement.class)
@SuppressWarnings("all")
public class UntilStatementAspect extends ConditionalStatementAspect {
  public static Scenario exec(final UntilStatement _self) {
    final org.robot.k3project.UntilStatementAspectUntilStatementAspectProperties _self_ = org.robot.k3project.UntilStatementAspectUntilStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario exec()
    if (_self instanceof org.robot.model.robot.UntilStatement){
    	result = org.robot.k3project.UntilStatementAspect._privk3_exec(_self_, (org.robot.model.robot.UntilStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static Scenario _privk3_exec(final UntilStatementAspectUntilStatementAspectProperties _self_, final UntilStatement _self) {
    while ((!ConditionAspect.exec(_self.getCondition()))) {
      final Consumer<Statement> _function = (Statement it) -> {
        StatementAspect.exec(it);
      };
      _self.getStatements().forEach(_function);
    }
    return null;
  }
}
