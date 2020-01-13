package am.inecobank.pages.home.header.ayl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class ApahovagrutyunPage extends InecoBankHeaderLinks {

	public ApahovagrutyunPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String APAHOVAGRUTYUN_PAGE_TITLE = "//h1[@class='content__title']";
	
	@FindBy (xpath = APAHOVAGRUTYUN_PAGE_TITLE)
	WebElement apahovagrutyunPageTitle;

	public void waitForApahovagrutyunPageTitle() {
		wait.waitForElementVisibility(apahovagrutyunPageTitle);
	}
	
	public boolean validateAppaPage() {
		if (apahovagrutyunPageTitle.isDisplayed()) {
			System.out.println("Appa page is opened");
			return true;
		}
		else return false;
	}
}
