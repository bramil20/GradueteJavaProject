package tests;

import org.testng.annotations.Test;

import pages.AdminPage;
import pages.SignUpPage;
import util.Prepare;
import util.Verification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class validationOfFields2 {

	private static WebDriver driver;
	AdminPage adminPage;
	SignUpPage singUpPage;
	
	@BeforeClass
	public void beforeClass() {
		//System.out.println("BEFORECLASS");
		//driver = Prepare.chromeDriver();
		//driver.manage().window().maximize();
		//singUpPage= new SignUpPage(driver);
		//driver = new ChromeDriver();
	    //driver.manage().window().maximize();

	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BEFORE METHOD");
		driver = Prepare.chromeDriver();
		driver.manage().window().maximize();
		singUpPage= new SignUpPage(driver);
		Sleeper.sleepTightInSeconds(1);
		singUpPage.clickLoginBtn();
		adminPage=singUpPage.loginToAdminPage("admin@admin.com", "admin");
		Sleeper.sleepTightInSeconds(2);
		
		
		
		
	}

	@Test // should added to database
	public void allCorrect() {
		System.out.println("Successful creation of user");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTight(750);
		adminPage.insertInputForAllFields("Correct", "Correct", "Correct1", "Correct@Correct.correct", "correct",
				"correct");
		Sleeper.sleepTight(750);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTight(750);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "allCorrect") // shouldn't be added to database
	public void allIncorrect() {
		System.out.println("Unuccessful creation of user");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("in", "in", "in", "incorrect", "inco", "inco");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "allIncorrect") // shouldn't be added to database
	public void justEmailIncorrect() {
		System.out.println("Unuccessful creation of user with wrong email");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("correct", "Correct", "Correct3", "incorrect", "Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "justEmailIncorrect")
	public void justEmailIncorrect2() {// shouldn't be added to database
		System.out.println("Unuccessful creation of user with email without dot(.)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("correct", "Correct", "Correct4", "incorrect@incorrect", "Correct",
				"Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "justEmailIncorrect2") // shouldn't be added to
													// database
	public void justEmailIncorrect3() {
		System.out.println("Unuccessful creation of user with email with @ and .");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("correct", "Correct", "Correct5", "in.correct@inc", "Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "justEmailIncorrect3") // shouldn't be added to
													// database
	public void sameEmailAsExisting() {
		System.out.println("SAME EMAIL AS EXISTING");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("sameEmail", "asExisting", "Correct55", "correct@correct.correct", "Correct",
				"Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "sameEmailAsExisting") // shouldn't be added to
													// database
	public void maxLengthMail() {
		System.out.println("MAX LENGTH MAIL");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("max", "length", "Correct6",
				"ccccccccccccccccccccccccc@cccccccccccccccccc.ccccc", "Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "maxLengthMail") // should be added to database
	public void minLengthMail() {
		System.out.println("MIN LENGTH MAIL");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("min", "length", "Correct7", "c@c.cc", "Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "minLengthMail") // shouldn't be added to database
	public void moreThanMaxLengthMail() {
		System.out.println("MORE THAN MAX LENGTH MAIL(30 CHARACTERS)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("morethan", "maxlength", "Correct8",
				"ccccccccccccccccccccccc@ccccccccccccccccccccccccc.cccc", "Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "moreThanMaxLengthMail") // shouldn't be added to
														// database
	public void lessThanMinLengthMail() {
		System.out.println("LESS THAN MIN LENGTH MAIL(5 CHARACTERS)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("lessthan", "minlength", "Correct8", "c@.c", "Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "lessThanMinLengthMail") // shouldn't be added to
														// database
	public void incorrectFormOfUserName() {
		System.out.println("INCORRECT FORM OF USERNAME");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("BADFORM", "OfUsername", "inc!orr@ect", "correct@correct12.correct",
				"Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "incorrectFormOfUserName") // shouldn't be added to
														// database
	public void usernameWithSpecialCharacter() {
		System.out.println("USERNAME WITH SPECIAL CHAR(TRYING ALL 3 ALLOWED (._-)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("Special", "CharaterInUser", "inc.orr_ec-t", "correct@correct13.correct",
				"Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "usernameWithSpecialCharacter") // should be added
																// to database
	public void maxLengthUsername() {
		System.out.println("MAX LENGTH USERNAME(20 CHAR)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("MAX", "LENGTHUSER", "u1234567890123456789", "correct@correct14.correct",
				"Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "maxLengthUsername") // shouldn't be added to
													// database
	public void moreThanMaxLengthUsername() {
		System.out.println("MORE THEN MAX LENGTH USERNAME(20+ CHAR)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("morethanMAX", "LENGTHUSER", "qwerty12345678901234567890",
				"correct@correct15.correct", "Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "moreThanMaxLengthUsername") // shouldn't be added
															// to database
	public void lessThanMinLengthUsername() {
		System.out.println("MORE THEN MAX LENGTH USERNAME(20+ CHAR)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("lessThanmin", "lengthuser", "a123", "correct@correct16.correct", "Correct",
				"Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "lessThanMinLengthUsername") // shouldn't be added
															// to database
	public void incorrectFormOfFirstAndLastName() {
		System.out.println("INCORRECT FORM OF FIRST AND LAST NAME");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("INCORRECT1", "INCORRECT!", "correct18", "correct@correct18.correct",
				"Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "incorrectFormOfFirstAndLastName") // should be
																// added to
																// database
	public void maxLengthFirstAndLastName() {
		System.out.println("MAX LENGTH FIRST AND LAST NAME(20 CHAR)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("MAXMAXMAXMAXMAXLENGT", "MAXMAXMAXMAXMAXLENGT", "correct19",
				"correct@correct20.correct", "Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "maxLengthFirstAndLastName") // should be added to
															// database
	public void minLengthFirstAndLastName() {
		System.out.println("MIN LENGTH FIRST AND LAST NAME(3 CHAR)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("min", "min", "length", "correct@correct21.correct", "Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "minLengthFirstAndLastName") // shouldn't be added
															// to database
	public void lessThanMinFirstAndLastName() {
		System.out.println("LESS THEN MIN LENGTH FIRST AND LAST NAME(3 CHAR)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("aa", "b", "lessThanMinFAndL", "correct@correct22.correct", "Correct",
				"Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "lessThanMinFirstAndLastName") // shouldn't be
															// added to database
	public void firstAndLastNameWithSpecialChars() {
		System.out.println("FIRST AND LAST NAME WITH SPECAIL CHAR)");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("specia;l", "chars#", "RandomNickName", "correct@correct23.correct",
				"Correct", "Correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "firstAndLastNameWithSpecialChars") // shouldn't be
																	// added to
																	// database
	public void differentPassAndConfirmPass() {
		System.out.println("DIFFERENT PASS AND CONFRIM PASS");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("different", "passwords", "confirm", "correct@correct25.correct", "Correct","Correct123");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "differentPassAndConfirmPass") // shouldn't be
															// added to database
	public void differentPassCases() {
		System.out.println("DIFFERENT CASE OF PASS AND CONFRIM PASS");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("different", "passwordsCases", "confirm", "correct@correct26.correct",
				"Correct", "correct");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "differentPassCases") // shouldn't be added to
													// database
	public void whiteSpaceInPass() {
		System.out.println("White space in pass");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("whitespace", "inpass", "whitespace", "correct@correct27.correct",
				"cor rect", "cor rect");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "whiteSpaceInPass") // should be added to database
	public void maxLengthPass() {
		System.out.println("MAX LENGHT PASS");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("maxpass", "lengthpass", "passmax", "correct@correct28.correct",
				"123456789012345678901234567890", "123456789012345678901234567890");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@Test(dependsOnMethods = "maxLengthPass") // shouldn't be added to database
	public void moreThanMaxLengthPass() {
		System.out.println("MORE THAN MAX LENGHT PASS");
		adminPage.clcikOnSignUpBtn();
		Sleeper.sleepTightInSeconds(1);
		adminPage.insertInputForAllFields("morethan", "morethanpass", "morethanmax", "correct@correct29.correct",
				"12345678901234567890123456789012", "12345678901234567890123456789012");
		Sleeper.sleepTightInSeconds(1);
		adminPage.clickOnSignUpBtn2();
		//Sleeper.sleepTightInSeconds(1);

		// Verification.verifyString(expected, actual, title);

		System.out.println("Test passed");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AFTER METHOD");
		//driver.findElement(By.id("Value")).sendKeys(Keys.RETURN);
		//driver.quit();
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AFTER CLASS");
		//driver.quit();
	}

}
