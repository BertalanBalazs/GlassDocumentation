@CheckComponent

Feature: Check Components

  Scenario: Check if we see the recently created version in Glass addon.
    Given I am logged in as system adminRole.
    And I am on the Project components page.
    When I fill the Version name input field with TestComponent text.
    And I fill the Default assignee input field with Unassigned text.
    And I click on the the Add button next to the new component input screen.
    And I go to the Glass documentation.
    Then I see the TestComponent version in the list.