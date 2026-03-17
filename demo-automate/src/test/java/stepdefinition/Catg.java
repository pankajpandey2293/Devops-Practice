package stepdefinition;

import Pageobject.catagorycheck;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Catg {
	
	catagorycheck object = new catagorycheck();
	
	@Given("user launch the URL")
	public void user_launch_the_url() {
		
	}

	@Given("user select a catagory")
	public void user_select_a_catagory() {
		object.userSelectACatagory();
	}

	@Given("validate user land on the correct catagory")
	public void validate_user_land_on_the_correct_catagory() throws InterruptedException {
		object.validateCatagory();
	}

	@Given("user applied the filter")
	public void user_applied_the_filter() throws InterruptedException {
		object.userAppliedTheFilter();
	}

	@Then("user sort catragory product by Gender Skin type and concern")
	public void user_sort_catragory_product_by_gender_skin_type_and_concern() throws InterruptedException {
	 object.sortProduct();
	}

	@Then("check that user is able to scroll the product")
	public void check_that_user_is_able_to_scroll_the_product() throws InterruptedException {
	  object.ableTOScroll();
	}

	@Then("user select a product and goes to checkout")
	public void user_select_a_product_and_goes_to_checkout() throws InterruptedException {
		object.selectAProductCheckout();
	}
	
	
	
}
