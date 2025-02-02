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

package org.eclipse.birt.report.engine.api.impl;

import java.util.HashMap;

import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.report.engine.api.IReportDocumentLock;
import org.eclipse.birt.report.engine.api.IReportDocumentLockManager;

/**
 * The locker manager used by the system.
 * 
 * The user should register the lock mangager to the report engine.
 * 
 */
public class ReportDocumentLockManager implements IReportDocumentLockManager {

	static protected IReportDocumentLockManager instance = null;

	public static IReportDocumentLockManager getInstance() {
		if (instance != null) {
			return instance;
		}
		synchronized (ReportDocumentLockManager.class) {
			if (instance == null) {
				instance = new InternalLockManager();
			}
		}
		return instance;
	}

	private ReportDocumentLockManager() {
	}

	public IReportDocumentLock lock(String document) throws BirtException {
		return null;
	}

	private static class InternalLock implements IReportDocumentLock {

		String document;

		InternalLock(String document) {
			this.document = document;
		}

		public void unlock() {
		}
	}

	private static class InternalLockManager implements IReportDocumentLockManager {

		private HashMap locks = new HashMap();

		InternalLockManager() {
		}

		public IReportDocumentLock lock(String document) throws BirtException {
			synchronized (this) {
				IReportDocumentLock lock = (IReportDocumentLock) locks.get(document);
				if (lock == null) {
					lock = new InternalLock(document);
					// first time, we must accquire a lock
					locks.put(document, lock);
				}
				return lock;
			}
		}
	}

}
