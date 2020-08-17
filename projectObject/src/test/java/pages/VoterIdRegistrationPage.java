package pages;

import org.openqa.selenium.By;

import base.BasePage;
import pageobjects.VoterIdRegistrationPageObject;

public class VoterIdRegistrationPage extends BasePage implements VoterIdRegistrationPageObject {
	
	public VoterIdRegistrationPage() {
		super();
	}
	
	public void applicantForm(String fname, String email, String phone, String birthplace, String gender, String FatherName) {
		type(fname,fullName);
		type(email,emailAddress);
		type(phone,phoneNumb);
		type(birthplace,placeOfBirth);
		type(gender, Gender);
		type(FatherName, fathername);
		
		
		
		
	}

	private void type(String phone, By phonenumb) {
		// TODO Auto-generated method stub
		
		
	}

	
	

}
