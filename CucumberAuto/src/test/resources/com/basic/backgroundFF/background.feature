Feature: Facebook account creation validation1
As a user I should be able to open facebook home page and perform validations

Background: 
Given user is on the facebook login page

Scenario: Validate first name field11
When user enters "David" first name
Then user checks user "David" first name is present
Then close the browser

Scenario: Validate create user multiple fileds12
When user enters "David" first name 
And user enter "Roger" surname
Then  user checks user "David" first name is present 
And user cheks user "Roger" surname is present
Then User mobile field should be blank
Then close the browser
