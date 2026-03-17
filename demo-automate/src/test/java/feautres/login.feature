 @sanity @logreg

Feature: Signin and Register functionality functionality 
 

	@prod @uat @dev
  Scenario: verify login with valid details 
    Given user launch url
    And user click on hamburguer icon 
    When user click on sign in button 
    Then user enter mobile no 
    Then user click on Send Otp button 
    And user click on resend Otp button 
    Then user click on Verify OTP Button 
    
   
@prod @uat @dev
 	 Scenario:  verify login with InValid details 
 		Given user launch url
    And user click on hamburguer icon 
    When user click on sign in button 
    Then user enter invlid Text 
    Then user enter a random numeric value 
    Then user click on Send Otp button 
   
  @prod @uat @dev @usedno
    Scenario:  verify Register with already used phone no and Invalid text
 		Given user launch url
    And user click on hamburguer icon 
    When user click on Register button 
    Then user enter used mobile no and random text for registration.
    
    
  @prod @register @social
    Scenario:  verify Register with socail media (Google and facebook)
 		Given user launch url
    And user click on hamburguer icon 
    When user click on Register button 
    Then user click on google 
    Then user click on facebook 
 