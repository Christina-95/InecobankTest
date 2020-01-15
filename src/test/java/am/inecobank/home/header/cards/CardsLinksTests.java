package am.inecobank.home.header.cards;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecobank.base.BaseTest;
import am.inecobank.pages.home.header.CardsLinks;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;
import am.inecobank.pages.home.header.cards.ArCaCardOrderPage;
import am.inecobank.pages.home.header.cards.StandartCardsPage;
import am.inecobank.pages.home.header.cards.WorldMasterCardBlackEditionPage;
import am.inecobank.pages.home.header.cards.worldmastercardblackeditionpage.LracucichPastatxterPage;
import am.inecobank.pages.home.header.cards.worldmastercardblackeditionpage.SpasarkmanSakagnerPage;

public class CardsLinksTests extends BaseTest{
	
	@Test
	//Test Case ID:5 Verify Քարտեր "Ստանդարտ քարտեր"
	public void valStandartCardsLink() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForCards();
		headerLinks.moveToCards();
		CardsLinks cardsLinks = new CardsLinks(driver);
		cardsLinks.waitForStandartCardsLink();
		cardsLinks.clickOnStandartCardsLink();
		StandartCardsPage standartCardsPage = new StandartCardsPage(driver);
		standartCardsPage.waitForStandartCardsPageTitle();
		Assert.assertTrue(standartCardsPage.valStandartCardsPage());
	}
	
	@Test
	//Test Case ID:6 Order a ArCa Classic card
	public void arCaOrderValidation() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForCards();
		headerLinks.moveToCards();
		CardsLinks cardsLinks = new CardsLinks(driver);
		cardsLinks.waitForStandartCardsLink();
		cardsLinks.clickOnStandartCardsLink();
		StandartCardsPage standartCardsPage = new StandartCardsPage(driver);
		standartCardsPage.waitForStandartCardsPageTitle();
		Assert.assertTrue(standartCardsPage.valStandartCardsPage());
		standartCardsPage.waitForArCaCardToxnelHaytBtn();
		ArCaCardOrderPage arCaCardOrderPage = standartCardsPage.clickOnToxnelHaytBtn();
		arCaCardOrderPage.waitForDimumHaytTitle();
		arCaCardOrderPage.waitForArCaClassicTitle();
		Assert.assertTrue(arCaCardOrderPage.validateArCaOrderPageTitle());
	}

	
	@Test
	//Test Case ID:7 "Պրեմիում քարտեր" "World Mastercard Black Edition" link validation
	public void worldMastercardBlackEditionLinkValidation() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForCards();
		headerLinks.moveToCards();
		CardsLinks cardsLinks = new CardsLinks(driver);
		cardsLinks.waitForWorldMasterCardBlackEditionLink();
		WorldMasterCardBlackEditionPage masterCardBlackeditionPage = cardsLinks.clickOnMasterCardBlackeditionLink();
		masterCardBlackeditionPage.waitForBlackeditionCardPageTitle();
		Assert.assertTrue(masterCardBlackeditionPage.validateBlackEditionCardPage());
	}
	
	@Test
	//Test Case ID:8 "Պատվիրեք World Mastercard Black Edition քարտ Ինեկոբանկում" page "ՍԱԿԱԳՆԵՐ ԵՒ ՊԱՅՄԱՆՆԵՐ" link validation
	public void sakagnerEvPlannerLinkValidation() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForCards();
		headerLinks.moveToCards();
		CardsLinks cardsLinks = new CardsLinks(driver);
		cardsLinks.waitForWorldMasterCardBlackEditionLink();
		WorldMasterCardBlackEditionPage masterCardBlackeditionPage = cardsLinks.clickOnMasterCardBlackeditionLink();
		masterCardBlackeditionPage.waitForBlackeditionCardPageTitle();
		Assert.assertTrue(masterCardBlackeditionPage.validateBlackEditionCardPage());
		masterCardBlackeditionPage.waitForSakagnerEvPlannerLink();
		masterCardBlackeditionPage.clickOnSakagnerEvPlannerLink();
		SpasarkmanSakagnerPage spasarkumPage = new SpasarkmanSakagnerPage(driver);
		spasarkumPage.waitForCartayinHashviArjuytText();
		Assert.assertTrue(spasarkumPage.validateSakagnerEvPlannerPage());
	}
	
	@Test
	//Test Case ID:9 "Պատվիրեք World Mastercard Black Edition քարտ Ինեկոբանկում" page "ԼՐԱՑՈՒՑԻՉ ՓԱՍՏԱԹՂԹԵՐ" link validation
	public void lracucichPastatxterLinkValidation() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForCards();
		headerLinks.moveToCards();
		CardsLinks cardsLinks = new CardsLinks(driver);
		cardsLinks.waitForWorldMasterCardBlackEditionLink();
		WorldMasterCardBlackEditionPage masterCardBlackeditionPage = cardsLinks.clickOnMasterCardBlackeditionLink();
		masterCardBlackeditionPage.waitForBlackeditionCardPageTitle();
		Assert.assertTrue(masterCardBlackeditionPage.validateBlackEditionCardPage());
		masterCardBlackeditionPage.waitForLracucichPastatxterLink();
		masterCardBlackeditionPage.clickOnLracucichPastatxterLink();
		LracucichPastatxterPage lracucichPage = new LracucichPastatxterPage(driver);
		lracucichPage.waitForBlackEditionCardSpasarkmanSakagnerText();
		Assert.assertTrue(lracucichPage.validateLracucichPastatxterPage());
	}
}
