/*******************************************************************************
 * Copyright (c) 2007 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.chart.factory;

import com.ibm.icu.util.ULocale;

/**
 * Provides services for externalization of static text messages rendered in a
 * chart. The chart title and axis titles are presently externalizable. If chart
 * engine runs within BIRT, ChartReportItemImpl has implemented this interface
 * by default, which reuses the model's externalization mechanism, and will
 * externalize the text with the properties file of the report design or the
 * library. Otherwise the user should implement it.
 */
public interface IExternalizer {
	/**
	 * Defines a separator for a fully externalized message reference containing a
	 * key on the LHS and a value on the RHS separated by the key separator.
	 */
	public static final char KEY_SEPARATOR = '=';

	String externalizedMessage(String sKey, String sDefaultValue, ULocale locale);
}
