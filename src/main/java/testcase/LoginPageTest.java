package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import utility.Utility;

public class LoginPageTest {


    WebDriver driver;
    LoginPage loginPage;
    Utility utility;

    @BeforeTest
    public  void setUp(){
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        utility = new Utility(driver);
    }



    @Test
    public void TC01_loginSuccessful(){
        loginPage.login("siddi","pw");


    }
}
