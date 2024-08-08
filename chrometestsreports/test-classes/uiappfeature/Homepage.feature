Feature: Homepage functionality
@sanity
Scenario: Validate title of page
Given I am at landing page
Then page title should have "Shopping"

@sanity
Scenario: verify cart icon
Given I am at landing page
Then cart icon should get display

@functional
Scenario: checkout deals section
Given I am at landing page
When I see the daily needs then I click on it

@regression
Scenario: Login to application
Given I am at landing page
When I click on signin button
And I enter the username as "8176867662"
And I enter the password as "123456" with final signin