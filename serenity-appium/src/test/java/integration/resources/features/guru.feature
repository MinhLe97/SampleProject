Feature: Test Guru web on Android device

Scenario: Automate Guru Page
#Login step
Given User go to Guru page
And User input UserName
And User input Password
And User click on Login
Then Login successful

#Create new Customer
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
And User click submit new customer
Then User create new customer successful

#Create new account
Given User click new account
And User input customer Id
And User input initial deposit
And User click submit new account
Then User create new account successful

#Deposit amount
Given User click deposit
And User input accountNo
And User input deposit amount
And User input desc
And User submit deposit
Then User deposit successful

#Delete customer and account
Then Cleanup