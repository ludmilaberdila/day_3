package studymate.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CoursePage {
    WebDriver driver;

    public CoursePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[text()='Create course']")
    public WebElement createCourse;



    @FindBy(xpath = "//*[@name='courseName']")
    public WebElement courseName;



    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement description;



    @FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
    public WebElement date;



    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createButton;

    @FindBys(@FindBy(xpath = "//div[@class='css-1qf1rpk']/div/div[2]/div/div"))
    public List<WebElement> courseNames;

    public void createACourse(String courseName, String description, String date){
        createCourse.click();
        this.courseName.sendKeys(courseName);
        this.description.sendKeys(description);
        this.date.sendKeys(date);

        this.date.click();
        this.date.sendKeys(date);
        createButton.click();
    }

    public boolean isCourseCreated(String courseName) {

        for (WebElement course : courseNames) {
            if (course.getText().contains(courseName)) {
                return true;
            }
        }
        return false;
    }
}

