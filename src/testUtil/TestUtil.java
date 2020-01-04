package testUtil;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader1;

public class TestUtil {
	static Xls_Reader1 reader;
public static ArrayList<Object[]> getDataFromExcel()
{
	ArrayList<Object[]> myData=new ArrayList<Object[]>();
	try {
		reader=new Xls_Reader1("F:\\JavaPrograms\\seleniumjava\\src\\com\\testdata\\AmazonTestData.xlsx");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	for(int rowNum=2;rowNum<=reader.getRowCount("RegTestData");rowNum++)
	{
	String customerName=reader.getCellData("RegTestData","customerName",rowNum);
	String phoneNumber=reader.getCellData("RegTestData","customerPhoneNumber",rowNum);
	String emailID=reader.getCellData("RegTestData","customerEmailID",rowNum);
	String password=reader.getCellData("RegTestData","customerPassword",rowNum);
	Object obj[]= {customerName,phoneNumber,emailID,password};
	myData.add(obj);
    }
	return myData;
}
}
