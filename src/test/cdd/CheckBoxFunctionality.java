


package test.cdd;

import org.testng.annotations.Test;

import lib.date.Property;
import lib.pages.CDDPage;
import lib.pages.Homepage;
import lib.pages.LoginPage;
import lib.pages.SearchResultPage;
import lib.util.Prepere;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CheckBoxFunctionality {

	private static WebDriver driver;

	boolean b = false;
	boolean isCheckd = false;

	LoginPage loginPage;
	Homepage homePage;
	SearchResultPage searchResultPage;
	CDDPage cddPage;

	String message;

	@BeforeClass
	public void beforeClass() {
		driver= Prepere.chromeDriver();
		System.out.println("Step: Go to app url.");
		loginPage = new LoginPage(driver);

	}

	@Test(groups = {"checkbox"})
	public void login() {

		try {
			System.out.println("Step: Login.");
			loginPage.typeUsername(Property.username).typePassword(Property.password);
			homePage = loginPage.clckOnLoginButton();

			System.out.println("Step: Verify successful login.");
			message = homePage.getTextFromLoginInfoLabel();
			System.out.println(message);			
			assert message.contains("You are logged in as") : "You are not logged in. Test Failed.";

			System.out.println("Step: Search app for 'career'.");
			homePage.typeSearchValueIntoSearchField(Property.searchText);
			searchResultPage = homePage.clickOnGoButton();
			
			System.out.println("Step: Click on cdd link.");
			cddPage = searchResultPage.clickOnCDDLink();

			System.out.println("Step: check first checkbox.");
			cddPage.checkInCheckBox();
			isCheckd = true;

			System.out.println("Step: Log out.");
			loginPage = cddPage.clickOnLogOutFromEndavaUni();

			System.out.println("Step: Login.");
			loginPage.typeUsername(Property.username).typePassword(Property.password);
			homePage = loginPage.clckOnLoginButton();

			System.out.println("Step: Verify successful login.");
			message = homePage.getTextFromLoginInfoLabel();
			System.out.println(message);
			assert message.contains("You are logged in as") : "You are not logged in. Test Failed.";

			System.out.println("Step: Search app for 'career'.");
			homePage.typeSearchValueIntoSearchField("career");
			searchResultPage = homePage.clickOnGoButton();
			
			System.out.println("Step: Click on cdd link.");
			cddPage = searchResultPage.clickOnCDDLink();

			System.out.println("Step: Verify checkbox is checked.");
			assert cddPage.isCheckBoxSelected() : "Check box should be selected";

			System.out.println("Step: Log out.");
			loginPage = cddPage.clickOnLogOutFromEndavaUni();

			b = true;
		} catch (Exception e) {
			throw e;
		}
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {

		System.out.println("AfterClass: Kill the driver.");
		driver.quit();

		if (isCheckd) {
			try {
				System.out.println("AfterClass: Revert to default.");
				driver =  Prepere.chromeDriver();
				loginPage = new LoginPage(driver);
				loginPage.typeUsername(Property.username).typePassword(Property.password);
				homePage = loginPage.clckOnLoginButton();
				message = homePage.getTextFromLoginInfoLabel();
				System.out.println(message);
				assert message.contains("You are logged in as") : "You are not logged in. Test Failed.";
				homePage.typeSearchValueIntoSearchField("career");
				searchResultPage = homePage.clickOnGoButton();
				cddPage = searchResultPage.clickOnCDDLink();
				
				assert cddPage.isCheckBoxSelected() : "Check box should be selected";
				cddPage.uncheckInCheckBox();
				loginPage = cddPage.clickOnLogOutFromEndavaUni();
				driver.quit();
			} catch (Exception e) {
				throw e;
			}
		}

		if (b) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

		

	}

}
 

