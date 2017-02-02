package tests;

import org.testng.annotations.Test;

import data.CSVReader;
import data.User;
import pages.AdminPage;
import pages.SignUpPage;
import util.Prepare;
import util.Verification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RegistrationTheRightWay2 {

	private static WebDriver driver;
	CSVReader csv;
	SignUpPage singUpPage;
	String message;
	
	@BeforeClass
	public void beforeClass() {
		driver = Prepare.chromeDriver();
		singUpPage = new SignUpPage(driver);

	}
	

	@Test
	public void allCorrectCases() {
		
		singUpPage.signUpOK();
//		Verification.verifyString("Successfully registered, confirm your email", getTextFromLabel(),
//				"User [First name= " + user[0] + " , Last name= " + user[1] + "\n \tNick name= " + user[2]
//						+ " ," + " Email= " + user[3] + "\n \tPassword= " + user[4] + ", Password Repeat= "
//						+ user[5] + "]");
//		Sleeper.sleepTight(600);

	}

	@Test(dependsOnMethods="allCorrectCases")
	public void allIncorrectCases() {
		System.out.println("All of these users must NOT be created");
		singUpPage.signUpBadRequest();
		
	}

	@Test(dependsOnMethods = "allIncorrectCases")
	public void allConflictCases() {
		System.out.println("All of these users must NOT be created");
		
		singUpPage.signUpConflict();
	

	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

}
