package HomeWorkSelenium;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SElenium_Xpath {
    public static void main(String[] args) {
        /*1. Go to https://cashwise.us/main
   2. Click on "sign up" button
   3. Provide any email
   4. Provide 4 chars password
   5. Verify "Password must be at least 6 characters" message pops up */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cashwise.us");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(),'Sign up')][1]"));
        signInButton.click();

        WebElement email = driver.findElement(By.xpath("//input[contains(@id, ':r3:')]"));
        email.sendKeys("ludmila.berdila@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[contains(@id, ':r4:')]"));
        password.sendKeys("1234");

        WebElement verifyPassvord = driver.findElement(By.xpath("//input[contains(@id, ':r5:')]"));
        verifyPassvord.sendKeys("1234");

        WebElement continueButton = driver.findElement(By.xpath(
                "//button[contains(text(), 'Continue')]"));
        continueButton.click();

        WebElement errorPassword = driver.findElement(By.xpath(
                "//p[contains(text(), 'Password must be')]"));

        Assert.isTrue(errorPassword.getText().equals("Password must be at least 6 characters"),
                "Error message is displayed");

        driver.quit();
//        WebDriverWait wait = new WebDriverWait(driver, 1000);
//        wait.until(ExpectedConditions.elementToBeClickable(continueButton));

    }

}
