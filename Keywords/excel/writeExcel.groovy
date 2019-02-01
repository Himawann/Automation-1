package excel

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {
	@Keyword
	public void demoKey(int indexRow, String[] dataToWrite) throws IOException{
		FileInputStream fis = new FileInputStream("D:\\Katalon\\Scenario_Login.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Scenario");
		//int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		//Row row = sheet.getRow(0);
		Row row = sheet.createRow(indexRow);

		/*
		 for (int j=0; j<row.getLastCellNum(); j++){
		 Cell cell = row.createCell(j);
		 cell.setCellValue(dataToWrite[j]);
		 println("j: " + j)
		 }
		 */

		for (int i = 4; i < dataToWrite.length; i++) {
			Cell cell = row.createCell(i);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(dataToWrite[i]);
		}

		FileOutputStream fos = new FileOutputStream("D:\\Katalon\\Scenario_Login.xlsx");
		workbook.write(fos);
		fos.close();
	}
}
