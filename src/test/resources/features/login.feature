@wip
Feature: Login functionality
  Agile story: Only authorized users should be able to login to the application.
  As a user I should be abel to login with valid credentials, account summary page should be displayed.


  Background:
    Given I am on the Login page

  Scenario: As an authorized user I should be able to login
    When I login with username "username" and password "password"
    Then the Account Summary page should be displayed


  Scenario: Users with wrong username or wrong password should not be able to login. Users
  with blank username or password should also not be able to login.
    When I login with username "wrong" and password "wrong".
    Then Error message "Login and/or password are wrong." should be displayed.
    And  I login with username "" and password "".
    Then Error message "Login and/or password are wrong." should be displayed.



