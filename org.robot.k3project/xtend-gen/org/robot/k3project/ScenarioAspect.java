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
  public static void start(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void start()
    if (_self instanceof org.robot.model.robot.Scenario){
    	org.robot.k3project.ScenarioAspect._privk3_start(_self_, (org.robot.model.robot.Scenario)_self);
    };
  }
  
  public static void step(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void step()
    if (_self instanceof org.robot.model.robot.Scenario){
    	org.robot.k3project.ScenarioAspect._privk3_step(_self_, (org.robot.model.robot.Scenario)_self);
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
  
  public static Scenario exec(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario exec()
    if (_self instanceof org.robot.model.robot.Scenario){
    	result = org.robot.k3project.ScenarioAspect._privk3_exec(_self_, (org.robot.model.robot.Scenario)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  private static Iterator<Statement> itStatement(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Iterator<Statement> itStatement()
    if (_self instanceof org.robot.model.robot.Scenario){
    	result = org.robot.k3project.ScenarioAspect._privk3_itStatement(_self_, (org.robot.model.robot.Scenario)_self);
    };
    return (java.util.Iterator<org.robot.model.robot.Statement>)result;
  }
  
  private static void itStatement(final Scenario _self, final Iterator<Statement> itStatement) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void itStatement(Iterator<Statement>)
    if (_self instanceof org.robot.model.robot.Scenario){
    	org.robot.k3project.ScenarioAspect._privk3_itStatement(_self_, (org.robot.model.robot.Scenario)_self,itStatement);
    };
  }
  
  public static Scenario next(final Scenario _self) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario next()
    if (_self instanceof org.robot.model.robot.Scenario){
    	result = org.robot.k3project.ScenarioAspect._privk3_next(_self_, (org.robot.model.robot.Scenario)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static void next(final Scenario _self, final Scenario next) {
    final org.robot.k3project.ScenarioAspectScenarioAspectProperties _self_ = org.robot.k3project.ScenarioAspectScenarioAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void next(Scenario)
    if (_self instanceof org.robot.model.robot.Scenario){
    	org.robot.k3project.ScenarioAspect._privk3_next(_self_, (org.robot.model.robot.Scenario)_self,next);
    };
  }
  
  protected static void _privk3_start(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    _self_.itStatement = _self.getStatements().iterator();
  }
  
  protected static void _privk3_step(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    _self_.next = StatementAspect.step(_self_.itStatement.next());
  }
  
  protected static boolean _privk3_isFinished(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    return ((!_self_.itStatement.hasNext()) || (_self_.next != null));
  }
  
  protected static Scenario _privk3_exec(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    ScenarioAspect.start(_self);
    while ((!ScenarioAspect.isFinished(_self))) {
      ScenarioAspect.step(_self);
    }
    return ScenarioAspect.next(_self);
  }
  
  protected static Iterator<Statement> _privk3_itStatement(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getItStatement") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Iterator) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.itStatement;
  }
  
  protected static void _privk3_itStatement(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self, final Iterator<Statement> itStatement) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setItStatement")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, itStatement);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.itStatement = itStatement;
    }
  }
  
  protected static Scenario _privk3_next(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getNext") &&
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
    return _self_.next;
  }
  
  protected static void _privk3_next(final ScenarioAspectScenarioAspectProperties _self_, final Scenario _self, final Scenario next) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setNext")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, next);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.next = next;
    }
  }
}
