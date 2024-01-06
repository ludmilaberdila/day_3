package HomeWorkSelenium;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
/*Test #4:
   1. go to https://demo.guru99.com/test/newtours/
   2. click on "Flights"
   3. select "One Way" radiobutton
   4. select "3" Passengers
   5. on October 20
   6. arriving in "Paris"
   7. returning December 15
   8. select "Unified Airlines"
   9. click on Continue
   10. verify "No Seats Avaialble" message displayed
   11. click on "Back to Home" button
   12. verify url is "https://demo.guru99.com/test/newtours/index.php"*/
public class guru99ticket {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://demo.guru99.com/test/newtours/");

        // Click on "Flights"
        driver.findElement(By.linkText("Flights")).click();

        // Select "One Way" radiobutton
        driver.findElement(By.cssSelector("input[value='oneway']")).click();

        // Select "3" Passengers
        WebElement passengersDropdown = driver.findElement(By.name("passCount"));
        Select passengersSelect = new Select(passengersDropdown);
        passengersSelect.selectByValue("3");

        // Select "Unified Airlines"
        WebElement airlineDropdown = driver.findElement(By.name("airline"));
        Select airlineSelect = new Select(airlineDropdown);
        airlineSelect.selectByVisibleText("Unified Airlines");

        // Selecting date and destination
        driver.findElement(By.name("fromPort")).sendKeys("Paris");
        driver.findElement(By.name("fromDay")).sendKeys("20");
        driver.findElement(By.name("toPort")).sendKeys("Paris");
        driver.findElement(By.name("toMonth")).sendKeys("December");
        driver.findElement(By.name("toDay")).sendKeys("15");

        // Click on Continue
        driver.findElement(By.name("findFlights")).click();

        // Verify "No Seats Available" message displayed
        WebElement noSeatsMessage = driver.findElement(By.xpath("//font[contains(text(),'No Seats Avaialble')]"));
        assertEquals("No Seats Avaialble", noSeatsMessage.getText());

        // Click on "Back to Home" button
        driver.findElement(By.linkText("Home")).click();

        // Verify URL is "https://demo.guru99.com/test/newtours/index.php"
        assertEquals("https://demo.guru99.com/test/newtours/index.php", driver.getCurrentUrl());
    }
}
