Feature: Guru 99 Login
  Scenario:successfully login to Guru 99
    Given I go to Website OK...
    When I enter the URLSSSS "http://demo.guru99.com/test/login.html"
    And Enter registered name and passwords
      | user          | password    |
      | lightyear9461 | Avadh@20090 |
    #/html/body/div[4]/div/div/h3
    And User must successfully login to the Web server
    Then I close My browser

