package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.robot.k3project.ControlStatementAspect;
import org.robot.k3project.RightStatementAspectRightStatementAspectProperties;
import org.robot.model.robot.RightStatement;
import org.robot.model.robot.Scenario;
import org.robot.vrep.robot.PolyRob;

@Aspect(className = RightStatement.class)
@SuppressWarnings("all")
public class RightStatementAspect extends ControlStatementAspect {
  public static String getType(final RightStatement _self) {
    final org.robot.k3project.RightStatementAspectRightStatementAspectProperties _self_ = org.robot.k3project.RightStatementAspectRightStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getType()
    if (_self instanceof org.robot.model.robot.RightStatement){
    	result = org.robot.k3project.RightStatementAspect._privk3_getType(_self_, (org.robot.model.robot.RightStatement)_self);
    };
    return (java.lang.String)result;
  }
  
  public static Scenario doStep(final RightStatement _self) {
    final org.robot.k3project.RightStatementAspectRightStatementAspectProperties _self_ = org.robot.k3project.RightStatementAspectRightStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario doStep()
    if (_self instanceof org.robot.model.robot.RightStatement){
    	result = org.robot.k3project.RightStatementAspect._privk3_doStep(_self_, (org.robot.model.robot.RightStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static String _privk3_getType(final RightStatementAspectRightStatementAspectProperties _self_, final RightStatement _self) {
    return "right";
  }
  
  protected static Scenario _privk3_doStep(final RightStatementAspectRightStatementAspectProperties _self_, final RightStatement _self) {
    InputOutput.<String>println("right");
    PolyRob.getSingleton().turnRight(1, ControlStatementAspect.step(_self));
    return null;
  }
}
