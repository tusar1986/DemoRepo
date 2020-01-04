package seleniumjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel {

	public static void main(String[] args) throws Exception {
		
		File f=new File("F:/Selenium/Test.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet("Sheet1");
		Row rw=st.getRow(0);
		Cell c=rw.getCell(2);
		//writing value to excel
		c.setCellValue("Browser");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		//String data=c.toString();
		//System.out.println(data);
		
		
	}

}
