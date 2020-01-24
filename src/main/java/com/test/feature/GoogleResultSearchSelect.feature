Feature: Auto result click

Scenario: Search Result clicking
When start two
Given user is in google page
When title of page is showing
Then search a text
Then select the third one
Then close two
