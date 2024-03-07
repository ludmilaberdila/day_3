Feature: product price

	Scenario: verify product prices are within of 1 to
    Given I set up connection to database
    And I retrive all product prices
    Then verify prices are between  1 and 1000