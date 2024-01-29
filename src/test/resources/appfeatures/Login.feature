Feature: Login funcitionality
Scenario: Login to application
Given I am at the login page
When I enter the credentials
And I click on login button
Then I should be able to login

Scenario: validate title of page
Given I am at the login page
Then I should see title of page