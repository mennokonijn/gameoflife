/*
 * generated by Xtext 2.28.0
 */
package gameoflife.tasks.ide

import com.google.inject.Guice
import gameoflife.tasks.TaskDSLRuntimeModule
import gameoflife.tasks.TaskDSLStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TaskDSLIdeSetup extends TaskDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TaskDSLRuntimeModule, new TaskDSLIdeModule))
	}
	
}
