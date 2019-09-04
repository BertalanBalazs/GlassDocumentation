Feature: Create and handle workflows as an admin

  Background: User is logged in as admin
    Given I visit the login page
    When I enter my username and password
    Then I should be logged in

  Scenario Outline: To check if it is possible to create a new workflow when logged in as an admin.
    Given I visit the following "link"
    When I click on the Add workflow menu
    Then a new prompt shows up that asks for a Name and a Description for a new project

    Examples: link
      | https://jira2.codecool.codecanvas.hu/secure/admin/workflows/ListWorkflows.jspa |


    Scenario Outline: Check the correct workflow is shown
      Given I am on "url"
      When I click on Issue Types menu
      And I select TestIssue
      Then a Workflow box shows the workflow associated with TestIssue

      Examples: url
        | https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass |

  Scenario Outline: Check that the workflow transitions are correctly shown on issue page
      Given I am on "url"
      When I clik on the Issue Types
      And I click on TestIssue
      Then I see a Workflow Transitions box with the following elements: Create, Start Progress, Review Problem, Finish Issue, Close Issue

      Examples: url
        | https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass |

    Scenario Outline: Workflow appears on the settings page outside of glass
      Given I visit "ur>"
      Then "custom workflow name" appears on the page

      Examples: url
        | https://jira2.codecool.codecanvas.hu/plugins/servlet/project-config/DEMO/workflows