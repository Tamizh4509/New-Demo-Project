@Sanity
Feature: User check a new window is open

Scenario: Click a new window option 
Given user enter a url for new window
When user click a Alerts,Frames and Windows
And user click a Browser window
And user click a new tab
Then user capture a new opened tab
