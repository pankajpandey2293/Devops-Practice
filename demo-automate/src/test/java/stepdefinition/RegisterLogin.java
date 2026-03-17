package stepdefinition;

import Pageobject.RegLog;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterLogin {

   RegLog obj1 = new RegLog();
	
	@Given("user click on hamburguer icon")
	public void user_click_on_hamburguer_icon() {
		obj1.hamburger();
		
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
		obj1.signinButton();
	}

	@Then("user enter mobile no")
	public void user_enter_mobile_no() {
		obj1.enterPhone();
	}

	@Then("user click on Send Otp button")
	public void user_click_on_send_otp_button() throws InterruptedException {
		obj1.sendOTP();
	}

	@Then("user click on resend Otp button")
	public void user_click_on_resend_otp_button() throws InterruptedException {
		obj1.resendOtp();
	}

	@Then("user click on Verify OTP Button")
	public void user_click_on_verify_otp_button() throws InterruptedException {
		obj1.verifyOTP();
	}

	@Then("user enter invlid Text")
	public void user_enter_invlid_text() throws InterruptedException {
	obj1.invalidMobile();
	}

	@Then("user enter a random numeric value")
	public void user_enter_a_random_numeric_value() throws InterruptedException {
		obj1.randonMobile();
	}

	@When("user click on Register button")
	public void user_click_on_register_button() {
		obj1.register();
	}

	@Then("user enter used mobile no and random text for registration.")
	public void user_enter_used_mobile_no_and_random_text_for_registration() throws InterruptedException {
		obj1.registerUsedMobileNo();
	}
	

	@Then("user click on google")
	public void user_click_on_google() throws InterruptedException {
	obj1.clickONGoogle();
	}

	@Then("user click on facebook")
	public void user_click_on_facebook() {
		
	}

}
