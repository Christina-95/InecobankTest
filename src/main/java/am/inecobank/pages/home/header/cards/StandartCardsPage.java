package am.inecobank.pages.home.header.cards;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class StandartCardsPage extends InecoBankHeaderLinks{

	public StandartCardsPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);

	public static final String STANDART_CARDS_PAGE_TITLE = "//h1[@class='content__title']";
	public static final String ARCA_CARD_TOXNEL_HAYT_BTN = "(//span[@class='btn__text'])[10]";
	
	@FindBy (xpath = STANDART_CARDS_PAGE_TITLE)
	WebElement standartCardsPageTitle;
	
	@FindBy (xpath = ARCA_CARD_TOXNEL_HAYT_BTN)
	WebElement arCaToxnelHaytBtn;
	
	public void waitForStandartCardsPageTitle() {
		wait.waitForElementVisibility(standartCardsPageTitle);
	}
	
	public boolean valStandartCardsPage() {
		if (standartCardsPageTitle.isDisplayed()) {
			System.out.println("Standart cards page is opened");
			return true;
		}
		else return false;	
	}
	
	public void waitForArCaCardToxnelHaytBtn() {
		wait.waitForElementToBeClickable(arCaToxnelHaytBtn);
	}
	
	public ArCaCardOrderPage clickOnToxnelHaytBtn() {
		arCaToxnelHaytBtn.click();
		return new ArCaCardOrderPage(driver);
	}
	
	
}
