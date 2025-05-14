package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_To_Card_Page {
	WebDriver AddToCardDriver;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCardButton;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement addTOCardIcon;
	
	@FindBy(xpath = "//div[@class='cart_item']")
	private WebElement cardItem;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	
	
	public Add_To_Card_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		AddToCardDriver = driver;
	}

	
	public void clickOnAddToCardButton()
	{
		addToCardButton.click();
	}
	
	public void clickOnAddToCardIcon()
	{
		addTOCardIcon.click();
	}
	
	public boolean itemIsDisplayedInTheCardAfterAdded()
	{
		return cardItem.isDisplayed();
	}
	
	public void clickOnCheckoutButton()
	{
		checkoutButton.click();
	}
}
