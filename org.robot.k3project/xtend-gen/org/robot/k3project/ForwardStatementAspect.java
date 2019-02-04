package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.robot.k3project.ControlStatementAspect;
import org.robot.k3project.ForwardStatementAspectForwardStatementAspectProperties;
import org.robot.model.robot.ForwardStatement;
import org.robot.model.robot.Scenario;
import org.robot.vrep.robot.PolyRob;

@Aspect(className = ForwardStatement.class)
@SuppressWarnings("all")
public class ForwardStatementAspect extends ControlStatementAspect {
  public static Scenario exec(final ForwardStatement _self) {
    final org.robot.k3project.ForwardStatementAspectForwardStatementAspectProperties _self_ = org.robot.k3project.ForwardStatementAspectForwardStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario exec()
    if (_self instanceof org.robot.model.robot.ForwardStatement){
    	result = org.robot.k3project.ForwardStatementAspect._privk3_exec(_self_, (org.robot.model.robot.ForwardStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static Scenario _privk3_exec(final ForwardStatementAspectForwardStatementAspectProperties _self_, final ForwardStatement _self) {
    InputOutput.<String>println("forward");
    PolyRob.getSingleton().goStraight(10, 5000);
    return null;
  }
}
