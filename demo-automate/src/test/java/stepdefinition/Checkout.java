package stepdefinition;

import Pageobject.checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Checkout {

	checkout obj = new checkout();

	@Given("user select a Product")
	public void user_select_a_product() throws InterruptedException {
		obj.selectingAPoroduct();
	}

	@Then("user click on  a product")
	public void user_click_on_a_product() {
		obj.userSelectTheProduct();
	}

	@Then("user click on Buy now")
	public void user_click_on_buy_now() throws InterruptedException {
		obj.buynow();
	}

	@Then("user fill up the add shipping Address form")
	public void user_fill_up_the_add_shipping_address_form() throws InterruptedException {
		obj.addShippingAddress();
	}

	@Then("User click on Proceed to payment")
	public void user_click_on_proceed_to_payment() throws InterruptedException {
		obj.proceedToPayement();
	}

	@Then("User click on the payment method")
	public void user_click_on_the_payment_method() throws InterruptedException {
		obj.clickOnThePayment();
	}

	@Then("user select a prod")
	public void user_select_a_prod() throws InterruptedException {
		obj.productclick();
	}

	@Then("user click on buynow")
	public void user_click_on_buynow() {
		obj.buynowButton();
	}

	@Then("user select an address")
	public void user_select_an_address() throws InterruptedException {
		obj.selectAnAddress();
	}

	@Then("user click on Proceed to checkout")
	public void user_click_on_proceed_to_checkout() throws InterruptedException {
		obj.procToPayment();
	}

	@Then("user select a product and procced to checkout")
	public void user_select_a_product_and_procced_to_checkout() throws InterruptedException {
	obj.selectingProduct();
	}

	@Then("user select on add new adress and fill a new address")
	public void user_select_on_add_new_adress_and_fill_a_new_address() throws InterruptedException {
	  obj.addAddress();
	}

	@Then("user click on  proceed to payment")
	public void user_click_on_proceed_to_payment1() throws InterruptedException {
	  obj.payment();
	}

}
