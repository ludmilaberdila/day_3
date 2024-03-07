package HomeWorkSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DemoGuru99HW {
    private WebDriver driver;
    private final String baseUrl = "https://demo.guru99.com/telecom/billing.php";

    @Before
    public void setUp() {
        // Set up WebDriver (Assuming ChromeDriver is used)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testSpecialChars() {
        driver.get(baseUrl);
        WebElement inputField = driver.findElement(By.name("customer"));
        inputField.sendKeys("!@#$%^&*()");
        WebElement errorMessage = driver.findElement(By.id("message"));
        assertEquals("Special characters are not allowed", errorMessage.getText());
    }

    @Test
    public void testStringInput() {
        driver.get(baseUrl);
        WebElement inputField = driver.findElement(By.name("customer"));
        inputField.sendKeys("Hello");
        WebElement errorMessage = driver.findElement(By.id("message"));
        assertEquals("Characters are not allowed", errorMessage.getText());

        driver.findElement(By.name("submit")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void testIntegerInput() {
        driver.get(baseUrl);
        WebElement inputField = driver.findElement(By.name("customer"));
        inputField.sendKeys("123");
        driver.findElement(By.name("submit")).click();
        WebElement errorMessage = driver.findElement(By.id("message"));
        assertEquals("Please Input Your Correct Customer ID", errorMessage.getText());
    }

    @Test
    public void testFlightsBooking() {
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.linkText("Flights")).click();
        driver.findElement(By.cssSelector("input[value='oneway']")).click();
        driver.findElement(By.name("passCount")).sendKeys("3");
        // ... continue with other steps

        // Verify "No Seats Available" message
        WebElement noSeatsMessage = driver.findElement(By.xpath("//b[contains(text(),'No Seats Avaialble')]"));
        assertTrue(noSeatsMessage.isDisplayed());

        // Click on "Back to Home" button
        driver.findElement(By.linkText("Back to Home")).click();
        assertEquals("https://demo.guru99.com/test/newtours/index.php", driver.getCurrentUrl());
    }

    @After
    public void tearDown() {
        // Close the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
