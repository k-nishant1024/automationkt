package pageObject;

import basepage.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

//    public LoginPage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
