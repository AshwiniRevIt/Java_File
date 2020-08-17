package objectrepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedifLoginPage {
	
	 WebDriver driver;
	 public RedifLoginPage(WebDriver driver) {
		 this.driver =driver;
	 }
	 By username = By.xpath("//input[@id='login1']");
	 By password = By.xpath("//input[@id='password']");
	 By submit = By.name("proceed");
	 
	 public WebElement Email() {
		return driver.findElement(username);
	 }
	 public WebElement Password() {
			return driver.findElement(password);
		 }
	 public WebElement Submit() {
			return driver.findElement(submit);
		 }


}
