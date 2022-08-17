package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ecommerce {
	@Given("User should be on loginpage")
	public void user_should_be_on_loginpage() {
	   System.out.println("given of background");
	}

	@When("User enter the uname and pswrd")
	public void user_enter_the_uname_and_pswrd() {
	    System.out.println("when of background");
	}

	@And("User clicks on button for login")
	public void user_clicks_on_button_for_login() {
	    System.out.println("And of background");
	}

	@Then("User logged in")
	public void user_logged_in() {
		System.out.println("Then of background");
	}

	@Given("User search for iphone")
	public void user_search_for_iphone() {
		System.out.println("Given of Scena 1");
	}

	@When("User adds iphone to the cart")
	public void user_adds_iphone_to_the_cart() {
		System.out.println("When of Scena 1");
	}

	@Then("iphone added to the cart")
	public void iphone_added_to_the_cart() {
		System.out.println("Then of Scena 1");
	}

	@Given("User searching oneplusnord")
	public void user_searching_oneplusnord() {
		System.out.println("Given of Scena 2");
	}

	@When("User adding oneplusnord to the cart")
	public void user_adding_oneplusnord_to_the_cart() {
		System.out.println("When of Scena 2");
	}

	@Then("oneplusnord added in cart")
	public void oneplusnord_added_in_cart() {
		System.out.println("Then of Scena 2");
	}

}
