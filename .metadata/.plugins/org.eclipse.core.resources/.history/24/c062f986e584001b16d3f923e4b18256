package com.sanjeev.utils.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.sanjeev.utils.enums.browsers;


public class localWebDriver 
{
	public static WebDriver getBrowser(browsers browserName) {

		switch (browserName) {
		case Chrome:
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		     ChromeOptions options = new ChromeOptions();
		        options.addArguments("headless");
		        options.addArguments("window-size=1200x600");
			return new ChromeDriver(options);
		case IE:
			return new InternetExplorerDriver();		
		case Firefox:
			return new FirefoxDriver();
		}
		return null;

	}
}
