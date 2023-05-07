
Feature: Testing Login functionality to the application

Scenario: User will be able to login with valid credential 

Given User opens the browser
And User navigates to "https://www.hotwire.com/"

When User clicks on the Sign In button
And User Enters the email
And User Enters the password

Then The user is successfully logged in and username is displayed
And User is navigated to home page