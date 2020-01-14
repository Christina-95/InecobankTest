package am.inecobank.home.business;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecobank.base.BaseTestBusiness;
import am.inecobank.pages.business.header.BusinessHeaderLinks;
import am.inecobank.pages.business.header.HashivneriKaravarumLinks;
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

}
