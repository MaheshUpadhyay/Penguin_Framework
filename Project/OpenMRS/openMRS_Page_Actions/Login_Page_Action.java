package openMRS_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common_Functions.WebButton;
import common_Functions.WebElementCommon;
import common_Functions.WebTextBox;
import openMRS_Page_Locators.Login_Page_Locator;

public class Login_Page_Action {
	WebDriver driver = null;
	Login_Page_Locator loginPL = null;
	public Login_Page_Action(WebDriver driver){
		this.driver = driver;
		loginPL = new Login_Page_Locator(driver);
	}
	
	public void enterUserName(String user){
		WebElement userEle = loginPL.getUserID();
		if(WebElementCommon.webElementPresent(userEle)){
			WebTextBox.sendInput(userEle, user);
		}
	}
	
	public void enterPassword(String pass){
		WebElement passEle = loginPL.getPassword();
		if(WebElementCommon.webElementPresent(passEle)){
			WebTextBox.sendInput(passEle, pass);
		}
	}
	
	public void clickLogin(){
		WebElement btnEle = loginPL.getLoginBtn();
		if(WebElementCommon.webElementPresent(btnEle)){
			if(WebElementCommon.webElementClickble(btnEle)){
				WebButton.clickBtn(btnEle);
			}
		}
	}
	
	public Home_Page_Action succesfulLogin(String user, String pass){
		Home_Page_Action homePA = null;
		try {
			enterUserName(user);
			enterPassword(pass);
			clickLogin();
			homePA = new Home_Page_Action(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return homePA;
	}
}
