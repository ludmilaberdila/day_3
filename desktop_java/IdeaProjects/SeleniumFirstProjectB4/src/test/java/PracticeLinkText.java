import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement redirekt = driver.findElement(By.linkText("Redirect Link"));
        redirekt.click();

        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.linkText("Dragon and Drop")).click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();

        driver.findElement(By.linkText("Context Menu")).click();
        System.out.println(driver.getCurrentUrl());

    }
}
