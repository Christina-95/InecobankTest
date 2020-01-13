package am.inecobank.pages.home.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.ayl.ApahovagrutyunPage;
import am.inecobank.pages.home.header.ayl.DramakanPoxancumnerPage;
import am.inecobank.pages.home.header.ayl.NerdrumayinCarayutyunnerPage;

public class AylLinks extends InecoBankHeaderLinks {

	public AylLinks(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String DRAMAKAN_POXANCUMNER_LINK = "(//a[@class='link'])[52]";
	public static final String ARAG_DRAMAKAN_POXANCUMNER_LINK = "(//a[@class='link'])[53]";
	public static final String APAHOVAGRUTYUN_LINK = "(//a[@class='link'])[46]";
	public static final String NERDRUMAYIN_CARAYUTYUNNER_LINK = "(//a[@class='link'])[43]";
	
	@FindBy (xpath = ARAG_DRAMAKAN_POXANCUMNER_LINK)
	WebElement aragDramakanPoxancumnerLink;
	
	@FindBy (xpath = DRAMAKAN_POXANCUMNER_LINK)
	WebElement dramakanPoxancumnerLink;
	
	@FindBy (xpath = APAHOVAGRUTYUN_LINK)
	WebElement apahovagrutyunLink;
	
	@FindBy (xpath = NERDRUMAYIN_CARAYUTYUNNER_LINK)
	WebElement nerdrumayinCarayutyunnerLink;
	
	public DramakanPoxancumnerPage clickOnAragDramakanPoxancumner() {
		aragDramakanPoxancumnerLink.click();
		return new DramakanPoxancumnerPage(driver);
	}
		
	public void waitForAragDramakanPoxancumner() {
		wait.waitForElementToBeClickable(aragDramakanPoxancumnerLink);
	}
	
	public void waitForDramakanPoxancumnerLink() {
		wait.waitForElementToBeClickable(dramakanPoxancumnerLink);
	}
	
	public DramakanPoxancumnerPage clickOnDramakanPoxancumnerLink() {
		dramakanPoxancumnerLink.click();
		return new DramakanPoxancumnerPage(driver);	
	}
	
	public boolean valDramakanPoxancumnerLink() {
		if (dramakanPoxancumnerLink.isDisplayed()){
			System.out.println("Dramakan poxancumner link is displayed");
			return true;
		}
		else return false;	
	}
	
	public void waitForApahovagrutyunLink() {
		wait.waitForElementToBeClickable(apahovagrutyunLink);
	}
	
	public ApahovagrutyunPage clickOnApahovagrutyunLink() {
		apahovagrutyunLink.click();
		return new ApahovagrutyunPage(driver);
	}
	
	public boolean valApahovagrutyunLink() {
		if (apahovagrutyunLink.isDisplayed()){
			System.out.println("Apahovagrutyun link is displayed");
			return true;
		}
		else return false;
	}
	
	public void waitForNerdrumayinCarayutyunnerLink() {
		wait.waitForElementToBeClickable(nerdrumayinCarayutyunnerLink);
	}
	
	public NerdrumayinCarayutyunnerPage clickOnNerdrumayinCarayutyunnerLink() {
		nerdrumayinCarayutyunnerLink.click();
		return new NerdrumayinCarayutyunnerPage(driver);
	}
	
	public boolean valNerdrumayinCarayutyunnerLink() {
		if (nerdrumayinCarayutyunnerLink.isDisplayed()) {
			System.out.println("Nerdrumayin Carayutyunner link is displayed");
			return true;
		}
		else return false;
	}

}
