package utility;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Utility  {

    WebDriver driver = new ChromeDriver();
    public void clickElement(String xpath){
       driver.findElements(By.xpath(xpath));
    }

    public WebElement getElements(String xpath){
        return  driver.findElement(By.xpath(xpath));
    }


    public String getText(){
        return "Successful";
    }


}
