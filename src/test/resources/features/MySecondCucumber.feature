@SearchTest

Feature: Aliexpress search test

  Background:
    Given Open the Chrome browser
    Then Go to https://www.aliexpress.com/
    And Turn off popup windows

  Scenario: Enter search data and filter them
    Given I enter search term
    When I press search
    Then I turn off another popup window
    And I set min price
    And I set max price
    And I press ok

