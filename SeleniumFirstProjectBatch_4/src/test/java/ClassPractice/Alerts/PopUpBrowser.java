package ClassPractice.Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUpBrowser {
    public static void main(String[] args) {
        /* pop ups thet come from browser cannot be handled by Selenium
        * The only way to deal with them is to block them using browser options
        * ChromeOptions*/

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.allrecipes.com/recipe/235052/moms-potato-latkes/");
    }
}
