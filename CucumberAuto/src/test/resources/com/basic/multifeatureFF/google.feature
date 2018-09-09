@google
Feature: sample google page check7
As a user I should be able to fill selenium word and check in google page

Scenario: Validate google search for selenium71
Given user is on the google home page
When user "selenium" in search box
Then user checks selenium web browser automation page is present
Then close the google browser

