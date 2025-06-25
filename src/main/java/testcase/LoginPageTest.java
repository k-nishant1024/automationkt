package testcase;

import org.openqa.selenium.WebDriver;
import pageObject.LoginPage;
import utility.Utility;

public class LoginPageTest {
    LoginPage logPage = new LoginPage();
    Utility util = new Utility();

    public void loginSuccess(){
        logPage.enterUsername("standard_user");
        logPage.enterPassword("secret_sauce");
        logPage.clickLoginButton();
        util.getText();
    }
}
