package ClassPractice.IntroToAction;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HoverOver {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://magento.softwaretestingboard.com");
      Actions actions = new Actions(driver);

      WebElement women = driver.findElement(By.linkText("Women"));
        actions.moveToElement(women).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Tops")));

        WebElement tops = driver.findElement(By.linkText("Tops"));
        actions.moveToElement(tops).click().build().perform();

        WebElement men = driver.findElement(By.linkText("Men"));
        actions.moveToElement(men).perform();

        WebElement butoon = driver.findElement(By.linkText("Button"));
        actions.moveToElement(butoon).click().perform();



    }
}
