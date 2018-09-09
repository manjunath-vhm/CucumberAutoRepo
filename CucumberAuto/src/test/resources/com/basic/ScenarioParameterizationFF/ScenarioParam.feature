Feature: Facebook account creation validation9
As a user I should be able to open facebook home page and perform validations

Scenario: Validate first name field91
Given user is on the facebook login page
When user enters "David" first name
Then user checks user "David" first name is present
Then close the browser

Scenario: Validate create user multiple fileds92
Given user is on the facebook login page
When user enters "David" first name 
And user enter "Roger" surname
Then  user checks user "David" first name is present 
And user cheks user "Roger" surname is present
Then User mobile field should be blank
Then close the browser
