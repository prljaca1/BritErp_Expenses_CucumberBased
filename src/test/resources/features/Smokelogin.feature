@smoke
Feature: log in functionality
  Scenario Outline: As a manager and an officer login the page
    Given user is on the landing page
    When user logs in using "<user_email>" and "<user_password>"
    And system displays Expenses Analysis title
    Then the title should be "#Inbox-Odoo"

    Examples:
      | user_email                    | user_password     |
      | in_ex_manager2@info.com       |   LLighg89        |
      | in_ex_officer2@info.com       |   LLighg94        |

#    Scenario: As an officer login the page
#      Given user is on the login page
#      When user logs in using "in_ex_officer2@info.com" and "LLighg94"
#      And Expenses title should be displayed
#      And user should click Expenses button
#      And system displays Expenses Analysis title
#      Then user clicks on Expenses Analysis

