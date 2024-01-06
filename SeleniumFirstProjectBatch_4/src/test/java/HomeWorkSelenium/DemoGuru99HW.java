package HomeWorkSelenium;

import Utilities.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class DemoGuru99HW {
         /*Test #1:
        1. go to https://demo.guru99.com/telecom/billing.php
        2. enter special chars
        3. verify "Special characters are not allowed"  message appears */

    public static WebDriver driver;

    @BeforeClass
    public static void createDriver() {
        driver = Driver.getDriver();
    }

    @AfterClass
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    /*Test #1:
    1. go to https://demo.guru99.com/telecom/billing.php
    2. enter special chars
    3. verify "Special characters are not allowed"  message appears */
    @Test
    public void testCustomerId() {
        driver.get("https://demo.guru99.com/telecom/billing.php");
        driver.findElement(By.id("customer_id")).sendKeys("####");
        String message = driver.findElement(By.id("message2")).getText();
        assertEquals("**** Customer ID text doesn't match ****",
                message, // message from page
                "Special characters are not allowed"); // actual message to match
    }

    /*Test #2:
   1. go to https://demo.guru99.com/telecom/billing.php
   2. enter string
   3. verify "Characters are not allowed" message appears
   4. click on submit
   5. "Please Correct Value Input" will pop up, accept it*/
    @Test
    public void stringText() {
        driver.get("https://demo.guru99.com/telecom/billing.php");
        driver.findElement(By.id("customer_id")).sendKeys("aaaa");
        String message1 = driver.findElement(By.id("message2")).getText();
        assertEquals("**** stringText  doesn't match ****",
                message1, // message from page
                "Characters are not allowed"); // actual message to match
        // driver.findElement(By.xpath("//input[@class='fit']")).click();


    }

    /*Test #3
  1. go to https://demo.guru99.com/telecom/billing.php
  2. enter integer
  3. click on submit
  4. verify "Please Input Your Correct Customer ID" message */
//    @Test
//    public void integer() {
//        driver.get("https://demo.guru99.com/telecom/billing.php");
//        driver.findElement(By.id("customer_id")).sendKeys("1111");
//        driver.findElement(By.xpath("//input[@class='fit']")).click();
//        String message2 = driver.findElement(By.linkText("Please Input Your Correct Customer ID")).getText();
//        assertEquals("**** integer doesn't match ****",
//                message2, // message from page
//                "Please Input Your Correct Customer ID"); // actual message to match
//
//    }

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


        @Test
        public  void testBookFlightAndVerifyNoSeatsAvailable() {
            // Test #4
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



