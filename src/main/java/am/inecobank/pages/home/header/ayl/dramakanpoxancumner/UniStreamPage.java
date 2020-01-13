package am.inecobank.pages.home.header.ayl.dramakanpoxancumner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class UniStreamPage extends InecoBankHeaderLinks {
	
	public UniStreamPage(WebDriver driver) {
		super(driver);
	}

	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String UNI_STREAM_PAGE_TITLE = "//h1[contains(text(),'UniStream')]";
	
	@FindBy (xpath = UNI_STREAM_PAGE_TITLE)
	WebElement uni_Stream_Page_Title;
	
	public void waitForUniStreamPageTitle() {
		wait.waitForElementVisibility(uni_Stream_Page_Title);
	}
	
	public boolean valUniStreamPage() {
		if (uni_Stream_Page_Title.isDisplayed()) {
			System.out.println("UniStream page is opened");
			return true;
		}
		else return false;
	}

}
