package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.ExecuteStatement;
import org.robot.model.robot.Scenario;

@Aspect(className = ExecuteStatement.class)
@SuppressWarnings("all")
public class ExecuteStatementAspect extends StatementAspect {
  public static Scenario step(final ExecuteStatement _self) {
    final org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectProperties _self_ = org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario step()
    if (_self instanceof org.robot.model.robot.ExecuteStatement){
    	result = org.robot.k3project.ExecuteStatementAspect._privk3_step(_self_, (org.robot.model.robot.ExecuteStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static Scenario _privk3_step(final ExecuteStatementAspectExecuteStatementAspectProperties _self_, final ExecuteStatement _self) {
    return _self.getDestination();
  }
}
