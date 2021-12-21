Feature: I will log in Nopcommerce And I will Order A Phone Of My desired choice
  Scenario: I will log in Nopcommerce And I will order a phone
    Given User will go to browsers
    When User Enter the Web URL "https://demo.nopcommerce.com/"
    And User will click on the sign in button
    And User will and my registered username and password
      | user                    | password |
      | lightyear9461@gmail.com | M630ela1 |
    And User will click on the log in button
    And now User will go to the electronics page
    And User will click on the cell phone page
    And User will pick a phone of his choice
    And User will agree to the terms and conditions
    And now user will click on the phone and go to checkout
    And now the user will you same address or make a new address
    And user will enter the billing address
    And user will click on continue
    And user will select the Shiping methods
    And user will select the payment method
    And user will see payment information
    And user will confirm the Order
    Then i will close the window

