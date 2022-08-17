Feature: Guru99 Demo application

@SmokeTest
Scenario: User is entering in Demo
Given User is Demo
When User enter "<un>" and "<pwd>"
And User clicking on submit
Then User is Logged into page
Examples: 
|un    |pwd  |
|amit1 |amit1|
|amit2 |amit2|
|amit3 |amit3|