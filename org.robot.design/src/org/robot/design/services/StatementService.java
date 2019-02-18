package org.robot.design.services;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;
import org.robot.k3project.RobotAspect;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.ConditionalStatement;
import org.robot.model.robot.Connection;
import org.robot.model.robot.Robot;
import org.robot.model.robot.Scenario;
import org.robot.model.robot.Statement;
import org.robot.vrep.robot.PolyRob;

public class StatementService {

	public String getServiceName(Statement s) {
		return StatementAspect.getType(s);
	}
	
	public List<Robot> getRobot(EObject e) {
		return Arrays.asList(RobotAspect.instance);
	}
	
	public String getRobotStatus(Connection c) {
		PolyRob.getSingleton().readNoseSensor();
		return String.format("x: %d\ny: %d\ndistance with object: %d", 
				PolyRob.getSingleton().getPosition().x,
				PolyRob.getSingleton().getPosition().y,
				PolyRob.getSingleton().getDetectedObjectDistance());
	}
	
	public List<Statement> getStatements(Scenario sc) {
		return sc.getStatementBlock().getStatements().stream()
				.map(this::getStatements)
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
	}
	
	public List<Statement> getStatements(Statement s) {
		if (s instanceof ConditionalStatement) {
			List<Statement> res = new LinkedList<>();
			res.add(s);
			for (Statement s2 : ((ConditionalStatement) s).getStatementBlock().getStatements())
				res.addAll(getStatements(s2));
			return res;
		}
		return Arrays.asList(s);
	}
	
	public boolean isCurrentStatement(Statement s) {
//		EObject container = s.eContainer();
//		while (! (container instanceof Robot)) {
//			container = container.eContainer();
//		}
//		return RobotAspect.isCurrent((Robot) container, s);
//		return StatementAspect.isActive(s);
//		System.out.println(s);
//		return new Random().nextBoolean();
//		return StatementAspect.getIsActive(s);
//		System.out.println(getAspectProperty(s, "org.robot.xdsl.RobotXdsl", "org.robot.k3project.StatementAspect", "isActive"));
//		EObject container = s.eContainer();
//		while (! (container instanceof Robot)) {
//			container = container.eContainer();
//		}
		Statement s2 = RobotAspect.getCurrentStatement(RobotAspect.instance);
		System.out.println(s);
		System.out.println(s2);
		return s.getClass().equals(RobotAspect.getCurrentStatement(RobotAspect.instance).getClass());
//		return s == RobotAspect.getCurrentStatement(RobotAspect.instance);
//		return false;
	}
	
	public String getAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		System.out.println(aspects);
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (aspect == null) {
			return "void (no aspect)";
		}
		Object res = null;
		 try {
			res = aspect.getDeclaredMethod(propertyName, ((Aspect)aspect.getAnnotations()[0]).className()).invoke(eObject, eObject);
			if (res != null) {
				return res.toString();
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		 return "void";
	}

}

