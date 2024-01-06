package ClassPractice.IntroToAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDadAndDrop {
    public static void main(String[] args) {
        /*  HOW TO DRAG AND DROP:
        * Locate the source element (element to drag)
        * locate the target element (place where we to drope the element)
        * actions.dragAndDrop(sourceElement, targetElement).build.perform()*/



        /* 1:
        go to https://the-internet.herokuapp.com/drsg_and_drop
        * drag A to B */
       WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));

       // Actions actions = new Actions(driver);
       // actions.dragAndDrop(source,target).build().perform();

        /* go to https://way2automation.com/way2auto_jquery/droppable.php#load_box
        * drag and drop White box into gray square
        * */

        //WebDriver driver = new ChromeDriver();
        driver.get("https://way2automation.com/way2auto_jquery/droppable.php#load_box");

        WebElement iframe1 = driver.findElement(By.xpath("//iframe[src='droppable/default.html']"));
        driver.switchTo().frame(iframe1);

        WebElement source1 = driver.findElement(By.id("draggable"));
        WebElement target2 = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source1, target2).build().perform();


    }
}
