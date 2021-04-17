/*******************************************************************************
 * Copyright (c) 2009 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.designer.ui.cubebuilder.page;

import org.eclipse.birt.report.designer.data.ui.property.PropertyNode;
import org.eclipse.birt.report.model.api.olap.TabularCubeHandle;

/**
 * 
 */

public interface ICubePageNodeGenerator {

	public PropertyNode createPropertyNode(CubeBuilder builder, TabularCubeHandle cube);

}
