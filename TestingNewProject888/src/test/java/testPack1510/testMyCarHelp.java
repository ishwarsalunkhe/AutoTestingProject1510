package testPack1510;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage1510.pomMyCarHelp;

public class testMyCarHelp {
	
	
	WebDriver driver;

	
	@BeforeClass
	public void driverSetup()
	{
		System.setProperty("webdriver.chrome.driver","E:\\ISHWAR S DATA\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver.get("https://www.mycarhelpline.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void currentURL()
	{
		String url =driver.getCurrentUrl();
		
		if(url.equals(url))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}
	
	@Test
	public void Verifycalculator() throws InterruptedException 
	{
		pomMyCarHelp rr = new pomMyCarHelp(driver);
		rr.ClickOnCalculator();
		rr.selectDropDown();
		Thread.sleep(3000);
		rr.modelDropDown();
		Thread.sleep(3000);
		System.out.println("checked");
		
	}
	
	@Test
	public void TakeScreenShot() 
	{
	
		pomMyCarHelp rr = new pomMyCarHelp(driver);
		rr.screenShot();
		
	}
	
	@AfterMethod
	public void homePage()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void close() throws InterruptedException
	{
		driver.close();
		Thread.sleep(3000);
	}
	
		
		
	

}
