Feature: datatable in step

  Scenario: Successful Login with Valid Credentials
    Given User is on base Page
    When User Navigate to home Page
    And User enters Credentials to LogIn
      | testuser_1 | Test@153 |
    Then Message displayed Login Success