package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepGroup {

	public WebDriver driver;
	public PropertyFile pf = new PropertyFile();
	public WebDriverUtility u= new WebDriverUtility();
	
	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pf.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
