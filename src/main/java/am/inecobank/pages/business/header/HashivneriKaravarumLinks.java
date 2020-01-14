package am.inecobank.pages.business.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;


public class HashivneriKaravarumLinks extends BusinessHeaderLinks {

	public HashivneriKaravarumLinks(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String YNTACIK_HASHIVNER_LINK = "(//a[@class='link'])[1]";
	public static final String CARDS_LINK = "(//a[@class='link'])[2]";
	
	@FindBy (xpath = YNTACIK_HASHIVNER_LINK)
	WebElement yntacik_Hashivner_Link;
	
	@FindBy (xpath = CARDS_LINK)
	WebElement cards_Link;
	
	public void waitForCardsLink() {
		wait.waitForElementToBeClickable(cards_Link);
	}
	
	public boolean validateCardsLink() {
		if (cards_Link.isDisplayed()) {
			System.out.println("Cards link is valid ");
			return true;
		}
		else return false;
	}
	
	public void waitForYntacikHashivnerLink() {
		wait.waitForElementToBeClickable(yntacik_Hashivner_Link);
	}
	
	public boolean validateYntacikHashivnerLink() {
		if(yntacik_Hashivner_Link.isDisplayed()) {
			System.out.println("Yntacik hashivner link is valid ");
			return true;
		}
		else return false;
	}

}
