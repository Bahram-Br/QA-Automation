package com.demo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.test.BaseTest;

public class LogoutPage {

	@FindBy(id = "submit")
	WebElement logout;
	
	public LogoutPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void LogoutFromApplication() {
		logout.click();
		System.out.println("Logout button clicked");
	}
}
