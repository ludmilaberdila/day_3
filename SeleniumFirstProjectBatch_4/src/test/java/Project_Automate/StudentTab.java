package Project_Automate;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class StudentTab {
    private static Instant wait;

    public static void main(String[] args) throws InterruptedException {
        HashMap<String, String> studentToAdd = new HashMap<String, String>(){{
            put("email", getRandomEmail(5) + ".romanova@gmail.com");
            put("fName", "Ana");
            put("lName", "Romanova");
            put("phone", "7739853257");
            put("groupId", "Batch4");
            put("studyFormat", "ONLINE");
        }};

        WebDriver driver = Driver.getDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Dimension browserSize = new Dimension(1400, 1000);
        driver.manage().window().setSize(browserSize);

        driver.get("https://codewiser.studymate.us/login");
        // wait until page is loaded
        wait.until(d -> driver.findElement(By.xpath("//input[@id=':r0:']")).isDisplayed());
        printLog("success", "page loaded successfully");

        printLog("success", "fill up login form...");
        driver.findElement(By.xpath("//input[@id=':r0:']"))
                .sendKeys("admin@codewise.com");
       Thread.sleep(300);
        driver.findElement(By.xpath("//input[@id=':r1:']"))
                .sendKeys("codewise123");
        Thread.sleep(300);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(d -> driver.findElement(By.xpath("//li[contains(text(),'Student')]"))
                .isDisplayed());
        Thread.sleep(2000);
        printLog("success", "User loged in");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[contains(text(),'Student')]")).click();
        printLog("success", "Click on student Button");
        Thread.sleep(2000);

        // create first new student
        addNewStudent(driver, studentToAdd, true);

        compareAlertMessage(driver, "successSuccess", "New student successfully saved");
        Thread.sleep(2000);
        // finish adding a student with success

        // try to add same user again
        addNewStudent(driver, studentToAdd, true);

        compareAlertMessage(driver, "errorSuccess", "User with the same email already exists");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("form.css-0 button[type=button]")).click();
        WebElement searchInput = driver.findElement(By.xpath(
                "//input[@name='search']"));

        //  searchInput.sendKeys(newEmail);
        searchInput.sendKeys(studentToAdd.get("email"));

        // wait up to 10 seconds until student is found by email, can have a long delay due to API slowness
        wait.until(d -> driver.findElement(By.cssSelector("table tbody tr td:last-child button")).isDisplayed());
        printLog("success", "student \"" + studentToAdd.get("email") + "\" found successfully in search box");
        Thread.sleep(1500);

        driver.findElement(By.cssSelector("table tbody tr td:last-child button")).click();
        Thread.sleep(1500);

        //find and click student action menu
        driver.findElement(By.cssSelector("ul[role='menu'] li:last-child")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(1500);
        compareAlertMessage(driver, "successSuccess", "Student successfully deleted");
        printLog("success", "Student \"" + studentToAdd.get("email") + "\" moved to trash." );

        // clear the search input
        driver.findElement(By.xpath("//button[@tabindex='0'][3]")).click();
        printLog("success", "Clear out input field");
        if(searchInput.getText().equals("")){
            printLog("success", "Success clearing search input field");
        }else { printLog("error", "Failed to clear search input field"); }

        Thread.sleep(1000);
        // try to add same user again but this time user is in trash
        addNewStudent(driver, studentToAdd, true);
        compareAlertMessage(driver, "errorSuccess",
                "User with the same email already exists in the Trash");

//        driver.findElement(By.cssSelector("form.css-0 button[type=button]")).click();
//        Thread.sleep(1000);
        cancelButton(driver);

        // add new student for edite
        studentToAdd.put("email", getRandomEmail(5) + ".romanova@gmail.com");
        addNewStudent(driver, studentToAdd, true);
        Thread.sleep(2000);

        //search for new student with email
        searchInput.sendKeys(studentToAdd.get("email"));

        // wait up to 10 seconds until student is found by email, can have a long delay due to API slowness
        wait.until(d -> driver.findElement(By.cssSelector("table tbody tr td:last-child button")).isDisplayed());
        printLog("success", "student \"" + studentToAdd.get("email") + "\" found successfully in search box");
        Thread.sleep(1500);

        //find and click action menu
        driver.findElement(By.cssSelector("table tbody tr td:last-child button")).click();
        Thread.sleep(1500);

        //click on action menu for edite student
        driver.findElement(By.xpath("//ul[@role='menu']//li[contains(text(),'Edit')]")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//div[@id='mui-component-select-groupId']")).click();
        Thread.sleep(200);
        driver.findElement(
                By.xpath("//li[contains(text(),'batch3')]")).click();
        Thread.sleep(200);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(500);

        compareAlertMessage(driver,"successSuccess", "Student successfully updated");
        Thread.sleep(2000);

        //        =================================================
        driver.findElement(By.cssSelector("table tbody tr td:last-child button")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//ul[@role='menu']//li[contains(text(),'Edit')]")).click();
        Thread.sleep(1500);
        cancelButton(driver);
        printLog("Success","Edite Button Cancel Click");
//        =================================================


        driver.findElement(By.cssSelector("table tbody tr td:last-child button")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//li[contains(text(),'Block')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Block')]")).click();
        Thread.sleep(1500);
        compareAlertMessage(driver,"successSuccess", "Student successfully blocked");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("table tbody tr td:last-child button")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//li[contains(text(),'Unblock')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Unblock')]")).click();
        Thread.sleep(1500);

        compareAlertMessage(driver,"successSuccess", "Student successfully unblocked");
        Thread.sleep(2000);

        //  ===========================================================================================
        driver.findElement(By.cssSelector("table tbody tr td:last-child button")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//li[contains(text(),'Block')]")).click();
        Thread.sleep(1500);
        cancelButton(driver);
        printLog("Success","Block Button Cancel Click");
     //==============================================================

        Thread.sleep(1500);

       //  ===========================================================================================
        driver.findElement(By.cssSelector("table tbody tr td:last-child button")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//li[contains(text(),'Delete')]")).click();
        Thread.sleep(1500);
        cancelButton(driver);
        printLog("Success","Delete Button Cancel Click");
        //==============================================================
        Thread.sleep(1500);
        //Search parameters
        driver.findElement(By.xpath("//button[@type='button'][2]")).click();
        printLog("success","Search parameters Click");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//div[@id='mui-component-select-studyFormat']")).click();
        printLog("success","Click on study format");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//li[@data-value='ONLINE']")).click();
        printLog("success","Select from study format Online");
        Thread.sleep(1000);

        //click on search parameters to specify parameters
        driver.findElement(By.xpath("//div[@id='mui-component-select-groupId']")).click();
        printLog("success","Click on Group");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@data-value='446']")).click();
        printLog("success","Select from Group Batch4");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='presentation']//button[contains(text(),'Apply')]")).click();
        Thread.sleep(2000);
        printLog("success","Click on Apply Button");
        Thread.sleep(2000);

        //click on search parameters second time to reset
        driver.findElement(By.xpath("//button[@type='button'][2]")).click();
        printLog("success","Search parameters Click second time");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='presentation']//button[contains(text(),'Reset')]")).click();
        Thread.sleep(2000);

        //click on search parameters 3 time to reset
        //search parameters study format
        driver.findElement(By.xpath("//button[@type='button'][2]")).click();
        printLog("success","Search parameters Click");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//div[@id='mui-component-select-studyFormat']")).click();
        printLog("success","Click on study format");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//li[@data-value='OFFLINE']")).click();
        printLog("success","Select from study format OFFLINE");
        Thread.sleep(1000);

        //search parameters Group
        driver.findElement(By.xpath("//div[@id='mui-component-select-groupId']")).click();
        printLog("success","Click on Group");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@data-value='454']")).click();
        printLog("success","Select from Group %^%^%^%^%");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='presentation']//button[contains(text(),'Apply')]")).click();
        Thread.sleep(2000);
        printLog("success","Click on Apply Button");
        Thread.sleep(2000);
        String notFoundBadBatch = driver.findElement(By.xpath("//p[@class='css-fc1v9w']")).getText();
        if(notFoundBadBatch.equals("You don't have any students!")){
            printLog("success","You don't have any students!");
        }else {
            printLog("error","You don't have any students, message not found");
        }

        // clear the search input
        driver.findElement(By.xpath("//button[@tabindex='0'][3]")).click();
        printLog("success", "Clear out input field");
        if(searchInput.getText().equals("")){
            printLog("success", "Success clearing search input field");
        }else { printLog("error", "Failed to clear search input field"); }

        //alert message
        searchInput.sendKeys("kljkjhjhgjhgghgHGHJGJHGJ");
        String notFound = driver.findElement(By.xpath("//p[@class='css-fc1v9w']")).getText();
        if(notFound.equals("You don't have any students!")){
            printLog("success","You don't have any students!");
        }else {
            printLog("error","You don't have any students, message not found");
        }



       //=======================================================================================
        //// NEGATIVE TESTING CASE////////////// //// NEGATIVE TESTING CASE/////////////////////
        HashMap<String, String> badStudent = new HashMap<String, String>(){{
            put("email", getRandomEmail(210) + ".romanova@gmail.com");
            put("fName", getRandomEmail(250));
            put("lName", getRandomEmail(250));
            put("phone", generateRandomPhone(70));
            put("groupId", "Batch4");
            put("studyFormat", "ONLINE");
        }};
        addNewStudent(driver, badStudent, true);
        // if success popup display as student added with success that is a bad thing
        Thread.sleep(1500);
        if (!driver.findElements(By.cssSelector("div.MuiAlert-successSuccess")).isEmpty() &&
                driver.findElement(
                        By.xpath("//div[contains(@class,'MuiAlert-successSuccess')]" +
                                "//p[@class='sc-dkrFOg hbyUzQ']"))
                        .getText().equals("New student successfully saved")) {
            printLog("error", "A bad student were abe to be entered in the form");
        } else {
            printLog("success", "Form doesn't allow to enter bad data");
            Thread.sleep(2000);
            // try to cancel form after trying to add a new student and was unsuccessfully
            cancelButton(driver);
        }
         //************************ Negative Phone Number   ****************
        HashMap<String, String> negativePhoneNumber = new HashMap<String, String>(){{
            put("email", getRandomEmail(10) + ".romanova@gmail.com");
            put("fName", getRandomEmail(6));
            put("lName", getRandomEmail(7));
            put("phone", "-2359895252");
            put("groupId", "Batch4");
            put("studyFormat", "ONLINE");
        }};
        addNewStudent(driver, negativePhoneNumber, true);

        Thread.sleep(1500);
        if (!driver.findElements(By.cssSelector("div.MuiAlert-successSuccess")).isEmpty() &&
                driver.findElement(
                                By.xpath("//div[contains(@class,'MuiAlert-successSuccess')]" +
                                        "//p[@class='sc-dkrFOg hbyUzQ']"))
                        .getText().equals("New student successfully saved")) {
            printLog("error", "A student with negative Phone number were abe to be entered in the form");
        } else {
            printLog("success", "Form doesn't allow to enter negative Phone Number");
            Thread.sleep(2000);
            // try to cancel form after trying to add a new student and was unsuccessfully
            cancelButton(driver);
        }

        //************ Space in the First Name and Last Name  *****************
        HashMap<String, String> amptyFirstLast = new HashMap<String, String>(){{
            put("email", getRandomEmail(4) + ".romanova@gmail.com");
            put("fName", "    ");
            put("lName", "      ");
            put("phone", "235");
            put("groupId", "Batch4");
            put("studyFormat", "ONLINE");
        }};
        addNewStudent(driver, amptyFirstLast, true);

        Thread.sleep(1500);
        if (!driver.findElements(By.cssSelector("div.MuiAlert-successSuccess")).isEmpty() &&
                driver.findElement(
                                By.xpath("//div[contains(@class,'MuiAlert-successSuccess')]" +
                                        "//p[@class='sc-dkrFOg hbyUzQ']"))
                        .getText().equals("New student successfully saved")) {
            printLog("error", "A student with First and Last Name is allowed having " +
                    "empty space also short Phone Number");
        } else {
            printLog("success", "Form doesn't allow to enter short Phone Number " +
                    "and empty First and Last Name");
            Thread.sleep(2000);
            // try to cancel form after trying to add a new student and was unsuccessfully
            cancelButton(driver);
        }

        //##################################
        //************  enable and disable add button  *****************
        HashMap<String, String> goodData = new HashMap<String, String>(){{
            put("email", getRandomEmail(4) + ".romanova@gmail.com");
            put("fName", getRandomEmail(4));
            put("lName", getRandomEmail(4));
            put("phone", "55533326666");
            put("groupId", "Batch4");
            put("studyFormat", "ONLINE");
        }};
        addNewStudent(driver, goodData, false);
        // display success or fail message
        displayMessage("form fully completed submit button is enable",
                "form fully completed submit button is disabled",
                        submitIsEnabled(driver));
        Thread.sleep(1500);

        //**************** NO CLEAR OUT FIRST NAME FIELD AND CHECK SUBMIT BUTTON DISABLED
        driver.findElement(By.xpath("//input[@name='name']")).clear();
        // display fail or success message
        displayMessage("First Name field is empty and submit button is disabled",
                "First Name field is empty and submit button is enabled",
                !submitIsEnabled(driver));
        Thread.sleep(1500);
        cancelButton(driver);

        Thread.sleep(3000);
        // upload wrong file format
        printLog("success", "Try to upload csv file");
        loadFileInForm(driver, "student_test_csv.csv");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // wait for alert message
        wait.until(d -> driver.findElement(By.xpath(getAlertXpath()))
                .isDisplayed());
        compareAlertMessage(driver,
                "errorSuccess",
                "No valid entries or contents found, this is not a valid OOXML (Office Open XML) file");
        cancelButton(driver);
        Thread.sleep(2000);

        // upload file with no students
        printLog("success", "Try to upload excel file with no students");
        loadFileInForm(driver, "excel_no_students.xlsx");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // wait for alert message
        wait.until(d -> driver.findElement(By.xpath(getAlertXpath()))
                .isDisplayed());
        compareAlertMessage(driver,
                "errorSuccess",
                "Students successfully added from excel file");
        Thread.sleep(2000);

        // upload empty file
        printLog("success", "Try to upload empty excel file");
        loadFileInForm(driver, "excel_empty_file.xlsx");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // wait for alert message
        wait.until(d -> driver.findElement(By.xpath(getAlertXpath()))
                .isDisplayed());
        compareAlertMessage(driver,
                "errorSuccess",
                "Some headers are missing in the sheet: [Email, Last Name, Phone Number, Study Format, Name]");
        Thread.sleep(2000);
        cancelButton(driver);

        // upload excel file with students
        printLog("success", "Try to upload excel file with students");
        loadFileInForm(driver, "excel_with_students.xlsx");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // wait for alert message
        wait.until(d -> driver.findElement(By.xpath(getAlertXpath()))
                .isDisplayed());
        compareAlertMessage(driver,
                "successSuccess",
                "Students successfully added from excel file");
        Thread.sleep(3000);

        // upload same file with students
        printLog("success", "Try to upload excel file with students");
        loadFileInForm(driver, "excel_with_students.xlsx");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // wait for alert message
        wait.until(d -> driver.findElement(By.xpath(getAlertXpath()))
                .isDisplayed());
        compareAlertMessage(driver,
                "errorSuccess",
                "Emails [[vasea@test.com]] already in use");
        Thread.sleep(3000);
        cancelButton(driver);


    }

    public static String getAlertXpath(){
        return "//div[contains(@class, 'MuiAlert-')]";
    }

    public static void loadFileInForm(WebDriver driver, String fileName) throws InterruptedException {
        File uploadFile = new File("src\\test\\java\\Automate_Test\\" + fileName);
        driver.findElement(By.xpath("//button[contains(text(), 'Import Excel')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@id, 'modal')]//div[@id='mui-component-select-groupId']"))
                .click();
        driver.findElement(By.xpath("//ul[@role='listbox']//li[contains(text(), 'batch3')]")).click();
        driver.findElement(By.xpath("//div[@id='content']//input[@type='file']"))
                .sendKeys(uploadFile.getAbsolutePath());
    }

    public static void displayMessage(String successMsg, String failMsg, boolean successFail) throws InterruptedException {
        if (successFail) {
            printLog("success", successMsg);
        } else {
            printLog("error", failMsg);
            Thread.sleep(2000);
        }
    }

    public static boolean submitIsEnabled(WebDriver driver) throws InterruptedException {
       return driver.findElement(By.xpath("//div[contains(@class,'actions')]//button[@type='submit']"))
               .isEnabled();
    }

    public static void cancelButton(WebDriver driver) throws InterruptedException {
        try {
            driver.findElement(
                    By.xpath("//div[@role='presentation']//button[contains(text(),'Cancel')]")).click();
        }catch (Exception e){
            printLog("success", "No Cancel button found to click");
        }
        Thread.sleep(2000);
    }

    /***
     * Console print colored message
     * @param type: success, error, warning
     * @param message
     * https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println/5762502#5762502
     */
    public static void printLog(String type, String message){
        type = type.toLowerCase();
        if(type.equals("success")){
            System.out.println("\033[0;32m" + message + "\033[0m");
        } else if (type.equals("error")) {
            System.out.println("\033[0;31m" + message + "\033[0m");
        } else if (type.equals("warning")) {
            System.out.println("\033[0;33m" + message + "\033[0m");
        }else { System.out.println(message); }
    }

    /**
     * Populate student form by providing WebDriver and a HashMap with values
     * @param driver
     * @param student
     * @throws InterruptedException
     */
    public static void addNewStudent(WebDriver driver, HashMap<String, String> student, boolean clickSubmit) throws InterruptedException {

        driver.findElement(By.xpath("//button[contains(text(),'Add student')]")).click();
        printLog("success", "Click button \"Add Student\" to open from for new student");
        Thread.sleep(2000);

        printLog("success", "Filling out the form for new student...");
        driver.findElement(By.xpath("//input[@name='name']"))
                .sendKeys(student.get("fName"));
        Thread.sleep(200);

        driver.findElement(By.xpath("//input[@name='lastName']"))
                .sendKeys(student.get("lName"));
        Thread.sleep(200);

        driver.findElement(By.xpath("//input[@name='phoneNumber']"))
                .sendKeys(student.get("phone"));
        Thread.sleep(200);

        driver.findElement(By.xpath("//input[@name='email']"))
                .sendKeys(student.get("email"));
        Thread.sleep(200);

        driver.findElement(By.xpath("//div[@id='mui-component-select-groupId']")).click();
        Thread.sleep(200);
        driver.findElement(
                By.xpath("//li[contains(text(),'"+ student.get("groupId")+"')]")).click();
        Thread.sleep(200);

        driver.findElement(By.xpath("//div[@class='MuiFormControl-root css-ccwj9y'][2]")).click();
        Thread.sleep(200);
        driver.findElement(By.xpath("//li[@data-value='"+ student.get("studyFormat") +"']")).click();
        Thread.sleep(200);
        if(clickSubmit){
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }

        Thread.sleep(500);
    }

    /**
     * Test if alert message is displayed correctly
     * @param driver
     * @param alertType: successSuccess, errorSuccess
     * @param message
     */
    public static void compareAlertMessage(WebDriver driver, String alertType, String message) {
        String alertSelector = "div.MuiAlert-" + alertType;
        if (!driver.findElements(By.cssSelector(alertSelector)).isEmpty() &&
                driver.findElement(By.xpath("//div[contains(@class,'MuiAlert-" +
                                alertType + "')]//p[@class='sc-dkrFOg hbyUzQ']"))
                        .getText().equals(message)) {
            printLog("success", "Alert message does match: \"" + message + "\"");
        } else {
            printLog("error", "Alert message doesn't match \"" + message + "\"");
        }
    }

    /**
     * Generate a random string
     * @return
     */
    public static String getRandomEmail(int textSize){
        Random random = new Random();
        int leftLimit = 96;
        int rightLimit = 122;
        int targetStringLength = textSize;
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    public static String generateRandomPhone(int size){
        Random r = new Random();
        int randIndex;
        String numbers = "0123456789";
        String phone = "";
        int pSize = size;
        while (pSize > 0){
            randIndex = r.nextInt(numbers.length());
            phone += numbers.charAt(randIndex);
            pSize--;
        }
        return phone;
    }



}
