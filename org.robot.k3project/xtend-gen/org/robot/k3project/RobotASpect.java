package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import org.eclipse.emf.common.util.EList;
import org.robot.k3project.RobotASpectRobotAspectProperties;
import org.robot.k3project.StateAspect;
import org.robot.model.robot.Robot;
import org.robot.model.robot.State;

@Aspect(className = Robot.class)
@SuppressWarnings("all")
public class RobotASpect {
  @Main
  public static void exec(final Robot _self) {
    final org.robot.k3project.RobotASpectRobotAspectProperties _self_ = org.robot.k3project.RobotASpectRobotAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof org.robot.model.robot.Robot){
    	org.robot.k3project.RobotASpect._privk3_exec(_self_, (org.robot.model.robot.Robot)_self);
    };
  }
  
  protected static void _privk3_exec(final RobotASpectRobotAspectProperties _self_, final Robot _self) {
    EList<State> _states = _self.getScenario().getStates();
    for (final State s : _states) {
      StateAspect.exec(s);
    }
  }
}
