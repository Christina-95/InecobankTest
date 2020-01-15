package am.inecobank.pages.home.header.cards;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;
import am.inecobank.pages.home.header.cards.worldmastercardblackeditionpage.LracucichPastatxterPage;
import am.inecobank.pages.home.header.cards.worldmastercardblackeditionpage.SpasarkmanSakagnerPage;

public class WorldMasterCardBlackEditionPage extends InecoBankHeaderLinks {

	public WorldMasterCardBlackEditionPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String WORLD_MASTERED_BLACK_EDITION_PAGE_TITLE = "//h1[contains(text(),'World Mastercard Black Edition')]";
	public static final String SAKAGNER_EV_PAYMANNER_LINK = "(//a[@class='tab__item tab__item--primary'])[1]";
	public static final String LRACUCICH_PASTATXTER_LINK = "(//a[@class='tab__item tab__item--primary'])[2]";
	
	@FindBy(xpath = WORLD_MASTERED_BLACK_EDITION_PAGE_TITLE)
	WebElement worldMasteredBlackEditionCardTitle;
	
	@FindBy (xpath = SAKAGNER_EV_PAYMANNER_LINK)
	WebElement sakagnerEvPaymannerLink;
	
	@FindBy (xpath = LRACUCICH_PASTATXTER_LINK)
	WebElement lracucichPastatxterLink;
	
	
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
	
	public SpasarkmanSakagnerPage clickOnSakagnerEvPlannerLink() {
		sakagnerEvPaymannerLink.click();
		return new SpasarkmanSakagnerPage(driver);
	}
	
	public void waitForLracucichPastatxterLink() {
		wait.waitForElementToBeClickable(lracucichPastatxterLink);
	}
	
	public LracucichPastatxterPage clickOnLracucichPastatxterLink() {
		lracucichPastatxterLink.click();
		return new LracucichPastatxterPage(driver);
	}
	
}
