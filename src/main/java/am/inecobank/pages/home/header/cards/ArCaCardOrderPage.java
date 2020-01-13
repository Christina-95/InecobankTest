package am.inecobank.pages.home.header.cards;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class ArCaCardOrderPage extends InecoBankHeaderLinks {

	public ArCaCardOrderPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String DIMUM_HAYT_TITLE = "//h3[@class='title']";
	public static final String ARCA_CLASSIC_TITLE = "//h5[@class='cardName']";

	@FindBy (xpath = DIMUM_HAYT_TITLE)
	WebElement dimumHaytTitle;
	
	@FindBy (xpath = ARCA_CLASSIC_TITLE)
	WebElement arCaClassicTitle;
	
	public void waitForDimumHaytTitle() {
		wait.waitForElementVisibility(dimumHaytTitle);
	}
	
	public void waitForArCaClassicTitle() {
		wait.waitForElementVisibility(arCaClassicTitle);
	}
	
	public boolean validateArCaOrderPageTitle() {
		if (dimumHaytTitle.isDisplayed() & arCaClassicTitle.isDisplayed()) {
			System.out.println("ArCa order page is displayed");
			return true;
		}
		else return false;
	}
}
