
Feature: login functionality

  Background:
    Given user is on the login page

  Scenario:  As a manager login the page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    Then Expenses title should be displayed
    And user should click Expenses button
  @wip
  Scenario: As an officer login the page
    When user logs in using "in_ex_officer2@info.com" and "LLighg94"
    Then Expenses title should be displayed
    And user should click Expenses button












