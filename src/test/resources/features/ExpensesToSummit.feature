Feature: Check the title for each module in Lunch pageBackground:




  Scenario:  Verify the titles is display
    Given user is on the login page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    Then Expenses title should be displayed
    And  user should click Expenses button

    Then following title should be Display:

      |Expenses to Submit   |
      |My Expenses          |
      |Create               |
      |Import               |

  Scenario:  Verify that Expenses to summit is clickable
    Given user is on the login page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    Then Expenses title should be displayed
    And user should click Expenses button
    Then  user should be able to click Expenses to Submit   Button

  @smoke
  Scenario:  Verify that import  button  is clickable and title is visiable
    Given user is on the login page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    Then Expenses title should be displayed
    And user should click Expenses button
    When user should be able to click "Create" button
    Then following title should be Display on the createPage:

      |Submit to Manager   |
      |Expense Description |
      |Save                |
      |Discard             |
      |Documents           |


#    Then the following link is clickable
#    |Create   |
#Scenario: Verify that Expenses description table can be able to fill it up
#  Given user is on the login page
#  When user logs in using "in_ex_manager2@info.com" and "LLighg89"
#  Then Expenses title should be displayed
#  And user should be able to click Expenses Button
#  When user should be able to click "Create" button
#  #Then user should be able