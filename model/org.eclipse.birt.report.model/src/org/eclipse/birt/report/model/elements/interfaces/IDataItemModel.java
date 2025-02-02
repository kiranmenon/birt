/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.model.elements.interfaces;

/**
 * The interface for DataItem element to store the constants.
 */
public interface IDataItemModel {

	/**
	 * Name of the value expression property.
	 * 
	 * @deprecated As of BIRT version 2.1,0, replaced by RESULT_SET_COLUMN_PROP
	 */

	public static final String VALUE_EXPR_PROP = "valueExpr"; //$NON-NLS-1$

	/**
	 * Name of the help text property.
	 */

	public static final String HELP_TEXT_PROP = "helpText"; //$NON-NLS-1$

	/**
	 * Name of the help text key property.
	 */

	public static final String HELP_TEXT_KEY_PROP = "helpTextID"; //$NON-NLS-1$

	/**
	 * Name of the action property.
	 */

	public static final String ACTION_PROP = "action"; //$NON-NLS-1$

	/**
	 * Name the data column name property.
	 */

	public static final String RESULT_SET_COLUMN_PROP = "resultSetColumn"; //$NON-NLS-1$

}
