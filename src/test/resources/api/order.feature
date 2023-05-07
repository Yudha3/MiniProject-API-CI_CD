Feature: Orders
  As an user
  I want to make a transaction products
  So that I can login the application and choose products

  Scenario: POST - make a new order correctly and completely
    Given I set order endpoint
    When I add the new order
    Then the response status codes should be 200's
#    And the response should contain the new order data
#
  Scenario: POST - create a new order with a product id that doesn't exist
    Given I set order endpoint
    When I add the new order1
    Then the response status codes should be 200's
#    And the response should contain the new order data
#
  Scenario: GET - displays all order data
    Given I set order endpoint
    When I send GET HTTP request order
    Then the response status codes should be 200's
#    And the response should contain order
#
  Scenario: GET - displays order data based on the correct id
    Given I set GET order endpoint
    When I send GET HTTP request order1
    Then the response status codes should be 200's
#
  Scenario: GET - displays order data based on the incorrect id
    Given I set GET order endpoint1
    When I send GET HTTP request order2
    Then the response status codes should be 404's