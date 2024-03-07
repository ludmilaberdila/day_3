Feature:

  Scenario: test search functionality
    Given I am on the "Amazon.com" homepage
    When I enter the title of the "protein" in the search bar
    Then the search results should display all product available
    When I click on the "protein" from the search results
    Then I should be directed to the page of the selected "protein"
    And on the page should be display information about the "protein"


    Scenario Outline: verify search functionality
      Given I am on the Amazon.com homepage
      When I enter "<protein title>" in the search bar
      Then the search results should display all relevant protein products
      When I click on the protein with the name "<selected protein>" from the search results
      Then I should be directed to the page of the selected protein
      And on the page, the following information should be displayed accurately:

      Examples:
        | protein title | selected protein  |
        | "whey protein" | "Standard Whey"  |
        | "vegan protein" | "Plant Protein" |
        | "casein protein" | " Vegan"       |


#      Scenario: one Scenario (add just one product)
#        one Scenario with multiline strings
#        one Scenario Outline
#        user should be able to add more than 1 product to the cart and to go
#        to the cart and see those product

  Scenario Outline: Add Various Protein Products to the Cart

      Given I am on the Amazon.com homepage
      When I enter the title of the protein "<protein title>" in the search bar
      Then the search results should display the selected protein product
      When I click on the "<protein title>" from the search results
      Then I should be directed to the page of the selected protein
      And on the page, I click the "Add to Cart" button

      Examples:
        | protein title     |
        | "Orgain  Protein" |
        | "Standard Whey"   |
        | "Elite Casein"    |
        | "Muscle   Powder" |
        | " Protein Powder" |


  Scenario: Add Multiple Protein Products to the Cart
        Given I am on the "Amazon.com" homepage
        When enter the title of the protein "Gold Standard" in the search bar
        Then the search results should display the selected protein product
        When click on the "Gold Standard" from the search results
        Then I should be directed to the page of the selected protein
        And  I click the "Add to Cart" button

        And when I enter the title of the protein "Elite Casein" in the search bar
        Then the search results should display the selected protein product
        When I click on the "Elite Casein" from the search results
        Then I should be directed to the page of the selected protein
        And on the page, I click the "Add to Cart" button

        And I go to the cart
        Then the cart should display the protein
        Then i click checkout for checkout