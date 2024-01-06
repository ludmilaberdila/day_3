package HomeWorkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoHomeWork {
    public static void main(String[] args) {
        /*Login to https://www.saucedemo.com/
Add "Sauce Labs Bolt T-Shirt" to cart
Add "Sauce Labs Fleece Jacket" to cart
Go to cart
Remove "Sauce Labs Fleece Jacket" from cart
Click on "Continue Shopping"
Add "Sauce Labs Onesie" to cart
Go to cart
Verify the price of "Sauce Labs Bolt T-Shirt" is 15.99
Click on "Checkout"
Enter following credentials:
first name: John
last name: Doe
zip code: 12345
Click on Finish
Verify "Back Home" button is displayed  */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement addToCartButton;
        addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCartButton.click();
        addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCartButton.click();

        WebElement goToCart = driver.findElement(By.className("shopping_cart_container"));
        goToCart.click();

        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        removeButton.click();

        WebElement continueShoppingButton = driver.findElement(By.id("continue-shopping"));
        continueShoppingButton.click();

        WebElement addSauceLabsOnesie = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addSauceLabsOnesie.click();

        WebElement goToCartButton = driver.findElement(By.className("shopping_cart_link"));
        goToCartButton.click();

        WebElement priceText = driver.findElement(By.xpath("//div[contains(@class,'inventory_item_price')]"));
        String priceShirtText = priceText.getText();
        if (priceShirtText.equals("$15.99")){
            System.out.println("Test Pass");
        }
        else {
            System.out.println("Error: Price is not right");
        }

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        WebElement backHomeButton = driver.findElement(By.id("//button[contain(@class, 'back-to-products')]"));
        String backHome = backHomeButton.getText();
        if (backHome.equals("Back Home")){
            System.out.println("Test Pass");
        } else {
            System.out.println("Fail");
        }
    }

}
