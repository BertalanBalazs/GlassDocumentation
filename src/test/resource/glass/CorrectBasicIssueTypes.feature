@correctBasicIssueTypes
Feature: Check if the issuetype icons on the glass page are the same as the ones the scheme contains

  Background:
    Given I am logged in as an admin
    And The scheme with the following IssueTypes are applied to the project:
      |Bug|
      |Task|
      |TestIssue|
      |Story|

  Scenario: Check whether icons on the glass page are the same as the scheme
    When I go to the project page
    Then I see the icons related to the scheme

  Scenario: Icons on the glass dropdown are the same as the scheme
    When I go to the project page
    And I click on the Issue Types dropdown
    Then I see the Issue Types related to the scheme
