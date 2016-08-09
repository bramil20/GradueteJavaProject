package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

	@FindBy(linkText= "ivecluj.1@endava.com")
	WebElement emailLabel;
	
	@FindBy(linkText= "Career Development Discussion")
	WebElement careerDevelopmentDiscussionLabel;
	
	@FindBy(linkText= "Log out")
	WebElement logOutFromMyProfile;
	
	private WebDriver driver;
	
	MyProfilePage(WebDriver driver) {
		this.driver=driver;
		Sleeper.sleepTightInSeconds(3);
		PageFactory.initElements(driver, this);
		
	
		
		
	}
	public String getEmailAddress(){
		return emailLabel.getText();
				
	}
	
	public String getTextFromDevelopmentLabel(){
		return careerDevelopmentDiscussionLabel.getText();
	}
	
	public LoginPage clickLogout(){
		logOutFromMyProfile.click();
		Sleeper.sleepTightInSeconds(2);
		return new LoginPage(driver);
	}
}
