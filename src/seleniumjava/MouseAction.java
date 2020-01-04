package seleniumjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader1;
public class MouseAction {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26tag%3Dabkexpt1-21%26ascsubtag%3D_k_EAIaIQobChMInLqF6_PZ5gIVhJSPCh3ZkgvaEAAYASAAEgLQjvD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMInLqF6_PZ5gIVhJSPCh3ZkgvaEAAYASAAEgLQjvD_BwE%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("createAccountSubmit"));
		Actions act=new Actions(driver);
		//String value=driver.getWindowHandle();
		////System.out.println("Window ID is: "+value);
		//System.out.println("Gmail link is diplayed? "+isDisplayed);
		//System.out.println("Gmail link is enabled? "+gmailLink);
		//act.moveToElement(element).perform();
		 act.moveToElement(element).click().build().perform();
		WebElement customerName=driver.findElement(By.id("ap_customer_name"));
		 
		 //WebElement phoneCode=driver.findElement(By.cssSelector(".a-dropdown-prompt"));
		 //Select sel=new Select(phoneCode);
		// sel.selectByVisibleText("India +91");
		 WebElement customerPhoneNumber=driver.findElement(By.id("ap_phone_number"));
		 WebElement customerEmailID=driver.findElement(By.id("ap_email"));
		 WebElement customerPassword=driver.findElement(By.id("ap_password"));
		  
		Xls_Reader1 reader=new Xls_Reader1("F:\\JavaPrograms\\seleniumjava\\src\\com\\testdata\\AmazonTestData.xlsx");
		int rowCount=reader.getRowCount("RegTestData");
		System.out.println(rowCount);
		for(int rowNum=2;rowNum<=rowCount;rowNum++)
		{
		String firstName=reader.getCellData("RegTestData","customerName",rowNum);
		customerName.clear();
		 customerName.sendKeys(firstName);
		String customerPhone=reader.getCellData("RegTestData","customerPhoneNumber",rowNum);
		customerPhoneNumber.clear();
		customerPhoneNumber.sendKeys(customerPhone);
		String customerEmail=reader.getCellData("RegTestData","customerEmailID",rowNum);
		customerPhoneNumber.clear();
		customerPhoneNumber.sendKeys(customerEmail);
		String customerPass=reader.getCellData("RegTestData","customerPassword",rowNum);
		customerPhoneNumber.clear();
		customerPhoneNumber.sendKeys(customerPass);
		
		}
		//driver.close();
		
		}

}
