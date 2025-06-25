package testcase;

import org.openqa.selenium.WebDriver;
import pageObject.LoginPage;

public class LoginPageTest {
    LoginPage logPage = new LoginPage();

    public void loginSuccess(){
        logPage.enterUsername("standard_user");
        logPage.enterPassword("secret_sauce");
        logPage.clickLoginButton();
    }
}
