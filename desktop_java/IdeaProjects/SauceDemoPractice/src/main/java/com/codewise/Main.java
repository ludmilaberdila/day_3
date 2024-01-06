package com.codewise;
 /*
        Test Scenario:
        1. go to https://www.saucedemo.com/
        2. provide valid username
        3. provide valid password
        4. click on login button
        5. print current url
        6. add "Sauce Labs Backpack" to the cart
        7. add "Sauce Labs Bike Light" to the cart
        8. add "Sauce Labs Bolt T-Shirt" to the cart
        9. go to cart
        10. click on "Checkout" button
        11. provide firstName, lastName, zipCode
        12. click on "Continue"
        13. click on "Finish"
        14. verify the current url
            is equal to "https://www.saucedemo.com/checkout-complete.html"
         */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        WebDriver driver = new ChromeDriver();


    }
}