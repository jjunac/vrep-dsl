package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.UntilStatementAspectUntilStatementAspectProperties;
import org.robot.model.robot.UntilStatement;

@SuppressWarnings("all")
public class UntilStatementAspectUntilStatementAspectContext {
  public final static UntilStatementAspectUntilStatementAspectContext INSTANCE = new UntilStatementAspectUntilStatementAspectContext();
  
  public static UntilStatementAspectUntilStatementAspectProperties getSelf(final UntilStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.UntilStatementAspectUntilStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<UntilStatement, UntilStatementAspectUntilStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.UntilStatement, org.robot.k3project.UntilStatementAspectUntilStatementAspectProperties>();
  
  public Map<UntilStatement, UntilStatementAspectUntilStatementAspectProperties> getMap() {
    return map;
  }
}
