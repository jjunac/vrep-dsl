package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties;
import org.robot.model.robot.StatementBlock;

@SuppressWarnings("all")
public class StatementBlockAspectStatementBlockAspectContext {
  public final static StatementBlockAspectStatementBlockAspectContext INSTANCE = new StatementBlockAspectStatementBlockAspectContext();
  
  public static StatementBlockAspectStatementBlockAspectProperties getSelf(final StatementBlock _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StatementBlock, StatementBlockAspectStatementBlockAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.StatementBlock, org.robot.k3project.StatementBlockAspectStatementBlockAspectProperties>();
  
  public Map<StatementBlock, StatementBlockAspectStatementBlockAspectProperties> getMap() {
    return map;
  }
}
