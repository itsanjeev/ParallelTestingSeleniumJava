package com.sanjeev.utils.selenium;

import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Sanjeev Kumar
 *
 */
public class webElementFinder 
{
	
	public static WebElement getElement(WebDriver driver,final By elementLocator, int timeOutInSecs) throws Exception 
	{
		try 
		{
			  WebDriverWait wait = new WebDriverWait(driver, timeOutInSecs);
			  wait.ignoring(NoSuchElementException.class);
			  wait.ignoring(ElementNotVisibleException.class);
			  return wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return getElement(driver, elementLocator);
					}
				});
			
		} 
		catch (Exception ex) 
		{
			System.err.println("Error:" + ex);
			throw ex;
		}
		
	}
	
	   private static WebElement getElement(final SearchContext searchContext,final By elementLocator)
       {
           WebElement element = searchContext.findElement(elementLocator);

           if (element.isDisplayed()&&element.isEnabled())
           {
               return element;
           }
           throw new ElementNotVisibleException("WebElement with locator "+elementLocator+" is not visible.");
       }

}
