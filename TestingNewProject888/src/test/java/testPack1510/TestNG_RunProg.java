package testPack1510;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import crossBrowserSetting.Base;

public class TestNG_RunProg extends Base {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("before suite");
	}
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("before test 1");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class 1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method 1");
	}
	
	@Test
	public void testA() {
		System.out.println("test A 1");
	}
	
	@Test
	public void testB() {
		System.out.println("test B 1");
	}
	
	@Test
	public void testC() {
		System.out.println("test C 1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("aftermethod 1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass 1");
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("after test 1");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("after suite");
	}
	
	
	

	

}
