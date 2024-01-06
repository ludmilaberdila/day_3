package ClassPractice.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsPractice {
    public static void main(String[] args) throws InterruptedException {


//        WebDriver driver = new ChromeDriver();
//        driver.get("https://en.wikipedia.org/wiki/Java_(programming_language)#cite_note-40");
////        WebElement linkBetta = driver.findElement(By.xpath("//th[text()='Version']"));
////        linkBetta.click();
//
//
//            /* scrol find element and haver Over on element*/
//        WebElement table = driver.findElement(By.xpath("//table[@class='wikitable']"));
//        ((JavascriptExecutor) driver)
//                .executeScript("arguments[0].scrollIntoView(true)", table);
//        Actions actions = new Actions(driver);
//        WebElement betalink = driver.findElement(By.partialLinkText("Beta"));
//        actions.moveToElement(betalink).moveToElement(betalink).release().perform();




           ///test2: action move to element
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://en.wikipedia.org/wiki/Java_(programming_language)#cite_note-40");
//        WebElement linkBetta = driver.findElement(By.xpath("//th[text()='Version']"));
//        linkBetta.click();
//
//
//
//        WebElement table = driver.findElement(By.xpath("//table[@class='wikitable']"));
//        ((JavascriptExecutor) driver)
//                .executeScript("arguments[0].scrollIntoView(true)", table);
//
//        Actions actions = new Actions(driver);
//        WebElement betaLink = driver.findElement(By.partialLinkText("Beta"));
//
//        actions.moveToElement(betaLink).moveToElement(betaLink).release().perform();


        //scroll by amount test
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://amazon.com/");
//
//        Actions actions = new Actions(driver);
//        //x orizont, y vertical
//        actions.scrollByAmount(0,1000).perform();


        //click and hold
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
//
//        Actions actions = new Actions(driver);
//        //find the button C
//        WebElement buttonC =  driver.findElement(By.xpath("//li[@mname='C']"));
//
//        //click and hold button C for 10 secunds
//        actions.clickAndHold(buttonC).perform();
//        Thread.sleep(10000);
//
//        //after 10 seconds release button C
//        actions.release().perform();


        // go to website "https://selenium.blogspot.com/2020/01/click-and-hold.html/"
        //clic and hold button c
        //move the cursor to the B
        //c na b button should be swapped
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
//        Actions actions = new Actions(driver);
//        //find the button C
//        WebElement buttonC =  driver.findElement(By.xpath("//li[@name='C']"));
//        WebElement buttonB = driver.findElement(By.xpath("//li[@name='B']"));
//        actions.clickAndHold(buttonC).moveToElement(buttonB).release().perform();



        //action double click
        //go to https://demoqa.com/buttons
        //make double clickButton
        //verify that alert mess is equal"you have done a double click"
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/buttons");
//
//        WebElement doubleButton = driver.findElement(By.id("doubleClickBtn"));
//        Actions actions = new Actions(driver);
//        actions.doubleClick(doubleButton);
//
//        String expectText = "You have done a double click!";
//        String actualText = driver.findElement(By.id("doubleClickMessage")).getText();
//        if(expectText.equals(actualText)){
//            System.out.println("success");
//        }
//        else {
//            System.out.println("fail");
//        }

          //right click
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/buttons");
//
//        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
//        Actions actions = new Actions(driver);
//        actions.contextClick(rightClickBtn).perform();
//
//        String expectText = "You have done a right click!";
//        String actualText = driver.findElement(By.id("rightClickMessage")).getText();
//        if(expectText.equals(actualText)){
//            System.out.println("success");
//        }
//        else {
//            System.out.println("fail");
//        }




        //actions drag and drops
        //drag the draggable element
        //and drop it inside drop here element
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/dragabble");
//        WebElement draggable = driver.findElement(By.id("draggable"));
//       WebElement droppable =  driver.findElement(By.id("droppable"));
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(draggable, droppable).perform( );

        //drag and drops by
        //go to web https://demoqa.com/dragabble
        // drag the dragabble element
        //and drop it inside drophere element
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/dragabble");
//        WebElement drogBox = driver.findElement(By.id("dragBox"));
//        Actions actions =new Actions(driver);
//        actions.dragAndDropBy(drogBox, 0, 300).perform();

        //WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        Actions actions = new Actions(driver);
//        WebElement textBox = driver.findElement(By.xpath("//textarea[@name='q']"));
//        actions.keyDown(Keys.SHIFT).
//                sendKeys(textBox,"codewise").keyUp(Keys.SHIFT).sendKeys("academy" + Keys.ENTER)
//                .sendKeys(Keys.ARROW_DOWN).perform();


        /*actions keys exercices
        go to https://en.wikipedia.org/wiki/Karate
        locate heading element select the text and copy it
        locate serch box element past the copied test + Combat and press enter
        verify that webdrive is redirected to the url https://en.wikipedia.org/wiki/Karate_Comba
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Karate");

        WebElement karateText = driver.findElement(By.xpath("//h1[@id='firstHeading']/span"));
        WebElement serchBox = driver.findElement(By.xpath("//input[@role='combobox']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(karateText).keyDown(Keys.COMMAND)
                .sendKeys("c")
                .keyUp(Keys.COMMAND).perform();

        actions.keyDown(Keys.COMMAND)
                .click(serchBox)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .pause(Duration.ofMillis(200))
                .sendKeys("Combat")
                .sendKeys(Keys.ENTER).perform();




    }


}
