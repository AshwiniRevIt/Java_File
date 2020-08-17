package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//Public//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911442121038&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_2nwj9de76o_e");
		driver.manage().window().maximize();
		List<WebElement> objlink = driver.findElements(By.tagName("a"));
		
		for (WebElement objCurrentLink : objlink) {
			
			String stringLink = objCurrentLink.getText();
			
			System.out.println(stringLink);
			
		}
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus nord");
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("p_85/10440599031")).click();
		driver.navigate().to("https://elegaldocs.in/voterid/");
		Thread.sleep(3000);
		driver.navigate().back();
	    
		

	}

}
