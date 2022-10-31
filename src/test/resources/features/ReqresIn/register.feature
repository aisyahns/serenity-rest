Feature: Register
  As a user
  I want to register my account
  So I can login

  @Register
  Scenario Outline: Register with various data
    Given I set a url api for register
    # jadi satu keyword (email password -> data yg mau kita bikin di bodynya)
    And I set body "<email>" email and "<password>"
    When I request register
    Then I will get <result>
    Examples:
    | email | password | result |
    |       |          | 400    |
    | eve.holt@reqres.in |      | 400 |

#  Scenario: Register with valid email and password
#    Given I set a url api for register
#    And I set body valid email and valid password
#    When I request register
#    Then I will get status code is 200