package testcase;

import org.testng.Assert;
import pageObject.LoginPage;

public class LoginPageTest {

    LoginPage loginPage = new LoginPage();
    public void loginSuccessful(){

        loginPage.loginUser();
        boolean msg = loginPage.returnLoginSuccessfullMsg();
        Assert.assertTrue(msg);

    }
}
