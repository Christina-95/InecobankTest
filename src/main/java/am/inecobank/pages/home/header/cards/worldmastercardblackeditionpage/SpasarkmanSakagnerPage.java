package am.inecobank.pages.home.header.cards.worldmastercardblackeditionpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.cards.WorldMasterCardBlackEditionPage;

public class SpasarkmanSakagnerPage extends WorldMasterCardBlackEditionPage {

	public SpasarkmanSakagnerPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String CARTAYIN_HASHVI_ARJUYT_TEXT = "(//div[@class='row__title'])[1]";
	
	
	@FindBy (xpath = CARTAYIN_HASHVI_ARJUYT_TEXT)
	WebElement cartayinHashviArjuytText;
	
	
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
	
	
}
