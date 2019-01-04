package common_Functions;

import org.openqa.selenium.WebElement;

public class WebElementCommon {
	public static boolean webElementPresent(WebElement ele){
		boolean isPresent = false;
		if(ele.isDisplayed()){
			isPresent = true;
		}
		return isPresent;
	}
	
	public static boolean webElementClickble(WebElement ele){
		boolean isClick = false;
		if(ele.isEnabled()){
			isClick = true;
		}
		return isClick;
	}
	
	public static boolean webElementSelected(WebElement ele){
		boolean isSelect = false;
		if(ele.isSelected()){
			isSelect = true;
		}
		return isSelect;
	}
}
