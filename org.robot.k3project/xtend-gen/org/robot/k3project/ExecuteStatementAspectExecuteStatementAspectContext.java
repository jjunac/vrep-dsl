package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectProperties;
import org.robot.model.robot.ExecuteStatement;

@SuppressWarnings("all")
public class ExecuteStatementAspectExecuteStatementAspectContext {
  public final static ExecuteStatementAspectExecuteStatementAspectContext INSTANCE = new ExecuteStatementAspectExecuteStatementAspectContext();
  
  public static ExecuteStatementAspectExecuteStatementAspectProperties getSelf(final ExecuteStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ExecuteStatement, ExecuteStatementAspectExecuteStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.ExecuteStatement, org.robot.k3project.ExecuteStatementAspectExecuteStatementAspectProperties>();
  
  public Map<ExecuteStatement, ExecuteStatementAspectExecuteStatementAspectProperties> getMap() {
    return map;
  }
}
