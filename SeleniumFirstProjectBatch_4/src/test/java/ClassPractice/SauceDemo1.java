package ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo1 {
    public static void main(String[] args) {
        /* Test Scenario:
go to https://www.saucedemo.com/
provide valid userName
provide valid password
click on login button
verify user is logged in
 */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard-user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));

        String loginPageURL = driver.getCurrentUrl();
        loginButton.click();
        String homePage = driver.getCurrentUrl();

        System.out.println("loginPageUrl");
        System.out.println("homePageUrl");

        driver.quit();


    }
}
