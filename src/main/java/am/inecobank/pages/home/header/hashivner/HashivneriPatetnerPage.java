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
	public static final String STANDART_PATETNER_MIANAL_HIMA_BTN = "(//span[@class='btn__text'])[6]";
	
	@FindBy (xpath = HASHIVNERI_PATETNER_PAGE_TITLE)
	WebElement hashivneriPatetnerpageTitle;
	
	@FindBy (xpath = INECO_ONE_MIANAL_HIMA_BTN)
	WebElement inecoOneMianalHimaBtn;
	
	@FindBy (xpath = STANDART_PATETNER_MIANAL_HIMA_BTN)
	WebElement standartPatetnerMianalHimaBtn;
	
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
	
	public void waitForInecoOneMianalHimaBtn() {
		wait.waitForElementToBeClickable(inecoOneMianalHimaBtn);
	}
	
	public MianalInecoOneHashivPatetinPage clickOnInecoOneMianalHimaBt() {
		inecoOneMianalHimaBtn.click();
		return new MianalInecoOneHashivPatetinPage(driver);
	}
	
	public void waitForStandartPatetnerMianalHimaBtn() {
		wait.waitForElementToBeClickable(standartPatetnerMianalHimaBtn);
	}
	
	public MianalStandartHashivPatetinPage clickOnStandartPatetnerMianalHimaBtn() {
		standartPatetnerMianalHimaBtn.click();
		return new MianalStandartHashivPatetinPage(driver);
	}
}
