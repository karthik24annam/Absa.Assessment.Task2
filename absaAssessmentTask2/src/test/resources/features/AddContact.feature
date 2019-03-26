Feature: Absa Assessment Add User Feature

Scenario: Add User1 Test Scenario
Given Navigate to URL
Then  Validate I am on User on the User List table
When  I Click Add User
Then  I enters firstName1 and lastName1 and userName1 and password1
Then  Select Customer1
Then  Select Role1
Then  I enters email1 and cell1
And   Click Save
And   Quit Browser

Scenario: Add User2 Test Scenario
Given Navigate to URL
Then  Validate I am on User on the User List table
When  I Click Add User
Then  I enters firstName2 and lastName2 and userName2 and password2
Then  Select Customer2
Then  Select Role2
Then  I enters email2 and cell2
And   Click Save
And   Quit Browser

	