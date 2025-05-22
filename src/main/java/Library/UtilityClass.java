package Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;

import com.google.api.services.gmail.Gmail.Users.Drafts.Get;

import lombok.val;

public class UtilityClass {

	public static String read(String key) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\git\\HubTown\\Properties.properties");
		Properties prop = new Properties();
		
		prop.load(file);
		
		String value = prop.getProperty(key);
		return value;
		
	}
	
}
