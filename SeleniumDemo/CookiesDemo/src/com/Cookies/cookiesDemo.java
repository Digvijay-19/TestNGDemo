package com.Cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiesDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Drivers//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    Set<Cookie> cookie =  driver.manage().getCookies();
	    Iterator<Cookie> itr =  cookie.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    driver.manage().deleteAllCookies();

	    driver.close();
	}

}
