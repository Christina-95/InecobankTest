package am.inecobank.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	protected String inecoBankUrl = "https://www.inecobank.am/hy/Individual";
	
	protected WebDriver driver;
	
	@BeforeTest
	public void beginning() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(inecoBankUrl);	
		//driver.manage().window().maximize();
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}

}
