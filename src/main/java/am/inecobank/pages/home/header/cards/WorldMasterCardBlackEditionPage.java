package am.inecobank.pages.home.header.cards;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class WorldMasterCardBlackEditionPage extends InecoBankHeaderLinks {

	public WorldMasterCardBlackEditionPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String WORLD_MASTERED_BLACK_EDITION_PAGE_TITLE = "//h1[contains(text(),'World Mastercard Black Edition')]";
	public static final String SAKAGNER_EV_PAYMANNER_LINK = "(//a[@class='tab__item tab__item--primary'])[1]";
	public static final String CARTAYIN_HASHVI_ARJUYT_TEXT = "(//div[@class='row__title'])[1]";
	public static final String LRACUCICH_PASTATXTER_LINK = "(//a[@class='tab__item tab__item--primary'])[2]";
	public static final String WORLD_MASTERCARD_BLACK_EDITION_CARD_SPASARKMAN_SAKAGNER_DOCUMENT= "(//span[@class='document__title'])[1]";
	
	@FindBy(xpath = WORLD_MASTERED_BLACK_EDITION_PAGE_TITLE)
	WebElement worldMasteredBlackEditionCardTitle;
	
	@FindBy (xpath = SAKAGNER_EV_PAYMANNER_LINK)
	WebElement sakagnerEvPaymannerLink;
	
	@FindBy (xpath = CARTAYIN_HASHVI_ARJUYT_TEXT)
	WebElement cartayinHashviArjuytText;
	
	@FindBy (xpath = LRACUCICH_PASTATXTER_LINK)
	WebElement lracucichPastatxterLink;
	
	@FindBy (xpath = WORLD_MASTERCARD_BLACK_EDITION_CARD_SPASARKMAN_SAKAGNER_DOCUMENT)
	WebElement masterCardBlackSpasarkmanSakagnerDocument;
	
	public void waitForBlackeditionCardPageTitle() {
		wait.waitForElementVisibility(worldMasteredBlackEditionCardTitle);
	}
	
	public boolean validateBlackEditionCardPage() {
		if (worldMasteredBlackEditionCardTitle.isDisplayed()) {
			System.out.println("Black edition card page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForSakagnerEvPlannerLink() {
		wait.waitForElementToBeClickable(sakagnerEvPaymannerLink);
	}
	
	public void clickOnSakagnerEvPlannerLink() {
		sakagnerEvPaymannerLink.click();
	}
	
	public void waitForCartayinHashviArjuytText() {
		wait.waitForElementVisibility(cartayinHashviArjuytText);
	}
	
	public boolean validateSakagnerEvPlannerPage() {
		if (cartayinHashviArjuytText.isDisplayed()) {
			System.out.println("Sakagner ev Planner page is displayed");
			return true;
		}
		else return false;
	}
	
	public void waitForLracucichPastatxterLink() {
		wait.waitForElementToBeClickable(lracucichPastatxterLink);
	}
	
	public void clickOnLracucichPastatxterLink() {
		lracucichPastatxterLink.click();
	}
	
	public void waitForBlackEditionCardSpasarkmanSakagnerText() {
		wait.waitForElementVisibility(masterCardBlackSpasarkmanSakagnerDocument);
	}
	
	public boolean validateLracucichPastatxterPage() {
		if(masterCardBlackSpasarkmanSakagnerDocument.isDisplayed()) {
			System.out.println("Lracucich pastatxter page is dipslayed");
			return true;
		}
		else return false;
	}
}
