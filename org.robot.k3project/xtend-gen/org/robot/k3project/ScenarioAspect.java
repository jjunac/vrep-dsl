package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Iterator;
import org.robot.k3project.ScenarioAspectScenarioAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.Scenario;
import org.robot.model.robot.Statement;

@Aspect(className = Scenario.class)
@SuppressWarnings("all")
public class ScenarioAspect {
  public static Scenario exec(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario exec()
    if (_self instanceof org.robot.model.robot.Scenario){
    	result = org.robot.k3project.ScenarioAspect._privk3_exec(_self_, (org.robot.model.robot.Scenario)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static Scenario _privk3_exec(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    Scenario next = null;
    Iterator<Statement> iter = _self.getStatements().iterator();
    while (((next == null) && iter.hasNext())) {
      next = StatementAspect.exec(iter.next());
    }
    return next;
  }
}
