package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import org.robot.k3project.ConnectionAspect;
import org.robot.k3project.RobotAspectRobotAspectProperties;
import org.robot.k3project.ScenarioAspect;
import org.robot.k3project.StatementBlockAspect;
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
    ConnectionAspect.connect(_self.getConnection());
    Scenario sc = _self.getInitial();
    while ((sc != null)) {
      {
        ScenarioAspect.enter(sc);
        Scenario next = null;
        while ((!ScenarioAspect.isFinished(sc))) {
          {
            StatementBlockAspect.exec(_self.getGlobal());
            next = ScenarioAspect.step(sc);
          }
        }
        ScenarioAspect.exit(sc);
        sc = next;
      }
    }
    PolyRob _singleton = PolyRob.getSingleton();
    boolean _tripleNotEquals = (_singleton != null);
    if (_tripleNotEquals) {
      PolyRob.getSingleton().stopSimulation();
    }
  }
}
