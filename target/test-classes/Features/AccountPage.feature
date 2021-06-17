
Feature: AccountPage

Scenario: Verify Account Page
Given Application should be launched with <url>
When User enters userid and password
When user clicks on login button
Then user navigated to homepage
And  user clicks on account link
Then user navigated to accounts page
Then user creates new account
Then user clicks on logout link

