package am.inecobank.pages.home.header.ayl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;
import am.inecobank.pages.home.header.ayl.dramakanpoxancumner.MoneyGramPage;
import am.inecobank.pages.home.header.ayl.dramakanpoxancumner.UniStreamPage;

public class DramakanPoxancumnerPage extends InecoBankHeaderLinks {

	public DramakanPoxancumnerPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	InecoBankBasePage actions = new InecoBankBasePage(driver);
	
	public static final String MONEY_GRAM_MANRAMASNER_BTN = "(//span[@class='btn__text'])[3]";
	public static final String UNI_STREAM_MANRAMASNER_BTN = "(//span[@class='btn__text'])[4]";
	public static final String INTEL_EXPRESS_MANRAMASNER_BTN = "(//span[@class='btn__text'])[5]";
	public static final String CONVERSE_TRANSFER_MANRAMASNER_BTN = "(//span[@class='btn__text'])[6]";
	
	
	@FindBy (xpath = MONEY_GRAM_MANRAMASNER_BTN)
	WebElement moneyGramManramasnBtn;
	
	@FindBy (xpath = UNI_STREAM_MANRAMASNER_BTN)
	WebElement uniStreamManramasnBtn;
	
	@FindBy (xpath = INTEL_EXPRESS_MANRAMASNER_BTN)
	WebElement intelExpressManramasnBtn;
	
	@FindBy (xpath = CONVERSE_TRANSFER_MANRAMASNER_BTN)
	WebElement converseTransferManramasnBtn;
	
	public void waitForMoneyGramManramasnerBtn() {
		wait.waitForElementToBeClickable(moneyGramManramasnBtn);
	}
	
	public MoneyGramPage clickOnMoneyGramManramasnerBtn() {
		moneyGramManramasnBtn.click();
		return new MoneyGramPage(driver);
	}
	
	public void waitForUniStreamManramasnerBtn() {
		wait.waitForElementToBeClickable(uniStreamManramasnBtn);
	}
	
	public UniStreamPage clickOnUniStreamManramasnerBtn() {
		uniStreamManramasnBtn.click();
		return new UniStreamPage(driver);
	}
	
	public void waitForIntelExpressManramasnerBtn() {
		wait.waitForElementToBeClickable(intelExpressManramasnBtn);
	}
	
	public UniStreamPage clickOnIntelExpressManramasnerBtn() {
		intelExpressManramasnBtn.click();
		return new UniStreamPage(driver);
	}
	
	public void waitForConverseTransferManramasnerBtn() {
		wait.waitForElementToBeClickable(converseTransferManramasnBtn);
	}
	
	public UniStreamPage clickOnConverseTransferManramasnerBtn() {
		converseTransferManramasnBtn.click();
		return new UniStreamPage(driver);
	}

}
