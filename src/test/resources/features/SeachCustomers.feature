Feature: Search

Scenario: Search customer
    Given  User launch crome browser
    When User opens URL"https://admin-demo.nopcommerce.com/login"
    Then Enter email as "admin@yourstore.com" and password as "admin"
    And Click on login
   Then User can viwe dashboard
   When User Click on Customer Menu
   And Click on Customer Menu Item
   Then Search Customer using email,fname,lname
   Then Close browser