package com.test;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.selenium.training.basics.BasicsDriver;

public class LoginTest extends BasicsDriver{

	
	public static void main(String[] args) throws IOException {
		WebDriver driver = launchDriver();
		HomePage hPage = new HomePage(driver);
		hPage.readQuickLinks();
		hPage.clickLoginBtn();
		
		LoginPage lPg = new LoginPage(driver);
		lPg.enterUserId();
	}

}
