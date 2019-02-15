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
  public static Scenario doStep(final ForwardStatement _self) {
    final org.robot.k3project.ForwardStatementAspectForwardStatementAspectProperties _self_ = org.robot.k3project.ForwardStatementAspectForwardStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario doStep()
    if (_self instanceof org.robot.model.robot.ForwardStatement){
    	result = org.robot.k3project.ForwardStatementAspect._privk3_doStep(_self_, (org.robot.model.robot.ForwardStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static Scenario _privk3_doStep(final ForwardStatementAspectForwardStatementAspectProperties _self_, final ForwardStatement _self) {
    InputOutput.<String>println("forward");
    PolyRob _singleton = PolyRob.getSingleton();
    int _step = ControlStatementAspect.step(_self);
    int _factor = ControlStatementAspect.getFactor(_self);
    int _multiply = (_step * _factor);
    _singleton.goStraight(10, _multiply);
    return null;
  }
}
