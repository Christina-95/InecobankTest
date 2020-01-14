package am.inecobank.pages.business.header.hashivnerikaravarum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.business.header.BusinessHeaderLinks;

public class YntacikHashivnerPage extends BusinessHeaderLinks {

	public YntacikHashivnerPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	
	public static final String YNTACIK_HASHIVNER_PAGE_TITLE = "//h1[@class='customDetailBanner__title']";
	
	@FindBy (xpath = YNTACIK_HASHIVNER_PAGE_TITLE)
	WebElement yntacikHashivnerPageTitle;
	
	public void waitForYntacikHashivnerPageTitle() {
		wait.waitForElementVisibility(yntacikHashivnerPageTitle);
	}
	
	public boolean validateYntacikHashivnerPage() {
		if(yntacikHashivnerPageTitle.isDisplayed()) {
			System.out.println("Yntacik hashivner page is opened");
			return true;
		}		
		else return false;
	}


}
