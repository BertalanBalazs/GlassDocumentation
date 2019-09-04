Feature: Check if the issuetype icons on the glass page are the same as the ones the scheme contains

  Scenario: toDo
    Given Admin user is on the "project page"
    And I have "scheme" that is applied to the "project"
    When I go to the "glass documentation" page
    Then I see the "icons" related to the "scheme"