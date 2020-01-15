package am.inecobank.pages.business.header.finansavorum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.business.header.FinansavorumLinks;

public class ArevtriFinansavorumPage extends FinansavorumLinks {

	public ArevtriFinansavorumPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
    public static final String AREVTRI_FINANSAVORUM_TITLE = "//h1[@class='content__title']";
	
	@FindBy (xpath = AREVTRI_FINANSAVORUM_TITLE)
	WebElement arevtriFinansavorumTitle;

	
	public void waitForArevtriFinansavorumTitleTitle() {
		wait.waitForElementVisibility(arevtriFinansavorumTitle);
	}
	
	public boolean validateArevtriFinansavorumPage() {
		if (arevtriFinansavorumTitle.isDisplayed()) {
			System.out.println(" Arevtri Finansavorum page is open");
			return true;
		}
		else return false;
	}

}
