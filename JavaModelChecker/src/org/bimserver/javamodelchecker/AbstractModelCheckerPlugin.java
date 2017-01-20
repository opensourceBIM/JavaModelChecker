package org.bimserver.javamodelchecker;

import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.plugins.PluginContext;
import org.bimserver.plugins.modelchecker.ModelCheckerPlugin;
import org.bimserver.shared.exceptions.PluginException;

public abstract class AbstractModelCheckerPlugin implements ModelCheckerPlugin {

	@Override
	public void init(PluginContext pluginContext) throws PluginException {
	}

	@Override
	public ObjectDefinition getSettingsDefinition() {
		return null;
	}
}