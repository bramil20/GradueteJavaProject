package test2;

import org.testng.annotations.Test;

import lib.date.Property;
import lib.pages.Homepage;
import lib.pages.InternalSystemPage;
import lib.pages.LoginPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class Test2 {
	
	WebDriver driver;
	LoginPage loginPage;
	Homepage homepage;
	InternalSystemPage internalPage;
	String message;
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class  ");
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		
		loginPage.typeUsername(Property.username).typePassword(Property.password);
		Sleeper.sleepTightInSeconds(4);

		homepage = loginPage.clckOnLoginButton();

		message = homepage.getTextFromLoginInfoLabel();
		System.out.println(message);

		assert message.contains("You are logged in as") : "You are not logged in. Test Failed";
	  
  }
	@Test
  public void f() {
		System.out.println("Testing");
		homepage.clickOnEndavaUniMenu();
		internalPage=homepage.clickOnSubMenuInternal();
		
		
		message = internalPage.getParagraphDescription();
		System.out.println(message);
		assert message.contains("This category contains help") : "Test failed";
		System.out.println("Test passed");
  }
 

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
	  driver.quit();
  }

}
