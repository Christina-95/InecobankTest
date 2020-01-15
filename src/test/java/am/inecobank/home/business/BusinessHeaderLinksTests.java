package am.inecobank.home.business;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecobank.base.BaseTestBusiness;
import am.inecobank.pages.business.header.BusinessHeaderLinks;
import am.inecobank.pages.business.header.FinansavorumLinks;
import am.inecobank.pages.business.header.HashivneriKaravarumLinks;
import am.inecobank.pages.business.header.finansavorum.ArevtriFinansavorumPage;
import am.inecobank.pages.business.header.finansavorum.VarkavorumPage;
import am.inecobank.pages.business.header.hashivnerikaravarum.CardsPage;
import am.inecobank.pages.business.header.hashivnerikaravarum.YntacikHashivnerPage;

public class BusinessHeaderLinksTests extends BaseTestBusiness {
	
	@Test 
	//Test Case ID:16 Հաշիվների կառավարում validation
	public void hashivneriKaravarumValidation() {
		BusinessHeaderLinks businessHeader = new BusinessHeaderLinks(driver);
		businessHeader.waitForHashivneriKaravarum();
		businessHeader.moveToHashivneriKaravarum();
		HashivneriKaravarumLinks hashivneriKaravarum = new HashivneriKaravarumLinks(driver);
		hashivneriKaravarum.waitForYntacikHashivnerLink();
		Assert.assertTrue(hashivneriKaravarum.validateYntacikHashivnerLink());
		hashivneriKaravarum.waitForCardsLink();
		Assert.assertTrue(hashivneriKaravarum.validateCardsLink());
	}
	
	@Test 
	//Test Case ID:17 "Ընթացիկ հաշիվներ" link validation
	public void yntacikHashivnerLinkvalidation() {
		BusinessHeaderLinks businessHeader = new BusinessHeaderLinks(driver);
		businessHeader.waitForHashivneriKaravarum();
		businessHeader.moveToHashivneriKaravarum();
		HashivneriKaravarumLinks hashivneriKaravarum = new HashivneriKaravarumLinks(driver);
		hashivneriKaravarum.waitForYntacikHashivnerLink();
		Assert.assertTrue(hashivneriKaravarum.validateYntacikHashivnerLink());
		hashivneriKaravarum.waitForCardsLink();
		Assert.assertTrue(hashivneriKaravarum.validateCardsLink());
		hashivneriKaravarum.clickOnYntacikHashivnerLink();
		YntacikHashivnerPage yntacikhashivner = new YntacikHashivnerPage(driver);
		yntacikhashivner.waitForYntacikHashivnerPageTitle();
		Assert.assertTrue(yntacikhashivner.validateYntacikHashivnerPage());
	}
	
	@Test 
	//Test Case ID:18 "Քարտեր" link validation
	public void cardsLinkvalidation() {
		BusinessHeaderLinks businessHeader = new BusinessHeaderLinks(driver);
		businessHeader.waitForHashivneriKaravarum();
		businessHeader.moveToHashivneriKaravarum();
		HashivneriKaravarumLinks hashivneriKaravarum = new HashivneriKaravarumLinks(driver);
		hashivneriKaravarum.waitForYntacikHashivnerLink();
		Assert.assertTrue(hashivneriKaravarum.validateYntacikHashivnerLink());
		hashivneriKaravarum.waitForCardsLink();
		Assert.assertTrue(hashivneriKaravarum.validateCardsLink());
		hashivneriKaravarum.clickOnCardsLink();
		CardsPage cards = new CardsPage(driver);
		cards.waitForCardsPageTitle();
		Assert.assertTrue(cards.validateCardsPage());
	}
	
