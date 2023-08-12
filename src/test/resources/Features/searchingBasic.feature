Feature: Search Functionality
  Background:
    Given User on the Amazon website

  Scenario: Search for a valid product (single and multiple words)
    When User enter following keywords in the search bar and should see list of results for:
    | coffee |
    | coffee maker |
    | apple |
    | apple syrup |

  Scenario: Search for an invalid product
    When User enter "fosoro" in the search bar
    And User click the search button
    Then User see a message that no results were found for "fosoro"

  Scenario: Search with autosuggestions
    When User typing "iPhone" in the search bar
    Then User should see a list of autosuggestions for "iPhone"

  Scenario: Search with special characters




