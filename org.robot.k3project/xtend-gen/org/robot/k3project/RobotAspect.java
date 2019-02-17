package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.robot.k3project.ConnectionAspect;
import org.robot.k3project.RobotAspectRobotAspectProperties;
import org.robot.k3project.ScenarioAspect;
import org.robot.k3project.StatementBlockAspect;
import org.robot.model.robot.Robot;
import org.robot.model.robot.Scenario;
import org.robot.model.robot.Statement;
import org.robot.vrep.robot.PolyRob;

@Aspect(className = Robot.class)
@SuppressWarnings("all")
public class RobotAspect {
  public static Robot instance = null;
  
  @Main
  public static void exec(final Robot _self) {
    final org.robot.k3project.RobotAspectRobotAspectProperties _self_ = org.robot.k3project.RobotAspectRobotAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof org.robot.model.robot.Robot){
    	org.robot.k3project.RobotAspect._privk3_exec(_self_, (org.robot.model.robot.Robot)_self);
    };
  }
  
  public static Statement getCurrentStatement(final Robot _self) {
    final org.robot.k3project.RobotAspectRobotAspectProperties _self_ = org.robot.k3project.RobotAspectRobotAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Statement getCurrentStatement()
    if (_self instanceof org.robot.model.robot.Robot){
    	result = org.robot.k3project.RobotAspect._privk3_getCurrentStatement(_self_, (org.robot.model.robot.Robot)_self);
    };
    return (org.robot.model.robot.Statement)result;
  }
  
  public static String getFullName(final Robot _self) {
    final org.robot.k3project.RobotAspectRobotAspectProperties _self_ = org.robot.k3project.RobotAspectRobotAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getFullName()
    if (_self instanceof org.robot.model.robot.Robot){
    	result = org.robot.k3project.RobotAspect._privk3_getFullName(_self_, (org.robot.model.robot.Robot)_self);
    };
    return (java.lang.String)result;
  }
  
  public static Scenario sc(final Robot _self) {
    final org.robot.k3project.RobotAspectRobotAspectProperties _self_ = org.robot.k3project.RobotAspectRobotAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario sc()
    if (_self instanceof org.robot.model.robot.Robot){
    	result = org.robot.k3project.RobotAspect._privk3_sc(_self_, (org.robot.model.robot.Robot)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static void sc(final Robot _self, final Scenario sc) {
    final org.robot.k3project.RobotAspectRobotAspectProperties _self_ = org.robot.k3project.RobotAspectRobotAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void sc(Scenario)
    if (_self instanceof org.robot.model.robot.Robot){
    	org.robot.k3project.RobotAspect._privk3_sc(_self_, (org.robot.model.robot.Robot)_self,sc);
    };
  }
  
  protected static void _privk3_exec(final RobotAspectRobotAspectProperties _self_, final Robot _self) {
    RobotAspect.instance = _self;
    ConnectionAspect.connect(_self.getConnection());
    _self_.sc = _self.getInitial();
    while ((_self_.sc != null)) {
      {
        ScenarioAspect.enter(_self_.sc);
        Scenario next = null;
        while (((!ScenarioAspect.isFinished(_self_.sc)) && (next == null))) {
          {
            PolyRob.getSingleton().readNoseSensor();
            InputOutput.<String>println(String.format("Robot is at (%d, %d), object ahead at: %d", Integer.valueOf(PolyRob.getSingleton().getPosition().x), Integer.valueOf(PolyRob.getSingleton().getPosition().y), Integer.valueOf(PolyRob.getSingleton().getDetectedObjectDistance())));
            final Scenario shortcut = StatementBlockAspect.exec(_self.getGlobal());
            if (((shortcut == null) || (shortcut.getName() == _self_.sc.getName()))) {
              next = ScenarioAspect.step(_self_.sc);
            } else {
              next = shortcut;
            }
          }
        }
        ScenarioAspect.exit(_self_.sc);
        _self_.sc = next;
      }
    }
    PolyRob _singleton = PolyRob.getSingleton();
    boolean _tripleNotEquals = (_singleton != null);
    if (_tripleNotEquals) {
      PolyRob.getSingleton().stopSimulation();
    }
  }
  
  protected static Statement _privk3_getCurrentStatement(final RobotAspectRobotAspectProperties _self_, final Robot _self) {
    if ((_self_.sc == null)) {
      return null;
    }
    return ScenarioAspect.getCurrentStatement(_self_.sc);
  }
  
  protected static String _privk3_getFullName(final RobotAspectRobotAspectProperties _self_, final Robot _self) {
    return _self.getName();
  }
  
  protected static Scenario _privk3_sc(final RobotAspectRobotAspectProperties _self_, final Robot _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSc") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.robot.model.robot.Scenario) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.sc;
  }
  
  protected static void _privk3_sc(final RobotAspectRobotAspectProperties _self_, final Robot _self, final Scenario sc) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSc")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, sc);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.sc = sc;
    }
  }
}
