package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demoqa {

	RemoteWebDriver driver;
	
	@Test
	public void login() throws MalformedURLException {
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap();
		sauceOptions.put("username", "oauth-brr113114-e42ad");
		sauceOptions.put("accessKey", "82ecae28-ff30-4a08-a62c-a0bec7d52c6d");
		sauceOptions.put("build", "selenium-build-84JEF");
		sauceOptions.put("name", "<your test name>");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
		driver = new RemoteWebDriver(url, browserOptions);

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		driver.findElement(By.id("userName")).sendKeys("BRR");
    	driver.findElement(By.id("password")).sendKeys("Bb114306@");
    	driver.findElement(By.id("login")).click();
    	
	}
	
	@Test
	public void logout() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
		
		driver.findElement(By.id("submit")).click();
		
	}
}
	
