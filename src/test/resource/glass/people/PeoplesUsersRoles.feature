Feature: Show Users's and People's roles

  Background:
      Given You are on the Temp - Project Configuration Documentation site

  Scenario:Add users and roles
    When I click on the people section
    And I click on the Users and Roles link
    And I click on the Add users to a role icon
    And I add Simple User as Developer
    And I save the Developers name and quantity
    And I click on the Glass documentation
    And I click on the people section
    Then I have to see the same data like on the Users and Roles site


  Scenario:Remove users and roles
    When I click on the people section
    And I click on the Users and Roles link
    And I click on the Simple User delete button
    And I save the Developers name and quantity
    And I click on the Glass documentation
    And I click on the people section
    Then I have to see the same data like on the Users and Roles site

  Scenario:Compare users and roles
    When I click on the people section
    And I save the Administrators name and quantity
    And I click on the Users and Roles link
    Then I have to see the same data like on the People section of the Glass Documentation

  Scenario:Compare the num of jira-administrators
    When I click on the people section
    And I save the Administrators name and quantity
    And navigate to Administration group site
    Then I have to assert the num of the jira-administrators user quantity


