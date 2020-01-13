package am.inecobank.pages.home.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.tvayinbank.InecoOnlinePage;

public class TvayinBankLinks extends InecoBankHeaderLinks{

	public TvayinBankLinks(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String INECO_PAY_LINK = "//a[contains(text(),'InecoPay')]";
	public static final String INECO_MOBILE_LINK = "//a[contains(text(),'InecoMobile')]";
	public static final String INECO_ONLINE_LINK = "//a[contains(text(),'InecoOnline')]";
	
	
	@FindBy (xpath = INECO_PAY_LINK)
	WebElement inecoPayLink;
	
	@FindBy (xpath = INECO_MOBILE_LINK)
	WebElement inecoMobileLink;
	
	@FindBy (xpath = INECO_ONLINE_LINK)
	WebElement inecoOnlineLink;
	
	
	public InecoOnlinePage clickLink() {
		inecoOnlineLink.click();
		return new InecoOnlinePage(driver);
	}
	
	public boolean valInecoOnlineLink() {
		if (inecoOnlineLink.isDisplayed()) {
			System.out.println(" Ineco Online link is displayed");
			return true;
		}
		else return false;
	}
}
