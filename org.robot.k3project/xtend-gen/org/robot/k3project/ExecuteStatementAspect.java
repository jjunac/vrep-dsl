package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.ExecuteStatement;
import org.robot.model.robot.Scenario;

@Aspect(className = ExecuteStatement.class)
@SuppressWarnings("all")
public class ExecuteStatementAspect extends StatementAspect {
  public static String getType(final ExecuteStatement _self) {
    final org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectProperties _self_ = org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getType()
    if (_self instanceof org.robot.model.robot.ExecuteStatement){
    	result = org.robot.k3project.ExecuteStatementAspect._privk3_getType(_self_, (org.robot.model.robot.ExecuteStatement)_self);
    };
    return (java.lang.String)result;
  }
  
  public static Scenario doStep(final ExecuteStatement _self) {
    final org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectProperties _self_ = org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario doStep()
    if (_self instanceof org.robot.model.robot.ExecuteStatement){
    	result = org.robot.k3project.ExecuteStatementAspect._privk3_doStep(_self_, (org.robot.model.robot.ExecuteStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static String _privk3_getType(final ExecuteStatementAspectExecuteStatementAspectProperties _self_, final ExecuteStatement _self) {
    return "execute";
  }
  
  protected static Scenario _privk3_doStep(final ExecuteStatementAspectExecuteStatementAspectProperties _self_, final ExecuteStatement _self) {
    String _name = _self.getDestination().getName();
    String _plus = ("goto " + _name);
    InputOutput.<String>println(_plus);
    return _self.getDestination();
  }
}
