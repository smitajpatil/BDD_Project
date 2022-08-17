Feature: Ecommerce application

Background:  User logs in
Given User should be on loginpage
When User enter the uname and pswrd
And User clicks on button for login
Then  User logged in
 
Scenario:  User search and add to cart
Given User search for iphone 
When User adds iphone to the cart
Then iphone added to the cart
 
Scenario:  User searches smartphone and adding to cart
Given User searching oneplusnord 
When User adding oneplusnord to the cart
Then oneplusnord added in cart