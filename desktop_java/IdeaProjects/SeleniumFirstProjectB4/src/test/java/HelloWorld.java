import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
/*
        Test Scenario:
        1. go to https://www.saucedemo.com/
        2. provide valid username
        3. provide valid password
        4. click on login button
        5. verify user is logged in
         */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");


        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));

        String loginPageUrl = driver.getCurrentUrl();

        loginButton.click();

        String homePageUrl = driver.getCurrentUrl();

        System.out.println(loginPageUrl);
        System.out.println(homePageUrl);

        driver.quit();

    }

}
