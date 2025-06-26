package basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Utility;

public class BasePage {

    public WebDriver driver;
    public Utility utility ;

    public BasePage(WebDriver driver){
        this.driver = driver;
        utility = new Utility(driver);
        driver.get("https://www.saucedemo.com");
    }

}
