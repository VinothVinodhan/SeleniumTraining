package com.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.selenium.training.basics.BasicsDriver;
import com.selenium.training.basics.CommonUtility;

public class LoginTest extends BasicsDriver {
	WebDriver driver;

	@BeforeClass
	public void nameXZ() {
		System.out.println("I am Before Class.");
	}

	@AfterClass
	public void nameXYA() {
		System.out.println("I am After Class.");
	}

	@BeforeTest
	public void nameX() throws IOException {
		System.out.println("I am Before Suite.");
		driver = launchDriver();
		CommonUtility.generateExtentReports();
	}

	@AfterTest
	public void nameXY() {
		System.out.println("I am After Suite.");
		driver.quit();
		CommonUtility.completeExtentReport();
	}

	@Test
	public void name() throws IOException {
//		privateName();

		HomePage hPage = new HomePage(driver);
//		hPage.readQuickLinks();
		hPage.clickLoginBtn();

		LoginPage lPg = new LoginPage(driver);
		lPg.enterUserId("12345");
	}
	
}
