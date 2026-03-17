@checkout @sanity
Feature: Test the checkout Functionality 
 

  @check @uat @dev @prod @pay
  Scenario: Check out for guest user 
    Given user launch url
    And user select a Product 
    Then user click on  a product
    Then user click on Buy now 
    Then user fill up the add shipping Address form 
    Then User click on Proceed to payment 
    Then User click on the payment method 

  @check @uat @dev @prod @pay
  Scenario: Check out functionality for signin user
    Given user launch url
    And user click on hamburguer icon 
    When user click on sign in button 
    Then user enter mobile no 
    Then user click on Send Otp button 
    Then user click on Verify OTP Button 
    And user select a prod 
    Then user click on buynow
    Then user select an address 
    Then user click on Proceed to checkout
    
    @new
   Scenario: Check out functionality with select a product and fill a new address 
   Given user launch url 
   And user click on hamburguer icon 
   When user click on sign in button 
   Then user enter mobile no 
   Then user click on Send Otp button 
   Then user click on Verify OTP Button
   And user select a product and procced to checkout 
   Then user select on add new adress and fill a new address 
   And user click on  proceed to payment 
    
    
    

   
