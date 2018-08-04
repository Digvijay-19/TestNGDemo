package com.TestCasesExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	static WebDriver driver;
	
	
	
	
	
	@Parameters({"url"})
	@BeforeMethod
	public void setUp(String url){
		System.setProperty("webdriver.chrome.driver", "D://Selenium Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	
	@Test(priority=1,groups="Regression")
	public void verifyLoginTitle(){
		String title = driver.getTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
		System.out.println(title);
	
	}
	
	@Parameters({"username","password"})
	@Test(priority=2,groups="Regression")
	public void verifyLoginIN(String username,String password) throws InterruptedException{
		System.out.println("UserName of the CRM Page is --- " +username);
		System.out.println("UserName of the CRM Page is --- " +password);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit' and @value ='Login']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRMPRO");
	}
	
	@Parameters({"title"})
	@Test(priority=3,groups="Regression")
	public void ValidateCRMTitle(String title){
		System.out.println(title);
		
	}
	
   @AfterMethod
   public void breakDown(){
	   driver.close();
   }

}
