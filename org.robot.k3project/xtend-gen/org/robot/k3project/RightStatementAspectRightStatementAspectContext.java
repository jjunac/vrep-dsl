package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.RightStatementAspectRightStatementAspectProperties;
import org.robot.model.robot.RightStatement;

@SuppressWarnings("all")
public class RightStatementAspectRightStatementAspectContext {
  public final static RightStatementAspectRightStatementAspectContext INSTANCE = new RightStatementAspectRightStatementAspectContext();
  
  public static RightStatementAspectRightStatementAspectProperties getSelf(final RightStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.RightStatementAspectRightStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RightStatement, RightStatementAspectRightStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.RightStatement, org.robot.k3project.RightStatementAspectRightStatementAspectProperties>();
  
  public Map<RightStatement, RightStatementAspectRightStatementAspectProperties> getMap() {
    return map;
  }
}
