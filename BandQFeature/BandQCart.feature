Feature: Placing order
  Scenario: Place order
    Given Open the browsers
    When Enter the URLSS "http://practice.automationtesting.in/"
    And I click on Shop
   When I click on  Add to basket
    And I click on checkout
  And I order is placed successfully
    And I add my billing detail


