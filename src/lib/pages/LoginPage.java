package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.date.Property;
import lib.util.Wait;

public class LoginPage extends Page {
	
	@FindBy(id = "username")
	private WebElement usernameInputField;
	
	@FindBy(id ="password")
	private WebElement passwordInputField;
	
	@FindBy(id="loginbtn")
	private WebElement loginButton;
	
	@FindBy(className ="error")
	private WebElement errorLabel;
	
	
			
	public LoginPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		driver.manage().window().maximize();
		driver.get(Property.URL);
		PageFactory.initElements(driver, this);
		
	}
	
	/**
	 * Type username into username input field
	 * @param username (String)
	 * @return {LoginPage}
	 */
	public LoginPage typeUsername(String username){
		usernameInputField.sendKeys(username);
		return this; //this objekat(instanca) klase LoginPage
	}
	
	/**
	 * Type password into password input field
	 * @param password {String}
	 * @return {LoginPage}
	 */
	public LoginPage typePassword(String password) {
		passwordInputField.sendKeys(password);
		return this;
	}
	/**
	 * Click on Login button
	 * @return {Homepage}
	 */
	public Homepage clckOnLoginButton(){
		loginButton.click();
		return new Homepage(driver);
		
	}
	/**
	 *  Get text from error label
	 * @return {String}
	 */
	
	public String getErrorMessage(){
		return errorLabel.getText();
	}
	
	/**
	 * Click on log in button when invalid data provided
	 * @return {LoginPage}
	 */
	public LoginPage clickOnLoginButtonInvalidData(){
		loginButton.click();
		return this;
	}
	/**
	 * Clears username and password fields
	 * @return {LoginPage}
	 */
	
	public LoginPage clearUsernameAndPasswordFields(){
		usernameInputField.clear();
		passwordInputField.clear();
		return this;
		
	}

}
