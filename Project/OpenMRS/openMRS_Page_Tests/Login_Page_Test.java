package openMRS_Page_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import OpenMRS.PropertyReader;
import base_Architecture.BaseClass;
import base_Architecture.ReportTestManager;
import openMRS_Page_Actions.Home_Page_Action;
import openMRS_Page_Actions.Login_Page_Action;


public class Login_Page_Test extends BaseClass{
 
    @Test (priority = 0, description="valid Login Scenario with correct username and password.")
    public void succesfulLogin() throws InterruptedException {
            
        Login_Page_Action loginPA = new Login_Page_Action(driver);
        Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),PropertyReader.getValue("ui.application.password"));
        Assert.assertEquals("Login", homePA.verifyTitle());
 
     }
    

    @Test (priority = 1, description="valid Login Scenario with wrong username and wrong password.")
    public void unSuccesfulLogin () throws InterruptedException {
        
        Login_Page_Action loginPA = new Login_Page_Action(driver);
        Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.incorrectusername"),PropertyReader.getValue("ui.application.incorrectpassword"));
        Assert.assertEquals("Home ", homePA.verifyTitle());
         
     }
}
