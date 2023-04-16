@Sepulsa
Feature: Sepulsa

  @NormalPositive @Login
    Scenario: User login into website Sepulsa.com
    Given User is on sepulsa home page
    And User click button login sepulsa
    And User input email "EMAIL"
    And User input password "PASSWORDSEPULSA"
    Then User click submit login
    Then User is on sepulsa home page

  @NormalPositive @BeliPulsa5rbDiSepulsa
  Scenario: User can choose pulsa tri 5 ribu
    Given User is on sepulsa home page
    And User click button login sepulsa
    And User input email "EMAIL"
    And User input password "PASSWORDSEPULSA"
    Then User click submit login
    Then User is on sepulsa home page
    And User click beli pulsa
    And User input nomor handphone "089696425377"
    And User choose pulsa 5 ribu
    Then User see "Total Pembayaran" checkout page

  @NormalPositive @BeliPulsa10rbDiSepulsa
  Scenario: User can choose pulsa tri 10 ribu
    Given User is on sepulsa home page
    And User click button login sepulsa
    And User input email "EMAIL"
    And User input password "PASSWORDSEPULSA"
    Then User click submit login
    Then User is on sepulsa home page
    And User click beli pulsa
    And User input nomor handphone "089696425377"
    And User choose pulsa 10 ribu
    Then User see "Total Pembayaran" checkout page

  @NormalPositive @BeliPulsa15rbDiSepulsa
  Scenario: User can choose pulsa tri 15 ribu
    Given User is on sepulsa home page
    And User click button login sepulsa
    And User input email "EMAIL"
    And User input password "PASSWORDSEPULSA"
    Then User click submit login
    Then User is on sepulsa home page
    And User click beli pulsa
    And User input nomor handphone "089696425377"
    And User choose pulsa 15 ribu
    Then User see "Total Pembayaran" checkout page

  @NormalPositive @BeliPulsa20rbDiSepulsa
  Scenario: User can choose pulsa tri 20 ribu
    Given User is on sepulsa home page
    And User click button login sepulsa
    And User input email "EMAIL"
    And User input password "PASSWORDSEPULSA"
    Then User click submit login
    Then User is on sepulsa home page
    And User click beli pulsa
    And User input nomor handphone "089696425377"
    And User choose pulsa 20 ribu
    Then User see "Total Pembayaran" checkout page

  @NormalPositive @BeliPulsa25rbDiSepulsa
  Scenario: User can choose pulsa tri 25 ribu
    Given User is on sepulsa home page
    And User click button login sepulsa
    And User input email "EMAIL"
    And User input password "PASSWORDSEPULSA"
    Then User click submit login
    Then User is on sepulsa home page
    And User click beli pulsa
    And User input nomor handphone "089696425377"
    And User choose pulsa 25 ribu
    Then User see "Total Pembayaran" checkout page

  @NormalPositive @BeliPulsa30rbDiSepulsa
  Scenario: User can choose pulsa tri 30 ribu
    Given User is on sepulsa home page
    And User click button login sepulsa
    And User input email "EMAIL"
    And User input password "PASSWORDSEPULSA"
    Then User click submit login
    Then User is on sepulsa home page
    And User click beli pulsa
    And User input nomor handphone "089696425377"
    And User choose pulsa 30 ribu
    Then User see "Total Pembayaran" checkout page

