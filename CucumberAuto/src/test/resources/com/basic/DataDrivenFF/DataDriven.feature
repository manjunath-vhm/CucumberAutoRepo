Feature: Facebook account creation validation2
As a user I should be able to open facebook home page and perform validations

Scenario Outline: Validate first name field21
Given user is on the facebook login page
When user enters "<user>" first name
And user enter "<surname>" surname
Then user checks user "<user>" first name is present
Then close the browser
Examples:
| user | surname |
| Tom  |	Jerry  |
| 1234  | 4567    |



