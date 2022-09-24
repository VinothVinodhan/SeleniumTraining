package com.selenium.training.basics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicsDriver {
	static WebDriver driver;

	public static WebDriver launchDriver() throws IOException {
		ReadProFile read = new ReadProFile();

		System.out.println("Browser name is: " + read.browserName());
		System.out.println("Driver Path is: " + read.getDriverPath());
		System.out.println("Entire driver path: "+System.getProperty("user.dir") + read.getDriverPath());
		
		if (read.browserName().equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + read.getDriverPath());
			driver = new EdgeDriver();
		} else if (read.browserName().equalsIgnoreCase("Chrome")){
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(read.getUrl());
		return driver;
	}

	

}
