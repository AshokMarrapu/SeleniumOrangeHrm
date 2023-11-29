
Feature: Check Login functionality of Orange Hrm Application

@sanity
  Scenario: A) User login to Orange Hrm Application with valid credentials
   Given User is on Login page of Orange Hrm application
    When User enters correct username as "admin" and password as "admin"
    And Click on Login button
    Then User should login successfully
    
   @smoke
  Scenario: B) Logout from Orange Hrm Application 
    Given User is on home page of Orange Hrm application
    When User clicks on Logout button
    Then User should logout successfully