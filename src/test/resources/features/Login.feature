Feature: Login

Scenario: Succefully Login with valid credential
Given User launch crome browser
When User opens URL"https://admin-demo.nopcommerce.com/login"
And Enter email as "admin@yourstore.com" and password as "admin"
And Click on login
Then page Title should be "Dashboard / nopCommerce administration"
When User click on logout link
Then Page Title should be your login page "Your store. Login"
And Close the browser


Scenario Outline: Login data driven
Given User launch crome browser
When User opens URL"https://admin-demo.nopcommerce.com/login"
And Enter email as "<email>" and password as "<password>"
And Click on login
Then page Title should be "Dashboard / nopCommerce administration"
When User click on logout link
Then Page Title should be your login page "Your store. Login"
And Close the browser

Examples: 
          |email|password|
          |admin@yourstore.com| admin |
          |admin@yourstore.com| admin123 |