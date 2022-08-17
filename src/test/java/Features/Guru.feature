Feature: Guru99 Demo application
@Smoke
  Scenario: User is entering in Guru99 application
    Given User is in Demo guru99 applicatiom
    When User enter Username and password
    And User click on submit button
    Then User is in login page

@Regression 
    Scenario: User enters in DemoGuru99 App
    Given User is in DemoGuru99 App
    When User is entering Username and password
    And User click on login button
    Then User is loggedIn