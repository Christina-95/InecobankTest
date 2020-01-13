package am.inecobank.pages.home.header.ayl.dramakanpoxancumner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePage;
import am.inecobank.pages.home.header.InecoBankHeaderLinks;

public class MoneyGramPage extends InecoBankHeaderLinks {

	public MoneyGramPage(WebDriver driver) {
		super(driver);
	}
	
	InecoBankBasePage wait = new InecoBankBasePage(driver);
	InecoBankBasePage actions = new InecoBankBasePage(driver);
	
	public static final String MONEY_GRAM_TITLE = "//h1[contains(text(),'MoneyGram')]";
	
	@FindBy (xpath = MONEY_GRAM_TITLE)
	WebElement money_Gram_Title;
	
	public void waitForMoneyGramTitle() {
		wait.waitForElementVisibility(money_Gram_Title);
	}
	
	public boolean validateMoneyGramPage() {
		if (money_Gram_Title.isDisplayed()) {
			System.out.println("MoneyGram page is opened");
			return true;
		}
		else return false;
	}

}
