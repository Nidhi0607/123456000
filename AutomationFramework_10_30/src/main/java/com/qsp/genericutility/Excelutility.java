package com.qsp.genericutility;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility 
{
public String getStringDataFromExcel(String sheetName,int roeindex,int colIndex) throws IOException
{
	FileInputStream fis = new FileInputStream("./src/test/resourses/testscriptexceldata1.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	return workbook.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getStringCellValue();
	
}
public double getNumberDataFromExcel(String sheetName,int roeindex,int colIndex) throws IOException
{
	FileInputStream fis = new FileInputStream("./src/test/resourses/testscriptexceldata1.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	return workbook.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getNumericCellValue();
	
}
public boolean getBooleanDataFromExcel(String sheetName,int roeindex,int colIndex) throws IOException
{
	FileInputStream fis = new FileInputStream("./src/test/resourses/testscriptexceldata1.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	return workbook.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getBooleanCellValue();	
}

}
