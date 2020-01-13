package am.inecobank.pages.home.header.hashivner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class HashivneriPatetnerPage  extends InecoBankHeaderLinks {

	public HashivneriPatetnerPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String HASHIVNERI_PATETNER_PAGE_TITLE = "//h1[@class='content__title']";
	public static final String INECO_ONE_MIANAL_HIMA_BTN = "(//span[@class='btn__text'])[4]";
	
	@FindBy (xpath = HASHIVNERI_PATETNER_PAGE_TITLE)
	WebElement hashivneriPatetnerpageTitle;
	
	@FindBy (xpath = INECO_ONE_MIANAL_HIMA_BTN)
	WebElement inecoOneMianalHimaBtn;
	
	public void waitForHashivneriPatetnerPageTitle() {
		wait.waitForElementVisibility(hashivneriPatetnerpageTitle);
	}
	
	public boolean validateHashivneriPatetnerPage() {
		if (hashivneriPatetnerpageTitle.isDisplayed()) {
			System.out.println("Hashivneri patetner page is displayed");
			return true;
		}
		else return false;
	}
	
	public void waitForInecoOnlineMianalHimaBtn() {
		wait.waitForElementToBeClickable(inecoOneMianalHimaBtn);
	}
	
	public MianalInecoOneHashivPatetinPage clickOnInecoOneMianalHimaBt() {
		inecoOneMianalHimaBtn.click();
		return new MianalInecoOneHashivPatetinPage(driver);
	}
}
