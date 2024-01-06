package HomeWork_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task_2 {
    public static void main(String[] args) {
        /*Login to https://www.saucedemo.com/
Click on Menu on top left
Click on "About" option
Verify the URL has changed to "https://saucelabs.com/"  */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();

        WebElement aboutOption = driver.findElement(By.id("about_sidebar_link"));
        // wait for 2 seconds for tab to open before clicking on link
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        aboutOption.click();

        if (driver.getCurrentUrl().equals("https://saucelabs.com/")) {
            System.out.println("Test Passed! Checkout was successful.");
        } else {
            System.out.println("Test Failed! Checkout was not successful.");
        }

        driver.quit();
    }
}
