package testPack1510;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestNg {
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	void afetrClass()
	{
		System.out.println("after class");
	}
	
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("before method");
	}
	
	
	@AfterMethod
	void aftermethod()
	{
		System.out.println("after method");
	}
	
	@Test
	void test1() 
	{
		System.out.println("This is test1");
	}
	
	@Test
	void test2()
	{
		System.out.println("this is test2");
	}
	

}
