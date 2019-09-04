Feature: Validate Scheme changes
  Scenario: Validate Issue Type Scheme change
    Given I am on the Select Issue Type Scheme page
    When I input admin credentials
    And I set Demo Issue Type Scheme for the project
    And I go to the project's Glass Documentation page
    And I click Schemes
    Then the Issue Type Scheme displays Demo Issue Type Scheme
