package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import org.robot.k3project.RobotAspectRobotAspectProperties;
import org.robot.k3project.ScenarioAspect;
import org.robot.model.robot.Robot;
import org.robot.model.robot.Scenario;
import org.robot.vrep.robot.PolyRob;

@Aspect(className = Robot.class)
@SuppressWarnings("all")
public class RobotAspect {
  @Main
  public static void exec(final Robot _self) {
    final org.robot.k3project.RobotAspectRobotAspectProperties _self_ = org.robot.k3project.RobotAspectRobotAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof org.robot.model.robot.Robot){
    	org.robot.k3project.RobotAspect._privk3_exec(_self_, (org.robot.model.robot.Robot)_self);
    };
  }
  
  protected static void _privk3_exec(final RobotAspectRobotAspectProperties _self_, final Robot _self) {
    PolyRob.createSingleton("127.0.0.1", 19997);
    ScenarioAspect.exec(_self.getGlobal());
    Scenario next = ScenarioAspect.exec(_self.getInitial());
    while ((next != null)) {
      next = ScenarioAspect.exec(next);
    }
    PolyRob.getSingleton().stopSimulation();
  }
}
