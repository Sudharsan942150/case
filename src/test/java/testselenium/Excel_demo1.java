package testselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_demo1 {
  @Test
  public void f() throws Exception {
	  File fl=new File("C:\\Users\\training_h2a.06.15\\eclipse-workspace\\MAY19SELENIUM\\Data.xlsx");
	  FileInputStream fi=new FileInputStream(fl);
	  XSSFWorkbook wb=new XSSFWorkbook(fi);
	  XSSFSheet sh= wb.getSheetAt(0);
	  
	  int rc=sh.getLastRowNum();
	   for(int i=0;i<=rc;i++)
	  {
		 
			  
		  System.out.print(sh.getRow(i).getCell(0).getStringCellValue()+"    ");
		  System.out.print(sh.getRow(i).getCell(1).getStringCellValue());
		  System.out.println();
		  
		  
		  
		  
	  }
	  sh.getRow(0).getCell(0).setCellValue("Status");
	   
	  FileOutputStream fo= new FileOutputStream(new File("C:\\Users\\training_h2a.06.15\\eclipse-workspace\\MAY19SELENIUM\\Data.xlsx"));
	  
	  wb.write(fo);
	  wb.close();
  }
}
