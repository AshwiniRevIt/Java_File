package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Public//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		System.out.println(driver.getTitle());
		
		driver.findElements(ByClassName("html7magic")); //
		driver.findElement(By.linkText("https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar")); //forgotten account
		
		driver.findElements(By.id("u_0_b"));  //login to the exisiting account
		driver.findElements(By.id("u_0_c"));   //login button
		driver.findElements(By.id("u_0_n"));    // first name
		driver.findElements(By.id("u_0_p"));       //surname
		driver.findElements(By.id("u_0_s"));         //mobile number
		driver.findElements(By.id("password_step_input")); //password setup
		driver.findElements(By.id("u_0_x"));  //DOB
		driver.findElements(By.id("u_0_6"));   //sex
		driver.findElements(By.className("_58mt")); //female
		driver.findElements(By.className("_58mt")); //male
		driver.findElements(By.id("u_0_14"));
		
		
		

	}

	private static By ByClassName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
