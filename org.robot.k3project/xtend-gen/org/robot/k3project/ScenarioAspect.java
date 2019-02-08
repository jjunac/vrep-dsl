package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ScenarioAspectScenarioAspectProperties;
import org.robot.k3project.StatementBlockAspect;
import org.robot.model.robot.Scenario;

@Aspect(className = Scenario.class)
@SuppressWarnings("all")
public class ScenarioAspect {
  public static void enter(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enter()
    if (_self instanceof org.robot.model.robot.Scenario){
    	org.robot.k3project.ScenarioAspect._privk3_enter(_self_, (org.robot.model.robot.Scenario)_self);
    };
  }
  
  public static Scenario step(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario step()
    if (_self instanceof org.robot.model.robot.Scenario){
    	result = org.robot.k3project.ScenarioAspect._privk3_step(_self_, (org.robot.model.robot.Scenario)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static void exit(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exit()
    if (_self instanceof org.robot.model.robot.Scenario){
    	org.robot.k3project.ScenarioAspect._privk3_exit(_self_, (org.robot.model.robot.Scenario)_self);
    };
  }
  
  public static boolean isFinished(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isFinished()
    if (_self instanceof org.robot.model.robot.Scenario){
    	result = org.robot.k3project.ScenarioAspect._privk3_isFinished(_self_, (org.robot.model.robot.Scenario)_self);
    };
    return (boolean)result;
  }
  
  protected static void _privk3_enter(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    StatementBlockAspect.enter(_self.getStatementBlock());
  }
  
  protected static Scenario _privk3_step(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    return StatementBlockAspect.step(_self.getStatementBlock());
  }
  
  protected static void _privk3_exit(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    StatementBlockAspect.exit(_self.getStatementBlock());
  }
  
  protected static boolean _privk3_isFinished(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    return StatementBlockAspect.isFinished(_self.getStatementBlock());
  }
}
