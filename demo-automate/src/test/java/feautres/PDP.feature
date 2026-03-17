
 @sanity 
Feature: PDP scenerio check 
 

   
  	Scenario: PDP Page socialmedia icon  and review button check 
    Given user launch the url
    And user click on a product 
    Then user click on share facebook icon 
    Then user click on share twitter icon
    Then user click on write a review icon 
  
    Scenario: PDP Page image slide and simpl payment check 
    Given user launch the url
    And user click on zoom icon on the image 
    Then user click on click on image slide 
    Then user click on simpl icon on the pdp page 
    
   Scenario: PDP Page product variant and offer check 
    Given user launch the url
    Then user select a product 
    And user click on various variant of the product 
    Then user click on offers and route to promotion page  

   Scenario: PDP Page Pincode Availability
    Given user launch the url
    Then user select a product for pincode check 
    Then user enter  pincode for different location valid and invalid (Both) 
    
  
   Scenario: add to bag and minicart functionality check on pdp 
    Given user launch the url
    Then user select a product 
    And User select add to bag 
    And User click on mini cart 
    And User goes to checkout
    
   @pdp
    Scenario: Select a product and Click on buy now 
    Given user launch the url
    Then user choose a product  
    And click on buy now  
 
     
     
    

 
