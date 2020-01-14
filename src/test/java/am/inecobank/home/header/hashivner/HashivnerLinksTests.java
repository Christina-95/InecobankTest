package am.inecobank.home.header.hashivner;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecobank.base.BaseTest;
import am.inecobank.pages.home.header.HashivnerLinks;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;
import am.inecobank.pages.home.header.hashivner.HashivneriPatetnerPage;
import am.inecobank.pages.home.header.hashivner.MianalInecoOneHashivPatetinPage;
import am.inecobank.pages.home.header.hashivner.MianalStandartHashivPatetinPage;

public class HashivnerLinksTests  extends BaseTest {
	
	
	@Test 
	//Test Case ID:10 "Հաշիվների փաթեթներ" link functionality
	public void hashivneriPatetnerLinkVal() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForHashivner();
		headerLinks.moveToHashivner();
		HashivnerLinks hashivnerLinks = new HashivnerLinks(driver);
		hashivnerLinks.waitForHashivneriPatetnerLink();
		hashivnerLinks.clickOnHashivneriPatetnerLink();
		HashivneriPatetnerPage hashivneriPatetnerPage = new HashivneriPatetnerPage(driver);
		hashivneriPatetnerPage.waitForHashivneriPatetnerPageTitle();
		Assert.assertTrue(hashivneriPatetnerPage.validateHashivneriPatetnerPage());
	}
	
	@Test 
	//Test Case ID:11 "Բանկային հաշվի փաթեթներ" page INECOONE "Միանալ հիմա" button functionality
	public void inecoOneMianalHimaBtnFunction() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForHashivner();
		headerLinks.moveToHashivner();
		HashivnerLinks hashivnerLinks = new HashivnerLinks(driver);
		hashivnerLinks.waitForHashivneriPatetnerLink();
		hashivnerLinks.clickOnHashivneriPatetnerLink();
		HashivneriPatetnerPage hashivneriPatetnerPage = new HashivneriPatetnerPage(driver);
		hashivneriPatetnerPage.waitForHashivneriPatetnerPageTitle();
		hashivneriPatetnerPage.waitForInecoOneMianalHimaBtn();
		hashivneriPatetnerPage.clickOnInecoOneMianalHimaBt();
		MianalInecoOneHashivPatetinPage mianalInecoOnePatetPage = new MianalInecoOneHashivPatetinPage(driver);
		mianalInecoOnePatetPage.waitForMianalInecoOnePageTitle();
		Assert.assertTrue(mianalInecoOnePatetPage.valiInecoOnePage());
	}
	
	@Test 
	//Test Case ID:12 "Բանկային հաշվի փաթեթներ" page «Ստանդարտ» փաթեթ "Միանալ հիմա" button 
	public void standartPatetnerMianalHimaBtnFunction() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForHashivner();
		headerLinks.moveToHashivner();
		HashivnerLinks hashivnerLinks = new HashivnerLinks(driver);
		hashivnerLinks.waitForHashivneriPatetnerLink();
		hashivnerLinks.clickOnHashivneriPatetnerLink();
		HashivneriPatetnerPage hashivneriPatetnerPage = new HashivneriPatetnerPage(driver);
		hashivneriPatetnerPage.waitForStandartPatetnerMianalHimaBtn();
		hashivneriPatetnerPage.clickOnStandartPatetnerMianalHimaBtn();
		MianalStandartHashivPatetinPage mianalStandartPatetinPage = new MianalStandartHashivPatetinPage(driver);
		mianalStandartPatetinPage.waitForMianalStandartHashivPatetinPageTitle();
		Assert.assertTrue(mianalStandartPatetinPage.validateStandartPatetPage());
	}
}
