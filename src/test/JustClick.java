package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class JustClick {
	public static String URL="https://www.endavauniversity.com";
	private static WebDriver driver;
	
		
	
  @Test
  public void f() {
	  driver.findElement(By.id("loginbtn")).click();
	  Sleeper.sleepTightInSeconds(3);
	  
	  String message = driver.findElement(By.className("error")).getText();
	  System.out.println(message);
	  
	  assert message.equals("Invalid login, please try again") : "You are logged";
	  System.out.println("Test passed");
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get(URL);
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
