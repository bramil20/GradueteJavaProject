package test1;

import org.testng.annotations.Test;

import lib.date.Property;
import lib.pages.Homepage;
import lib.pages.LoginPage;
import lib.pages.MyProfilePage;
import lib.util.Prepere;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class Test1 {
	
	private WebDriver driver;
	LoginPage loginPage;
 	Homepage homepage;
	MyProfilePage myProfilePage;
	String message;
	@BeforeClass
	public void beforeClass() {
		System.out.println("Test: Before class");
		driver =  Prepere.chromeDriver();
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		
		
		loginPage.typeUsername(Property.username).typePassword(Property.password);
		Sleeper.sleepTightInSeconds(4);

		homepage = loginPage.clckOnLoginButton();

		message = homepage.getTextFromLoginInfoLabel();
		System.out.println(message);

		assert message.contains("You are logged in as") : "You are not logged in. Test Failed";

		homepage.clickOnMyAccount();
		
		myProfilePage = homepage.clickOnMyProfile();
		
		
		
		
		
	}

	@Test(dependsOnMethods ="verifyCareerTextLabel")
	public void verifyProfile() {
		System.out.println("Verify Career Text Label");
		message = myProfilePage.getEmailAddress();
		
		assert message.equals(myProfilePage.getEmailAddress()) : "You are not logged in or this is not your email address. Test failed";
		System.out.println("Test passed");
		
		
	}
	
	@Test
	public void verifyCareerTextLabel() {
		System.out.println("Test: Verify Career Text Label");
		message = myProfilePage.getTextFromDevelopmentLabel();
		
		assert message.contains("Career Development") : "Test failed";
		System.out.println("Test passed");
		
		
		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
		myProfilePage.clickOnLogOutFromEndavaUni();
		driver.quit();
		
		
	}

}
