package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	@Parameters({"url","emailId"})
	@Test
	public void yahooLoginTest(String url,String emailId) {
		System.setProperty("webdriver.chrome.driver","F:/Selenium/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailId);
		driver.findElement(By.id("login-signin")).click();
		//driver.close();
				
	}

}