	@Test 
	//Test Case ID:19 Ֆինանսավորում validation
	public void finansavorumLinkvalidation() {
		BusinessHeaderLinks businessHeader = new BusinessHeaderLinks(driver);
		businessHeader.waitForFinansavorum();
		businessHeader.moveToFinansavorum();
		FinansavorumLinks finansavorum = new FinansavorumLinks(driver);
		finansavorum.waitForVarkavorumLink();
		finansavorum.waitForBusinessVarkLink();
		finansavorum.waitForBusinessVarkayinGicLink();
		finansavorum.waitForBusinessOverdraft();
		finansavorum.waitForArevtriFinansavorumLink();
		finansavorum.waitForBankayinErashxiqLink();
		finansavorum.waitForAkreditivLink();
		finansavorum.waitForInkasoLink();
		finansavorum.waitForPaymanagriFinansavorumLink();
		Assert.assertTrue(finansavorum.validateVarkavorumLink());
		Assert.assertTrue(finansavorum.validateBusinessVarkLink());
		Assert.assertTrue(finansavorum.validateBusinessVarkayinGicLink());
		Assert.assertTrue(finansavorum.validateBusinessOverdraft());
		Assert.assertTrue(finansavorum.validateArevtriFinansavorumLink());
		Assert.assertTrue(finansavorum.validateBankayinErashxiqLink());
		Assert.assertTrue(finansavorum.validateAkreditivLink());
		Assert.assertTrue(finansavorum.validateInkasoLink());
		Assert.assertTrue(finansavorum.validatePaymanagriFinansavorumLink());
	}

	
	@Test 
	//Test Case ID:20 "Վարկավորում" link validation
		public void varkavorumLinkvalidation() {
			BusinessHeaderLinks businessHeader = new BusinessHeaderLinks(driver);
			businessHeader.waitForFinansavorum();
			businessHeader.moveToFinansavorum();
			FinansavorumLinks finansavorum = new FinansavorumLinks(driver);
			finansavorum.waitForBusinessVarkLink();
			finansavorum.waitForBusinessVarkayinGicLink();
			finansavorum.waitForBusinessOverdraft();
			finansavorum.waitForArevtriFinansavorumLink();
			finansavorum.waitForBankayinErashxiqLink();
			finansavorum.waitForAkreditivLink();
			finansavorum.waitForInkasoLink();
			finansavorum.waitForPaymanagriFinansavorumLink();
			Assert.assertTrue(finansavorum.validateVarkavorumLink());
			Assert.assertTrue(finansavorum.validateBusinessVarkLink());
			Assert.assertTrue(finansavorum.validateBusinessVarkayinGicLink());
			Assert.assertTrue(finansavorum.validateBusinessOverdraft());
			Assert.assertTrue(finansavorum.validateArevtriFinansavorumLink());
			Assert.assertTrue(finansavorum.validateBankayinErashxiqLink());
			Assert.assertTrue(finansavorum.validateAkreditivLink());
			Assert.assertTrue(finansavorum.validateInkasoLink());
			Assert.assertTrue(finansavorum.validatePaymanagriFinansavorumLink());
			finansavorum.waitForVarkavorumLink();
			finansavorum.clickOnVarkavorumLink();
			VarkavorumPage varkPage = new VarkavorumPage(driver);
			varkPage.waitForFinansavorumPageTitle();
			Assert.assertTrue(varkPage.validateFinansavorumPage());
		}
	
	@Test 
	//Test Case ID:21 "Առևտրի ֆինանսավորում" link functionality
	public void arevtriFinansavorumLinkvalidation() {
		BusinessHeaderLinks businessHeader = new BusinessHeaderLinks(driver);
		businessHeader.waitForFinansavorum();
		businessHeader.moveToFinansavorum();
		FinansavorumLinks finansavorum = new FinansavorumLinks(driver);
		finansavorum.waitForVarkavorumLink();
		finansavorum.waitForBusinessVarkLink();
		finansavorum.waitForBusinessVarkayinGicLink();
		finansavorum.waitForBusinessOverdraft();
		finansavorum.waitForBankayinErashxiqLink();
		finansavorum.waitForAkreditivLink();
		finansavorum.waitForInkasoLink();
		finansavorum.waitForPaymanagriFinansavorumLink();
		Assert.assertTrue(finansavorum.validateVarkavorumLink());
		Assert.assertTrue(finansavorum.validateBusinessVarkLink());
		Assert.assertTrue(finansavorum.validateBusinessVarkayinGicLink());
		Assert.assertTrue(finansavorum.validateBusinessOverdraft());
		Assert.assertTrue(finansavorum.validateArevtriFinansavorumLink());
		Assert.assertTrue(finansavorum.validateBankayinErashxiqLink());
		Assert.assertTrue(finansavorum.validateAkreditivLink());
		Assert.assertTrue(finansavorum.validateInkasoLink());
		Assert.assertTrue(finansavorum.validatePaymanagriFinansavorumLink());
		finansavorum.waitForArevtriFinansavorumLink();
		finansavorum.clickOnArevtriFinansavorumLink();
		ArevtriFinansavorumPage arevrtiFinansPage = new ArevtriFinansavorumPage(driver);
		arevrtiFinansPage.waitForArevtriFinansavorumTitleTitle();
		Assert.assertTrue(arevrtiFinansPage.validateArevtriFinansavorumPage());
	}
}
