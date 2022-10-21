Feature: Register
  As a user
  I want to register my account
  So I can login

  Scenario: Register with valid email and password
    Given I set a url api for register
    And I set body valid email and valid password
    When I request register
    Then I will get status code is 200