package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.PrintStatementAspectPrintStatementAspectProperties;
import org.robot.model.robot.PrintStatement;

@SuppressWarnings("all")
public class PrintStatementAspectPrintStatementAspectContext {
  public final static PrintStatementAspectPrintStatementAspectContext INSTANCE = new PrintStatementAspectPrintStatementAspectContext();
  
  public static PrintStatementAspectPrintStatementAspectProperties getSelf(final PrintStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.PrintStatementAspectPrintStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PrintStatement, PrintStatementAspectPrintStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.PrintStatement, org.robot.k3project.PrintStatementAspectPrintStatementAspectProperties>();
  
  public Map<PrintStatement, PrintStatementAspectPrintStatementAspectProperties> getMap() {
    return map;
  }
}
