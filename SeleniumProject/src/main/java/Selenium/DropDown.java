package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Public//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.findElement(By.id("u_0_n")).sendKeys("Ashwini");
		driver.findElement(By.id("u_0_p")).sendKeys("Priyanka");
		driver.findElement(By.id("u_0_s")).sendKeys("9481434833");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Ashwin@34#$i123");
		
		WebElement ele = driver.findElement(By.id("day"));
		
		Select day = new Select(ele);
		day.selectByIndex(10);
		
         WebElement elem = driver.findElement(By.id("month"));
		
		Select month = new Select(elem);
		month.selectByIndex(7);
		
         WebElement yr = driver.findElement(By.id("year"));
		
		Select year = new Select(yr);
		year.selectByVisibleText("1999");
		
		System.out.println(driver.findElement(By.id("u_0_6")).isSelected());
		 driver.findElement(By.id("u_0_6")).click();
		 
		 driver.findElement(By.id("u_0_14")).click();

	}

}
