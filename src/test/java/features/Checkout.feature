@Checkout
Feature: Add Product
  @checkout-valid
  Scenario: checkout product
    Given user is on login page checkout
    And user input username checkout with "standard_user"
    And user input password checkout with "secret_sauce"
    And user click login button checkout
    And user click button Add to chart product checkout
    And user click shopping chart checkout
    And user click button checkout
    And user input firstname with "Mala"
    And user input lastname with "Fauzana"
    And user input portalcode with "1130"
    And user click button continue
    When user click button finish
    Then user see finish page