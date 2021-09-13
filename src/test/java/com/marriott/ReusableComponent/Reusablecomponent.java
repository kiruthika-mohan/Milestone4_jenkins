package com.marriott.ReusableComponent;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.marriott.Utilities.PropertyFileReader;


public class Reusablecomponent {

	public static WebDriver driver;
	private static Logger log=LogManager.getLogger(Reusablecomponent.class.getName()); 
	public static WebDriver initializer()throws IOException {
    String browser=PropertyFileReader.loadfile().getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			log.info("Chrome driver invocked");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 log.info("Firefox driver invocked");
		}
		else
		{
			System.setProperty("webdriver.edge.driver","C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
			log.info("Edge driver invocked");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
