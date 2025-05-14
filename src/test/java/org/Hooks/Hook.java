package org.Hooks;

import org.Pages.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utilities.Generic_utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	public static WebDriver driver;
	
	@Before
	public void launchingBrowserAndLoginIn()
	{
		driver = Generic_utilities.launchBrowser("chrome", "https://www.saucedemo.com/");
		
		Login_Page lp = new Login_Page(driver);
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");	
		lp.clickOnLoginButton();
		
	}
	
	@After
	public void quiteTheBroweser()
	{
		driver.quit();
	}

}
