package am.inecobank.pages.home.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.tvayinbank.InecoOnlinePage;
import am.inecobank.pages.home.header.tvayinbank.InecoPayPage;

public class TvayinBankLinks extends InecoBankHeaderLinks{

	public TvayinBankLinks(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String INECO_PAY_LINK = "//a[@href='https://inecopay.am/hy/individuals']";
	public static final String INECO_MOBILE_LINK = "//a[contains(text(),'InecoMobile')]";
	public static final String INECO_ONLINE_LINK = "//a[contains(text(),'InecoOnline')]";
	
	
	@FindBy (xpath = INECO_PAY_LINK)
	WebElement inecoPayLink;
	
	@FindBy (xpath = INECO_MOBILE_LINK)
	WebElement inecoMobileLink;
	
	@FindBy (xpath = INECO_ONLINE_LINK)
	WebElement inecoOnlineLink;
	
	
	public InecoOnlinePage clickInecoOnlineLink() {
		inecoOnlineLink.click();
		return new InecoOnlinePage(driver);
	}
	
	public boolean valInecoOnlineLink() {
		if (inecoOnlineLink.isDisplayed()) {
			System.out.println(" Ineco Online link is valid");
			return true;
		}
		else return false;
	}
	
	public void waitForInecoOnlineLink() {
		wait.waitForElementToBeClickable(inecoOnlineLink);
	}
	
	public void waitForInecoPayLink() {
		wait.waitForElementToBeClickable(inecoPayLink);
	}
	
	public boolean valInecoPayLink() {
		if (inecoPayLink.isDisplayed()) {
			System.out.println("Ineco pay link is valid");
			return true;
		}
		else return false;
	}
	
	public InecoPayPage clickOnInecoPayLink() {
		inecoPayLink.click();
		return new InecoPayPage(driver);
	}
}
