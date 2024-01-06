import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoQaPractice {
    public static void main(String[] args) throws InterruptedException {
        /*go to https://demoqa.com/text-box
         * name
         * enter email
         * enter c */

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[contains(@id, 'userName')]"));

        WebElement email = driver.findElement(By.xpath(
                "//input[@autocomplete='off' and @type='email']"));
        email.sendKeys("Bena");

        WebDriver currentAddress = (WebDriver) driver.findElement(By.xpath(
                "//textArea[strts-with(@id, 'cur' "));
        ((WebElement) currentAddress).sendKeys("123 Abs Street");

        WebElement permanentAddress = driver.findElement(By.xpath(
                "//textArea[@class='form-control' and id@='permanentAddress']"));
        permanentAddress.sendKeys("890 Zxy Street");


            Thread.sleep(3000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        List<WebElement> output = driver.findElements(By.xpath("//div[id@='output']//p"));

        for (WebElement element : output) {
            System.out.println(element.getText());
            if (element.getText().contains("Name")) {
                element.getText().contains("Bena");
            }
        }
    }
}
