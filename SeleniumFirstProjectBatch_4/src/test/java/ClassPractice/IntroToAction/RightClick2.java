package ClassPractice.IntroToAction;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightClick = driver.findElement(By.xpath(
                "//span[@class='context-menu-one btn-neutral"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClick).perform();
        WebElement element = driver.findElement(By.xpath("//button[@ondblclick='myFunction"));
        actions.doubleClick(element).perform();

       // driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
//        driver.switchTo().sendKeys("");
    }
}
