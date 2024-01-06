import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");

        WebElement linkToBeach = driver.findElement(By.xpath("//a[contains(@href, 'vacat')]"));
//        WebElement linkToBeach_2 = driver.findElement(By.cssSelector("a[href=vacat]"));
        linkToBeach.click();

        WebElement hawaiiText = driver.findElement(By.xpath("//div[contains(@class, 'cont')])[2]"));
        String actualTest = hawaiiText.getText();

        if(actualTest.contains("Hawaii")) {
            System.out.println("Woho, going to Hawaii");
        }
            else{
                System.out.println("Stay in Chicago");
            }



    }
}
