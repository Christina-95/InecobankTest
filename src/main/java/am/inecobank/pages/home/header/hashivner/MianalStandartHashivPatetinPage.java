package am.inecobank.pages.home.header.hashivner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class MianalStandartHashivPatetinPage  extends InecoBankHeaderLinks {

	public MianalStandartHashivPatetinPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String MIANAL_STANDART_HASHIV_PATETIN_PAGE_TITLE = "//h3[@class='title']";
	
	@FindBy (xpath = MIANAL_STANDART_HASHIV_PATETIN_PAGE_TITLE)
	WebElement mianalStandartHashivPatetinPageTitle;
	
	public void waitForMianalStandartHashivPatetinPageTitle() {
		wait.waitForElementVisibility(mianalStandartHashivPatetinPageTitle);
	}
	
	public boolean validateStandartPatetPage() {
		if(mianalStandartHashivPatetinPageTitle.isDisplayed()) {
			System.out.println("Mianal Standart hashiv patetin page is opened");
			return true;
		}
		else return false;
	}

}
