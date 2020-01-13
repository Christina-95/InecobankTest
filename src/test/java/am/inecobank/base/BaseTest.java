package am.inecobank.base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	private Properties properties;
	protected WebDriver driver;
	
	@BeforeTest
	public void beginning() throws IOException {
		properties = new Properties();
		properties.load(getClass().getClassLoader().getResourceAsStream("readProperty.properties"));
		System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDriver"));
		driver = new ChromeDriver();
		driver.get(properties.getProperty("inecoBankUrl"));	
		//driver.manage().window().maximize();
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}

}
