package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ConnectionAspectConnectionAspectProperties;
import org.robot.model.robot.Connection;
import org.robot.vrep.robot.PolyRob;

@Aspect(className = Connection.class)
@SuppressWarnings("all")
public class ConnectionAspect {
  public static void connect(final Connection _self) {
    final org.robot.k3project.ConnectionAspectConnectionAspectProperties _self_ = org.robot.k3project.ConnectionAspectConnectionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void connect()
    if (_self instanceof org.robot.model.robot.Connection){
    	org.robot.k3project.ConnectionAspect._privk3_connect(_self_, (org.robot.model.robot.Connection)_self);
    };
  }
  
  protected static void _privk3_connect(final ConnectionAspectConnectionAspectProperties _self_, final Connection _self) {
    PolyRob.createSingleton(_self.getIp(), _self.getPort());
  }
}
