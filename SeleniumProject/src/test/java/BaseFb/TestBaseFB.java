package BaseFb;

import java.io.IOException; 
//import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.AfterSuite; 
import org.testng.annotations.BeforeSuite; 

public class TestBaseFB { 

	public static WebDriver driver = null; 

	@BeforeSuite
	public void initialize() throws IOException { 

		System.setProperty("webdriver.chrome.driver","C://Users//Public//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver(); 
	
		// To maximize browser 
		driver.manage().window().maximize(); 
	
		// Implicit wait 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
		// To open FaceBook Login site 
		driver.get("\"https://www.facebook.com/login.php\""); 
	} 

	@AfterSuite
	// Test cleanup 
	public void TeardownTest() { 
		TestBaseFB.driver.quit(); 
	} 
} 
