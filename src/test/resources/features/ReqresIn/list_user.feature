Feature: List User
  As a user
  I want to get list of users
  So I can manage the user

  Scenario: Get list users with page is 2
    Given I set a url api for list users
    When I request list user with page 2
    Then I will get status code is 200
    And I will get the detail of user