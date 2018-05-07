package ProfilesDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandlingUntrustedSSL {

	public static void main(String[] args) {
		
		FirefoxProfile profile1 = new FirefoxProfile();
		profile1.setAcceptUntrustedCertificates(true); // false
		WebDriver driver = new FirefoxDriver(profile1);
		driver.manage().window().maximize();
		driver.get("https://www.vrecedu.org/");
		driver.close();

	}

}
