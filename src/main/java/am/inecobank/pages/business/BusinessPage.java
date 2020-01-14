package am.inecobank.pages.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.InecoBankHomePage;

public class BusinessPage extends InecoBankHomePage {

	public BusinessPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String HASHIVNERI_KARAVARUM_TITLE = "(//h3[@class='promotion__title'])[1]";
	
	@FindBy (xpath = HASHIVNERI_KARAVARUM_TITLE)
	WebElement hashivneriKaravarumTitle;
	
	public void waitForHashivneriKaravarumTitle() {
		wait.waitForElementVisibility(hashivneriKaravarumTitle);
	}
	
	public boolean validateHashivneriKaravarumTitle() {
		if(hashivneriKaravarumTitle.isDisplayed()) {
			System.out.println("Business page is opened");
			return true;
		}		
		else return false;
	}


}
