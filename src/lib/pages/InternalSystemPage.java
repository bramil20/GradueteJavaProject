package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.sf.cglib.proxy.Factory;

public class InternalSystemPage {
	
	WebDriver driver;
	
	@FindBy(className="no-overflow")
	WebElement categoryDescription;
	public InternalSystemPage(WebDriver driver) {
		this.driver=driver;
		Sleeper.sleepTightInSeconds(2);
		PageFactory.initElements(driver, this);
		
	}
	/*
	 * get text from description
	 */
	public String getParagraphDescription(){
		return categoryDescription.getText();
	}
	

}
