/*
 * generated by Xtext 2.28.0
 */
package gameoflife.tasks.ui.tests;

import com.google.inject.Injector;
import gameoflife.tasks.ui.internal.TasksActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class TaskDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TasksActivator.getInstance().getInjector("gameoflife.tasks.TaskDSL");
	}

}
