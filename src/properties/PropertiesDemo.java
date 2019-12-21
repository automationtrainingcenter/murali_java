package properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(".//credentials.properties");
			// create an object of Properties class
			Properties prop = new Properties();
			// load the file name from which we want to read the data
			prop.load(fis);
			// read data from the properties file using getProperty(String key) 
			String urlValue = prop.getProperty("url");
			String usernameValue = prop.getProperty("username");
			String passwordValue = prop.getProperty("password", "dummy");
			String emailValue = prop.getProperty("email", "test@sunshine.com");
			System.out.println("url --- "+urlValue+"\nusername --- "+usernameValue+"\npassword --- "+passwordValue+"\nemail --- "+emailValue);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}

}
