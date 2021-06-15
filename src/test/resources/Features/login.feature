Feature: Valid Login feature
Scenario:  Valid Login
Given Application should be launched with <url>
When user enters valid userid and password
And user clicks on login button
Then user should be navigated to homepage
Then User should see the logout link
