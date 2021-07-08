package testNG_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataProviderExample {
	
  @Test
  public void ReadExelData() throws Exception {
  
	  ExcelDataReader edr = new ExcelDataReader();
	 edr.ExcelSheetReader("C:\\Users\\vishw\\Desktop\\Study Material\\Lectures\\TestExcel.xlsx");
	 edr.ReadDataExcel(0, 0, 0);
  }
}
