package testng;
//import java.io.File;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class iteration {
 
	private WebDriver driver; 
	String appURL = "https://www.amazon.in/gp/site-directory?ref=nav_em_linktree_fail";
	
	@BeforeClass
	public void testSetUp() {
		System.setProperty("webdriver.chrome.driver","C://Users//Public//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(appURL);
	}
 
	@Test
	public void test_1_click3rdMenuItem() throws InterruptedException {
		List<WebElement> menuItems =  driver.findElements(By.xpath("//h2[text()='Echo & Alexa']//following-sibling::ul//a"));
		System.out.println(menuItems.size());
		
		for(int i=0; i<menuItems.size();i++)
		{
			System.out.println("Menu Items are "+menuItems.get(i).getText());
		}
		
		for(int i=0; i<menuItems.size();i++)
		{
			System.out.println(menuItems.get(i).getText());
			if(menuItems.get(i).getText().contains("Echo Show 8"))
			{
				menuItems.get(i).click();
				System.out.println("Your iteam is matched");
				Thread.sleep(3000);
			}
		}
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
 
}