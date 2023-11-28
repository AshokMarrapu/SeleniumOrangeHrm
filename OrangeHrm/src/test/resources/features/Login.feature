
Feature: Check Login functionality of Orange Hrm Application
  
  Background:
  Given User is on Login page of Orange Hrm application  

@smoke @all
  Scenario: A) User login to Orange Hrm Application with valid credentials
    When User enters correct username as "admin" and password as "admin"
    And Click on Login button
    Then User should login successfully

@regression @all
  Scenario: B) User login to Orange Hrm Application with invalid credentials
    When User enters incorrect username as "admin2" and password as "admin02"
    And Click on Login button
    Then User should get an error message is as "Invalid Login"