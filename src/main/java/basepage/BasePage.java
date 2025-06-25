package basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Utility;

public class BasePage {

    public WebDriver driver;
    public Utility utility = new Utility();

    public BasePage(){
        driver  = new ChromeDriver();
    }

}
