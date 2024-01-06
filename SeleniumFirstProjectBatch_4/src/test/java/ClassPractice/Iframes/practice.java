package ClassPractice.Iframes;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
        // switching to embedded iframe
        driver.switchTo().frame("globalSqa");

        WebElement elementToScrollTo = driver.findElement(By.xpath("//div[@id='portfolio_items']"));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true)", elementToScrollTo);

        Thread.sleep(2000);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='portfolio_items']/div//h3"));
        System.out.println("We have these trainings available:");
        for(WebElement i: elements){
            System.out.println(i.getText());
        }
    }
}
