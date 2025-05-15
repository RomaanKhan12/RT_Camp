package org.Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generic_Utilities {
static WebDriver driver;
	
	public static WebDriver launchingBrowser(String browser , String url)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver(options);
		}
		
		if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
}
