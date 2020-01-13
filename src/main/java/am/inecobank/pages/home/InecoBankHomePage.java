package am.inecobank.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;

public class InecoBankHomePage extends InecoBankBasePage {

	public InecoBankHomePage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	InecoBankBasePage actions = new InecoBankBasePage(driver);
	
	public static final String BUSINESS_LINK = "(//a[@class='firstNav__item'])[1]";
	
	@FindBy (xpath = BUSINESS_LINK)
	WebElement businessLink;
	
	

}
