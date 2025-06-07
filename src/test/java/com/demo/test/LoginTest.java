package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.page.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void loginWithValidValue() {
		
		LoginPage loginPage = new LoginPage();
		
		loginPage.loginToApplication("BRR", "Bb114306@");
		
		WebElement userNameLabel = driver.findElement(By.id("userName-value"));
	    Assert.assertTrue(userNameLabel.isDisplayed(), "Login failed or userName not displayed.");
	}
	
	
}