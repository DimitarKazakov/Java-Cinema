Feature: feature to test login functionality

  Scenario: Check login is successfull with correct credentials
    Given user in on login page
    When users enters username and password
    And clicks on login button
    Then user is navigated to the home page