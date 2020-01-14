package am.inecobank.pages.business.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.business.BusinessPage;

public class BusinessHeaderLinks extends BusinessPage {

	public BusinessHeaderLinks(WebDriver driver) {
		super(driver);
	}

	InecoBankBasePage wait = new InecoBankBasePage(driver);
	InecoBankBasePage actions = new InecoBankBasePage(driver);

	
	public static final String HASHIVNERI_KARAVARUM = "(//span[@class='secondaryNav__action secondaryNav__action--noAction'])[1]";
	
	@FindBy (xpath = HASHIVNERI_KARAVARUM)
	WebElement hashivneriKaravarumLink;
	
	public void waitForHashivneriKaravarum() {
		wait.waitForElementVisibility(hashivneriKaravarumLink);
	}
	
	public void moveToHashivneriKaravarum() {
		actions.moveToElement(hashivneriKaravarumLink);
	}
	
	
}
