@workflow
Feature: Workflow Creation & Handling

  Background:
    Given I am logged in as admin to Jira

  Scenario Outline: Check if possible to create workflow when logged in as admin
    Given I visit "<link>"
    When I click on the Add workflow menu
    Then I should see a new prompt shows up that asks for a Name and a Description for a new project

    Examples:
      | link      |
      | https://jira2.codecool.codecanvas.hu/secure/admin/workflows/ListWorkflows.jspa |

    Scenario Outline: Workflow box shows on issue page
    Given I am on "<link>"
    When I click on Issue Types menu
    And I select TestIssue
    Then a Workflow box shows the workflow associated with TestIssue
      And the Workflow Transition is also shown with the following elements: Create, Start Progress, Review Problem, Finish Issue, Close Issue

    Examples:
      | link |
      | https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass |

    Scenario Outline: Workflow is also visible in settings site
      Given I open "<link>"
      Then Test Workflow appears on the page

      Examples:
        | link |
        | https://jira2.codecool.codecanvas.hu/plugins/servlet/project-config/DEMO/workflows |