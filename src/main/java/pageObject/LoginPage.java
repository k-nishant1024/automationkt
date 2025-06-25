package pageObject;

import basepage.BasePage;
import utility.Utility;

public class LoginPage extends BasePage {



    public void loginUser(){
        driver.switchTo().activeElement();
    }

    public boolean returnLoginSuccessfullMsg(){
        String msg = utility.getText();
        if (msg.equals("Yes")){
            return  true;
        }else{
            return false;
        }
    }
}
