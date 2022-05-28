package testPack1510;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import crossBrowserSetting.Base;
import pomPackage1510.pomHRM20;

public class testHRM20 extends Base {
	
	WebDriver driver;
	pomHRM20 rr;
	pomHRM20 ss;
	
	@Parameters("browser")
	@BeforeTest
	
	public void browserOpening(String browser) {
		
		if(browser.equals("ChromeBrowser"))
		{
			driver=openChromeBrowser();
		}
		
		if(browser.equals("FirefoxBrowser"))
		{
			driver=openFireFoxBrowser();
		}
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeClass
	
		public void launchTheBrowser()
		{
		 rr=new pomHRM20 (driver);
		// ss=new pomHRM20 (driver);
		   
		}
	
	@BeforeMethod
	public void LoginToHrm() throws InterruptedException
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		rr.sendUserName();
		rr.sendPassword();
		rr.clickOnLoginButton();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void print()
	{
		System.out.println("think and grow rich");
	}
	
	@AfterMethod
	public void LogOut() throws InterruptedException 
	{
		rr.clickOnDropdown();
		rr.clickOnlogout();
		//ss.clickOnDropdown();
		Thread.sleep(2000);
		//ss.clickOnlogout();
		Thread.sleep(2000);
	}
		
	@AfterClass
	public void ClearPOMobjects()
	{
		 rr=null;
	     ss=null;
	}
	
	@AfterTest
	public void closeTheBrowser() {
	driver.close();
	driver=null;
	System.gc();   //for garbage collector
	
		
		

}
}
