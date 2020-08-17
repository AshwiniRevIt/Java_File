package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Public//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911442121039&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_2nwj9de76o_e");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text() = 'E-Mail']")).click();
		
		driver.findElement(By.xpath("//span[starts-with(text(),'Samsung Galaxy M01s (Blue, 3GB RAM, 32GB Storage) with No Cost EMI/Additional Exchange Offers')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]")).click();
		
		
		//WebElement mob = driver.findElement(By.xpath("//span[contains(text(),'TECNO Spark 5 Pro (Seabed Blue, 4GB RAM, 64GB Storage))')]"));
	//	WebElement mob = driver.findElement(By.xpath("//span[text()='TECNO Spark 5 Pro (Seabed Blue, 4GB RAM, 64GB Storage)']"));
	//	mob.click();
		
		
		
		//driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')][5]")).click();
		
		
		
		
		
		//driver.navigate().to("https://www.amazon.in/s?k=mobile&rh=n%3A1389432031%2Cp_n_feature_three_browse-bin%3A1484944031&dc&qid=1596096485&rnid=1484941031&ref=sr_nr_p_n_feature_three_browse-bin_3");
		
		//driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']/child::span[@class='a-size-base a-color-base']")).click();
		
	}
	

}
