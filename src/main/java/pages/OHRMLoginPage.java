package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMLoginPage {

	@FindBy(name="username")
	private WebElement usernametextbox;
	
	@FindBy(name="password")
	private WebElement passwordtextbox;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbtn;
	
	public OHRMLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void usernameBox(String username) {
		usernametextbox.sendKeys(username);
	}
	
	public void passwordBox(String password) {
		passwordtextbox.sendKeys(password);
	}
	
	public void loginBtn() {
		loginbtn.click();
	}
}
