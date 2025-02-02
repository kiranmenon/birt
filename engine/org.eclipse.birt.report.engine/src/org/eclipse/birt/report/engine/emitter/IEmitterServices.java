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

package org.eclipse.birt.report.engine.emitter;

import java.util.HashMap;

import org.eclipse.birt.report.engine.api.IRenderOption;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.script.IReportContext;

/**
 * Defines interface to supply emitters with necessary information
 */
public interface IEmitterServices {

	/**
	 * TODO: review, return IEmitterConfig, by format.
	 * 
	 * @return emitter configuration of engine
	 */
	public HashMap getEmitterConfig();

	/**
	 * @return render options
	 */
	public IRenderOption getRenderOption();

	/**
	 * @return the current report name
	 */
	public String getReportName();

	/**
	 * 
	 * @deprecated the user should use getReportContext().getRenderContext() to get
	 *             the render options.
	 * @return render context
	 */
	public Object getRenderContext();

	/**
	 * @return the report runnable
	 */
	public IReportRunnable getReportRunnable();

	/**
	 * @param name option name
	 * @return option value
	 */
	public Object getOption(String name);

	public IReportContext getReportContext();

	public IReportEngine getReportEngine();
}