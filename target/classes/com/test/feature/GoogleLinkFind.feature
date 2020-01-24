Feature: Google Search

@RegressionTest
Scenario: Google Search for particular data
When start one
Given user is on Google page
When title of Google Page is displayed
Then type a text search
Then click on Google Search button
When search list displayed
Then find out where expected search result is displaying
Then close one