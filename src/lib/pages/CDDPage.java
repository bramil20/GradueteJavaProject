package lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;


public class CDDPage extends Page{

	@FindBy(xpath = "//input[contains(@title, 'CDD')]")
	private WebElement checkBox;
	
	private By byFirstCheckBox = new By.ByXPath("//input[contains(@title, 'CDD')]");

	public CDDPage(WebDriver driver) {
		super(driver);
		waitForPageToBeLoaded(driver, byFirstCheckBox, 3);
	}

	/**
	 * Check on first check box
	 * 
	 * @return {CDDPage}
	 */
	public CDDPage checkInCheckBox() {
		if (!isCheckBoxSelected()) {
			checkBox.click();
			Sleeper.sleepTightInSeconds(2);
		}		
		return this;
	}
	
	/**
	 * Uncheck on first check box
	 * 
	 * @return {CDDPage}
	 */
	public CDDPage uncheckInCheckBox() {
		if (isCheckBoxSelected()) {
			checkBox.click();
			Sleeper.sleepTightInSeconds(2);
		}		
		return this;
	}

	/**
	 * Is first check box selected
	 * 
	 * @return {boolean}
	 */
	public boolean isCheckBoxSelected() {
		String attributeValue = checkBox.getAttribute("title");
		if (attributeValue.contains("Mark as not")) {
			return true;
		} else
			return false;
	}

}