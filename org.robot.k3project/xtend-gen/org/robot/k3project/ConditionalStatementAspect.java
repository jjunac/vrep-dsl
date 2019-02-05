package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ConditionalStatementAspectControlStatementAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.ControlStatement;
import org.robot.model.robot.Scenario;

@Aspect(className = ControlStatement.class)
@SuppressWarnings("all")
public abstract class ConditionalStatementAspect extends StatementAspect {
  @Abstract
  public static Scenario exec(final ControlStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectControlStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectControlStatementAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.ConditionalStatementAspect#Scenario exec() from org.robot.k3project.UntilStatementAspect
    		if (_self instanceof org.robot.model.robot.UntilStatement){
    			result = org.robot.k3project.UntilStatementAspect.exec((org.robot.model.robot.UntilStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.ConditionalStatementAspect#Scenario exec() from org.robot.k3project.UntilStatementAspect
    // #DispatchPointCut_before# Scenario exec()
    if (_self instanceof org.robot.model.robot.ControlStatement){
    	result = org.robot.k3project.ConditionalStatementAspect._privk3_exec(_self_, (org.robot.model.robot.ControlStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static Scenario _privk3_exec(final ConditionalStatementAspectControlStatementAspectProperties _self_, final ControlStatement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
