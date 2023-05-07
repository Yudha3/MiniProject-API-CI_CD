Feature: Products
  As an user
  I want to see list of products
  So that I can create new products

  Scenario: GET - displays all product data
    Given I set products endpoint
    When I send GET HTTP request1
    Then the responses status code should be 200
#    And the response should contain products

  Scenario: POST - add a new product correctly and completely
    Given I set products endpoint
    When I send POST HTTP request
    Then the responses status code should be 200

  Scenario: POST - adding a new product with incomplete data
    Given I set products endpoint
    When I send POST HTTP request1
    Then the responses status code should be 200

  Scenario: POST - adding a new product with fill in the price column incorrectly
    Given I set products endpoint
    When I send POST HTTP request2
    Then the responses status code should be 400

  Scenario: POST - adding a new product with fill in the price column with .
    Given I set products endpoint
    When I send POST HTTP request3
    Then the responses status code should be 400

  Scenario: GET - displays product data based on the correct id
    Given I set GET product endpoint with id 12887
    When I send GET HTTP request product
    Then the responses status code should be 200
#    And the response should contain product with id 11290
#
  Scenario: GET - displays product data based on wrong id
    Given I set GET product endpoint with id 1
    When I send GET HTTP request product1
    Then the responses status code should be 404
#    And the response should contain product with id 11290
#
  Scenario: DELETE - delete a product based on the correct id
    Given User requests to delete a product with id 11994
    When I send DELETE HTTP request product
    Then the responses status code should be 200
#
  Scenario: DELETE - delete a product based on the wrong id
    Given User requests to delete a product with id 1
    When I send DELETE HTTP request product1
    Then the responses status code should be 200
#
  Scenario: POST - assign product ratings correctly
    Given I set rating products endpoint
    When I add the new rating
    Then the responses status code should be 200
#    And the response should contain the product data with new ratings
#
  Scenario: POST - assign product ratings incorrectly
    Given I set rating products endpoint1
    When I add the new rating1
    Then the responses status code should be 200
#    And the response should contain the product data with new ratings
#
  Scenario: GET - displays product rating data based on the correct id
    Given I set GET rating product endpoint with id 11289
    When I send GET HTTP request product2
    Then the responses status code should be 200
#
  Scenario: GET - displays product rating data based on the wrong id
    Given I set GET rating product endpoint with id 2
    When I send GET HTTP request product3
    Then the responses status code should be 200
#
  Scenario: POST - make a comment for the product correctly and completely
    Given I set comment products endpoint
    When I add the new comment
    Then the responses status code should be 200
#    And the response should contain the product data with new comment
#
  Scenario: POST - Make comments on products that don't exist
    Given I set comment products endpoint1
    When I add the new comment1
    Then the responses status code should be 200
#    And the response should contain the product data with new comment
#
  Scenario: GET - displays comments on products based on existing id
    Given I set GET comment product endpoint
    When I send GET HTTP request
    Then the responses status code should be 200
#
  Scenario: GET - displays comments on products based on id that doesn't exist
    Given I set GET comment product endpoint2
    When I send GET HTTP request2
    Then the responses status code should be 200