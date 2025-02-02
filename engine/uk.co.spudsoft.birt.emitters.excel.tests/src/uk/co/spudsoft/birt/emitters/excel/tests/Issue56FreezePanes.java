/*************************************************************************************
 * Copyright (c) 2011, 2012, 2013 James Talbut.
 *  jim-emitters@spudsoft.co.uk
 *  
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     James Talbut - Initial implementation.
 ************************************************************************************/

package uk.co.spudsoft.birt.emitters.excel.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.InputStream;

import org.apache.poi.hssf.util.PaneInformation;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class Issue56FreezePanes extends ReportRunner {

	@Test
	public void testPanes() throws Exception {

		debug = false;
		groupSummaryHeader = true;
		InputStream inputStream = runAndRenderReport("Issue56FreezePanes.rptdesign", "xlsx");
		assertNotNull(inputStream);
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			assertNotNull(workbook);

			assertEquals(1, workbook.getNumberOfSheets());

			XSSFSheet sheet0 = workbook.getSheetAt(0);

			PaneInformation paneInfo = sheet0.getPaneInformation();
			assertEquals(true, paneInfo.isFreezePane());
			assertEquals(2, paneInfo.getVerticalSplitLeftColumn());
			assertEquals(1, paneInfo.getHorizontalSplitTopRow());
		} finally {
			inputStream.close();
		}

	}
}
