package lib.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.date.Property;

public class Homepage {
	
	@FindBy(className = "logininfo")
	private WebElement loginInfoLabel;
	
	@FindBy(id= "shortsearchbox")
	private WebElement searchInputField;
	
	//@FindBy(css= "input[type='submit'][value='Go']")
	//private WebElement goButton;
	
	@FindBy(xpath="//input[contains(@value,'Go') and contains(@type, 'submit')]")
	private WebElement goButton;
	
	//@FindBy(className= "dropdown-toggle")
	@FindBy(css= "a[title='My Account']")
	WebElement myAccount;
	
	@FindBy(css="a[title='My Profile']")
	WebElement myProfile;
	
	@FindBy(css="a[title='Endava University']")
	WebElement endavaUniLink;
	
	@FindBy(css="a[title='Internal systems self help']")
	WebElement inferalSystemSubMenu;
	
	private WebDriver driver;
	
	public Homepage(WebDriver driver){
		this.driver=driver;
	//	driver.get(Property.URLSEARCH);
		Sleeper.sleepTightInSeconds(4);
		PageFactory.initElements(driver, this);
	}
	/**
	 * Get text from login info label
	 * @return {String}
	 */
	public String getTextFromLoginInfoLabel(){
		return loginInfoLabel.getText();
		
	}
	/**
	 * Type search value into search field
	 * @param value {String}
	 * @return {Homepage}
	 */
	public Homepage typeSearchValueIntoSearchField(String value){
		searchInputField.sendKeys(value);
		return this;
	}
	/**
	 * Click on go button
	 * @return {SearcResultPage}
	 */
	public SearchResultPage clickOnGoButton(){
		//goButton.click();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", goButton);
		return new SearchResultPage(driver);
		
	}
	/**
	 * CLick dropdown menu my account
	 * @return {Homepage}
	 */
	
	public Homepage clickOnMyAccount(){
		myAccount.click();
		return this;
	}
	/**
	 * Click my profile
	 * @return {MyProfilePage}
	 */
	public MyProfilePage clickOnMyProfile(){
		myProfile.click();
		return new MyProfilePage(driver);
	}
	/**
	 * 
	 * @return {Homepage}
	 */
	public Homepage clickOnEndavaUniMenu(){
		endavaUniLink.click();
		return this;
	}
	/**
	 * Click on sub menu internal
	 * @return {InternalSystemPage}
	 */
	
	public InternalSystemPage clickOnSubMenuInternal(){
		inferalSystemSubMenu.click();
		return new InternalSystemPage(driver);
	}

}
