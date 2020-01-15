package am.inecobank.pages.business.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.business.header.finansavorum.ArevtriFinansavorumPage;
import am.inecobank.pages.business.header.finansavorum.VarkavorumPage;

public class FinansavorumLinks  extends BusinessHeaderLinks {

	public FinansavorumLinks(WebDriver driver) {
		super(driver);
	}

	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String VARKAVORUM_LINK = "(//a[@class='link'])[3]";
	public static final String BUSINESS_VARK_LINK = "(//a[@class='link'])[4]";
	public static final String BUSINESS_VARKAYIN_GIC_LINK = "(//a[@class='link'])[5]";
	public static final String BUSINESS_OVERDRAFT_LINK = "(//a[@class='link'])[6]";
	public static final String AREVTRI_FINANSAVORUM_LINK = "(//a[@class='link'])[7]";
	public static final String BANKAYIN_ERASHXIQ_LINK = "(//a[@class='link'])[8]";
	public static final String AKREDITIV_LINK = "(//a[@class='link'])[9]";
	public static final String INKASO_LINK = "(//a[@class='link'])[10]";
	public static final String PAYMANAGRI_FINANSAVORUM_LINK = "(//a[@class='link'])[11]";
	
	@FindBy (xpath = VARKAVORUM_LINK)
	WebElement varkavorumLink;
	
	@FindBy (xpath = BUSINESS_VARK_LINK)
	WebElement businessVarkLink;
	
	@FindBy (xpath = BUSINESS_VARKAYIN_GIC_LINK)
	WebElement businessVarkayinGicLink;
	
	@FindBy (xpath = BUSINESS_OVERDRAFT_LINK)
	WebElement businessOverdraft;
	
	@FindBy (xpath = AREVTRI_FINANSAVORUM_LINK)
	WebElement arevtriFinansavorumLink;
	
	@FindBy (xpath = BANKAYIN_ERASHXIQ_LINK)
	WebElement bankayinErashxiqLink;
	
	@FindBy (xpath = AKREDITIV_LINK)
	WebElement akreditivLink;
	
	@FindBy (xpath = INKASO_LINK)
	WebElement inkasoLink;
	
	@FindBy (xpath = PAYMANAGRI_FINANSAVORUM_LINK)
	WebElement paymanagriFinansavorumLink;
	
	public void waitForVarkavorumLink() {
		wait.waitForElementToBeClickable(varkavorumLink);
	}
	
	public VarkavorumPage clickOnVarkavorumLink() {
		varkavorumLink.click();
		return new VarkavorumPage(driver);
	}
	
	public boolean validateVarkavorumLink() {
		if(varkavorumLink.isDisplayed()) {
			System.out.println("Varkavorum link is valid ");
			return true;
		}
		else return false;
	}
	
	public void waitForBusinessVarkLink() {
		wait.waitForElementToBeClickable(businessVarkLink);
	}
	
	
	public boolean validateBusinessVarkLink() {
		if(businessVarkLink.isDisplayed()) {
			System.out.println("BusinessVarkLink is valid ");
			return true;
		}
		else return false;
	}
	
	public void waitForBusinessVarkayinGicLink() {
		wait.waitForElementToBeClickable(businessVarkayinGicLink);
	}
	
	public boolean validateBusinessVarkayinGicLink() {
		if(businessVarkayinGicLink.isDisplayed()) {
			System.out.println("BusinessVarkayinGicLink is valid ");
			return true;
		}
		else return false;
	}
	
	public void waitForBusinessOverdraft() {
		wait.waitForElementToBeClickable(businessOverdraft);
	}
	
	public boolean validateBusinessOverdraft() {
		if(businessOverdraft.isDisplayed()) {
			System.out.println("BusinessOverdraft is valid ");
			return true;
		}
		else return false;
	}
	
	public void waitForArevtriFinansavorumLink() {
		wait.waitForElementToBeClickable(arevtriFinansavorumLink);
	}
	
	public ArevtriFinansavorumPage clickOnArevtriFinansavorumLink() {
		arevtriFinansavorumLink.click();
		return new ArevtriFinansavorumPage(driver);
	}
	
	public boolean validateArevtriFinansavorumLink() {
		if(arevtriFinansavorumLink.isDisplayed()) {
			System.out.println("ArevtriFinansavorumLink is valid ");
			return true;
		}
		else return false;
	}
	
	public void waitForBankayinErashxiqLink() {
		wait.waitForElementToBeClickable(bankayinErashxiqLink);
	}
	
	public boolean validateBankayinErashxiqLink() {
		if(bankayinErashxiqLink.isDisplayed()) {
			System.out.println("BankayinErashxiqLink is valid ");
			return true;
		}
		else return false;
	}
	
	public void waitForAkreditivLink() {
		wait.waitForElementToBeClickable(akreditivLink);
	}
	
	public boolean validateAkreditivLink() {
		if(akreditivLink.isDisplayed()) {
			System.out.println("AkreditivLink is valid ");
			return true;
		}
		else return false;
	}
	
	public void waitForInkasoLink() {
		wait.waitForElementToBeClickable(inkasoLink);
	}
	
	public boolean validateInkasoLink() {
		if(inkasoLink.isDisplayed()) {
			System.out.println("InkasoLink is valid ");
			return true;
		}
		else return false;
	}
	
	public void waitForPaymanagriFinansavorumLink() {
		wait.waitForElementToBeClickable(paymanagriFinansavorumLink);
	}
	
	public boolean validatePaymanagriFinansavorumLink() {
		if(paymanagriFinansavorumLink.isDisplayed()) {
			System.out.println("PaymanagriFinansavorumLink is valid ");
			return true;
		}
		else return false;
	}
}
