Feature: Facebook account creation validation4
As a user I should be able to open facebook home page and perform validations

Scenario: Validate first name field41
Given user is on the facebook login page
When user enters first name
Then user checks user first name is present

#Scenario: Validate create user multiple fileds
#Given user is on the facebook login page
#When user enters first name And user enter surname
#Then  user checks user first name is present And user cheks user surname is present
#But User mobile field should be blank
