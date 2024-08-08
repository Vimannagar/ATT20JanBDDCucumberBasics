Feature: Order functionality
Background:
Given user should be logged into the app
When user clicks on order button

Scenario: Fetching previously placed order info
When User clicks on past order button
Then user should be able to see past order information

Scenario: Fetching currently placed order info
When user clicks on current order button
Then user should be able to see the current order information

Scenario: Fetching cancelled order order info
When user clicks on cancelled order button
Then user should be able to see the cancelled order information
