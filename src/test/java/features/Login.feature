Feature: Login

Scenario: To verify Login Functionality using wrong admin username/Password
Given User is in landing Page
When User enters  Username as "admin" and Password as "admin1234" and click on Submit
Then User won't be able to login
And Error message to be displayed

Scenario: To verify Login Functionality for Non Admin User
Given User is in landing Page
When User enters  Username as "nonadmin" and Password as "nonadmin1234" and click on Submit
Then User logged in as Non Admin user

