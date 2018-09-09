Feature: Facebook account creation validation3
As a user I should be able to open facebook home page and perform validations

Scenario: Validate create user multiple fileds31
Given user is on the facebook login page
When User Enters the following data
	|userName | userSurname | Mobile |
	| Nanu | Nane | 1234 |
	| Neenu | Neene | 4567 |
