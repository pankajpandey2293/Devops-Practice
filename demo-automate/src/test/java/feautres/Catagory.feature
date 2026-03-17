
Feature: Catagory page scenerio 
 

  
  Scenario: Check catagory page 
    Given user launch the URL 
    And user select a catagory 
    And validate user land on the correct catagory 
    And user applied the filter 
    Then user sort catragory product by Gender Skin type and concern 
   
    
@cato
 Scenario: Check catagory page product check out and scrolling 
  	Then check that user is able to scroll the product 
    And user select a product and goes to checkout 
    
    
    