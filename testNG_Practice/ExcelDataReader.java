package testNG_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataReader {
	
	static XSSFSheet sheet;
	static XSSFWorkbook wb;
	static FileInputStream fis;
	
  @Test
  public static void ExcelSheetReader(String filePath) {
	  
	  File file = new File(filePath);
	  
	
	try {
		fis = new FileInputStream(file);
		
		wb = new XSSFWorkbook(fis);
		  

		  
	} catch (Exception e) {
		e.getMessage();
	}

  }
  
  public void ReadDataExcel(int sheetNum, int rowNum, int cellNum) {

		sheet = wb.getSheetAt(sheetNum);  
		
		System.out.println(sheet.getRow(rowNum).getCell(cellNum).getStringCellValue());
  }
  

  
}
