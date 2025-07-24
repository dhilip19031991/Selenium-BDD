
@smoke
Feature: Mary_Web_Add mobile to cart

Background:
Given Launch fURL "https://www.flipkart.com/"

Scenario Outline: User searches for mobile and adds it to cart
#When I click the 
When I search for the "<mobileName>"
And I apply filter "<brand>"
And I sort results by "<network_type>"
And I add mobile to the cart
Then the cart icon should display quantity "1"
And the cart page should list the mobile "<expected_mobile>"
And the total price in the cart should match the mobile's price

Examples: 
|mobileName|brand|network_type|expected_mobile|
|iPhone|Apple|4G|iPhone 15|





