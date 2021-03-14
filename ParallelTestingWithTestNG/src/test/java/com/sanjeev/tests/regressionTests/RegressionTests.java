package com.sanjeev.tests.regressionTests;

import org.testng.annotations.Test;
import com.sanjeev.pageObjects.facebook.facebookApp;

public class RegressionTests {

	@Test(description="Login with invalid username and password")
	public void loginTestFacebook() {
		
		try 
		{
			{
				facebookApp app = new facebookApp();
				 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
				app.navigateToUrl("http://facebook.com");
				app.loginPage().enterUsername("abac@abc.com");
				app.dispose();
			}
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	
	@Test(description="Login with valid username and password")
	public void loginTestFacebookWithValidUser() {
		
		try 
		{
			{
				facebookApp app = new facebookApp();
				System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
				app.navigateToUrl("http://facebook.com");
				app.loginPage().enterUsername("valid@abc.com");
				app.dispose();
			}
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
}
