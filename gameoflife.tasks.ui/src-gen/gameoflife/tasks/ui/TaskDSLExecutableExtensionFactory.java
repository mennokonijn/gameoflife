/*
 * generated by Xtext 2.28.0
 */
package gameoflife.tasks.ui;

import com.google.inject.Injector;
import gameoflife.tasks.ui.internal.TasksActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TaskDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(TasksActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		TasksActivator activator = TasksActivator.getInstance();
		return activator != null ? activator.getInjector(TasksActivator.GAMEOFLIFE_TASKS_TASKDSL) : null;
	}

}
