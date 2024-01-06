import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAy_7_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox/");

        WebElement checkButton = driver.findElement(By.xpath(
                "//input[contains(@id, 'checkbox-1')]"));
        checkButton.click();
        driver.quit();
    }
}
