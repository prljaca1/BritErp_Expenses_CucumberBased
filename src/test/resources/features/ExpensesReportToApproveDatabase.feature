
Feature: As a Expense manager2 I should able to approve or disapprove  the expense result
 # @BRIT-408
@we
  Background:
    Given user is on the login page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    Then Expenses title should be displayed
    And user should click Expenses button
  @back
  Scenario:verify info in database
    And user click on Expenses Report to Approve
    And Expenses Report to Approve should display
    And user click on create button
    When user click and run the epmloyees dropdown
    Then the following employees  should be in database
      |Demo User       |
      |Hans Anders     |
      |Ashley Presley  |
      |Famke Jenssens  |


  @see
  Scenario Outline: verify the following info in the database
    Given Expenses Report to Approve should display
    And user click on create button
    When user should enter the Expense Summary Report "<box>"
    And user click and sellect from the Employee box
    Then user click on save buttonThen all the following should be in database
    Examples:
      |box             |
      |gitf            |
      |travel to london|
      |travel Expenses |
      |lunch Expenses  |

