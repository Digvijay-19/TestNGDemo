package packageOne;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class classOne {
 
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver","D:/SeleniumDemo/Selenium Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com/index.html");
}
	
	@Test
	public void freecrmtitletest(){
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	
	
	@AfterMethod
	public void teardow() throws IOException{
		
		
		driver.quit();
	}
}
	