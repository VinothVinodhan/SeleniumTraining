package com.pages;

import java.awt.Robot;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.selenium.training.basics.CommonUtility;

public class HomePage {

	WebDriver driver;
	String a;

	public HomePage(WebDriver xyz) {
		this.driver = xyz;
	}

	/**
	 * This method is to read all the links
	 * 
	 * @author 91822
	 */

	public void readQuickLinks() {
		List<WebElement> quickLinks = driver
				.findElements(By.xpath("(//div[@class='view-content'])[1]//div[@class='field--item']"));
		for (WebElement xyz : quickLinks) {
			System.out.println(xyz.getText());
			CommonUtility.addInfo(xyz.getText());

			if (xyz.getText().equalsIgnoreCase("e- Verify Return")) {
				CommonUtility.reportPass("Link name is matching with e- Verify Return.");
			} else {
				CommonUtility.reportFail("Link name is not matching with e- Verify Return.");
			}

			CommonUtility.failTestCase("e- Verify Return", xyz.getText());
		}

		System.out.println("*****");
		for (int i = 1; i <= quickLinks.size(); i++) {
			WebElement quickLink = driver
					.findElement(By.xpath("((//div[@class='view-content'])[1]//div[@class='field--item'])[" + i + "]"));
			System.out.println(quickLink.getText());
		}
	}

	public void clickLoginBtn() {
		WebElement loginBtn = driver.findElement(By.xpath("(//a[contains(text(),'Login')])[1]"));
		System.out.println("Link/Button name is: " + loginBtn.getText());
		CommonUtility.clickGivenElement(loginBtn);
		System.out.println("User clicked Login button/link.");
		CommonUtility.takeScreenshot("LoginPage");
	}

}
