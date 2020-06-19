Feature: Test Guru web on Android device

Scenario: Login
Given User go to Guru page
And User input UserName
And User input Password
And User click on Login
Then Login successful

Given User click add customer
And User input customer name
And User input dob
And User input address
And User input city
And User input state
And User input pin
And User input mobile number
And User input email
And User input password
And User click submit
Then User create successful

Then Cleanup