/**
 * generated by Xtext 2.14.0
 */
package org.robot.dsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.robot.dsl.services.RobotDslGrammarAccess;
import org.robot.model.robot.Robot;
import org.robot.model.robot.Scenario;
import org.robot.model.robot.StatementBlock;

@SuppressWarnings("all")
public class RobotDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RobotDslGrammarAccess _robotDslGrammarAccess;
  
  protected void _format(final Robot robot, @Extension final IFormattableDocument document) {
    EList<Scenario> _scenarii = robot.getScenarii();
    for (final Scenario scenario : _scenarii) {
      document.<Scenario>format(scenario);
    }
    document.<StatementBlock>format(robot.getGlobal());
  }
  
  protected void _format(final Scenario scenario, @Extension final IFormattableDocument document) {
    document.<StatementBlock>format(scenario.getStatementBlock());
  }
  
  public void format(final Object robot, final IFormattableDocument document) {
    if (robot instanceof XtextResource) {
      _format((XtextResource)robot, document);
      return;
    } else if (robot instanceof Robot) {
      _format((Robot)robot, document);
      return;
    } else if (robot instanceof Scenario) {
      _format((Scenario)robot, document);
      return;
    } else if (robot instanceof EObject) {
      _format((EObject)robot, document);
      return;
    } else if (robot == null) {
      _format((Void)null, document);
      return;
    } else if (robot != null) {
      _format(robot, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(robot, document).toString());
    }
  }
}
