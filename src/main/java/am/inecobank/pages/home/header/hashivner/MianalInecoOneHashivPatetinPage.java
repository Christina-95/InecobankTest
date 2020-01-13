package am.inecobank.pages.home.header.hashivner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class MianalInecoOneHashivPatetinPage extends InecoBankHeaderLinks {

	public MianalInecoOneHashivPatetinPage(WebDriver driver) {
		super(driver);
	}

	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String MIANAL_INECO_ONE_HASHIV_PATETIN_PAGE_TITLE = "//h3[@class='title']";
	
	@FindBy (xpath = MIANAL_INECO_ONE_HASHIV_PATETIN_PAGE_TITLE)
	WebElement mianalInecoOneHashivPatetinPageTitle;
	
	public void waitForMianalInecoOnePageTitle() {
		wait.waitForElementVisibility(mianalInecoOneHashivPatetinPageTitle);
	}
	
	public boolean valiInecoOnePage() {
		if(mianalInecoOneHashivPatetinPageTitle.isDisplayed()) {
			System.out.println("Mianal Ineco One hashiv patetin page is opened");
			return true;
		}
		else return false;
	}
}
