package FbPage;

import org.openqa.selenium.By;

import BaseFb.BasePageFb;
import FbPageObject.FbInterface;

public class FbClass extends BasePageFb implements FbInterface {
	
	public FbClass() {
		super();
	}
	
	public void fbForm(String firstname, String surname,String phone,String password,String Day,String Month,String Year,String Gender) {
		type(firstname,fname);
		type(surname,sname);
		type(phone,mobile);
		type(password,pword);
		type(Day,day);
		type(Month,month);
		type(Year,year);
		type(Gender,female);
		
		
		
	}

private void type(String firstname, By fname) {
		By.
		
		
	}

public static void main(String[] args) {
	
}
	

}
