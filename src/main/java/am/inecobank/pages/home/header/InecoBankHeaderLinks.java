package am.inecobank.pages.home.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.InecoBankHomePage;

public class InecoBankHeaderLinks extends InecoBankHomePage {

	public InecoBankHeaderLinks(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	InecoBankBasePage actions = new InecoBankBasePage(driver);
	
	public static final String AYL = "(//span[@class='secondaryNav__action secondaryNav__action--noAction'])[5]";
	public static final String TVAYIN_BANK = "(//span[@class='secondaryNav__action secondaryNav__action--noAction'])[4]";
	public static final String CARDS = "//a[@class='secondaryNav__action']";
	public static final String HASHIVNER = "(//span[@class='secondaryNav__action secondaryNav__action--noAction'])[1]";
	
	@FindBy (xpath = AYL)
	WebElement aylLink;
	
	@FindBy (xpath = TVAYIN_BANK)
	WebElement tvayinBankLink;
	
	@FindBy (xpath = CARDS)
	WebElement cardsLink;
	
	@FindBy (xpath = HASHIVNER)
	WebElement hashivnerLink;
	
	public void waitForAyl() {
		wait.waitForElementVisibility(aylLink);
	}
	
	public void moveToAyl() {
		actions.moveToElement(aylLink);
	}
	
	public void waitForTvayinBank() {
		wait.waitForElementVisibility(tvayinBankLink);
	}
	
	public void moveToTvayinBank() {
		actions.moveToElement(tvayinBankLink);
	}
	
	public void waitForCards() {
		wait.waitForElementVisibility(cardsLink);
	}
	
	public void moveToCards() {
		actions.moveToElement(cardsLink);
	}
	
	public void waitForHashivner() {
		wait.waitForElementVisibility(hashivnerLink);
	}
	
	public void moveToHashivner() {
		actions.moveToElement(hashivnerLink);
	}
}
