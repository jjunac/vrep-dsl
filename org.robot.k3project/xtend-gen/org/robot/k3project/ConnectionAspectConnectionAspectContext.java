package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.ConnectionAspectConnectionAspectProperties;
import org.robot.model.robot.Connection;

@SuppressWarnings("all")
public class ConnectionAspectConnectionAspectContext {
  public final static ConnectionAspectConnectionAspectContext INSTANCE = new ConnectionAspectConnectionAspectContext();
  
  public static ConnectionAspectConnectionAspectProperties getSelf(final Connection _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.ConnectionAspectConnectionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Connection, ConnectionAspectConnectionAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.Connection, org.robot.k3project.ConnectionAspectConnectionAspectProperties>();
  
  public Map<Connection, ConnectionAspectConnectionAspectProperties> getMap() {
    return map;
  }
}
