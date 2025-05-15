package Step_Definition;

import Hooks.Hook;
import org.Pages.Add_To_Card_Page;
import org.Pages.checkout_Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout_Sept_Definition {
	WebDriver driver = Hook.driver;
	checkout_Page cp;
	Add_To_Card_Page acp;

	@Given("user is on the add to card page")
	public void user_is_on_the_add_to_card_page() {

		acp = new Add_To_Card_Page(driver);
		acp.clickOnAddToCardIcon();

		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");
		driver.navigate().back();
	}

	@When("user adds a items to the card")
	public void user_adds_a_items_to_the_card() {
		acp.clickOnAddToCardButton();
		acp.clickOnAddToCardIcon();
		acp.clickOnCheckoutButton();
	}

	@When("clicks on the checkout button and enter the require details {string} , {string} , {string}")
	public void clicks_on_the_checkout_button_and_enter_the_require_details(String firstname, String lastname , String postalCode) 
	{
		cp = new checkout_Page(driver);
		cp.enterFirtsName(firstname);
		cp.enterLastName(lastname);
		cp.enterPostalCode(postalCode);
	}

	@When("click on the continue and finist button")
	public void click_on_the_continue_and_finist_button() {
		cp.clickOnContinueButton();
		cp.clickOnFinishButton();
	}

	@Then("product successfully dispatched pop-up should be displayed")
	public void product_successfully_dispatched_pop_up_should_be_displayed() {
		cp.textIsDisplayedAfterOrderIsSuccessfullyPlaced();
	}



}
