package HomeWorkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Xpath2 {
    public static void main(String[] args) {
        /*1. Go to https://cashwise.us/main
        2. Verify URL contains "cashwise"
        3. Verify "accounting@gmail.com" is present on top left
        4. Verify "sign in" button is present
        5. Verify "sign up" button is present  */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cashwise.us");

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("cashwise")) {
            System.out.println("Test Pass, the URL present contain Cashwise");
        } else {
            System.out.println("Test Fail, The URL dose not contain Cashwile");
        }

        WebElement emailText = driver.findElement(By.xpath(
                "//p[contains(text(), 'accounting@gmail.com')]"));
        String email = emailText.getText();
        if (email.equals("accounting@gmail.com")) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Email not mach, test fail ");
        }

        WebElement signInButton = driver.findElement(By.xpath(
                "//button[contains(text(), 'Sign In')]"));
        String signIn = signInButton.getText();
        if(signIn.equals("Sign in")){
            System.out.println("Sign In button present, test pass");
        }
        else {
            System.out.println("test fail, Sing in button dosent exist");
        }

        WebElement signUpButton = driver.findElement(By.xpath(
                "//button[contains(text(), 'Sign up')][1]"));
        String signUp = signUpButton.getText();
        if(signIn.equals("Sign in")){
            System.out.println("Sign Up button present, test pass");
        }
        else {
            System.out.println("Test fail, Sing Up button dosent exist");
        }
    }
}
