package openMRS_Page_Actions;

import org.openqa.selenium.WebDriver;


public class Home_Page_Action {
	WebDriver driver = null;
	public Home_Page_Action(WebDriver driver){
		this.driver = driver;
	}
	public String verifyTitle(){
		return driver.getTitle();
	}
}
