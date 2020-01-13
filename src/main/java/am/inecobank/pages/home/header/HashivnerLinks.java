package am.inecobank.pages.home.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.hashivner.HashivneriPatetnerPage;

public class HashivnerLinks extends InecoBankHeaderLinks {

	public HashivnerLinks(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String HASHIVNERI_PATETNER_LINK = "(//a[@class='link'])[1]";
	
	@FindBy (xpath = HASHIVNERI_PATETNER_LINK)
	WebElement hashivneriPatetnerLink;
	
	public void waitForHashivneriPatetnerLink() {
		wait.waitForElementVisibility(hashivneriPatetnerLink);
	}
	
	public HashivneriPatetnerPage clickOnHashivneriPatetnerLink() {
		hashivneriPatetnerLink.click();
		return new HashivneriPatetnerPage(driver);
	}
}
