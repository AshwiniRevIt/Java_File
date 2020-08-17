package pageobjects;

import org.openqa.selenium.By;

public interface VoterIdRegistrationPageObject {
	
	By fullName = By.xpath("//input[@name='your-name']");
	By emailAddress = By.xpath("//input[@name='your-email']']");
	By phoneNumb = By.xpath("//input[@name='mobile']");
	By placeOfBirth = By.xpath("//input[@name='placeofbirth']");
	By Gender = By.xpath("//select[@name='gender']");
	By fathername = By.xpath("//input[@name='father-name']");
	
	
	

}
