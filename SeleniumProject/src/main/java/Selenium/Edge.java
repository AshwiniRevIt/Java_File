package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C://Users//Public//Downloads//msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/child::input[@name='firstname']")).sendKeys("AAshwini");
	driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("1234567896");
	
	
	
	}

}
