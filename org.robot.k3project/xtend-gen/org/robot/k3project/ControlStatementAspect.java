package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ControlStatementAspectControlStatementAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.ControlStatement;
import org.robot.model.robot.Scenario;

@Aspect(className = ControlStatement.class)
@SuppressWarnings("all")
public abstract class ControlStatementAspect extends StatementAspect {
  @Abstract
  public static Scenario step(final ControlStatement _self) {
    final org.robot.k3project.ControlStatementAspectControlStatementAspectProperties _self_ = org.robot.k3project.ControlStatementAspectControlStatementAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.ControlStatementAspect#Scenario step() from org.robot.k3project.ForwardStatementAspect
    		if (_self instanceof org.robot.model.robot.ForwardStatement){
    			result = org.robot.k3project.ForwardStatementAspect.step((org.robot.model.robot.ForwardStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.ControlStatementAspect#Scenario step() from org.robot.k3project.ForwardStatementAspect
    // #DispatchPointCut_before# Scenario step()
    if (_self instanceof org.robot.model.robot.ControlStatement){
    	result = org.robot.k3project.ControlStatementAspect._privk3_step(_self_, (org.robot.model.robot.ControlStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static Scenario _privk3_step(final ControlStatementAspectControlStatementAspectProperties _self_, final ControlStatement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
