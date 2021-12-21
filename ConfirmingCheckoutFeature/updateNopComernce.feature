Feature: MyAccount-Login Feature
  Description: This feature will test a Login feature

  #Simple login without parameters
  #Scenario: Log-in with valid username and password
  #Given Open the browser
  #When Enter the URL "http://practice.automationtesting.in/"
  #And Click on My Account Menu
  #And Enter registered username and password
  #And Click on login button
  #Then User must successfully login to the web page
  #Simple login without parameters

  #Scenario: Log-in with valid username and password
  #Given Open the browser
  #When Enter the URL "http://practice.automationtesting.in/"
  #And Click on My Account Menu
  #And Enter registered username "pavanoltraining" and password "Test@selenium123"
  #And Click on login button
  #Then User must successfully login to the web page
  #Simple login without parameters

  #Simple login with scenario Outline & Examples Keyword
  #Scenario Outline: Log-in with valid username and password
  # Given Open the browser
  #When Enter the URL "http://practice.automationtesting.in/"
  #And Click on My Account Menu
  #And Enter registered username "<username>" and password "<password>"
  #And Click on login button
  #Then Very login
  #Examples:
  # | username        | password         |
  # | pavanoltraining | Test@selenium    |
  # | pavanol         | Test@selenium123 |
  # | pavanol         | Test@selenium    |


  #Simple login with Data table params
 	# Scenario: Log-in with valid username and password
  # Given Open the browser
  # When Enter the URL "http://practice.automationtesting.in/"
  # And Click on My Account Menu
  # And Enter registered username and password
  #    | pavanoltraining | Test@selenium123 |
  # And Click on login button
  # Then User must successfully login to the web page


   #Simple login with Data table params with header
  Scenario: Log-in with valid username and password
    Given Open the browsers
    When Enter the URLS "https://demo.nopcommerce.com/"
    And Click on register

    And Enter registered username and passwords
      | user                     | password |
      | lightyear9461@gmail.com | M630ela1 |

    And Click on login buttons
    And User must successfully login to the web pages
    And I will click on electronics website
    And will click on cell billing_phone
    Then I will pick a choice of my desired phone

     #   And now i will select my country
    And  I will do shiping methods
    And now i will select my payment method cash or card
    And I click on continue button
    And then I will see payment information
    And  now i will confirm my i Order is place susscefuully