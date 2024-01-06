package ClassPractice.IntroToAction;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PracticeRightClick {
    public static void main(String[] args) {
        /*go to  https://the-internet.herokuapp.com/context_menu
        right click on block box
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement blackBox = driver.findElement(By.linkText("hot-spot"));

        Actions actions = new Actions(driver);
        actions.contextClick(blackBox).perform();


    }
}
