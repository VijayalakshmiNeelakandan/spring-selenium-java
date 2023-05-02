Feature: Verify first returned Google search result and logo on Web Browser
  As a user I want to search for "J. P. Morgan" with Google
  And verify the first search result and J. P. Morgan logo on the search results page

  @regression
  Scenario: Verify first Google search result and logo on web for JP Morgan Search Term
    Given I am on the Google search page
    When I search for "J. P. Morgan" into the search box
    And I click on the first search result link on the page
    Then I landed on J. P. Morgan Home page
    And the logo should be displayed on the page

  @negativeCase
  Scenario: Verify first Google search result and J. P. Morgan logo for a different search term
    Given I am on the Google search page
    When I search for "j p morgan uk" into the search box
    And I click on the first search result link on the page
    And the J. P. Morgan Home page and the logo should not be displayed on the page
