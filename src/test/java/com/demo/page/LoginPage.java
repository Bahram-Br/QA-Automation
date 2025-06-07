package com.demo.page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.test.BaseTest;

public class LoginPage {

	@FindBy(id = "userName")
	WebElement userNameTextBox;
	
	@FindBy(id = "password")
	WebElement passwordTextBox;
	
	@FindBy(id = "login")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this );
	}
	
	public void loginToApplication(String userName, String password) {
		
		System.out.println("Waiting for userNameTextBox...");
		
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(userNameTextBox));

	    userNameTextBox.sendKeys(userName);
	    System.out.println("Username input done");

	    passwordTextBox.sendKeys(password);
	    System.out.println("Password input done");

	    loginButton.click();
	    System.out.println("Login button clicked");
		
	}
}


