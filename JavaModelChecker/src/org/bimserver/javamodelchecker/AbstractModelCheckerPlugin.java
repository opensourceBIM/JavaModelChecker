package org.bimserver.javamodelchecker;

/******************************************************************************
 * Copyright (C) 2009-2018  BIMserver.org
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