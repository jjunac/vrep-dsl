package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.robot.k3project.PrintStatementAspectPrintStatementAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.PrintStatement;
import org.robot.model.robot.Scenario;

@Aspect(className = PrintStatement.class)
@SuppressWarnings("all")
public class PrintStatementAspect extends StatementAspect {
  public static Scenario doStep(final PrintStatement _self) {
    final org.robot.k3project.PrintStatementAspectPrintStatementAspectProperties _self_ = org.robot.k3project.PrintStatementAspectPrintStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario doStep()
    if (_self instanceof org.robot.model.robot.PrintStatement){
    	result = org.robot.k3project.PrintStatementAspect._privk3_doStep(_self_, (org.robot.model.robot.PrintStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static Scenario _privk3_doStep(final PrintStatementAspectPrintStatementAspectProperties _self_, final PrintStatement _self) {
    InputOutput.<String>println(_self.getText());
    return null;
  }
}
