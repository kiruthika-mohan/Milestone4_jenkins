package com.marriott.pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.marriott.ReusableComponent.Methods;
import com.marriott.UIstore.OurbrandsUI;

public class Ourbrands {

	public boolean OurbrandsNav(WebDriver driver) throws InterruptedException
	{ 
		Thread.sleep(2000);
	  if(Methods.click(OurbrandsUI.ourbrands, driver))
	  {
		if(Methods.click(OurbrandsUI.ourbrands,driver))
		{
			return true;
		}
	  }
		return false;
	}
	public boolean JWVerify(WebDriver driver) throws InterruptedException
	{ 
		Thread.sleep(2000);
	  if(Methods.click(OurbrandsUI.jw, driver))
	  {
		  if(Methods.click(OurbrandsUI.jw, driver))
			 {
				  String values=driver.findElement(OurbrandsUI.jw).getText();
				  System.out.println(values);
				 Assert.assertEquals(values, "JW Marriott");
		              return true;
				 }
			 }
		 return false;		
	}
	public boolean JWClick(WebDriver driver) throws InterruptedException
	{ 
		Thread.sleep(2000);
	  if(Methods.click(OurbrandsUI.jw, driver))
	  {
		if(Methods.click(OurbrandsUI.jw,driver))
		{
			return true;
		}
	  }
		return false;
	}
}
