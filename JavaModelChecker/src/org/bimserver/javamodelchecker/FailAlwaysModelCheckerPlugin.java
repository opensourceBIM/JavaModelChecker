package org.bimserver.javamodelchecker;

import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.modelchecker.ModelChecker;

public class FailAlwaysModelCheckerPlugin extends AbstractModelCheckerPlugin {

	@Override
	public ModelChecker createModelChecker(PluginConfiguration pluginConfiguration) {
		return new FailAlways();
	}
}