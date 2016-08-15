package test.login;

import org.testng.annotations.Test;

import lib.date.Property;
import lib.pages.Homepage;
import lib.pages.LoginPage;
import lib.pages.SearchResultPage;
import lib.util.Prepere;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class Login {

	private WebDriver driver;
	LoginPage loginPage;
	Homepage homepage;
	
	@BeforeClass
	public void beforeClass() {
		driver = Prepere.chromeDriver();
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}

	@Test
	public void f() {

		//try {
			loginPage.typeUsername(Property.username).typePassword(Property.password);
			Sleeper.sleepTightInSeconds(4);

			homepage = loginPage.clckOnLoginButton();

			String message = homepage.getTextFromLoginInfoLabel();
			System.out.println(message);

			assert message.contains("You are logged in as") : "You are not logged in. Test Failed";
			
			
			
			System.out.println("Test passed");
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
	}

	@AfterClass()
	public void afterClass() {

		driver.quit();

	}
}
