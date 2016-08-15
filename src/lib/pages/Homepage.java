package lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.date.Property;
import lib.util.Wait;

public class Homepage extends Page {

	@FindBy(id = "shortsearchbox")
	private WebElement searchInputField;
	
	private By searchField = new By.ById("shortsearchbox");

	// @FindBy(css = "input[type= 'submit'][value= 'Go']")
	@FindBy(xpath = "//input[contains(@value, 'Go') and contains(@type, 'submit')]")
	private WebElement goButton;

	@FindBy(xpath = "//a[contains(@title, 'My Account')]")
	private WebElement myAccountLink;

	@FindBy(css = "a[title = 'My Profile']")
	private WebElement myProfileLink;

	@FindBy(css = "a[title = 'Endava University']")
	private WebElement endavaUniversityLink;

	@FindBy(css = "a[title = 'Internal systems self help']")
	private WebElement internalSystemSelfHelpLink;

	private By goBtn = new ByXPath("//input[contains(@value, 'Go') and contains(@type, 'submit')]");

	public Homepage(WebDriver driver) {
		super(driver);
		//this.driver=driver;
		waitForPageToBeLoaded(driver, goBtn, 5);
		//dPageFactory.initElements(driver, this);
	}

	/**
	 * Type search value into search field
	 * 
	 * @param value
	 *            {String}
	 * @return {HomePage}
	 */
	public Homepage typeSearchValueIntoSearchField(String value) {
		System.out.println("typeSearchValueIntoSearchField(" + value + ")");
		Wait.untilWebElementPresent(driver, searchField, 3);
		searchInputField.sendKeys(value);
		return this;
	}

	/**
	 * Click on go button
	 * @return {SearchResultPage}
	 */
	public SearchResultPage clickOnGoButton() {
		System.out.println("clickOnGoButton()");
		// goButton.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", goButton);
		return new SearchResultPage(driver);
	}

	/**
	 * Click on dropdown menu my account
	 * 
	 * @return {HomePage}
	 */
	public Homepage clickOnMyAccount() {
		myAccountLink.click();
		return this;

	}

	/**
	 * Click on dropdown menu my profile
	 * 
	 * @return {MyProfilePage}
	 */
	public MyProfilePage clickOnMyProfile() {
		myProfileLink.click();
		return new MyProfilePage(driver);

	}

	/**
	 * Click on dropdown menu endava university
	 * 
	 * @return{HomePage}
	 */
	public Homepage clickOnEndavaUniversity() {
		endavaUniversityLink.click();
		return this;

	}

	/**
	 * Click on dropdown menu internal system self help
	 * 
	 * @return{InternalSystemPage}
	 */
	public InternalSystemPage clickOnInternalSystemSelfHelpLink() {
		internalSystemSelfHelpLink.click();
		return new InternalSystemPage(driver);
	}

}