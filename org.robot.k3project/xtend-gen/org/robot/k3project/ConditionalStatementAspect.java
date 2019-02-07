package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Iterator;
import org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.ConditionalStatement;
import org.robot.model.robot.Scenario;
import org.robot.model.robot.Statement;

@Aspect(className = ConditionalStatement.class)
@SuppressWarnings("all")
public abstract class ConditionalStatementAspect extends StatementAspect {
  @Abstract
  public static boolean mustExecute(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.ConditionalStatementAspect#boolean mustExecute() from org.robot.k3project.UntilStatementAspect
    		if (_self instanceof org.robot.model.robot.UntilStatement){
    			result = org.robot.k3project.UntilStatementAspect.mustExecute((org.robot.model.robot.UntilStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.ConditionalStatementAspect#boolean mustExecute() from org.robot.k3project.UntilStatementAspect
    // #DispatchPointCut_before# boolean mustExecute()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	result = org.robot.k3project.ConditionalStatementAspect._privk3_mustExecute(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
    return (boolean)result;
  }
  
  public static void start(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void start()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	org.robot.k3project.ConditionalStatementAspect._privk3_start(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
  }
  
  public static Scenario step(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario step()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	result = org.robot.k3project.ConditionalStatementAspect._privk3_step(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static Scenario exec(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario exec()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	result = org.robot.k3project.ConditionalStatementAspect._privk3_exec(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  private static Iterator<Statement> itStatement(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Iterator<Statement> itStatement()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	result = org.robot.k3project.ConditionalStatementAspect._privk3_itStatement(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
    return (java.util.Iterator<org.robot.model.robot.Statement>)result;
  }
  
  private static void itStatement(final ConditionalStatement _self, final Iterator<Statement> itStatement) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void itStatement(Iterator<Statement>)
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	org.robot.k3project.ConditionalStatementAspect._privk3_itStatement(_self_, (org.robot.model.robot.ConditionalStatement)_self,itStatement);
    };
  }
  
  public static Scenario next(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario next()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	result = org.robot.k3project.ConditionalStatementAspect._privk3_next(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static void next(final ConditionalStatement _self, final Scenario next) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void next(Scenario)
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	org.robot.k3project.ConditionalStatementAspect._privk3_next(_self_, (org.robot.model.robot.ConditionalStatement)_self,next);
    };
  }
  
  protected static boolean _privk3_mustExecute(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_start(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
    _self_.itStatement = _self.getStatements().iterator();
  }
  
  protected static Scenario _privk3_step(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
    if (((_self_.itStatement == null) || (!_self_.itStatement.hasNext()))) {
      ConditionalStatementAspect.start(_self);
    }
    _self_.next = StatementAspect.step(_self_.itStatement.next());
    return _self_.next;
  }
  
  protected static Scenario _privk3_exec(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
    ConditionalStatementAspect.start(_self);
    while ((ConditionalStatementAspect.mustExecute(_self) && (ConditionalStatementAspect.next(_self) != null))) {
      ConditionalStatementAspect.step(_self);
    }
    return ConditionalStatementAspect.next(_self);
  }
  
  protected static Iterator<Statement> _privk3_itStatement(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
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
  
  protected static void _privk3_itStatement(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self, final Iterator<Statement> itStatement) {
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
  
  protected static Scenario _privk3_next(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
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
  
  protected static void _privk3_next(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self, final Scenario next) {
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
