@smoke
Feature: Mary_Web_AddToCart_RecommendedItems

Background:
Given Launch the given URL "https://www.automationexercise.com/"

Scenario: Add to cart from recommended items
When Scroll to bottom of home page
And verify Recommended items are visible
And click on add to cart
And click on cart button
And verify if the products are displayed
