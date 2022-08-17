Feature: whatsapp application
 Background: User is having whatsapp
 
 Scenario: User is sending message to friend by whats app
    Given User is having whatsapp application registered on number
    When User should search friends name
    And Type some message on friends number or saved name
    Then User able to click on send button and sending message
    
  Scenario: User is wants to send message 
    Given User is in whatsapp
    When User search friend
    And Useer should type message
    Then User sending message to friend
    
    Scenario: User Sending image to friend 
    Given User opens whatsapp
    When User goes to friends number
    And Attached image 
    Then User able to clicking on send button
