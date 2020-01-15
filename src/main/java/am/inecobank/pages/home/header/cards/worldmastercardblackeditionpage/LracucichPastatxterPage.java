package am.inecobank.pages.home.header.cards.worldmastercardblackeditionpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.cards.WorldMasterCardBlackEditionPage;

public class LracucichPastatxterPage extends WorldMasterCardBlackEditionPage{

	public LracucichPastatxterPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String WORLD_MASTERCARD_BLACK_EDITION_CARD_SPASARKMAN_SAKAGNER_DOCUMENT= "(//span[@class='document__title'])[1]";
	
	@FindBy (xpath = WORLD_MASTERCARD_BLACK_EDITION_CARD_SPASARKMAN_SAKAGNER_DOCUMENT)
	WebElement masterCardBlackSpasarkmanSakagnerDocument;
	
	
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
