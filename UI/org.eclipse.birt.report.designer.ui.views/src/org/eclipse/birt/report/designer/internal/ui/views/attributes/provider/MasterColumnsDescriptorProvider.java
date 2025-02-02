/*******************************************************************************
 * Copyright (c) 2008 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.designer.internal.ui.views.attributes.provider;

import org.eclipse.birt.report.designer.internal.ui.views.attributes.section.ComplexUnitSection;

/**
 * 
 */

public class MasterColumnsDescriptorProvider extends PropertyDescriptorProvider {

	public static final String THREE_COLUMNS = "3"; //$NON-NLS-1$
	public static final String TWO_COLUMNS = "2"; //$NON-NLS-1$
	public static final String ONE_COLUMN = "1"; //$NON-NLS-1$

	public MasterColumnsDescriptorProvider(String property, String element) {
		super(property, element);
	}

	private ComplexUnitSection columnSpaceSection;

	public void setColumnSpaceSection(ComplexUnitSection columnSpaceSection) {
		this.columnSpaceSection = columnSpaceSection;
	}

	public Object load() {
		Object value = super.load();
		if (columnSpaceSection != null) {
			if (value == null || value.toString().equals(ONE_COLUMN)) // $NON-NLS-1$
			{
				columnSpaceSection.getUnitComboControl().setReadOnly(true);
			} else
				columnSpaceSection.getUnitComboControl().setReadOnly(false);
		}
		return value;

	}
}
