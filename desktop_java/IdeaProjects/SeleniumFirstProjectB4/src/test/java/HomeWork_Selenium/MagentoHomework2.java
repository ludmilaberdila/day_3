//package HomeWork_Selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class MagentoHomework2 {
//    public static void main(String[] args) {
//
//        /*1. go to https://magento.softwaretestingboard.com/
//        2. click on "What's New"
//        3. click on "Jackets" in "New in men's"
//        4. click on "Sort by" and select by price
//        5. click on "Style" and choose "Insulated"
//        6. click on "Color" and choose "Black"
//        7. click on "Sale" and choose "Yes"
//        8. choose any color and size of the product
//        9. add to cart
//        10. go to cart
//        11. proceed with checkout (provide all details: shipping, billing)
//        12. choose "Fixed" shipping method
//        13. click on "Place order"
//        14. verify "Thank you for your purchase!" text is there */
//
//        WebDriver driver = new ChromeDriver();
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.get("https://magento.softwaretestingboard.com/");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        WebElement whatIsNewButton = driver.findElement(By.xpath("//a[@id='ui-id-3']"));
//        whatIsNewButton.click();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //clicking 0n men section jackets
//       driver.findElement(By.xpath("//ul[@class='items'][2]//a[text()='Jackets']")).click();
//
//       //4. click on "Sort by" and select by price
//        driver.findElement(By.xpath("//div[@class='filter-options-item']//div[text()='Price']"))
//                .click();
//        System.out.println("click on price, success");
//
//        // click on style drop down
//        driver.findElement(By.xpath("//div[@id='narrow-by-list']//div[contains(text(), 'Style')]"))
//                .click();
//
//        //5. click on "Style" and choose "Insulated"
//        driver.findElement(By.xpath(
//                "//div[@id='narrow-by-list']//a[contains(text(), 'Insulated')]")).click();
//        //div[@id='narrow-by-list']//a[contains(text(), 'Insulated')]]
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        //6. click on "Color" and choose "Black"
//        driver.findElement(By.xpath("//div[@id='narrow-by-list']//div[contains(text(), 'Color')]"))
//                .click();
//        driver.findElement(By.xpath("//div[@class='filter-options-content']//div[@option-id='49']"))
//                .click();
//
//        //7. click on "Sale" and choose "Yes"
//        driver.findElement(By.xpath("//div[@id='narrow-by-list']//div[contains(text(),'Sale')]")).click();
//
//        wait.until(d -> driver.findElement(
//                        By.xpath("//div[contains(@class,'filter-options-item')][8]//a[contains(text(),'Yes')]"))
//                .isDisplayed());
//
//        driver.findElement(By.xpath("//div[contains(@class,'filter-options-item')][8]//a[contains(text(),'Yes')]"))
//                .click();
//        System.out.println("click yes, success");
//
//        //8. choose any color and size of the product
//        driver.findElement(By.xpath("//div[@id='option-label-size-143-item-166']")).click();
//
//        //9. add to cart
//       driver.findElement(By.xpath("//button[@class='action tocart primary']")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//       // 10. go to cart
//        driver.findElement(By.xpath("//a[@class='action showcart']")).click();
//
//        //11. proceed with checkout (provide all details: shipping, billing)
//        //driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
//
//    }
//}
