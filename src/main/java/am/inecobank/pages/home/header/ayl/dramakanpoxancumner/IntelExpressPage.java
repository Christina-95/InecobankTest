package am.inecobank.pages.home.header.ayl.dramakanpoxancumner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class IntelExpressPage extends InecoBankHeaderLinks {

	public IntelExpressPage(WebDriver driver) {
		super(driver);
	}
	
    InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String INTEL_EXPRESS_PAGE_TITLE = "//h1[contains(text(),'Intel Express')]";
	
	@FindBy (xpath = INTEL_EXPRESS_PAGE_TITLE)
	WebElement intel_Express_Page_Title;
	
	public void waitForIntelExpressPageTitle() {
		wait.waitForElementVisibility(intel_Express_Page_Title);
	}
	
	public boolean valIntelExpressPage() {
		if (intel_Express_Page_Title.isDisplayed()) {
			System.out.println("IntelExpress page is opened");
			return true;
		}
		else return false;
	}


}
