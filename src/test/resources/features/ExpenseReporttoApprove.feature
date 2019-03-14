@mussei
Feature: As a Expense manager2 I should able to approve or disapprove  the expense result
 # @BRIT-4089
  Background:
    Given user is on the login page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    Then Expenses title should be displayed
    And user should click Expenses button
    And user click on Expenses Report to Approve
    And Expenses Report to Approve should display
  @nice
  Scenario:  verify create button is clickable
    And user click on create button
    Then create page should display
  @for
  Scenario: verify approve button is clickable
    And user click on create button
    And user should fill the Expense Summary Report box
    And user click and sellect from the Employee box
    And user click on Approve button
@just
  Scenario: verify save button is clickable
    And user click on create button
    And user should fill the Expense Summary Report box
    And user click and sellect from the Employee box
    And user click on save button
    Then the title should be Save
  @good
  Scenario Outline: verify edit button is clickable
    And user click on create button
    And user should fill the Expense Summary Report boxs"<box>"
    And user click and sellect from the Employee box
    And user click on save button
    And user click on edit button
    Then the title should be none
    Examples: expenses
      |box            |
      |lunch Expenses |
      |travel Expenses|
      #|trip to london |
      #|gift           |

@hope
  Scenario: verify the refuse button is clickable
    And user click on create button
    And user should fill the Expense Summary Report box
    And user click and sellect from the Employee box
    And user click on refuse button

  @fun
  Scenario Outline: verify search wether clickable
    And user click on x button
    And user enter "<word>" on search box and click
    And a new expenses page should display
    Examples:
      |word     |
      |paid     |
      |posted   |
    #  |refused  |
      #|submmited|

