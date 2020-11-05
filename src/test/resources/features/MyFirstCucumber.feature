@SmokeTest

Feature: Super awesome feature

  Scenario: Open browser at least
    Given Open Chrome browser
    When I open https://www.ss.com
    Then Open dogs category
    And I set dogs min and max age


  Scenario: Open browser at least
    Given Open Chrome browser
    And I open https://www.ss.com
    When Open cars category
    Then I choose min and max price
    And I select min year
    And I set engine type
    And I select color
    And I press search button

