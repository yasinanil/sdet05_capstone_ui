@Login
Feature: Login Feature

  Background: Go to homepage
    Given user goes to homepage

  @PositiveLogin
  Scenario: Positive Login
    When user enters username "johndoe2025@yahoo.com"
    And user enters password "John.123"
    And user clicks login button
    Then user verifies the login
    #And close driver


  @Negative1
  Scenario: Negative Scenario Wrong Username
    When user enters username "XYZ@yahoo.com"
    And user enters password "John.123"
    And user clicks login button
    Then user verifies error message
    #And close driver

  @FailedScenario
  Scenario: Failed Scenario
    When user enters username "johndoe2025@yahoo.com"
    And user enters password "John.123"
    And user clicks login button
    Then user verifies error message
    #And close driver

  @FailedScenario2
  Scenario: Failed Scenario 2
    When user enters username "johndoe2025@yahoo.com"
    And user enters password "John.123"
    And user clicks login button
    Then user verifies error message
    #And close driver
    #Code A
    #Code B
    #Remote B

