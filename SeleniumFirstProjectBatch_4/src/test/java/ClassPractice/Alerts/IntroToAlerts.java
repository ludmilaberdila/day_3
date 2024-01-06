package ClassPractice.Alerts;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IntroToAlerts {
    public static void main(String[] args) {
        /*go to https://demo.guru99.com/test/delete_customer.php
        * enter cust.ID
        * click on submit button
        * get alert message and print it
        * accept alert window
        * get alert message from new alert window and print it
        * accept alert window*/

        WebDriver driver = Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement custumId = driver.findElement(By.name("cusid"));
        custumId.sendKeys("24341");
        WebElement submitButton = driver.findElement(By.cssSelector("input[name='submit']"));
        System.out.println("submit button found");
        submitButton.click();
        System.out.println("submit button clicked");

        String alertMessage1 = driver.switchTo().alert().getText();
        System.out.println("getting alert message...");
        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert message: " + alertMessage1);
        driver.switchTo().alert().accept();
        System.out.println("Alert message accepted");
        wait.until(ExpectedConditions.alertIsPresent());

        String alertMessage2 = driver.switchTo().alert().getText();
        System.out.println("getting alert message...");
        System.out.println("Alert message 2: " + alertMessage2);
        driver.switchTo().alert().accept();
        System.out.println("Alert message accepted");

        driver.quit();
    }
}
