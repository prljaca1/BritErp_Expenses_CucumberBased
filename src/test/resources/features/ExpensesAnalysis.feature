
Feature: Expenses Analysis
  Background:
    Given user is on the login page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    And Expenses title should be displayed
    And user should click Expenses button

     #BRIT-4045 (http://jira.cybertekschool.com/browse/BRIT-4045)
    Scenario: Verify system should able to display Expenses Analysis is visible and clickable.
    And system displays Expenses Analysis title
    Then user should click Expenses Analysis title


     #BRIT-4253 (http://jira.cybertekschool.com/browse/BRIT-4253)
    Scenario:Verify Measure dropdown button is visible,clickable and its menu
     Then user should click Expenses Analysis title
     And system displays Measure dropdown
     And user should click Measure button
     Then Measure button's menu has following options
     | Total      |
     | Unit Price |
     | Quantity   |
     | Subtotal   |
     | Count      |

       @an #BRIT-4296 (http://jira.cybertekschool.com/browse/BRIT-4296)
      Scenario:Verify 3 graphic icons: "Bar Chart", "Line Chart", "Pie Chart" are visible and clickable next the  "Measures" dropdown button.
        And user should click Expenses Analysis title
        And system displays three graphic icons next to Measure button
        | Bar Chart |
        | Line Chart|
        | Pie Chart |
        Then user should click graphic icons

       #BRIT-4297 ( http://jira.cybertekschool.com/browse/BRIT-4297 )
       Scenario: Verify user should able to see 4 actions "Graph","Pivot","List" and "Kanban" actions on the  right  upper side of the page under "Filter" functionality .
         And user should click Expenses Analysis title
         And system displays four actions under Filter functionality
         | Graph |
         | Pivot |
         | List  |
         | Kanban|
         Then user should click four actions
