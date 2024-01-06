import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropOffSet {
    public static void main(String[] args) {
       /* go to https://the-internet.herokuapp.com/drsg_and_drop
        * drag A to B */

       WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
    }
}
