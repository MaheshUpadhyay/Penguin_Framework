package base_Architecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import OpenMRS.PropertyReader;
 
public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;
 
    public WebDriver getDriver() {
        return driver;
    }
 
    @BeforeMethod
    public void setup () {
        //Create a Chrome driver. All test classes use this.
    	System.out.println("launching Chrome browser"); 
    	String workingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", 
				workingDir+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver,15);
 
        //Maximize Window
        driver.manage().window().maximize();
        
        //Open test URL
		driver.get(PropertyReader.getValue("ui.application.url"));
	
    }
 
    @AfterMethod
    public void teardown () {
        driver.quit();
    }
 
}