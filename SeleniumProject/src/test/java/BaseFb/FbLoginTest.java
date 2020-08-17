package BaseFb;

import org.openqa.selenium.support.PageFactory; 
import org.testng.annotations.Test;

import FbPage.FbLoginPage; 

public class FbLoginTest extends TestBaseFB { 

	@Test
	public void init() throws Exception { 

		// driver.get("https://www.facebook.com/login.php"); 
		FbLoginPage loginpage = PageFactory.initElements(driver,FbLoginPage.class); 
	
		loginpage.setEmail("xyz@gmail.com"); 
		loginpage.setPassword("ashwini123"); 
		loginpage.clickOnNextButton(); 
	} 
} 