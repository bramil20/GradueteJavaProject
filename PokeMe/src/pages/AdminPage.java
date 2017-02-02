package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import data.User;
import util.Wait;

public class AdminPage {

	// @FindBy(className = "btn btn-warning pull-left")
	// private WebElement signUpButton;
	// @FindBy(xpath = "//button[contains(@ng-click, 'open')]")
	// private WebElement signUpButton;

	@FindBy(xpath = "//button[contains(@class, 'left')]")
	private WebElement signUpButton;

	@FindBy(xpath = "//input[contains(@name, 'first')]")
	private WebElement firstNameInputField;

	@FindBy(xpath = "//input[contains(@name, 'last')]")
	private WebElement lastNameInputField;

	@FindBy(xpath = "//input[contains(@name, 'nick')]")
	private WebElement nickNameInputField;

	@FindBy(xpath = "//input[contains(@name, 'email')]")
	private WebElement emailInputField;

	@FindBy(xpath = "//input[contains(@ng-model, 'password')]")
	private WebElement passInputField;

	@FindBy(xpath = "//input[contains(@name, 'passwordRepeated')]") // ng-disabled
	private WebElement passwordRepeatInputField;

	@FindBy(xpath = "//button[contains(@ng-disabled, 'invalid')]")
	private WebElement signUpButton2;

	@FindBy(xpath = "//*[@id='toast-container']/div/div/div/div")
	private WebElement infoMessage;
	
	@FindBy(xpath= "/html/body/div/div/div/div/nav/div[3]/div/button") 
	private WebElement logout;

	protected WebDriver driver;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		driver.get(User.ADMINURL);
		PageFactory.initElements(driver, this);
	}

	public AdminPage clcikOnSignUpBtn() {
		signUpButton.click();
		return this;
	}

	public AdminPage insertInputForAllFields(String firstName, String lastName, String nick, String email,
			String password, String passwordRepeat) {
		firstNameInputField.sendKeys(firstName);
		lastNameInputField.sendKeys(lastName);
		nickNameInputField.sendKeys(nick);
		emailInputField.sendKeys(email);
		passInputField.sendKeys(password);
		passwordRepeatInputField.sendKeys(passwordRepeat);
		return this;
	}

	public AdminPage clickOnSignUpBtn2() {
		signUpButton2.click();
		return this;

	}

	public String getInfoFromMessage() {
		Wait.untilWebElementVisible(driver, infoMessage, 2);
		return infoMessage.getText();
	}

	public SignUpPage clickLogOut() {
		Actions action= new Actions(driver);
		action.moveToElement(logout).click().perform();
		//logout.click();
		return new SignUpPage(driver);
	}

}
