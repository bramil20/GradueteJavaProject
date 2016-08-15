package lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage extends Page {

	private By emailL= new By.ByCssSelector("a[href*='mailto:']");
	//@FindBy(linkText= "ivecluj.1@endava.com")
	@FindBy(css = "a[href*='mailto:']")
	WebElement emailLabel;
	
	@FindBy(linkText= "Career Development Discussion")
	WebElement careerDevelopmentDiscussionLabel;
	
				
	MyProfilePage(WebDriver driver) {
		super(driver);
		//this.driver=driver;
		//Sleeper.sleepTightInSeconds(3);
		waitForPageToBeLoaded(driver, emailL, 5);
		//PageFactory.initElements(driver, this);
		
				
	}
	public String getEmailAddress(){
		return emailLabel.getText();
				
	}
	
	public String getTextFromDevelopmentLabel(){
		return careerDevelopmentDiscussionLabel.getText();
	}
	
	
}
