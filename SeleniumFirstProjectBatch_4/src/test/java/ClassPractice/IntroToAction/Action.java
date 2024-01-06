package ClassPractice.IntroToAction;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.browserstack.com/");

        WebElement getStratButton = driver.findElement(By.id("signupModalProductButton"));
       // getStratButton.click();

        Actions actions = new Actions(driver);
        actions.moveToElement(getStratButton).click().perform();
    }
}
