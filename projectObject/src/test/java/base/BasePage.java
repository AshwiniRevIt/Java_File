package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	protected WebDriver IDriver;
	
	public BasePage() {
		
		IDriver = new ChromeDriver();
		//PageFactory.initElements(IDriver, this);
	}
	
	protected void open(final String Url) {
		this.IDriver.get(Url);
	}
	
	protected void max() {
		this.IDriver.manage().window().maximize();
	}
	
	protected void closeAll() {
		this.IDriver.close();
	}
	
	protected WebElement find(By locator) {
		return this.IDriver.findElement(locator);
		
	}
	
	protected void click(By locator)
	{
		find(locator).click();
	}
	}
	
	
	


