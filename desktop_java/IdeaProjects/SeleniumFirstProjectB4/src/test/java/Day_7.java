import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

        WebElement selectEle1 = driver.findElement(By.xpath("//select[@id='first'"));
        Select selectProd = new Select(selectEle1);
        selectProd.selectByIndex(1);

        WebElement selectEle2 = driver.findElement(By.xpath("//select[@id='animal']"));
        Select selectAnimals = new Select(selectEle2);
        selectAnimals.selectByValue("babycat");

        WebElement selectElemen3 = driver.findElement(By.id("second"));
       // Select selectFood = driver.findElement();


    }
}
