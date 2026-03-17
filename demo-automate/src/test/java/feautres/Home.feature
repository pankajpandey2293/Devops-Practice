
@sanity
Feature: Homepage functionality
@uat @dev @prod @cat
Scenario: verify home page catagory 
Given user launch url
And user click on all Bestseller catagory
And user click on haircare catagory
And user click on skincare catagory  
And user click on Bath & BOdy catagory 
And user click on Gifting catagory
And user click on Men catagory 
And user click on Wellness catagory 
And user click on Website exclusive catagory
And user click on All Product catagory

@prod @uat @dev
Scenario: verify home page Hamburgor icon
Given user launch url 
And user click on hamburgor icon 
And user click on close the hamburgor icon 
Then user click on sign in 
Then user click on Register 
  
 @prod
Scenario: verify Header My icon 
Then user click on My cart 
Then user click on My account 
Then user click on My wish list 
Then user click on Track my order 
Then user click on mini cart icon 

#Durrento express 

@prod
Scenario: verify all Footer Shop section 

Then user click on all product link on the footer 
Then user click on skin care 
Then user click on Hair care
Then user click on Bath & Body
Then user click on Men 
Then user click on Best seller 
Then user click on Gifting 
Then user click on E -gift card


@prod
Scenario: verify all Footer Customer care section

 Then user click on News & Media 
 Then user click on Delivery and returns 
 Then user click on FAQ
 Then user click on Privacy Policy
 Then user click on Term and use 
 
 @prod
 Scenario: verify all Footer Quick links section
  Given user click on About us 
  Then user click on Ingredients 
  #Then user click on all Ingredients
  Then user click on Amaaya Rewards 
  Then user click on Kama Experience 
  Then user click on Store locator 
  Then user click on  Careers 
  Then user click on Promotions 
  Then user click on Blogs 
  Then user click on Hotel & Spa 
  Then user click on International Website 
  Then user click on India Website 
  Then user click on Naz helpline 
  
  @prod @uat @dev @search
	Scenario: Verify Logo click and search functionality 
  Given user click on Kama logo
  Given user click on Search bar 
  Then user enter keyword on the search bar 
  Then user click on back button 


  @prod @dev @uat
  Scenario: Verify currency click and check that swithing to international and national website 
  Given user click on INR 

   
  
  
  
  
 
 