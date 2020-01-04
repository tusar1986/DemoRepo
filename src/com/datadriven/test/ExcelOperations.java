package com.datadriven.test;

import com.excel.utility.Xls_Reader1;

public class ExcelOperations {

	public static void main(String[] args) {
		Xls_Reader1 reader=new Xls_Reader1("F:\\JavaPrograms\\seleniumjava\\src\\com\\testdata\\EbayTestData.xlsx");
		//reader.addSheet("Homepage");
		int colCount=reader.getColumnCount("RegTestData");//get total column number
		System.out.println("Total no of columns are :"+colCount);
		System.out.println(reader.getCellRowNum("RegTestData","firstname","namrata"));
	}

}
