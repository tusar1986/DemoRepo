package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader1;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://reg.ebay.in/reg/PartialReg");
		driver.manage().window().maximize();
		Xls_Reader1 reader=new Xls_Reader1("F:\\JavaPrograms\\seleniumjava\\src\\com\\testdata\\EbayTestData.xlsx");
		int rowCount=reader.getRowCount("RegTestData");
		System.out.println(rowCount);
		for(int rowNum=2;rowNum<=rowCount;rowNum++)
		{
		String firstName=reader.getCellData("RegTestData","firstname",rowNum);
		System.out.println(firstName);
		String lastName=reader.getCellData("RegTestData","lastname",rowNum);
		System.out.println(lastName);
		String emailid=reader.getCellData("RegTestData","emalid",rowNum);
		System.out.println(firstName);
		String password=reader.getCellData("RegTestData","password",rowNum);
		System.out.println(password);
		//driver.findElement(By.id("firstname")).clear();
		//driver.findElement(By.id("firstname")).sendKeys(firstName);
		}
		
		

	}

}
