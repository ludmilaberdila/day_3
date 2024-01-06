import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pracrice2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");

        driver.findElement(By.xpath(
                "//a[contains(text(),'Speaking JavaScript')]")).click();
        driver.getTitle();

         WebElement titleText = driver.findElement(By.xpath(
                "//a[contains(text(),'Speaking JavaScript')]"));
        String titleBook = titleText.getText();

        if(titleBook.equals("Speaking JavaScript")){
            System.out.println("test pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
