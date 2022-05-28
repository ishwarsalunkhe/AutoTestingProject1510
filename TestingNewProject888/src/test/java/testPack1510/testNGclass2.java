package testPack1510;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGclass2 {
	
	@BeforeSuite
	public void beforeSuit2() {
		System.out.println("before suite 2");
	}
	
	@Parameters ("alpha")
	@BeforeTest
	public void beforetest2(String data) {
		System.out.println("before test 2");
		System.out.println(data);
	}
	

	@BeforeClass
	public void beforeClass2() {
		System.out.println("before class 2");
	}
	
	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("before method 2");
	}
	
	@Test 
	public void test2A() {
		System.out.println("test A 2");
	}
	
	@Test
	public void test2B() {
		System.out.println("test B 2");
	}
	
	@Test
	public void test2C() {
		System.out.println("test C 2");
	}
	
	@AfterMethod
	public void afterMethod2() {
		System.out.println("aftermethod 2");
	}
	
	@AfterClass
	public void afterClass2() {
		System.out.println("afterClass 2");
	}
	
	@AfterTest
	public void aftertest2() {
		System.out.println("after test 2");
	}
	
	@AfterSuite
	public void afterSuit2() {
		System.out.println("after suite 2");
	}
	
	
	
	

	

}
