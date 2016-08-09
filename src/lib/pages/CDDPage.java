package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CDDPage {
	
	//@FindBy(css= "input[type='submit'][value='Go']")
	@FindBy(xpath="//input[contains(@type,'image') and contains(@title, 'CD Animation Scripts')") //CD Animation Scripts
	private WebElement checkBox;
	
	@FindBy(linkText="Log out") //mapirani elementi idu prvo odma ispod klase
	private WebElement logOutLink;
	
	private WebDriver driver;
	
	public CDDPage(WebDriver driver){
		this.driver=driver;
		Sleeper.sleepTightInSeconds(5);
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Check in check box
	 * return {CDDPage}
	 */
	
	public CDDPage checkInCheckBox(){
		if(!isCheckBoxSelected()){
		checkBox.click();
		}
		Sleeper.sleepTightInSeconds(2);
		return this;
	}
	
	public CDDPage uncheckInCheckBox(){
		if(isCheckBoxSelected()){
		checkBox.click();
		}
		Sleeper.sleepTightInSeconds(2);
		return this;
	}
	/**
	 * is check box selected
	 * @return {boolean}
	 */
	
	public boolean isCheckBoxSelected(){
		String attributeValue= checkBox.getAttribute("title"); //uzimamo iz CSS vrednost
		if(attributeValue.contains("not")){
			return true;
		}
		else return false;
	}
	/**
	 * clcik on log out link to log out from endava university
	 * @return {LoginPage}
	 */
	public LoginPage clickOnLogOutFromEndavaUni(){
		logOutLink.click();
		Sleeper.sleepTightInSeconds(3);
		return new LoginPage(driver);
	}

}
