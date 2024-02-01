@campaigns
Feature: Sending campaign functionality
@sanity
Scenario: Create campaign
Given user is at campaigns page
When user click on create campaign button
And user enters the information
And user click on save button
Then Campaign should get

@regression 
Scenario: Schedule a campaign
Given user is at campaigns page
When user click on edit campaign
And user enters the time
Then campaign should get scheduled

@functional @regression
Scenario: Send campaign
Given user is at campaigns page
When user click on send campaign
Then campaign should get sent to contacts


