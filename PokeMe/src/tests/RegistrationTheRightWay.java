package tests;

import org.testng.annotations.Test;

import data.CSVReader;
import data.User;
import pages.SignUpPage;
import util.Prepare;
import util.Verification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RegistrationTheRightWay {

	private static WebDriver driver;
	CSVReader csv;
	SignUpPage singUpPage;
	String message;
	
	@BeforeClass
	public void beforeClass() {
		driver = Prepare.chromeDriver();
		driver.manage().window().maximize();
		singUpPage = new SignUpPage(driver);

	}
	

	@Test
	public void allCorrectCases() {
		System.out.println("All of these users must be created");
		singUpPage.signUpOK();

		// CSVReader.csvOk();

		//singUpPage.signUp2(CSVReader.csvOk());
		// Sleeper.sleepTight(1000);
		// singUpPage.clcikOnSignUpBtn();
		// Sleeper.sleepTight(350);
		// singUpPage.insertInputForAllFields2(csv.csvOk());
		// singUpPage.clickOnSignUpBtn2();
		// Sleeper.sleepTight(1100);
		// Verification.verifyString("Successfully registered, confirm your
		// email", singUpPage.getTextFromLabel(), "BLABLA");

	}

	@Test(dependsOnMethods="allCorrectCases")
	public void allIncorrectCases() {
		System.out.println("All of these users must NOT be created");
		singUpPage.signUpBadRequest();
		//singUpPage.signUp2(CSVReader.csvBadRequest());
		//Verification.verifyString("Successfully registered, confirm your email", singUpPage.getTextFromLabel(), "ALL SHOULD PASS");
	}

	@Test(dependsOnMethods = "allIncorrectCases")
	public void allConflictCases() {
		System.out.println("All of these users must NOT be created");
		//singUpPage.signUp2(CSVReader.csvConflict());
		singUpPage.signUpConflict();
		// Verification.verifyString("User with this email already exist. Try
		// different email.", singUpPage.getTextFromLabel(), "Conflict cases");

	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

}
