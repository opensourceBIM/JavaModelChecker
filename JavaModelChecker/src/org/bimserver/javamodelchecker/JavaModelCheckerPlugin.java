package org.bimserver.javamodelchecker;

/******************************************************************************
 * Copyright (C) 2009-2016  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginContext;
import org.bimserver.plugins.modelchecker.ModelChecker;
import org.bimserver.plugins.modelchecker.ModelCheckerPlugin;
import org.bimserver.shared.exceptions.PluginException;

public class JavaModelCheckerPlugin implements ModelCheckerPlugin {

	private PluginContext pluginContext;

	@Override
	public void init(PluginContext pluginContext) throws PluginException {
		this.pluginContext = pluginContext;
		initExamples(pluginContext);
	}

	private void initExamples(PluginContext pluginContext) {
	}

	@Override
	public ObjectDefinition getSettingsDefinition() {
		return null;
	}
	
	@Override
	public ModelChecker createModelChecker(PluginConfiguration pluginConfiguration) {
		return new JavaModelChecker(pluginContext.getClassLoader(), pluginContext.getRootPath());
	}
}
