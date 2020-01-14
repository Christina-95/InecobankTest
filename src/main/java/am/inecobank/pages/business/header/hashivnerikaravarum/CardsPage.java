package am.inecobank.pages.business.header.hashivnerikaravarum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.business.header.BusinessHeaderLinks;

public class CardsPage extends BusinessHeaderLinks {

	public CardsPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String CARDS_PAGE_TITLE = "//h1[@class='content__title']";
	
	@FindBy (xpath = CARDS_PAGE_TITLE)
	WebElement cardsPageTitle;
	
	public void waitForCardsPageTitle() {
		wait.waitForElementVisibility(cardsPageTitle);
	}
	
	public boolean validateCardsPage() {
		if(cardsPageTitle.isDisplayed()) {
			System.out.println("Cards page is opened");
			return true;
		}		
		else return false;
	}


}
