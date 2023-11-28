
Feature: Check Login functionality of Orange Hrm Application

@sanity @all
  Scenario: C) Logout from Orange Hrm Application 
    Given User is on home page of Orange Hrm application
    When User clicks on Logout button
    Then User should logout successfully