/*******************************************************************************
 * Copyright (c) 2006 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.chart.script.internal.series.data;

import org.eclipse.birt.chart.model.data.Query;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.QueryImpl;
import org.eclipse.birt.chart.script.api.series.data.ISeriesData;
import org.eclipse.emf.common.util.EList;

/**
 * 
 */

public class SeriesDataImpl implements ISeriesData {

	protected EList querys;
	protected SeriesDefinition sd;

	protected SeriesDataImpl(SeriesDefinition sd) {
		this.sd = sd;
		this.querys = sd.getDesignTimeSeries().getDataDefinition();
		assert querys != null;
	}

	protected String getExprByIndex(int index) {
		return querys.size() > index ? ((Query) querys.get(index)).getDefinition() : null;
	}

	protected void setExprsByIndex(int index, String expr) {
		while (querys.size() < index + 1) {
			Query query = QueryImpl.create(""); //$NON-NLS-1$
			querys.add(query);
			query.eAdapters().addAll(sd.eAdapters());
		}
		((Query) querys.get(index)).setDefinition(expr);
	}
}
