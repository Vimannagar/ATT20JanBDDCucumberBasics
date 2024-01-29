Feature: Signup functionality
Background:
Given user is at signup page

Scenario Outline: validating signup for multiple users
When user enters "<name>" inside the form
And user enters age as <age>
And user confirms the "<gender>" by checkbox
Then user account gets created

Examples:
| name | age | gender |
| Eder | 23 | Male |
| Ron | 32 | Male |
| Daniel | 40 | Male |
| Diana | 25 | Female |