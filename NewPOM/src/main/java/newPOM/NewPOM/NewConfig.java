package newPOM.NewPOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NewConfig {
	
	String configPath;
	Properties prop;
	
	
	public NewConfig(String configPath) throws IOException {
		this.configPath=configPath;
	
		File file = new File(this.configPath);
		FileInputStream reader = new FileInputStream(file);
		prop = new Properties();
		prop.load(reader);
		
		this.configRead("user");
		
	}
	
	public void configRead(String key) throws IOException {
				
		prop.get(key);
		System.out.println(prop.getProperty("user"));
	}
	
	public static void main(String[] args) throws Throwable  {
			
		NewConfig nc = new NewConfig("C:\\Users\\91948\\eclipse-workspace\\NewPOM\\src\\test\\resources\\config\\newconfig.properties");
	//	nc.configRead("user");
		
		//NewConfig cf =  new NewConfig("C:\\Users\\91948\\eclipse-workspace\\NewPOM\\src\\test\\resources\\config\\config.properties");
		//cf.configRead("key");
    	 //cf.NewConfig("C:\\Users\\91948\\eclipse-workspace\\NewPOM\\src\\test\\resources\\config\\config.properties", "appUrl");
	}

}
