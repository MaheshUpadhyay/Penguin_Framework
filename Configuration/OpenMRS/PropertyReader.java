package OpenMRS;

import java.util.ResourceBundle;

public class PropertyReader {
	private static ResourceBundle resourceBundle = ResourceBundle.getBundle("OpenMRS.Config");
    public static String getValue(String key){
        return resourceBundle.getString(key);
    }

}
