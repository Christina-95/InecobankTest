package am.inecobank.pages.home.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.cards.StandartCardsPage;
import am.inecobank.pages.home.header.cards.WorldMasterCardBlackEditionPage;

public class CardsLinks extends InecoBankHeaderLinks{

	public CardsLinks(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String STANDART_CARDS = "(//a[@class='link'])[33]";
	public static final String WORLS_MASTERCARD_BLACK_EDITION = "(//a[@class='link'])[39]";
	
	@FindBy (xpath = STANDART_CARDS)
	WebElement standartCardsLink;
	
	@FindBy (xpath = WORLS_MASTERCARD_BLACK_EDITION)
	WebElement worldMasterCardBlackEditionLink;
	
	public StandartCardsPage clickOnStandartCardsLink() {
		standartCardsLink.click();
		return new StandartCardsPage(driver);
	}
	
	public void waitForStandartCardsLink() {
		wait.waitForElementToBeClickable(standartCardsLink);
	}
	
	public void waitForWorldMasterCardBlackEditionLink() {
		wait.waitForElementToBeClickable(worldMasterCardBlackEditionLink);
	}
	
	public WorldMasterCardBlackEditionPage clickOnMasterCardBlackeditionLink() {
		worldMasterCardBlackEditionLink.click();
		return new WorldMasterCardBlackEditionPage(driver);
	}
}
