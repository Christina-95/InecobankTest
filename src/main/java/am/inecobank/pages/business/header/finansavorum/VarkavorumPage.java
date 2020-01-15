package am.inecobank.pages.business.header.finansavorum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.business.header.FinansavorumLinks;

public class VarkavorumPage extends FinansavorumLinks {

	public VarkavorumPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String FINANSAVORUM_DZER_BUSINESSI_HAMAR_TITLE = "//h1[@class='content__title']";
	
	@FindBy (xpath = FINANSAVORUM_DZER_BUSINESSI_HAMAR_TITLE)
	WebElement finansavorumDzerBusinessiHamarTitle;

	
	public void waitForFinansavorumPageTitle() {
		wait.waitForElementVisibility(finansavorumDzerBusinessiHamarTitle);
	}
	
	public boolean validateFinansavorumPage() {
		if (finansavorumDzerBusinessiHamarTitle.isDisplayed()) {
			System.out.println("Finansavorum dzer businessi hamar page is open");
			return true;
		}
		else return false;
	}

}
