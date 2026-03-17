package stepdefinition;

import Pageobject.PDPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PDP {

	PDPage obj = new PDPage();
	
	@Given("user launch the url")
	public void user_launch_the_url()  {
		
	}

	@Given("user click on a product")
	public void user_click_on_a_product() throws InterruptedException {
		obj.clickaproduct();
	}

	@Then("user click on share facebook icon")
	public void user_click_on_share_facebook_icon() throws InterruptedException {
	   obj.facebookIcon();
	}

	@Then("user click on share twitter icon")
	public void user_click_on_share_twitter_icon() throws InterruptedException {
	  obj.twitterIcon();
	}

	@Then("user click on write a review icon")
	public void user_click_on_write_a_review_icon() throws InterruptedException {
	  obj.reviewButton();
	}

	@Given("user click on zoom icon on the image")
	public void user_click_on_zoom_icon_on_the_image() throws InterruptedException {
	   obj.imageslide();
	}

	@Then("user click on click on image slide")
	public void user_click_on_click_on_image_slide() {
	  obj.closeimage();
	}

	@Then("user click on simpl icon on the pdp page")
	public void user_click_on_simpl_icon_on_the_pdp_page() throws InterruptedException {
	  obj.simpl();
	}

	@Then("user select a product")
	public void user_select_a_product() throws InterruptedException {
		obj.selectAProduct();
	}

	@Then("user click on various variant of the product")
	public void user_click_on_various_variant_of_the_product() throws InterruptedException {
	 obj.variant();
	}


	@Then("user click on offers and route to promotion page")
	public void user_click_on_offers_and_route_to_promotion_page() throws InterruptedException {
	   obj.offer();
	}

	@Then("user select a product for pincode check")
	public void user_select_a_product_for_pincode_check() throws InterruptedException {
	  obj.selectAProd();
	}

	@Then("user enter  pincode for different location valid and invalid \\(Both)")
	public void user_enter_pincode_for_different_location_valid_and_invalid_both() throws InterruptedException {
	 obj.checkPincode();
	}

	@Then("User select add to bag")
	public void user_select_add_to_bag() throws InterruptedException {
	  obj.selectProduct();
	}

	@Then("User click on mini cart")
	public void user_click_on_mini_cart() throws InterruptedException {
	   obj.minicart();
	}

	@Then("User goes to checkout")
	public void user_goes_to_checkout() throws InterruptedException {
	 obj.checkoutt();
	}	
	
	@Then("user choose a product")
	public void user_choose_a_product() throws InterruptedException {
	 obj.chooseAProduct();
	}

	@Then("click on buy now")
	public void click_on_buy_now() throws InterruptedException {
	  obj.clickOnBuyNow();
	}
	
}
