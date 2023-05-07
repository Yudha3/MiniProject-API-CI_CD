Feature: Product Categories
  As an user
  I want to see list of categories
  So that I can create new categories

  Scenario: POST - correctly create a new category
    Given I set categories endpoint
    When I add the new categories
    Then the responses status codes should be 200
##    And the response should contain the new categories data
#
  Scenario: POST - create a new category by filling in the characters
    Given I set categories endpoint
    When I add the new categories1
    Then the response status code should be 200
##    And the response should contain the new categories data
#
  Scenario: POST - create a new category by filling in the numbers
    Given I set categories endpoint
    When I add the new categories2
    Then the responses status codes should be 400
##    And the response should contain the new categories data

  Scenario: POST - create a new category by not fill in the name
    Given I set categories endpoint
    When I add the new categories3
    Then the responses status codes should be 500
##    And the response should contain the new categories data

  Scenario: GET - returns a category based on the correct id
    Given I set GET categories product endpoint
    When I send GET HTTP request categories
    Then the response status code should be 200
#
  Scenario: GET - returns a category based on the wrong id
    Given I set GET categories product endpoint1
    When I send GET HTTP request categories1
    Then the responses status codes should be 404
#
  Scenario: GET - displays all existing categories
    Given I set categories endpoint
    When I send GET HTTP request categories2
    Then the responses status codes should be 200
#    And the response should contain categories
#
  Scenario: DELETE - delete category based on correct id
    Given User requests to delete a categories
    When I send DELETE HTTP request categories
    Then the responses status codes should be 200
#
  Scenario: DELETE - delete category based on wrong id
    Given User requests to delete a categories1
    When I send DELETE HTTP request categories1
    Then the responses status codes should be 200