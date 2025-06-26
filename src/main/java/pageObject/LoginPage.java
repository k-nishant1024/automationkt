package pageObject;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import utility.Utility;

public class LoginPage extends BasePage {

    @FindBy(xpath = "")
    WebElement inputUsername;

    @FindBy(xpath = "")
    WebElement inputPassword;

    @FindBy(xpath = "")
    WebElement buttonLogin;

    public LoginPage(WebDriver driver){
        super(driver);
        //PageFactory.initElements(driver, this);
    }

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        buttonLogin.click();

    }


}
