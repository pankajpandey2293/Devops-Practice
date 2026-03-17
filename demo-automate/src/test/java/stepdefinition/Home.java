package stepdefinition;

import Pageobject.Homepagecode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Home {

	Homepagecode obj = new Homepagecode();

	@Given("user launch url")
	public void user_launch_url() throws InterruptedException {
		
	}

	@Given("user click on all Bestseller catagory")
	public void user_click_on_all_bestseller_catagory() {
		
		obj.Bestseller();	
	
	}

	@Given("user click on haircare catagory")
	public void user_click_on_haircare_catagory() throws InterruptedException {
		obj.Haircare(); 
	}

	@Given("user click on skincare catagory")
	public void user_click_on_skincare_catagory() {
		obj.Skincare();
	}

	@Given("user click on Bath & BOdy catagory")
	public void user_click_on_bath_b_ody_catagory() {
		obj.Bath();
	}

	@Given("user click on Gifting catagory")
	public void user_click_on_gifting_catagory() {
	  obj.Gifting();
	}

	@Given("user click on Men catagory")
	public void user_click_on_men_catagory() {
	    obj.men();
	}

	@Given("user click on Wellness catagory")
	public void user_click_on_wellness_catagory() {
	  obj.Wellness();
	}

	@Given("user click on Website exclusive catagory")
	public void user_click_on_website_exclusive_catagory() {
	 obj.Website_exclusive(); 
	}

	@Given("user click on All Product catagory")
	public void user_click_on_all_product_catagory() {
	  obj.All_Product(); 
	}

	@Given("user click on hamburgor icon")
	public void user_click_on_hamburgor_icon() throws InterruptedException {
	 
		obj.hamburgurIconCheck();
	}

	@Given("user click on close the hamburgor icon")
	public void user_click_on_close_the_hamburgor_icon() throws InterruptedException {
		obj.hamburgurClose();
	}


	@Then("user click on sign in")
	public void user_click_on_sign_in() {
		obj.signInButton();
	}

	@Then("user click on Register")
	public void user_click_on_register() {
	  obj.register();
	}
//
//	@Given("user launch the URL")
//	public void user_launch_the_url() {
//	    
//	}

	@Then("user click on My cart")
	public void user_click_on_my_cart() {
		
	obj.mycart();
		
	}

	@Then("user click on My account")
	public void user_click_on_my_account() {
	  obj.account(); 
	}

	@Then("user click on My wish list")
	public void user_click_on_my_wish_list() {
	  obj.wishlist();
	}

	@Then("user click on Track my order")
	public void user_click_on_track_my_order() {
	   obj.trackorder();
	}

	@Then("user click on mini cart icon")
	public void user_click_on_mini_cart_icon() {
	 obj.minicart();
	}

	

	@Then("user click on all product link on the footer")
	public void user_click_on_all_product_link_on_the_footer() {
	   obj.allProduct();
	}

	@Then("user click on skin care")
	public void user_click_on_skin_care() {
	  obj.skin();
	}

	@Then("user click on Hair care")
	public void user_click_on_hair_care() {
	  obj.hair();
	}

	@Then("user click on Bath & Body")
	public void user_click_on_bath_body() {
	   obj.bath();
	}

	@Then("user click on Men")
	public void user_click_on_men() {
	  obj.men();
	}

	@Then("user click on Best seller")
	public void user_click_on_best_seller() {
	  obj.best();
	}

	@Then("user click on Gifting")
	public void user_click_on_gifting() {
	 obj.gift();
	}

	@Then("user click on E -gift card")
	public void user_click_on_e_gift_card() {
	 obj.ecard();
	}

	@Then("user click on News & Media")
	public void user_click_on_news_media() {
	   obj.press(); 
	}

	@Then("user click on Delivery and returns")
	public void user_click_on_delivery_and_returns() {
	obj.del();
	}

	@Then("user click on FAQ")
	public void user_click_on_faq() {
	   obj.faq();
	}

	@Then("user click on Privacy Policy")
	public void user_click_on_privacy_policy() {
	    obj.privat();
	}

	@Then("user click on Term and use")
	public void user_click_on_term_and_use() {
	 obj.term();  
	}

	@Given("user click on About us")
	public void user_click_on_about_us() {
	obj.about();
	}

	@Then("user click on Ingredients")
	public void user_click_on_ingredients() {
	 obj.ingredients();   
	}
	
//	@Then("user click on all Ingredients")
//	public void user_click_on_all_ingredients() {
//	
//	}

	@Then("user click on Amaaya Rewards")
	public void user_click_on_amaaya_rewards() {
	   obj.amaya();
	}

	@Then("user click on Kama Experience")
	public void user_click_on_kama_experience() {
	    obj.experience();
	}

	@Then("user click on Store locator")
	public void user_click_on_store_locator() {
	  obj.store();
	}

	@Then("user click on  Careers")
	public void user_click_on_careers() {
	   obj.career();
	}

	@Then("user click on Promotions")
	public void user_click_on_promotions() {
	   obj.promo();
	}

	@Then("user click on Blogs")
	public void user_click_on_blogs() {
	  obj.blogg();
	}

	@Then("user click on Hotel & Spa")
	public void user_click_on_hotel_spa() {
	  obj.hotel();  
	}

	@Then("user click on International Website")
	public void user_click_on_international_website() {
	  obj.international();
	}

	@Then("user click on India Website")
	public void user_click_on_india_website() {
	obj.national();
	}

	@Then("user click on Naz helpline")
	public void user_click_on_naz_helpline() {
		obj.naz();
	}

	@Given("user click on Kama logo")
	public void user_click_on_kama_logo() {
	   obj.logo();
	}

	@Given("user click on Search bar")
	public void user_click_on_search_bar() {
	   obj.search();
	}

	@Then("user enter keyword on the search bar")
	public void user_enter_keyword_on_the_search_bar()throws InterruptedException {
		obj.searchText();
	}
//	
//	@Then("user enter search on the search bar")
//	public void user_enter_keyword_on_the_search_bar()  {
//	
//	}

	@Then("user click on back button")
	public void user_click_on_back_button() throws InterruptedException {
	obj.searchBack();
	}

	@Given("user click on INR")
	public void user_click_on_inr() throws InterruptedException {
	  obj.currency();
	}


	
	
}
