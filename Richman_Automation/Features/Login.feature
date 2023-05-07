Feature: Testing Login functionality to the application
Scenario: User can be login with valid credential

Given User will open the browser
And Navigate to the browser
When User click on the profile icon
And User enter valid username
And User enter valid password
And User click on the signin button
Then User should be able to see username on the screen
