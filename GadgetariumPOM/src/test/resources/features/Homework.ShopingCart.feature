Feature: Shopping Cart Functionality

  @addToCart
  Scenario: Adding a book to the shopping cart
    Given the user is logged in and on the book details page
    When the user clicks on "Add to Cart" for a book
    Then the book should be added to their shopping cart

  @removeFromCart
  Scenario: Removing a book from the shopping cart
    Given the user has books in their shopping cart
    When the user goes to the cart page
    And the user selects the option to remove a book
    And the user confirms the removal action
    Then the selected book should be removed from the shopping cart
    And the user sees an updated cart with the remaining items
    And a confirmation message is displayed

  @viewCart
  Scenario: Viewing the contents of the shopping cart
    Given the user has added items to their cart
    When the user clicks on the shopping cart icon
    Then the user should be redirected to the shopping cart page
    And the user should see a list of all the items currently in the cart
    And the total price for the items in the cart should be displayed
    And the user can review the selected items and their quantities
    And the user has the option to proceed to checkout or continue shopping

  @updateCartQuantity
  Scenario: Updating the quantity of an item in the shopping cart
    Given the user has items in their shopping cart
    When the user goes to the cart page
    And the user changes the quantity of a selected item
    And the user clicks the "Update Cart" button
    Then the quantity of the selected item should be updated in the cart
    And the user sees a confirmation message for the cart update

  @applyPromoCode
  Scenario: Applying a promo code to the shopping cart
    Given the user has items in their cart
    When the user proceeds to the checkout page
    And the user enters a valid promo code
    Then the system should apply the discount to the total order amount
    And the user sees the discounted total amount
    And a confirmation message indicates the successful application of the promo code