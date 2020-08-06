Feature: Login Acti Time


Background:
Given Open the browser and enter uri
@TC_Login_page
Scenario Outline: Verify the Acti time
When Verify the title of acti time page 
Then Enter the valid "<username>" and "<password>"
Then Click on login button
And close the browser

Examples:
|username|password|
|admin|manager|
@TC_url
Scenario Outline: Verify the Acti time url
When Verify the acti time url 
Then Enter the valid "<username>" and "<password>"
Then Click on login button
And close the browser

Examples:
|username|password|
|admin|manager|
