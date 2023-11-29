
Feature: Check Login functionality of Orange Hrm Application with invalid credentials

@regression
  Scenario: B) User login to Orange Hrm Application with invalid credentials
    When User enters incorrect username as "admin2" and password as "admin02"
    And Click on Login button
    Then User should get an error message is as "Invalid Login"