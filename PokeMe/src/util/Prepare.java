package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prepare {
	
	
	public static WebDriver firefoxDriver(){
		return new FirefoxDriver();
	}

	public static WebDriver chromeDriver(){
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		// To enable chrome driver we need to define chromedriver.exe file location
		return new ChromeDriver();		
	}
}
