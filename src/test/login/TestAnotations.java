package test.login;

import org.testng.annotations.Test;

import lib.date.Property;
//import lib.data.Property;
import lib.pages.Homepage;
import lib.pages.LoginPage;
import lib.util.Prepere;
import lib.util.Verification;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

//@Test(groups={"login"})
public class TestAnotations {

	private static WebDriver driver;
	LoginPage loginPage;
	Homepage homepage;
	String message;

	@Test(groups = {"login"})
	public void neuspesnoLogovanje() {
		System.out.println("Test: NeuspesnoLogovanje()");
		loginPage.typeUsername("nenad");
		loginPage.typePassword(Property.password);
		loginPage.clckOnLoginButton();
		
		Verification.verifyErrorMsg("Invalid login, please try again", loginPage.getErrorMessage(), "Unsuccesful login verification");		
	/*	String errorMessage = loginPage.getErrorMessage();

		assert errorMessage.contains("Invalid login") : "ERROR: You are logged in";
		System.out.println("Test passed");*/

	}

	@Test(dependsOnMethods = "neuspesnoLogovanje")
	public void neuspesnoLogovanje1() {
		System.out.println("Test: NeuspesnoLogovanje1()");
		loginPage.typeUsername(Property.username);
		loginPage.typePassword("fdsfad");
		loginPage.clckOnLoginButton();
		
		Verification.verifyErrorMsg("Invalid login, please try again", loginPage.getErrorMessage(), "Unsuccesful login verification");
		
	  /*String errorMessage = loginPage.getErrorMessage();

		assert errorMessage.contains("Invalid login") : "ERROR: You are logged in";
		System.out.println("Test passed");*/
	}

	@Test(dependsOnMethods = "neuspesnoLogovanje1")
	public void UspesnoLogovanje() {

		
			System.out.println("Test: UspesnoLogovanje");
			loginPage.typeUsername(Property.username);
			loginPage.typePassword(Property.password);
			homepage = loginPage.clckOnLoginButton();
			
			

			Verification.verifyString("You are logged in", homepage.getTextFromLoginInfoLabel(), "Successfil login verification");
			
			/*
			message = homepage.getTextFromLoginInfoLabel();
			System.out.println(message);
			assert message.contains("You are logged in") : "ERROR: You are not logged in";
			System.out.println("Test passed");*/
	
			
		}

	@BeforeMethod
	public void clearFields() {
		System.out.println("Before Method");
		loginPage.clearUsernameAndPasswordFields();
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("Before Class");
		driver = Prepere.chromeDriver();
		loginPage = new LoginPage(driver);
	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

}
