package testPack1510;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage1510.OrangeHRMLogin;
import pomPackage1510.OrgPractice123;

public class HRMMAction {
	
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser()
	{
System.setProperty("webdriver.chrome.driver","E:\\ISHWAR S DATA\\Automation\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@BeforeMethod 
	public void loginHRM()
	{
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  OrangeHRMLogin orangeHRM = new OrangeHRMLogin(driver);
		orangeHRM.sendUserName();
		orangeHRM.sendUserPassword();
		orangeHRM.clickOnButton();
	}
	
	@Test
	public void toVerifyMyInfo() throws InterruptedException
	{
		OrgPractice123 rr= new OrgPractice123(driver);
		rr.clickOnMyInfotab();
		rr.clickOnEditButton();
		String title =driver.getTitle();
		String url =driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		Thread.sleep(3000);
	}
	
	@Test
	public void information()
	{
		OrgPractice123 info= new OrgPractice123(driver);
		info.sendFirstName();
		info.sendmiddleName();
		info.sendlastName();
		
	}
	
	
		
		

	
	  
	  
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	
}

	