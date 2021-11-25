
@activity1_1
Feature: First Test

@smokeTest
Scenario: opening a webpage using Selenium
Given User is on the google home page
When user types in cheese and hits enter
Then Show how many search results were shown
And Close the browser
  