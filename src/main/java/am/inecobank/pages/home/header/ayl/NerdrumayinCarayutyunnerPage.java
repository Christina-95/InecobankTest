package am.inecobank.pages.home.header.ayl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class NerdrumayinCarayutyunnerPage extends InecoBankHeaderLinks {

	public NerdrumayinCarayutyunnerPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String NERDRUMAYIN_CARAYUTYUNNER_PAGE_TITLE = "//h1[@class='content__title']";
	
	@FindBy (xpath = NERDRUMAYIN_CARAYUTYUNNER_PAGE_TITLE)
	WebElement nerdrumayinPageTitle;
	
	public void waitForNerdrumayinPageTitle() {
		wait.waitForElementVisibility(nerdrumayinPageTitle);
	}
	
	public boolean validateNerdrumayinPage() {
		if (nerdrumayinPageTitle.isDisplayed()) {
			System.out.println("Nerdrumayin Carayutyunner page is opened");
			return true;
		}
		else return false;
	}
}
