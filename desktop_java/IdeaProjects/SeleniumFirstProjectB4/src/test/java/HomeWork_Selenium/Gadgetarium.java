package HomeWork_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Gadgetarium {
    public static void main(String[] args) {
       /* 1. Go to https://gadgetarium.us/
        2. Click on "Delivery" tab
        3. Verify "Pay by card online" text is visible
        4. Verify "Cash upon receipt" text is visible
        5. Verify "By card upon receipt" text is visible
        6. Click on "FAQ" tab
        7. Verify "Frequently asked questions" text is visible
        8. Click on "How can I order?"
        9. Verify "You can easily order using our online platform." text is visible
        10. Click on "Catalog -> Smartphones -> Apple"
        11. Click on "Show more" button  */

        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://gadgetarium.us/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
}
