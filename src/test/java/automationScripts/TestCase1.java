package automationScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pages.OHRMLoginPage;

public class TestCase1 extends StepGroup {

	@Test
	public void testCase1() throws IOException, InterruptedException {
		OHRMLoginPage om = new OHRMLoginPage(driver);
		om.usernameBox(pf.getProperty("username"));
		Thread.sleep(2000);
		om.passwordBox(pf.getProperty("password"));
		Thread.sleep(2000);
		om.loginBtn();
	}
	
}
