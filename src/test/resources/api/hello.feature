Feature: Hello
  As an user
  I want to see list of hello
  So that I can access applications

  Scenario: GET - get all data hello
    Given I set GET hello endpoint
    When I send GET HTTP request hello
    Then the response status code should be 200's
#    And the response should contain hello