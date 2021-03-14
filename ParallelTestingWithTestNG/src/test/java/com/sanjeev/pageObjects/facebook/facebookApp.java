package com.sanjeev.pageObjects.facebook;

import org.openqa.selenium.WebDriver;
import com.sanjeev.utils.enums.browsers;
import com.sanjeev.utils.selenium.localWebDriver;

public class facebookApp 
{

	private WebDriver _driver;
	private loginPage _loginPage;
	
	public facebookApp() 
	{
		_driver = localWebDriver.getBrowser(browsers.Chrome);
	}
	
	public void navigateToUrl(String url) 
	{
		_driver.navigate().to(url);
	}
	
	public loginPage loginPage() 
	{
		if(_loginPage==null)
		{
			_loginPage = new loginPage(_driver);
		}
		return _loginPage;
	}
	
	public void dispose() 
	{
		_driver.quit();
		_driver = null;
	}
}
