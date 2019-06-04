package testselenium;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_demo {
  @Test
  public void f() throws Exception {
	  XSSFWorkbook xw=new XSSFWorkbook();
	  XSSFSheet xs=xw.createSheet("testme_app");
	  System.out.println(xw.getSheetName(0));
	  FileOutputStream fos=new FileOutputStream(new File("Data.xlsx"));
	  xw.write(fos);
	  fos.close();
	  
	  
  }
}
