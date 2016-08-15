package lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends Page{
	
	private By cddL= new By.ByLinkText("Career Development Discussion");
	@FindBy(linkText ="Career Development Discussion")
	public WebElement cddLink;
	
	
	
	public SearchResultPage(WebDriver driver){
		super(driver);
		//this.driver = driver;
		//Sleeper.sleepTightInSeconds(5);
		waitForPageToBeLoaded(driver, cddL, 5);
		//PageFactory.initElements(driver, this);
	}
	/**
	 * Click on cdd link	
	 * @return	{CDDPage}
	 */
	
	public CDDPage clickOnCDDLink(){
		cddLink.click();
		return new CDDPage(driver);
	}
	
	

}
