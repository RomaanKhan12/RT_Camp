package Hooks;

import org.Pages.Login_Page;
import org.Utilities.Generic_Utilities;
import org.Utilities.Reuseable_Methods;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Generic_utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
	public static WebDriver driver;

	@Before
	public void launchingBrowserAndLoginIn()
	{
		driver = Generic_Utilities.launchingBrowser("chrome", "https://www.saucedemo.com/");

		Login_Page lp = new Login_Page(driver);
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");	
		lp.clickOnLoginButton();

		Reuseable_Methods.handelAlert(driver);

	}

	@After(order=2)
	public void takeScreenshotForFailedScenario(Scenario scn)
	{
		if(scn.isFailed())
		{
			String ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
			String scnName = scn.getName(); 
			scnName=scnName.replace(" ", "_");
			scn.attach(ss,"image/png", scnName); 

		}

	}

	@After(order=1)
	public void quiteTheBroweser()
	{
		driver.quit();
	}

}
