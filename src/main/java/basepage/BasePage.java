package basepage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public BasePage(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        PageFactory.initElements(driver, this);
    }
}
