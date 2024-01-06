package HomeWork_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SauceDemoHomework2 {
    public static void main(String[] args) {
/*1. Go to https://www.saucedemo.com/
2. Login to the application
3. Add every item to the cart (there are 6 of them)
4. Go to cart
5. Verify following texts are present on the page:
Your Cart
QTY
Description
6. Remove Sauce Labs Fleece Jacket
7. Checkout, provide first name, last name and zip code, continue
8. Verify following texts are present
Payment Information
Shipping Information
Price Total
9. Verify total is 86.35
10. Finish
11. Verify this text is present "Checkout: Complete!"  */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement addToCartButton;

        addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
        addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCartButton.click();
        addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCartButton.click();
        addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCartButton.click();
        addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addToCartButton.click();
        addToCartButton = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        addToCartButton.click();

        WebElement goToCart = driver.findElement(By.className("shopping_cart_container"));
        goToCart.click();

        WebElement YourCartText = driver.findElement(By.xpath("//span[contains(@class, 'title')]"));
        String actualTest = YourCartText.getText();
        if (actualTest.equals("Your Cart")) {
            System.out.println("Title span- Your Cart pass");
        } else {
            System.out.println("fail");
        }

        WebElement QtyText = driver.findElement(By.xpath("//div[contains(@class, 'cart_quantity_label')]"));
        String actualText = QtyText.getText();
        if (actualText.equals("QTY")) {
            System.out.println("Title div- QTY pass");
        } else {
            System.out.println("fail");
        }

        WebElement descriptionText = driver.findElement(By.xpath("//div[contains(@class, 'cart_desc_label')]"));
        String presentText = descriptionText.getText();
        if (presentText.equals("Description")) {
            System.out.println("Title div- Description pass");
        } else {
            System.out.println("fail");
        }

        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        removeButton.click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        driver.findElement(By.id("first-name")).sendKeys("Liuda");
        driver.findElement(By.id("last-name")).sendKeys("Berdila");
        driver.findElement(By.id("postal-code")).sendKeys("60016");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement paymentInformationText = driver.findElement(By.xpath("//div[contains(@class, 'summary_info_label')][1]"));
        String paymentText = paymentInformationText.getText();
        if (paymentText.equals("Payment Information")) {
            System.out.println("Text Payment Information present, Test Pass");
        } else {
            System.out.println("fail");
        }

        WebElement shippingInformationText = driver.findElement(By.xpath("//div[contains(@class, 'summary_info_label')][2]"));
        String shippingText = shippingInformationText.getText();
        if (shippingText.equals("Shipping Information")) {
            System.out.println("Text Shipping Information present, Test Pass");
        } else {
            System.out.println("Fail");
        }

        WebElement priceTotalText = driver.findElement(By.xpath("//div[contains(@class, 'summary_info_label')][3]"));
        String priceText = priceTotalText.getText();
        if (priceText.equals("Price Total")) {
            System.out.println("Text Price Total present, Test Pass");
        } else {
            System.out.println("Fail");
        }

        WebElement totalText = driver.findElement(By.xpath("//div[contains(@class,'summary_info_label')][4]"));
        String totalPriceText = totalText.getText();
        if(totalPriceText.equals("Total: $86.35")){
        System.out.println("Text Total: $86.35 present, Test Pass");
       }
       else {
        System.out.println("Fail");
       }

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        WebElement checkoutCompleteText = driver.findElement(By.xpath("//span[contains(@class,'title')]"));
        String checkoutText = checkoutCompleteText.getText();
        if(checkoutText.equals("Checkout: Complete!")){
            System.out.println("Text Checkout: Complete! present, Test Pass");
        }
        else {
            System.out.println("Fail");
        }
        driver.quit();
        }
}
