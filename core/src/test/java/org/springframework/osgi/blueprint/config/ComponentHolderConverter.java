/*
 * Copyright 2006-2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.osgi.blueprint.config;

import org.osgi.service.blueprint.container.CollapsedType;
import org.osgi.service.blueprint.container.Converter;

/**
 * Dummy converter used for testing.
 * 
 * @author Costin Leau
 * 
 */
public class ComponentHolderConverter implements Converter {

	public boolean canConvert(Object fromValue, CollapsedType toType) {
		return ComponentHolder.class.equals(toType);
	}

	public Object convert(Object fromValue, CollapsedType toType) throws Exception {
		ComponentHolder comp = new ComponentHolder();
		comp.setProperty(fromValue);
		return comp;
	}
}