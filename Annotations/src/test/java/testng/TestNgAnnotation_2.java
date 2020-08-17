package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation_2 {
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite() and using @BeforeSuite ");
	}
	
	@BeforeTest
	public void testBeforeTest() {
		System.out.println("testBeforeTest() and using @BeforeTest ");
	}
	
	@Test
	
	public void test3() {
		System.out.println("inside test3() and using @test ");
	}
	
	@AfterTest
	public void testAfterTest() {
		System.out.println("testAfterTest() and using @AfterTest ");
	}
	
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("testAfterSuite() and using @AfterSuite ");
	}
	
	
	
	
}