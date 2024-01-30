Feature: Open bank account
Scenario: Opening bank account with nominee details
Given user should be at account opening page
When user enters the following data
| firstname | lastname | email | mobile |
| Erin | smith | erin.smith@gmail.com | 9988776655 |
| Rob | Gilto | rob.gilto@gmail.com | 9977665544 |
And user click on submit button
Then user account get created