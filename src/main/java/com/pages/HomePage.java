package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	String a;

	public HomePage(WebDriver xyz) {
		this.driver=xyz;
	}

	public void readQuickLinks() {
		List<WebElement> quickLinks = driver
				.findElements(By.xpath("(//div[@class='view-content'])[1]//div[@class='field--item']"));
		for (WebElement xyz : quickLinks) {
			System.out.println(xyz.getText());
		}

		System.out.println("*****");
		for (int i = 1; i <= quickLinks.size(); i++) {
			WebElement quickLink = driver
					.findElement(By.xpath("((//div[@class='view-content'])[1]//div[@class='field--item'])[" + i + "]"));
			System.out.println(quickLink.getText());
		}
	}

	public void clickLoginBtn() {
		System.out.println(
				"Link/Button name is: " + driver.findElement(By.xpath("(//a[contains(text(),'Login')])[1]")).getText());
		driver.findElement(By.xpath("(//a[contains(text(),'Login')])[1]")).click();
		System.out.println("User clicked Login button/link.");
	}

}
