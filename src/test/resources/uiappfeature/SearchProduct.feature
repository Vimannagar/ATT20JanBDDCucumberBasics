Feature: Search product
@regression
Scenario: verify search product functionality
Given I am at landing page
When I search the name as "mobile" in searchfield
Then I should get results