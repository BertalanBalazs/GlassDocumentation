Feature: Check Versions

  Scenario: Check if we see the recently created version in Glass addon.
    Given I am logged in as system admin.
    And I am on the Project page.
    When I click on Releases text option.
    And I fill the Version name input field with TestVersion text.
    And I click on the the Add button next to the new version input screen.
    And I click on the Glass documentation option.
    And I click on the Version text option.
    Then I see the TestVersion version in the list.