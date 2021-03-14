package com.sanjeev.pageObjects.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sanjeev.utils.selenium.webElementFinder;

public class loginPage extends webBase
{
	public loginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void enterUsername(String username) throws Exception 
	{
		try 
		{
			WebElement usernameInpt = webElementFinder.getElement(_driver, By.id("email"),30);
			System.out.println("Found:"+usernameInpt.getTagName());
			System.out.println("username to set:"+username);
			usernameInpt.sendKeys(username);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
