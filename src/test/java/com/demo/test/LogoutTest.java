package com.demo.test;

import org.testng.annotations.Test;

import com.demo.page.LogoutPage;

public class LogoutTest extends BaseTest{

	@Test  
	public void logout() {
		
	LogoutPage logoutPage = new LogoutPage();
	
	logoutPage.LogoutFromApplication();
	
	}
}
