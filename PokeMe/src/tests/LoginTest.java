package tests;

import org.testng.annotations.Test;

import data.CSVReader;
import data.MySql;
import data.User;
import pages.AdminPage;
import pages.SignUpPage;
import util.Prepare;
import util.Verification;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class LoginTest {
	WebDriver driver;
	SignUpPage signUpPage;
	AdminPage adminPage;
	String message;

	MySql sql = new MySql();

	ArrayList<User> users = new ArrayList<>();

	@BeforeClass
	public void beforeMethod() {

		driver = Prepare.chromeDriver();
		// driver.manage().window().maximize();
		signUpPage = new SignUpPage(driver);

	}

	/**
	 * This method takes one random admin from DB and try to login with it
	 */
	@Test
	public void login200() {
		User u = new User(sql.getAnAdmin().getEmail(), sql.getAnAdmin().getEmail());
		adminPage = signUpPage.successfulLogin(u);
		Sleeper.sleepTight(750);

		Verification.verifyString("You are logged in", adminPage.getInfoFromMessage(),
				"Logging in with successful user");
		Sleeper.sleepTight(600);

		signUpPage = adminPage.clickLogOut();

		Sleeper.sleepTight(750);
	}

	/**
	 * This method takes one user from CSV file and trys to login with it
	 */
	@Test(dependsOnMethods = "login200")
	public void login401() {

		Random rand= new Random();
		
		users= new CSVReader().csvValidUser();
		signUpPage.unauthorizedLogin(users.get(rand.nextInt(10)));
		Sleeper.sleepTight(750);

		Verification.verifyString("You don't have permission to access.", adminPage.getInfoFromMessage(),
				"Logging in with unaouthorized user");
		
		//signUpPage.unauthorizedLogin()
	}
	
	@Test(dependsOnMethods= "login401")
	//public void login
	@AfterMethod
	public void afterMethod() {

	}

	@AfterClass
	public void afterClass() {

	}

}
