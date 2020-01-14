package am.inecobank.pages.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.InecoBankHomePage;

public class InecoBankRegisterPage extends InecoBankHomePage {

	public InecoBankRegisterPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String REGISTER_PAGE_TITLE = "(//span[@class='btn__text'])[2]";
	
	@FindBy (xpath = REGISTER_PAGE_TITLE)
	WebElement regiterPageTitle;

	
	public void waitForRegisterPageTitle() {
		wait.waitForElementVisibility(regiterPageTitle);
	}
	
	public boolean validateRegisterPageTitle() {
		if (regiterPageTitle.isDisplayed()) {
			System.out.println("Register page is opened");
			return true;
		}
		else return false;
	}
}
