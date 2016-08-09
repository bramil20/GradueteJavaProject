package test.cdd;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.IsChecked;

import lib.date.Property;
import lib.pages.CDDPage;
import lib.pages.Homepage;
import lib.pages.LoginPage;
import lib.pages.SearchResultPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class CheckBoxFunctionality {

	boolean b = false;
	boolean isChecked = false;
	String message;

	private WebDriver driver;
	LoginPage loginPage;
	Homepage homepage;
	SearchResultPage searchResultPage;
	CDDPage cddP;

	@Test
	public void f() {

		loginPage.typeUsername(Property.username).typePassword(Property.password);
		Sleeper.sleepTightInSeconds(3);

		homepage = loginPage.clckOnLoginButton();

		message = homepage.getTextFromLoginInfoLabel();
		System.out.println(message);

		assert message.contains("You are logged in as") : "You are not logged in. Test Failed";

		homepage.typeSearchValueIntoSearchField(Property.searchText);
		searchResultPage = homepage.clickOnGoButton();
		cddP = searchResultPage.clickOnCDDLink();

		cddP.checkInCheckBox();
		isChecked = true;
		loginPage = cddP.clickOnLogOutFromEndavaUni();

		loginPage.typeUsername(Property.username).typePassword(Property.password);
		Sleeper.sleepTightInSeconds(3);

		homepage = loginPage.clckOnLoginButton();

		message = homepage.getTextFromLoginInfoLabel();
		System.out.println(message);

		assert message.contains("You are logged in as") : "You are not logged in. Test Failed";

		homepage.typeSearchValueIntoSearchField(Property.searchText);
		searchResultPage = homepage.clickOnGoButton();
		cddP = searchResultPage.clickOnCDDLink();
		cddP.checkInCheckBox();
		loginPage = cddP.clickOnLogOutFromEndavaUni();

		assert cddP.isCheckBoxSelected() : "Check box should be selected";

		

		loginPage = cddP.clickOnLogOutFromEndavaUni();
		System.out.println("Test passed");

		b = true;

	}

	@BeforeClass
	public void beforeClass() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}

	@AfterClass
	public void afterClass() {

		driver.quit();
		if(isChecked){
			driver = new FirefoxDriver();
			loginPage = new LoginPage(driver);
			
			loginPage.typeUsername(Property.username).typePassword(Property.password);
			Sleeper.sleepTightInSeconds(3);

			homepage = loginPage.clckOnLoginButton();

			message = homepage.getTextFromLoginInfoLabel();
			System.out.println(message);

			assert message.contains("You are logged in as") : "You are not logged in. Test Failed";

			homepage.typeSearchValueIntoSearchField(Property.searchText);
			searchResultPage = homepage.clickOnGoButton();
			cddP = searchResultPage.clickOnCDDLink();
			cddP.checkInCheckBox();
			loginPage = cddP.clickOnLogOutFromEndavaUni();

			assert cddP.isCheckBoxSelected() : "Check box should be selected";
			
			loginPage = cddP.clickOnLogOutFromEndavaUni();
			
			driver.quit();
		}

		if (b) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
		
	}

}
