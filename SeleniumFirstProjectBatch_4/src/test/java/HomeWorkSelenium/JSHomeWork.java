package HomeWorkSelenium;

import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

        /* 1. go to https://www.eatthismuch.com/
        2. select "Vegan"
        3. enter 2200 calories
        4. enter in 6 meals
        5. click on "Generate"
        6. verify there are 6 meals (breakfast,  snack, lunch, snack, dinner, snack)
        7. select any of recipes that was given
        8. new window with detailed recipe will pop up
        9. scroll down and verify "Other ingredients on Amazon fresh" button is displayed
        10. close window*/

public class JSHomeWork {
    WebDriver driver = Driver.getDriver();

    @Test
    public void EatThisMuch() throws InterruptedException {
        driver.get("https://www.eatthismuch.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(By.xpath(
                "//li[@data-value='vegetarian']")));

        js.executeScript("arguments[0].sendKeys('2200')", driver.findElement(By.xpath(
                "//input[@id='cal_input']")));
    }
}
