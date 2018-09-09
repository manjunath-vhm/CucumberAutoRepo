Feature: Facebook account creation validation8
As a user I should be able to open facebook home page and perform validations

Scenario: Validate first name field81
Given user is on the facebook login page
When user enters first name
Then user checks user first name is present
Then close the browser

Scenario: Validate create user multiple fileds82
Given user is on the facebook login page
When user enters first name 
And user enter surname
Then  user checks user first name is present 
And user cheks user surname is present
Then User mobile field should be blank
Then close the browser
