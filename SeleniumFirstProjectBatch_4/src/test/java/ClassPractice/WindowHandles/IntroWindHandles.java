package ClassPractice.WindowHandles;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class IntroWindHandles {
    public static void main(String[] args) {
        /* go to https://demoqa.com/browser-windows
        * click on new tab
        * print window handles*/
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/browser-windows");

        String parentWindHandle = driver.getWindowHandle();

        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        System.out.println(driver.getWindowHandle());

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows){
            if(!window.equals(parentWindHandle)){
                driver.switchTo().window(window);
            }
        }

    }
}
