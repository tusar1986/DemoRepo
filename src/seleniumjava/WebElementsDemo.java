package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		WebElement textbox=driver.findElement(By.name("q"));
		textbox.sendKeys("net speed");
		textbox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Speedtest by Ookla')]")).click();;
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int size=links.size();
		for(int i=0;i<size;i++)
		{
			WebElement list=links.get(i);
			String context=list.getText();
			System.out.println(context);
					
		}
		driver.close();
		

	}

}
