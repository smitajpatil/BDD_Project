Feature: Go to ATM for Cash withdrawal

  Scenario: To withdraw cash from ATM
    Given User is in front of ATM machine
    When User put ATM card in machine
    And User entered password
    Then User is successfully collecting cash
