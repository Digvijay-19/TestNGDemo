package com.TestNGListeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.TestNGListeners.TestNGListeners.class)
public class FirstScript {

	
	WebDriver driver;
	
	
	@Test
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D://Selenium Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		String title = driver.getTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and servce");
		driver.quit();
	}
}
