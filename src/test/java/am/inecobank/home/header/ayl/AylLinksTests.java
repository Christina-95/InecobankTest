package am.inecobank.home.header.ayl;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecobank.base.BaseTest;
import am.inecobank.pages.home.header.AylLinks;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;
import am.inecobank.pages.home.header.ayl.DramakanPoxancumnerPage;
import am.inecobank.pages.home.header.ayl.dramakanpoxancumner.ConverseTransferPage;
import am.inecobank.pages.home.header.ayl.dramakanpoxancumner.IntelExpressPage;
import am.inecobank.pages.home.header.ayl.dramakanpoxancumner.MoneyGramPage;
import am.inecobank.pages.home.header.ayl.dramakanpoxancumner.UniStreamPage;

public class AylLinksTests extends BaseTest {
	
	
	@Test
	//Test Case ID:1 "Արագ դրամական փոխանցումներ" MoneyGram "Մանրամասներ" button functionality
	public void moneyGramManramasnBtnVal() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForAyl();
		headerLinks.moveToAyl();
		AylLinks aylPage = new AylLinks(driver);
		aylPage.waitForDramakanPoxancumnerLink();
		Assert.assertTrue(aylPage.valDramakanPoxancumnerLink());
		aylPage.waitForApahovagrutyunLink();
		Assert.assertTrue(aylPage.valApahovagrutyunLink());
		aylPage.waitForNerdrumayinCarayutyunnerLink();
		Assert.assertTrue(aylPage.valNerdrumayinCarayutyunnerLink());
		AylLinks aylLinks = new AylLinks(driver);
		aylLinks.waitForAragDramakanPoxancumner();
		aylLinks.clickOnAragDramakanPoxancumner();
		DramakanPoxancumnerPage dramPoxancumnerPage = new DramakanPoxancumnerPage(driver);
		dramPoxancumnerPage.waitForMoneyGramManramasnerBtn();
		dramPoxancumnerPage.clickOnMoneyGramManramasnerBtn();
		MoneyGramPage moneyGramPage = new MoneyGramPage(driver);
		moneyGramPage.waitForMoneyGramTitle();
		Assert.assertTrue(moneyGramPage.validateMoneyGramPage());
	}
	
	@Test
	//Test Case ID:2 "Արագ դրամական փոխանցումներ" UniStream "Մանրամասներ" button functionality
	public void uniStreamManramasnBtnVal() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForAyl();
		headerLinks.moveToAyl();
		AylLinks aylPage = new AylLinks(driver);
		aylPage.waitForDramakanPoxancumnerLink();
		Assert.assertTrue(aylPage.valDramakanPoxancumnerLink());
		AylLinks aylLinks = new AylLinks(driver);
		aylLinks.waitForAragDramakanPoxancumner();
		aylLinks.clickOnAragDramakanPoxancumner();
		DramakanPoxancumnerPage dramPoxancumnerPage = new DramakanPoxancumnerPage(driver);
		dramPoxancumnerPage.waitForUniStreamManramasnerBtn();
		dramPoxancumnerPage.clickOnUniStreamManramasnerBtn();
		UniStreamPage uniStreamPage = new UniStreamPage(driver);
		uniStreamPage.waitForUniStreamPageTitle();
		Assert.assertTrue(uniStreamPage.valUniStreamPage());
	}
	
	@Test
	//Test Case ID:3 "Արագ դրամական փոխանցումներ" Intel Express "Մանրամասներ" button functionality
	public void intelExpressManramasnBtnVal() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForAyl();
		headerLinks.moveToAyl();
		AylLinks aylPage = new AylLinks(driver);
		aylPage.waitForDramakanPoxancumnerLink();
		Assert.assertTrue(aylPage.valDramakanPoxancumnerLink());
		AylLinks aylLinks = new AylLinks(driver);
		aylLinks.waitForAragDramakanPoxancumner();
		aylLinks.clickOnAragDramakanPoxancumner();
		DramakanPoxancumnerPage dramPoxancumnerPage = new DramakanPoxancumnerPage(driver);
		dramPoxancumnerPage.waitForIntelExpressManramasnerBtn();
		dramPoxancumnerPage.clickOnIntelExpressManramasnerBtn();
		IntelExpressPage intelExpressPage = new IntelExpressPage(driver);
		intelExpressPage.waitForIntelExpressPageTitle();
		Assert.assertTrue(intelExpressPage.valIntelExpressPage());	
	}

	
	@Test
	//Test Case ID:4 "Արագ դրամական փոխանցումներ" Converse Transfer "Մանրամասներ" button functionality
	public void converseTransferManramasnBtnVal() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForAyl();
		headerLinks.moveToAyl();
		AylLinks aylPage = new AylLinks(driver);
		aylPage.waitForDramakanPoxancumnerLink();
		AylLinks aylLinks = new AylLinks(driver);
		aylLinks.waitForAragDramakanPoxancumner();
		aylLinks.clickOnAragDramakanPoxancumner();
		DramakanPoxancumnerPage dramPoxancumnerPage = new DramakanPoxancumnerPage(driver);
		dramPoxancumnerPage.waitForConverseTransferManramasnerBtn();
		dramPoxancumnerPage.clickOnConverseTransferManramasnerBtn();
		ConverseTransferPage converseTransferPage = new ConverseTransferPage(driver);
		converseTransferPage.waitForConverseTransferPageTitle();
		Assert.assertTrue(converseTransferPage.valConverseTransferPage());
	}
}
