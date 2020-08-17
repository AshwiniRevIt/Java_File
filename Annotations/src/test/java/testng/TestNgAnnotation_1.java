package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotation_1 {
	
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("testBeforeclass() and using @Beforeclass ");
	}
	
	
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("testBeforeMethod() and using @BeforeMethod ");
	}
	
	@Test 
	
	public void test1() {
		System.out.println("test1() and using @test testCases1 are executed ");
	}
	
	@Test
	
	public void test2() {
		System.out.println("inside test2() and using @ test annotation testcases2 executed");
	}
	
	@AfterMethod
	public void testAfterMethod() {
		System.out.println("testAfterMethod() and using @AfterMethod ");
		
	}
	
	@AfterClass
	public void testAfterClass() {
		System.out.println("testAfterclass() and using @Afterclass ");
	}
	

}
