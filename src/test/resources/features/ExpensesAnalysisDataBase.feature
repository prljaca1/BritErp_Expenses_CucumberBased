
@aysha
Feature: DataBase verify
     Scenario Outline: verify manager should able to see created new expense description in database
       Given User logs in with manager credentials and reach ExpensesAnalysis page
       And user click on List Icon
       And user click on create button
       When user fills the fileds'<Expense_Description>','<Product>','<Unit Price>','<Quantity>','<Employee>' on expense description
       And click Save button
       Then verify '<Expense_Description>' in Database
       Examples:
         |Expense_Description          | Product       | Unit Price  | Quantity           | Employee     |
         | Sprint Planing Meeting      |[EXP] Expenses |   156.00    |   3                |Demo User     |












