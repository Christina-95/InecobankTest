package am.inecobank.pages.home.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.cards.StandartCardsPage;
import am.inecobank.pages.home.header.cards.VisaClassicCardOrderPage;
import am.inecobank.pages.home.header.cards.WorldMasterCardBlackEditionPage;

public class CardsLinks extends InecoBankHeaderLinks{

	public CardsLinks(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String STANDART_CARDS = "(//a[@class='link'])[33]";
	public static final String WORLS_MASTERCARD_BLACK_EDITION = "(//a[@class='link'])[39]";
	public static final String VISA_CLASSIC_LINK = "(//a[@class='link'])[36]";
	public static final String MASTER_CARD_STANDART_LINK = "(//a[@class='link'])[35]";
	public static final String MASTER_CARD_GOLD_LINK = "(//a[@class='link'])[37]";
	public static final String VISA_GOLD_LINK = "(//a[@class='link'])[38]";

	
	@FindBy (xpath = STANDART_CARDS)
	WebElement standartCardsLink;
	
	@FindBy (xpath = WORLS_MASTERCARD_BLACK_EDITION)
	WebElement worldMasterCardBlackEditionLink;
	
	@FindBy (xpath = VISA_CLASSIC_LINK)
	WebElement visaClassicLink;
	
	@FindBy (xpath = MASTER_CARD_STANDART_LINK)
	WebElement masterCardStandartLink;
	
	@FindBy (xpath = MASTER_CARD_GOLD_LINK)
	WebElement masterCardGoldLink;
	
	@FindBy (xpath = VISA_GOLD_LINK)
	WebElement visaGoldLink;
	
	
	
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
	
	public void waitForVisaClassicLink() {
		wait.waitForElementToBeClickable(visaClassicLink);
	}
	
	public VisaClassicCardOrderPage clickOnVisaClassicLink() {
		visaClassicLink.click();
		return new VisaClassicCardOrderPage(driver);
	}
}
