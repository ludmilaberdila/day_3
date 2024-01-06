package ClassPractice.IntroToAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDragAndDropOffSet {
    public static void main(String[] args) {

        /* 1:
        go to https://the-internet.herokuapp.com/drsg_and_drop
        * drag A to B */

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement source = driver.findElement(By.id("column-a"));
        Actions actions = new Actions(driver);
        actions
                .clickAndHold(source).moveByOffset(5,0).build().perform();

    }
}
