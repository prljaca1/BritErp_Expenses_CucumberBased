@an
Feature: Search Functionality
	
	#@BRIT-4265 Search Available
	Background:
		Given user is on the login page
		When user logs in using "in_ex_manager2@info.com" and "LLighg89"
		Then Expenses title should be displayed
		And user should click Expenses button



		  Given  User should able be to use Search functionality from all functionalities  
		  When User should be able to click "Expenses Reports"
		  Then Search functionality displayed located on same place
		  
		  Scenario: Verify search functinality displayed 
		   When User click "Expenses Reports to Approve "
		   Then User should verify that seach functonality still displayed



  # @BRIT-4278
	Scenario: Verify search functionality has 'Favorite' button
		When User should  click search icon
		And User should able to see Group By button and By group button
		Then  User should able to click Favorite button

	Scenario: Verify that user can select option from 'Favorite' dropdown list
		When user clicks  'Favorite' Button
		And user select option from dropdown list
		Then user should verify that option is selected

	Scenario Outline:
		When user clicks  'Favorite'  button
		And user select one of the option from Add an item dropdown list with index '<name>'
		Then user should verify that option is selected from AddItem dropdown

		Examples:
			| name                 |
			| My Expenses to Submit|
			| Save current search  |
			| Add to my Dashboard  |

		#	@BRIT-4277

Scenario: Verify Search Funtioanlity has
		When User should  click search icon
		And User should able to see Group By button and By group button
		Then  User should able to click Group By button

	Scenario: Verify that user can select option from Group By dropdown list
		When user clicks  Group By Button
		And user select option from dropdown list
		Then user should verify that option is selected

	Scenario Outline:
		When user clicks  Group By  button
		And user select one of the option from Add an item dropdown list with index '<name>'
		Then user should verify that option is selected from AddItem dropdown

		Examples:
			| name           |
			| Report         |
			| Product        |
			| Expenses Month |
		   
		   
		   
		   