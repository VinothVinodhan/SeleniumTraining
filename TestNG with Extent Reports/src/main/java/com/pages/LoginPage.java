package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.training.basics.CommonUtility;

public class LoginPage {
	WebDriver driver;
	String userIdXpath = "//input[@id='panAdhaarUserId' and @name='panAdhaarUserId']";
	public LoginPage(WebDriver abc) {
		this.driver = abc;
	}

	public void enterUserId(String userName) {
		driver.findElement(By.xpath(userIdXpath)).sendKeys(userName);
		CommonUtility.addInfo("User entered User ID in text field.");
//		Take screenshot
		CommonUtility.takeScreenshot("EnteredUaerID");
		
		CommonUtility.addScreenshotToReport("EnteredUaerIDToBeAdded");
	}
}
