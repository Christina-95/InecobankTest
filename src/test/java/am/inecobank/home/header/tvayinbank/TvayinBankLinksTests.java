package am.inecobank.home.header.tvayinbank;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecobank.base.BaseTest;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;
import am.inecobank.pages.home.header.TvayinBankLinks;
import am.inecobank.pages.home.header.tvayinbank.InecoPayPage;

public class TvayinBankLinksTests extends BaseTest {
	
	
	
	@Test
	//Test Case ID:15 Թվային բանկ "InecoPay" link  functionality
	public void inecoPayLinkFunctionality() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForTvayinBank();
		headerLinks.moveToTvayinBank();
		TvayinBankLinks tvayinBankLinks = new TvayinBankLinks(driver);
		tvayinBankLinks.waitForInecoPayLink();
		Assert.assertTrue(tvayinBankLinks.valInecoPayLink());
		tvayinBankLinks.clickOnInecoPayLink();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		InecoPayPage inecoPay = new InecoPayPage(driver);
		inecoPay.waitForIncheInecoPayTitle();
		Assert.assertTrue(inecoPay.validateIncheInecoPayTitle());
	}
}
