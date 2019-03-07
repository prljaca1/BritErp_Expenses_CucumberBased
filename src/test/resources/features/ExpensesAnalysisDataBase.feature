Feature: Verify Expenses

  Background:
    Given user is on the login page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    And Expenses title should be displayed
    And user should click Expenses button
    And user should click Expenses Analysis title
    When user should click "List" action
     #(http://jira.cybertekschool.com/browse/BRIT-4424)
    Scenario: verify manager should able to see all titles in database
      Then verify all title in database

      | Expenses Date        |
      | Expense Description  |
      | Employee             |
      | Total                |
      | Status               |

      #(http://jira.cybertekschool.com/browse/BRIT-4420)
  Scenario Outline: Verify MARCH expenses in Database

    Then verify  expenses of March "<Expenses Date>","<Expense Description>","<Employee>","<Total>","<Status>"

    Examples:
    | Expenses Date |  Expense Description    |  Employee         | Total      |  Status    |
    |  03/05/2019   |    presantation	      | Demo User	      |$ 365.00     | Reported   |
    |  03/04/2019	|   [EXP] Expenses        |	Antoine Langlais  |	$ 200.00    | Reported   |
    |  03/02/201    |   Kamal Belkati         |	Demo User	      |$ 1,600.00   | To Submit  |

      #(http://jira.cybertekschool.com/browse/BRIT-4423)
    Scenario:Verify how many i phone expense in the list

      Then verify under Expense Description how many i phone expenses in database

      #(http://jira.cybertekschool.com/browse/BRIT-4422)
    Scenario Outline: verify Manager should able to create a new expense

      And user should click on Create button
      When user should fill <Expense Description>,<Product>,<Unit Price>,<Quantity>,<Employee>,
      Examples:
        |Expense Description| Product       | Unit Price | Quantity | Employee      |
      | product devolop    |[EXP] Expenses |   256      |   1      |  David Samson|

        Then verify expense is created in database

         #(http://jira.cybertekschool.com/browse/BRIT-4421)
      Scenario Outline: verify on lthe list first 3 employee rows data in the database

        When user click on create button
        And user click on 'Employee' and then  click 'Search more'
        And Manager should see all  <Name>,<Work Phone>,<Work Email>,<Department>,<Job Position>,<Manager> title
        Then verify first 3 employees in database.

        Examples:
        | Name            | Work Phone      | Work Email     |  Department             |   Job Position   | Manager             |
        |Antoine Langlais|	+3281813700	     |antoine@odoo.com|	Research & Development	|Chief Technical   |Officer              |
        |Ashley Presley	  |+3281813700	     | ashley@odoo.com |Administration	Human Resources| Manager	|Pieter Parker        |
        |David Samson	  |+3281813700	      |david@odoo.com	|Research & Development  |	Experienced Developer|Antoine Langlais|




