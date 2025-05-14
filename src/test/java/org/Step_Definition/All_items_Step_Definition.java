package org.Step_Definition;

import org.Hooks.Hook;
import org.Pages.All_Items_Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class All_items_Step_Definition {
	WebDriver driver = Hook.driver;
	All_Items_Page ap;


	@Given(": user is on the all items page")
	public void user_is_on_the_all_items_page() 
	{

		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

	}

	@When(":	user select Z TO A from the filter dropdown")
	public void user_select_z_to_a_from_the_filter_dropdown() 
	{
		ap = new All_Items_Page(driver);
		ap.selectZToAFromDropdown();

	}

	@Then(": product list for Z TO A filter should be reordered accordingly")
	public void product_list_for_z_to_a_filter_should_be_reordered_accordingly() 
	{

		ap.producIsDsiplayedtAfterSelectZTOA();
	}

	@When(": user select high to low from the filter dropdown")
	public void user_select_high_to_low_from_the_filter_dropdown()
	{
		ap = new All_Items_Page(driver);
		ap.selectHighToLowAFromDropdown();
	}

	@Then(": product list for hight to low filter should be reordered accordingly")
	public void product_list_for_hight_to_low_filter_should_be_reordered_accordingly() 
	{
		ap.producIsDsiplayedtAfterSelectHighToLow();
	}


}
