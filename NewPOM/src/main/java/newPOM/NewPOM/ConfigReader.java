package newPOM.NewPOM;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public void configRead(String configPath, String key) throws IOException {
		File file = new File(configPath);
		FileInputStream reader = new FileInputStream(file);
		Properties props = new Properties();
		props.load(reader);
		props.get(key);
		System.out.println(props.getProperty("browserName"));
		
		
	}
	
	public static void main(String[] args) throws IOException {
		ConfigReader cf =  new ConfigReader();
    	 cf.configRead("C:\\Users\\91948\\eclipse-workspace\\NewPOM\\src\\test\\resources\\config\\config.properties", "key");
    		//System.out.println(props.getProperty("browserName"));
	}

}
