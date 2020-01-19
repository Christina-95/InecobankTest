package am.inecobank.home.header.cards;

import org.testng.annotations.Test;

import am.inecobank.base.BaseTest;
import am.inecobank.pages.home.header.CardsLinks;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;
import am.inecobank.pages.home.header.cards.VisaClassicCardOrderPage;

public class OrderCardInInecoBankTests  extends BaseTest {
	
	
	@Test 
	//Test Case ID:Order Visa Classic Card in Incebank.am process validation
	public void orderVisaClassicCardVal() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForCards();
		headerLinks.moveToCards();
		CardsLinks cardsLinks = new CardsLinks(driver);
		cardsLinks.waitForVisaClassicLink();
		cardsLinks.clickOnVisaClassicLink();
		VisaClassicCardOrderPage visaClassicOrder = new VisaClassicCardOrderPage(driver);
		//visaClassicOrder.
	}

}
