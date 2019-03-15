
Feature: login functionality

  Background:
    Given user is on the login page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    Then Expenses title should be displayed
    And  user should click Expenses button


  Scenario Outline:  As a manager login the page
    When user should be able to click "Create" button

    And user should be able to send following product to the "<lunchProduct>" and "<quantity>" and "<unitPrice>"
    And user should Randomly enter product from dropdown
    And user should Rendomly enter Employee name from dropdown
    And user should be able to click save button
    Then lunch Product information should match database records

    Examples:
      |lunchProduct                |quantity  |unitPrice   |
      |6 ne                        |222222222 |2.2         |
      |Laetan                       |444444444 |5.7        |
      |Demokrasi                    |555555555 |5,6        |


  Scenario:  As a manager login the page
    When user should be able to click "Create" button
    Then user should be able to click Searh more buttun under the employe
    And verify that Depaertmants under the Employe list is mactches at the data base

  @w @db
  Scenario:  Verify that empoyee name at the excel files macths with the data bas
    And User should be able to verify that employe name from excel file is visiable at the data base
    And User should be able to verify that Department name from excel file is visiable at the data base






#  Scenario:  Verify the titles is display
#    Given user is on the login page
#    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
#    Then Expenses title should be displayed
#    And user should be able to click Expenses Button
#
#    Then following title should be Display:
#
#      |Expenses to Submit   |
#      |My Expenses          |
#      |Create               |
#      |Import               |
#
#  Scenario:  Verify that Expenses to summit is clickable
#    Given user is on the login page
#    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
#    Then Expenses title should be displayed
#    And user should be able to click Expenses Button
#    Then  user should be able to click Expenses to Submit   Button
#
#
#  Scenario:  Verify that import  button  is clickable and title is visiable
#    Given user is on the login page
#    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
#    Then Expenses title should be displayed
#    And user should be able to click Expenses Button
#    When user should be able to click "Create" button
#    Then following title should be Display on the createPage:
#
#      |Submit to Manager   |
#      |Expense Description |
#      |Save                |
#      |Discard             |
#      |Documents           |
#



  #=============================

 # @BRIT-4432 @Expenses @McLean @Tyson_06



#  Scenario Outline:  Verify that maneger should be able to fill up Expenses Desciription Table
#    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
#    Then Expenses title should be displayed
#    And user should be able to click Expenses Button
#    When user should be able to click "Create" button
##
#    Then  user should   sendKeys  "<Expense Description>" in Expense Description Line
###    And  user should be  choice product name from drapdown   "<Product>"
#    And  user should be  sendKeys  "<Unit Price>" in Unit Price line
#    And  user should be  sendKeys  "<Quantity>" in Quantity line
#    And  user should be  sendKeys  "<Bill Reference>" in Bill Reference line
###    And  user should be  sendKeys  "<Expense Date>" in Expense Date line
###    And  user should be  choice Employee from dropdown   "<Employee>"
###    And  user should be  choice Sale order from drop down  "<Sale Order>" in Sale order line
###    Then Menegar can click save button
##
#    Examples:
#      |Expense Description  |Unit Price        | Quantity      |Bill Reference|
#      |Regular  Expenses    |150               |  4            |Personel      |
#      |[EXP] Expenses       |25000             |  5            | Personel     |
##
#    Then Manger able to see Expense Description text at the DataBase
#    And  Manger able to see Product text at the DataBase
#    And  Manger able to see Unit Price text at the DataBase
#    And  Manger able to see Quantity text at the DataBase
#    And  Manger able to see Bil References  text at the DataBase
#
## @BRIT-4438 @Expenses @McLean @Tyson_06
#
#  Scenario: Verify that Sale order Button is clikable
#    When Manager should be able to click Sale order button
#    Then Manager should be able to click Search More  at Sale button
#    And Maneger Able to see Sale order title List
#    And Manger shoul be able check first name at the Sale order list same as Database
#
#      # @BRIT-4439 @Expenses @McLean @Tyson_06
#  @dene
#  Scenario:Verify that Manager should be able to click Search More button under Employee
#    When Manager sends keyword to the "<Employee>" following table
#      |Employee        |
#      |Ashley Presley  |
#      |David Samson    |
#    Then maneger able see  employee email at the List
#    And Manager able see employee email at the data base