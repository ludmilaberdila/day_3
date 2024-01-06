import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefactoredShort {
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

        testerContainString(driver, "//span[contains(@class, 'title')]",
                "Your Cart", "Title span- Your Cart");
        testerContainString(driver, "//div[contains(@class, 'cart_quantity_label')]",
                "QTY", "Title div- QTY");
        testerContainString(driver, "//div[contains(@class, 'cart_desc_label')]",
                "Description", "Title div- Description");

        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        removeButton.click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        driver.findElement(By.id("first-name")).sendKeys("Liuda");
        driver.findElement(By.id("last-name")).sendKeys("Berdila");
        driver.findElement(By.id("postal-code")).sendKeys("60016");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        testerContainString(driver, "//div[contains(@class, 'summary_info_label')][1]",
                "Payment Information", "Payment");
        testerContainString(driver, "//div[contains(@class, 'summary_info_label')][2]",
                "Shipping Information", "Shipping");
        testerContainString(driver, "//div[contains(@class, 'summary_info_label')][3]",
                "Price Total", "Total text");
        testerContainString(driver, "//div[contains(@class, 'summary_info_label')][4]",
                "Total: $86.35", "Total price");

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        testerContainString(driver, "//span[contains(@class,'title')]",
                "Checkout: Complete!", "Checkout: Complete");

        driver.quit();
    }

    /**
     *
     * @param driver Selenium web driver
     * @param path element XPath selector
     * @param text text that element must contain
     * @param testMessage extra message for test
     */
    public static void testerContainString(WebDriver driver, String path, String text, String testMessage){
        WebElement checkoutCompleteText = driver.findElement(By.xpath(path));
        String checkoutText = checkoutCompleteText.getText();
        if(checkoutText.equals(text)){
            System.out.println(testMessage.trim() + ", " + "Test Pass");
        } else {
            System.out.println(testMessage.trim() + ", " + "Fail");
        }
    }
}
