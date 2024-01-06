package HomeWork_Selenium;

import dev.failsafe.internal.util.Assert;
import net.bytebuddy.matcher.EqualityMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoPract {
    public static void main(String[] args) {
        /*
        Test Scenario:
        .1. go to https://www.saucedemo.com/
        .2. provide valid username
        .3. provide valid password
        .4. click on login button
        .5. print current url
        .6. add "Sauce Labs Backpack" to the cart
        .7. add "Sauce Labs Bike Light" to the cart
        .8. add "Sauce Labs Bolt T-Shirt" to the cart
        .9. go to cart
        .10. click on "Checkout" button
        .11. provide firstName, lastName, zipCode
        .12. click on "Continue"
        .13. click on "Finish"
        14. verify the current url
            is equal to "https://www.saucedemo.com/checkout-complete.html"
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        String logUrl = driver.getCurrentUrl();
        String curUrl;

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
        addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCartButton.click();
        addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCartButton.click();

        WebElement goToCart = driver.findElement(By.className("shopping_cart_container"));
        goToCart.click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
       checkoutButton.click();

        driver.findElement(By.id("first-name")).sendKeys("Liuda");
        driver.findElement(By.id("last-name")).sendKeys("Berdila");
        driver.findElement(By.id("postal-code")).sendKeys("60016");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

       // Assert.isTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-complete.html"),
               // "URL is as expected");

        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-complete.html")) {
            System.out.println("Test Passed! Checkout was successful.");
        } else {
            System.out.println("Test Failed! Checkout was not successful.");
        }

        driver.quit();


    }
}
