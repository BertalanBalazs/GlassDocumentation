Feature: Check if the issuetype icons on the glass page are the same as the ones the scheme contains

  Scenario: Temp scheme is applied
    Given I am logged in as an admin
    And The following scheme is applied to the project:
      |Bug|
      |Task|
      |TestIssue|
      |Story|
    When I go to the project page
    Then I see the icons related to the scheme
