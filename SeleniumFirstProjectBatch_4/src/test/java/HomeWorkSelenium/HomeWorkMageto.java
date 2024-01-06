//package HomeWorkSelenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class HomeWorkMageto {
//    public static void main(String[] args) {
//        /*Create MagentoHomework class and complete following task:
//        1. go to https://magento.softwaretestingboard.com/
//        2. click on "Sale"
//        3. click on "Women's deals"
//        4. choose size, color of the first product and add to cart
//        5. click on add to cart for a second product
//        6. choose size, color, quantity and add to cart
//        7. go to cart
//        8. click on "Proceed to Checkout"
//        9. checkout
//
//        */
//        // note of different wait for full page wait
//        // new WebDriverWait(driver, Duration.ofSeconds(10)).until(
//        // webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
//        //  .equals("complete"));
//
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://magento.softwaretestingboard.com/");
//        Actions actiion = new Actions(driver);
//        // web driver wait (until we can see an element)
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        WebElement saleButton = driver.findElement(By.xpath("//a[@id='ui-id-8']"));
//        saleButton.click();
//
//        WebElement womenDeallButton = driver.findElement(By.xpath(
//                "//span[text()= 'Women’s Deals']"));
//        womenDeallButton.click();
//
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
//                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
//                        .equals("complete"));
//
//        WebElement colorButton = driver.findElement(By.xpath(
//                "//li[@class='item product product-item'][1]//div[@option-label='Blue']"));
//        colorButton.click();
//
//        WebElement sizeButton = driver.findElement(By.xpath(
//                "//li[@class='item product product-item'][1]//div[contains(text(), '29')]"));
//        sizeButton.click();
//
//        WebElement addToCartButton = driver.findElement(By.xpath(
//                "//li[@class='item product product-item'][1]//button[@title='Add to Cart']"));
//        actiion.moveToElement(driver.findElement(
//                        By.xpath("//li[@class='item product product-item'][1]")))
//                .perform();
//        addToCartButton.click();
//
//        // wait until we have 1 element in cart
//        wait.until(d -> driver.findElement(
//                        By.xpath("//a[@class='action showcart']//span[text() = '1']"))
//                .isDisplayed());
//
//        WebElement addTocartButton2 = driver.findElement(By.xpath(
//                "//li[@class='item product product-item'][2]//button[@title='Add to Cart']"));
//        // hover over element
//        actiion.moveToElement(driver.findElement(
//                        By.xpath("//li[@class='item product product-item'][2]")))
//                .perform();
//        addTocartButton2.click();
//
//
//        WebElement sizeItem2 = driver.findElement(By.xpath(
//                "//div[@class='product-options-wrapper']//div[@option-label='Orange']"));
//        sizeItem2.click();
//
//        WebElement colorItem2 = driver.findElement(By.xpath(
//                "//div[@class='product-options-wrapper']//div[@option-label='30']"));
//        colorItem2.click();
//
//        WebElement qty2 = driver.findElement(By.xpath("//div[@class='field qty']//input[@name='qty']"));
//        // empty quantity then add 2
//        qty2.clear();
//        qty2.sendKeys("2");
//        driver.findElement(By.xpath("//button[@id='product-addtocart-button']"))
//                .click();
//
//        // wait for 3 items in the cart
//        wait.until(d -> driver.findElement(
//                        By.xpath("//a[@class='action showcart']//span[text() = '3']"))
//                .isDisplayed());
//
//        // click on show cart
//        driver.findElement(By.xpath("//a[@class='action showcart']"))
//                .click();
//
//        WebElement checkoutButton = driver.findElement(By.xpath(
//                "//button[@id='top-cart-btn-checkout']"));
//        checkoutButton.click();
//
//        // driver.quit();
//    }
//}
//
