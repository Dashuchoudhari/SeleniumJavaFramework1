Feature: Feaure to be test google Search functionality

  Scenario: Validate google search working
    Given Browser is open
    And User is on the google search page
    When User enters a text in search box
    And hits Enter
    Then User is nevigated to search result
