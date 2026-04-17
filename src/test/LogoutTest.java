package test;

import org.testng.annotations.Test;

import main.LogoutPage;

public class LogoutTest extends BaseTest{

	@Test  
	public void logout() {

		LoginTest loginTest = new LoginTest();
		loginTest.loginWithValidValue();
		
		LogoutPage logoutPage = new LogoutPage();
		logoutPage.LogoutFromApplication();
	
	}
}
