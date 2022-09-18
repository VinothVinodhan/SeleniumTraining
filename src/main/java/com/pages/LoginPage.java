package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	String userIdXpath = "//input[@id='panAdhaarUserId' and @name='panAdhaarUserId']";

	public LoginPage(WebDriver abc) {
		this.driver = abc;
	}

	public void enterUserId() {
		driver.findElement(By.xpath(userIdXpath)).sendKeys("1234567890");
		System.out.println("User entered User ID in text field.");
	}
}
