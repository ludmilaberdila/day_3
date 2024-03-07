Feature: Shopping Cart Functionality

@addCart
Scenario: Adding a book to the shopping cart Given the user is logged in and on the book details page
When the user clicks on "Add to Cart" for a book
Then the book should be added to their shopping cart