package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGmailLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement searchText=driver.findElement(By.xpath("//input[@name='q']"));
		String maxlength=searchText.getAttribute("maxlength");
		System.out.println(maxlength);
		searchText.sendKeys("Selenium");
		searchText.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		searchText.sendKeys("Internet speed test");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		WebElement searchLink=driver.findElement(By.xpath("//span[contains(text(),'Speedtest by Ookla')]"));
		searchLink.click();
		driver.findElement(By.xpath("//span[text()='Go']")).click();		
		//WebElement gmailLink=driver.findElement(By.xpath("//a[text()='Gmail']"));
		//gmailLink.click();
		driver.close();
	}

}
