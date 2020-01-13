package am.inecobank.pages.home.header.ayl.dramakanpoxancumner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class ConverseTransferPage extends InecoBankHeaderLinks {

	public ConverseTransferPage(WebDriver driver) {
		super(driver);
	}
	 
	InecoBankBasePage wait = new InecoBankBasePage(driver);
		
		public static final String CONVERSE_TRANSFER_PAGE_TITLE = "//h1[contains(text(),'Converse Transfer')]";
		
		@FindBy (xpath = CONVERSE_TRANSFER_PAGE_TITLE)
		WebElement converse_Transfer_Page_Title;
		
		public void waitForConverseTransferPageTitle() {
			wait.waitForElementVisibility(converse_Transfer_Page_Title);
		}
		
		public boolean valConverseTransferPage() {
			if (converse_Transfer_Page_Title.isDisplayed()) {
				System.out.println("Converse Transfer page is opened");
				return true;
			}
			else return false;
		}
	

}
