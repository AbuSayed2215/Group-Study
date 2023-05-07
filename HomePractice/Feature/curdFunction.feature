
Feature: Read data with API

Scenario: Read data use get method

Given Set up test data in json and connect get method with url

Then Check status code
And Check response time
And Check content type
And Check response body not null