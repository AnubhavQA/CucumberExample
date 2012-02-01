Feature: To search for QAI
	To find information about QA Infotech
	As a user
	I want to make a bing for QA Infotech

	Scenario: Search for QAInfotech
		Given I am on Bings's home page
		When I enter the keyword "QA Infotech"
		And click the Submit button
		Then the page title should be "QA Infotech - Bing"