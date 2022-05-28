package testPack1510;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityInTestNG {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class start");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method start");
	}
	
	@Test(priority=1,enabled=false)
	public void launchTheBrowser()
	{
		System.out.println("launching");
	}
	
	@Test(priority=2,enabled=false)
	public void loginTofacebook()
	{
		System.out.println("login");
	}
	
	@Test(priority=3)
	public void homepage()
	{
		System.out.println("homepage showing");
	}
	
	@Test(priority=4)
	public void facebookStory() 
	{
		System.out.println("facebook story");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("end");
	}
	
	

}
