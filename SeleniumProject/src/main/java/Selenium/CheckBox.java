package Selenium;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Public//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin.typeform.com/signup");
		
		driver.findElement(By.id("email")).sendKeys("ashwini@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ashwin@34#$i123");
		
		System.out.println(driver.findElement(By.id("terms")).isSelected());
		
		
		Thread.sleep(4000);
		 driver.findElement(By.id("terms")).click();
		 Thread.sleep(4000);
		 
		 System.out.println(driver.findElement(By.id("consents")).isSelected());
		 driver.findElement(By.id("consents")).click();
		 
	     driver.findElement(By.className("button__Button-sc-18qod6g-0 gSmUaP signup-form-gdpr__PaddedLoadingButton-sc-106jvjh-2 hljpkH")).click();
	
		
		
		
}

}
