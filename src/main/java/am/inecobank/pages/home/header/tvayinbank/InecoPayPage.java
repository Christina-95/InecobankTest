package am.inecobank.pages.home.header.tvayinbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;

public class InecoPayPage extends InecoBankBasePage {

	public InecoPayPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String INCH_E_INECO_PAY_TITLE = "(//div[@class='inecopay__title' and text()='pay'])[2]";

	@FindBy (xpath = INCH_E_INECO_PAY_TITLE)
	WebElement incheInecoPayTitle;
	
	public void waitForIncheInecoPayTitle() {
		wait.waitForElementVisibility(incheInecoPayTitle);
	}
	
	public boolean validateIncheInecoPayTitle() {
		if(incheInecoPayTitle.isDisplayed()) {
			System.out.println("InecoPay page is opened");
			return true;
		}
		else return false;
	}
}
