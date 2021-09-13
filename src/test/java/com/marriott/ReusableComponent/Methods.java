package com.marriott.ReusableComponent;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.marriott.Utilities.PropertyFileReader;

public class Methods {

	public static void loadURL(WebDriver driver) throws IOException {
		driver.get(PropertyFileReader.loadfile().getProperty("url"));
		timelapse(driver);
	}

	public static void timelapse(WebDriver driver) throws NumberFormatException, IOException {
		int wait = Integer.parseInt(PropertyFileReader.loadfile().getProperty("implicitWait"));
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
	public static boolean click(By selector, WebDriver driver)
	   {
		   try
		   {
		   driver.findElement(selector).click();
		   return true;
		   }
		   catch(Exception e)
		   {
			   System.out.println(String.format("Element %s doesnt exist", selector));
			   return false;
		   }
		   
	   }
	public static boolean findElement(By selector, WebDriver driver)
	   {
		   try
		   {
		   driver.findElement(selector);
		   return true;
		   }
		   catch(Exception e)
		   {
			   System.out.println(String.format("Element %s doesnt exist", selector));
			   return false;
		   }  
	   }
}
