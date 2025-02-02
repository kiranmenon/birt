/*******************************************************************************
 * Copyright (c) 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.script.internal.element;

import org.eclipse.birt.report.engine.api.script.ScriptException;
import org.eclipse.birt.report.engine.api.script.element.IColumn;
import org.eclipse.birt.report.engine.api.script.element.IHideRule;
import org.eclipse.birt.report.model.api.ColumnHandle;
import org.eclipse.birt.report.model.api.activity.SemanticException;
import org.eclipse.birt.report.model.api.elements.structures.HideRule;
import org.eclipse.birt.report.model.api.simpleapi.SimpleElementFactory;

/**
 * Column script. Implements of <code>IColumn</code>
 */

public class Column extends DesignElement implements IColumn {
	/**
	 * Constructor.
	 * 
	 * @param columnHandle
	 */

	public Column(ColumnHandle columnHandle) {
		super(columnHandle);
	}

	public Column(org.eclipse.birt.report.model.api.simpleapi.IColumn columnImpl) {
		super(columnImpl);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.engine.api.script.element.IHideRuleStructure#
	 * addHideRule(org.eclipse.birt.report.engine.api.script.element.IHideRule)
	 */

	public void addHideRule(IHideRule rule) throws ScriptException {
		org.eclipse.birt.report.model.api.simpleapi.IHideRule hideRule = SimpleElementFactory.getInstance()
				.createHideRule((HideRule) rule.getStructure());
		try {
			((org.eclipse.birt.report.model.api.simpleapi.IColumn) designElementImpl).addHideRule(hideRule);
		} catch (SemanticException e) {
			throw new ScriptException(e.getLocalizedMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.engine.api.script.element.IHideRuleStructure#
	 * getHideRules()
	 */

	public IHideRule[] getHideRules() {
		org.eclipse.birt.report.model.api.simpleapi.IHideRule[] hideRules = ((org.eclipse.birt.report.model.api.simpleapi.IColumn) designElementImpl)
				.getHideRules();

		IHideRule[] rules = new IHideRule[hideRules.length];

		for (int i = 0; i < hideRules.length; i++) {
			rules[i] = new HideRuleImpl((HideRule) hideRules[i].getStructure());
		}
		return rules;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.engine.api.script.element.IHideRuleStructure#
	 * removeHideRule(org.eclipse.birt.report.engine.api.script.element.IHideRule)
	 */

	public void removeHideRule(IHideRule rule) throws ScriptException {
		org.eclipse.birt.report.model.api.simpleapi.IHideRule hideRule = SimpleElementFactory.getInstance()
				.createHideRule((HideRule) rule.getStructure());
		try {
			((org.eclipse.birt.report.model.api.simpleapi.IColumn) designElementImpl).removeHideRule(hideRule);
		} catch (SemanticException e) {
			throw new ScriptException(e.getLocalizedMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.engine.api.script.element.IHideRuleStructure#
	 * removeHideRules()
	 */

	public void removeHideRules() throws ScriptException {
		try {
			((org.eclipse.birt.report.model.api.simpleapi.IColumn) designElementImpl).removeHideRules();
		} catch (SemanticException e) {
			throw new ScriptException(e.getLocalizedMessage());
		}
	}

}
