Feature: Compare permissions from glass with permissions from csv

  Scenario Outline: Glass permissions
    Given I am logged in as system admin
      And I am on the Permission Test Project page
    When I click on the Permissions button
    Then Ensure it displays the right permissions for the different roles

    Examples:
