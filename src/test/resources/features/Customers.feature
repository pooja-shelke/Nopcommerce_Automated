Feature: Customers

Scenario: Add new Customer
Given User launch chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And Click on login
Then User can viwe dashboard
When User Click on Customer Menu
And Click on Customer Menu Item
And Click on Add new button
Then User can view add new customer page
When User Enter Customer Info
And Click on Save button
Then can view Confirmation message
Then Navigate back 
 Then Search Customer using email,fname,lname
And close browser 