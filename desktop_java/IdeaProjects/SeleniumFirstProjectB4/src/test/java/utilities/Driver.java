package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;
public class Driver {
    private static WebDriver driver = null;


    public static WebDriver getDriver(String browser) {
        /*
        this checks if instance of driver was already created before
         */
        if (driver != null) {
            return driver;
        }

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                driver = new ChromeDriver();
        }


        // this is implicit wait for the driver session

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // this is pageloadtimeout waits until the page is fully loaded
        //driver.manage().pageLoadTimeout(120, TimeUnit.SECONDS);


        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}