package tests;

import org.testng.annotations.Test;

import pages.SignUpPage;
import util.Prepare;
import util.Verification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class CreatingNUser {

	private static WebDriver driver;
	SignUpPage singUpPage;

	@BeforeClass
	public void beforeClass() {
		// System.out.println("BEFORECLASS");
		// driver = Prepare.chromeDriver();
		// driver.manage().window().maximize();
		// singUpPage= new SignUpPage(driver);
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BEFORE METHOD");
		driver = Prepare.chromeDriver();
		// driver.manage().window().maximize();

		singUpPage = new SignUpPage(driver);

	}

	@Test // should added to database
	public void creatingUsers() {
		
		for(int i=1;i<=100;i++){
		System.out.println("Making of user nr"+i);
		singUpPage.clcikOnSignUpBtn();
		Sleeper.sleepTight(200);
		singUpPage.insertInputForAllFields("testing", "TESTING", "Correct"+i+"","Correct"+i+"@Correct.com", "correct","correct");
		Sleeper.sleepTight(200+i*15);
		singUpPage.clickOnSignUpBtn2();
		Sleeper.sleepTight(500+i*5);
		System.out.println(singUpPage.getTextFromLabel());
		Verification.verifyString("Successfully registered, confirm your email", singUpPage.getTextFromLabel(), "ALL SHOULD PASS");
	
		}
		System.out.println("Test passed");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AFTER METHOD");
		// driver.findElement(By.id("Value")).sendKeys(Keys.RETURN);
		// driver.quit();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AFTER CLASS");
		// driver.quit();
	}

}
