import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");

        String actualText = driver.findElement(By.xpath(
                "//text[text(), 'Choose your departure city:]")).getText();
        System.out.println(actualText);

        String anotherActualText = driver.findElement(By.xpath(
                "//a[@class='brand' and starts-with(text(),'Travel')]")).getText();
        System.out.println(anotherActualText);


    }
}
