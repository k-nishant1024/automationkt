package utility;

import basepage.BasePage;
import org.openqa.selenium.*;

public class Utility extends BasePage {
    BasePage basePage = new BasePage();
    public void clickElement(String xpath){
        basePage.driver.findElements(By.xpath(xpath));
    }

    public WebElement getElements(String xpath){
        return  basePage.driver.findElement(By.xpath(xpath));
    }
    public String getText(){
        return "Successful";
    }
}
