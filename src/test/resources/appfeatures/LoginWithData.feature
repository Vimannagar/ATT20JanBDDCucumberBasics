Feature: Login by entering credentials
Scenario: Login with valid data
Given user is at loginpage
When user enters the username as "testuser"
And user enters "Test@1234" as password
And user click on login 1 button
Then user should be able to logged in