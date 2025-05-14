package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout_Page {
	
	WebDriver checkoutDriver;
	
	@FindBy(id = "first-name")
	private WebElement firstNameField;
	
	@FindBy(id = "last-name")
	private WebElement lastNameField;
	
	@FindBy(id = "postal-code")
	private WebElement postalCodeField;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	@FindBy(id = "finish")
	private WebElement finishButton;
	
	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	private WebElement successfullyOrderText;
	
	public checkout_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		checkoutDriver= driver;
	}
	
	public void enterFirtsName(String firstName)
	{
		firstNameField.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		lastNameField.sendKeys(lastName);
	}

	public void enterPostalCode(String pincode)
	{
		postalCodeField.sendKeys(pincode);
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	public void clickOnFinishButton()
	{
		finishButton.click();
	}
	
	public boolean textIsDisplayedAfterOrderIsSuccessfullyPlaced()
	{
		return successfullyOrderText.isDisplayed();
	}
	
	
	
	
}
