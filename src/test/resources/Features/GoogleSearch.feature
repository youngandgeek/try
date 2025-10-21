Feature: feature to test google search functionality
  Scenario: Validate google search is working
    Given browse is open
    And  User is on google search page
    When user enters a text in search text area
    And hits enter
    Then User Navigated to search result