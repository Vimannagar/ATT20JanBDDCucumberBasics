Feature: Homepage functionality
Scenario: Validate title of page
Given I am at landing page
Then page title should have "Shopping"

Scenario: verify cart icon
Given I am at landing page
Then cart icon should get display

Scenario: checkout deals section
Given I am at landing page
When I see the daily needs then I click on it

Scenario: Login to application
Given I am at landing page
When I click on signin button
And I enter the username as ""
And I enter the password with final signin