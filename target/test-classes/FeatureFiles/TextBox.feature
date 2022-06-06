@Smoke
Feature: User Check a Demoqa site for entering a details in textbox


Scenario Outline: User enter a details

Given user enter a url for textbox
When user click a Element 
And user click a text box
When user enter a full name as "<FullName>"
When user enter a  Email as "<Email>" 
And user enter a current address
And user enter a permananat address
Then user click a submit button and verified it

Examples:

|  FullName            |            Email         |
|Tamizhselvan           |tamizhselvan1234@gmail.com|
|Tamizh                 |tamizhselvan3456@gmail.com|
|Selva                  |selva23445@gmail.com      |