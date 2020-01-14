package am.inecobank.register;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecobank.base.BaseTest;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;
import am.inecobank.pages.register.InecoBankRegisterPage;

public class InecoBankRegisterTests  extends BaseTest {
	
	@Test
	//Test Case ID:13 "Գրանցվել" button functionality
	public void gracvelBtnValidation() {
		InecoBankHeaderLinks headerLinks = new InecoBankHeaderLinks(driver);
		headerLinks.waitForGrancvelBtn();
		headerLinks.clickOnGrancvelBtn();
		InecoBankRegisterPage registerPage = new InecoBankRegisterPage(driver);
		registerPage.waitForRegisterPageTitle();
		Assert.assertTrue(registerPage.validateRegisterPageTitle());
	}

}
