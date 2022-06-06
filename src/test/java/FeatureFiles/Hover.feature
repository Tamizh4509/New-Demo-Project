@Regression
Feature: Hover the menu item in DemoQa site

Scenario: Capture the hover menu item
Given user enter the url for hover
When user click a widgets
And user click a menu option
And user hover the menu item2
And user hover the sub-sublist
And user hover the sub-sub item2
Then user capture the page
