@SmokeTest

Feature: Super awesome feature


  Scenario: Open dogs page and configure it
    Given Open Chrome browser
    And I open https://www.ss.com
    When Open dogs category
    Then I set dogs min and max age
    And I press search button

  @Wip
  Scenario: Open cars page and configure it
    Given Open Chrome browser
    And I open https://www.ss.com
    When Open cars category
    Then I choose min and max price
    And I select min year
    And I set engine type
    And I select color
    And I press search button

