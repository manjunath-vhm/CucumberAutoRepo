@Important
Feature: Facebook account creation validation11
As a user I should be able to open facebook home page and perform validations

@Smoke
Scenario: Validate first name field111
Given user is on the facebook login page
When user enters "David" first name
Then user checks user "David" first name is present
Then close the browser

@Smoke @Regression
Scenario: Validate create user multiple fileds112
Given user is on the facebook login page
When user enters "David" first name 
And user enter "Roger" surname
Then  user checks user "David" first name is present 
And user cheks user "Roger" surname is present
Then User mobile field should be blank
Then close the browser


Scenario: Validate first name field113
Given user is on the facebook login page
When user enters "David" first name
Then user checks user "David" first name is present
Then close the browser

@Regression
Scenario: Validate create user multiple fileds114
Given user is on the facebook login page
When user enters "David" first name 
And user enter "Roger" surname
Then  user checks user "David" first name is present 
And user cheks user "Roger" surname is present
Then User mobile field should be blank
Then close the browser

@Smoke
Scenario: Validate first name field115
Given user is on the facebook login page
When user enters "David" first name
Then user checks user "David" first name is present
Then close the browser



