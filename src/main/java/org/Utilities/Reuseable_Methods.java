package org.Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reuseable_Methods {
	
	public static void handleDropdown(WebElement element , String value)
	{
		Select sl = new Select(element);
		sl.selectByValue(value);
	}
	
	public static void handelAlert(WebDriver driver)
	{
		try
		{
		WebDriverWait ewait = new WebDriverWait(driver , Duration.ofSeconds(10));
		ewait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
