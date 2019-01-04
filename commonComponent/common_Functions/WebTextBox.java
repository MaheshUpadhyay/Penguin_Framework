package common_Functions;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	
	public static void sendInput(WebElement textBox, String text){
		textBox.sendKeys(text);
	}
	
}
