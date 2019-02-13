package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.WhileStatementAspectWhileStatementAspectProperties;
import org.robot.model.robot.WhileStatement;

@SuppressWarnings("all")
public class WhileStatementAspectWhileStatementAspectContext {
  public final static WhileStatementAspectWhileStatementAspectContext INSTANCE = new WhileStatementAspectWhileStatementAspectContext();
  
  public static WhileStatementAspectWhileStatementAspectProperties getSelf(final WhileStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.WhileStatementAspectWhileStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<WhileStatement, WhileStatementAspectWhileStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.WhileStatement, org.robot.k3project.WhileStatementAspectWhileStatementAspectProperties>();
  
  public Map<WhileStatement, WhileStatementAspectWhileStatementAspectProperties> getMap() {
    return map;
  }
}
