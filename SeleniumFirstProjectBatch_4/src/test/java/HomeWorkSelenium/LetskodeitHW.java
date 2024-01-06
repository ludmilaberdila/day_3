package HomeWorkSelenium;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LetskodeitHW {
    public static void main(String[] args) throws InterruptedException {
        /*
            Create LetskodeitHW class
            1. Go to https://www.letskodeit.com/
            2. Click on Practice on menu
            3. Switch to the second window
            4. Click on the 'open tab' button
            5. Switch to the third tab
            6. Print the Title and URL of the third tab
            1. Navigate to https://www.letskodeit.com/practice
            2. Click on Open Window button
            3. print title and url
        */
        //1. Go to https://www.letskodeit.com/
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.letskodeit.com/");

        //2. Click on Practice on menu
        WebElement practiceButton = driver.findElement(By.xpath("//li[@data-id='547247']"));
        practiceButton.click();
        System.out.println("Click Practice Button");

        //3. Switch to the second window
        String homePageWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(homePageWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Thread.sleep(5000);

        driver.findElement(By.xpath("//header[@id='top']"));
        System.out.println("on the second pages");


        //4. Click on the 'open tab' button
        WebElement opentab = driver.findElement(By.xpath("//a[@id='opentab']"));
        opentab.click();
        System.out.println("Click open Tab");

        //5. Switch to the third tab
        int onThirdTab = 3;
        for (String windowHandle : driver.getWindowHandles()) {
            onThirdTab--;
            if (!windowHandle.equals(homePageWindowHandle) && onThirdTab == 0) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Thread.sleep(5000);

//
//        int onSecondTab = 2;
//        for (String windowHandle : driver.getWindowHandles()) {
//            onSecondTab--;
//            if (!windowHandle.equals(homePageWindowHandle) && onSecondTab == 0) {
//                driver.switchTo().window(windowHandle);
//                break;
//            }
//        }


        //6. Print the Title and URL of the third tab
        System.out.println("Title of the third tab: " + driver.getTitle());
        System.out.println("URL of the third tab: " + driver.getCurrentUrl());


          //1. Navigate to https://www.letskodeit.com/practice
          driver.get("https://www.letskodeit.com/practice");

        // Step 2: Click on Open Window button
         driver.findElement(By.id("openwindow")).click();
        Thread.sleep(5000);

        // Step 3: print title and url
        System.out.println("Title of the new window: " + driver.getTitle());
        System.out.println("URL of the new window: " + driver.getCurrentUrl());
    }
}
