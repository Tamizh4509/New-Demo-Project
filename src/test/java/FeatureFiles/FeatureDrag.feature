@Sanity
Feature: User dragged and dropped the value without using drag and dropdown option


Scenario: User drag and drop a dropme option
Given user enter a url for without using drag and drop
When user click a interaction option
And user click a droppable option
And user click and hold the drag me text
And user drag the text 
And user drop the option in drop me folder
Then user verified it