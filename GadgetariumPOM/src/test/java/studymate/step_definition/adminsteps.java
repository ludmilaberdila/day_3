package studymate.step_definition;

import Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import studymate.page.CommonsPage;
import studymate.page.CoursePage;
import studymate.page.LoginPage;
import studymate.page.TeachersPage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class adminsteps {
    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    CommonsPage commonsPage = new CommonsPage(driver);
    TeachersPage teachersPage = new TeachersPage(driver);
    CoursePage coursesPage = new CoursePage(driver);

    public static String courseName;
    @Given("admin logs in to studymate with {string} and {string}")
    public void admin_logs_in_to_studymate_with_and(String username, String password) {
        driver.get("https://codewiser.studymate.us/login");
        loginPage.login(username, password);

    }

    @When("admin goes to Courses page")
    public void admin_goes_to_courses_page() {
        commonsPage.coursesTab.click();

    }

    @When("admin creates a course")
    public void admin_creates_a_course() {
    Faker faker = new Faker();

    courseName = faker.educator().course();
    String description = faker.book().title();

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String todaysDate = today.format(formatter);

        coursesPage.createACourse(courseName, description, todaysDate);

    }
    @Then("verify the course is created")
    public void verify_the_course_is_created() {
        Assert.assertTrue(coursesPage.isCourseCreated(courseName));

    }

}
