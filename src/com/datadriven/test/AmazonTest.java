package com.datadriven.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testUtil.TestUtil;

public class AmazonTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","F:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26tag%3Dabkexpt1-21%26ascsubtag%3D_k_EAIaIQobChMInLqF6_PZ5gIVhJSPCh3ZkgvaEAAYASAAEgLQjvD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMInLqF6_PZ5gIVhJSPCh3ZkgvaEAAYASAAEgLQjvD_BwE%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		WebElement element=driver.findElement(By.id("createAccountSubmit"));
		Actions act=new Actions(driver);
	    act.moveToElement(element).click().build().perform();
		
	}
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData=TestUtil.getDataFromExcel();
		return testData.iterator();
		
	}
	@Test(dataProvider="getTestData")
	public void AmazonRegTest(String customerName,String phoneNumber,String emailID,String password) {
	driver.findElement(By.id("ap_customer_name")).clear();
	driver.findElement(By.id("ap_customer_name")).sendKeys(customerName);
	driver.findElement(By.id("ap_phone_number")).clear();
	driver.findElement(By.id("ap_phone_number")).sendKeys(phoneNumber);
	driver.findElement(By.id("ap_email")).clear();
	driver.findElement(By.id("ap_email")).sendKeys(emailID);
	driver.findElement(By.id("ap_password")).clear();
	driver.findElement(By.id("ap_password")).sendKeys(password);
	}
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	}
	
