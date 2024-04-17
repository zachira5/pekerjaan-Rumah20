@login
Feature: Login

  @valid-login
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user click button Add to chart product
    When user click shopping chart
    Then user see chart page
