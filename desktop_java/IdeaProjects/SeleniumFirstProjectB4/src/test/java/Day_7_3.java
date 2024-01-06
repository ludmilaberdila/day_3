import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_7_3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement checkButton = driver.findElement(By.name("exampleRadios"));
        checkButton.click();
    }
}
