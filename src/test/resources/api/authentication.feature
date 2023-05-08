Feature: Authentication
  As an user
  I want to login to application
  So that I can create new account

  Scenario: POST - create a new account correctly and completely
    Given I set register endpoint
    When I add the new account
    Then the response status code should be 200
#    And the response should contain the new account data

  Scenario: POST - create a new account by leaving the email section blank
    Given I set register endpoint
    When I add the new account1
    Then the response status code should be 400
#    And the response should contain the new account data
#
  Scenario: POST - register an account with an already registered account
    Given I set register endpoint
    When I add the new account
    Then the response status code should be 400
#    And the response should contain the new account data
#
  Scenario: POST - Login with an already registered account
    Given I set login endpoint
    When I login the account
    Then the response status code should be 200
#    And the response should contain the account data
#
  Scenario: POST - Login with an account that has not been registered
    Given I set login endpoint
    When I login the account1
    Then the response status code should be 400
##    And the response should contain the account data
#
  Scenario: GET - displays the desired user data information
    Given I set GET user data endpoint
    When I send GET HTTP request user
    Then the response status code should be 200
#    And the response should contain user data