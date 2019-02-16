package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Iterator;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.robot.k3project.StatementAspect;
import org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties;
import org.robot.model.robot.Scenario;
import org.robot.model.robot.Statement;
import org.robot.model.robot.StatementBlock;

@Aspect(className = StatementBlock.class)
@SuppressWarnings("all")
public class StatementBlockAspect {
  public static void enter(final StatementBlock _self) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enter()
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	org.robot.k3project.StatementBlockAspect._privk3_enter(_self_, (org.robot.model.robot.StatementBlock)_self);
    };
  }
  
  public static boolean isFinished(final StatementBlock _self) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isFinished()
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	result = org.robot.k3project.StatementBlockAspect._privk3_isFinished(_self_, (org.robot.model.robot.StatementBlock)_self);
    };
    return (boolean)result;
  }
  
  public static Scenario step(final StatementBlock _self) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario step()
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	result = org.robot.k3project.StatementBlockAspect._privk3_step(_self_, (org.robot.model.robot.StatementBlock)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static Scenario stepWithoutDebug(final StatementBlock _self) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario stepWithoutDebug()
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	result = org.robot.k3project.StatementBlockAspect._privk3_stepWithoutDebug(_self_, (org.robot.model.robot.StatementBlock)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  private static Scenario step(final StatementBlock _self, final boolean debug) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario step(boolean)
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	result = org.robot.k3project.StatementBlockAspect._privk3_step(_self_, (org.robot.model.robot.StatementBlock)_self,debug);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static void exit(final StatementBlock _self) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exit()
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	org.robot.k3project.StatementBlockAspect._privk3_exit(_self_, (org.robot.model.robot.StatementBlock)_self);
    };
  }
  
  public static Scenario exec(final StatementBlock _self) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario exec()
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	result = org.robot.k3project.StatementBlockAspect._privk3_exec(_self_, (org.robot.model.robot.StatementBlock)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  private static Iterator<Statement> itStatement(final StatementBlock _self) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Iterator<Statement> itStatement()
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	result = org.robot.k3project.StatementBlockAspect._privk3_itStatement(_self_, (org.robot.model.robot.StatementBlock)_self);
    };
    return (java.util.Iterator<org.robot.model.robot.Statement>)result;
  }
  
  private static void itStatement(final StatementBlock _self, final Iterator<Statement> itStatement) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void itStatement(Iterator<Statement>)
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	org.robot.k3project.StatementBlockAspect._privk3_itStatement(_self_, (org.robot.model.robot.StatementBlock)_self,itStatement);
    };
  }
  
  private static Statement current(final StatementBlock _self) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Statement current()
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	result = org.robot.k3project.StatementBlockAspect._privk3_current(_self_, (org.robot.model.robot.StatementBlock)_self);
    };
    return (org.robot.model.robot.Statement)result;
  }
  
  private static void current(final StatementBlock _self, final Statement current) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void current(Statement)
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	org.robot.k3project.StatementBlockAspect._privk3_current(_self_, (org.robot.model.robot.StatementBlock)_self,current);
    };
  }
  
  private static Scenario next(final StatementBlock _self) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario next()
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	result = org.robot.k3project.StatementBlockAspect._privk3_next(_self_, (org.robot.model.robot.StatementBlock)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  private static void next(final StatementBlock _self, final Scenario next) {
    final org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties _self_ = org.robot.k3project.StatementBlockAspectStatementBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void next(Scenario)
    if (_self instanceof org.robot.model.robot.StatementBlock){
    	org.robot.k3project.StatementBlockAspect._privk3_next(_self_, (org.robot.model.robot.StatementBlock)_self,next);
    };
  }
  
  protected static void _privk3_enter(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self) {
    _self_.itStatement = _self.getStatements().iterator();
    InputOutput.<Iterator<Statement>>println(_self_.itStatement);
    boolean _hasNext = _self_.itStatement.hasNext();
    if (_hasNext) {
      _self_.current = _self_.itStatement.next();
      StatementAspect.enter(_self_.current);
    } else {
      _self_.current = null;
    }
    _self_.next = null;
  }
  
  protected static boolean _privk3_isFinished(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self) {
    return (((_self_.current == null) || (StatementAspect.isFinished(_self_.current) && (!_self_.itStatement.hasNext()))) || (_self_.next != null));
  }
  
  protected static Scenario _privk3_step(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self) {
    return StatementBlockAspect.step(_self, true);
  }
  
  protected static Scenario _privk3_stepWithoutDebug(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self) {
    return StatementBlockAspect.step(_self, false);
  }
  
  protected static Scenario _privk3_step(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self, final boolean debug) {
    _self_.next = null;
    if (debug) {
      _self_.next = StatementAspect.step(_self_.current);
    } else {
      _self_.next = StatementAspect.stepWithoutDebug(_self_.current);
    }
    StatementAspect.exit(_self_.current);
    if ((StatementAspect.isFinished(_self_.current) && _self_.itStatement.hasNext())) {
      _self_.current = _self_.itStatement.next();
      StatementAspect.enter(_self_.current);
    }
    return _self_.next;
  }
  
  protected static void _privk3_exit(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self) {
  }
  
  protected static Scenario _privk3_exec(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self) {
    StatementBlockAspect.enter(_self);
    while ((!StatementBlockAspect.isFinished(_self))) {
      StatementBlockAspect.stepWithoutDebug(_self);
    }
    StatementBlockAspect.exit(_self);
    return _self_.next;
  }
  
  protected static Iterator<Statement> _privk3_itStatement(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self) {
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
  
  protected static void _privk3_itStatement(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self, final Iterator<Statement> itStatement) {
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
  
  protected static Statement _privk3_current(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrent") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.robot.model.robot.Statement) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.current;
  }
  
  protected static void _privk3_current(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self, final Statement current) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrent")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, current);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.current = current;
    }
  }
  
  protected static Scenario _privk3_next(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self) {
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
  
  protected static void _privk3_next(final StatementBlockAspectStatementBlockAspectProperties _self_, final StatementBlock _self, final Scenario next) {
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
