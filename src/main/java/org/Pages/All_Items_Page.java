package org.Pages;

import org.Utilities.Reuseable_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class All_Items_Page {
	WebDriver allItemsPageDriver;
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement filterDropdown;
	
	@FindBy(xpath = "(//div[@class='inventory_item_description'])[1]")
	private WebElement productAfterSelectZTOA;
	
	@FindBy(xpath = "(//div[@class='inventory_item_description'])[1]")
	private WebElement productAfterSelectHighToLow;
	
	
	public All_Items_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		allItemsPageDriver = driver;
	}
	
	public void selectZToAFromDropdown()
	{
		Reuseable_Methods.handleDropdown(filterDropdown, "za");
	}
	
	public void selectHighToLowAFromDropdown()
	{
		Reuseable_Methods.handleDropdown(filterDropdown, "hilo");
	}
	
	public boolean producIsDsiplayedtAfterSelectZTOA()
	{
		return productAfterSelectZTOA.isDisplayed();
	}
	
	public boolean producIsDsiplayedtAfterSelectHighToLow()
	{
		return productAfterSelectHighToLow.isDisplayed();
	}
}