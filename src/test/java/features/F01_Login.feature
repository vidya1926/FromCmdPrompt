@login
Feature: Leaftaps login functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@smoke
Scenario Outline: Test login functionality with positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
Then close the browser



Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@smoke@regression
Scenario: Test login functionality with negative credential
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed




