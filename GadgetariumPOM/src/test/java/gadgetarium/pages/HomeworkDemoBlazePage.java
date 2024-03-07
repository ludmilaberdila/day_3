package gadgetarium.pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeworkDemoBlazePage {
    public HomeworkDemoBlazePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login2")
    public WebElement loginButton;

    @FindBy(id = "loginusername")
    public WebElement userName;

    @FindBy(id = "loginpassword")
    public WebElement password;

    @FindBy(linkText = "Log in")
    public WebElement login;
}
