Feature: User Resistration
@Smoke, @Regression
  Scenario: User is in registration page
    Given User is in Register page
    When User enter all fields
    And User submitting details
    Then User is registered

@Sanity, @Regression
    Scenario:New user login
    Given User login with register details
    When User entering new uname and pwd
    And User logging In
    Then New user is in logIn