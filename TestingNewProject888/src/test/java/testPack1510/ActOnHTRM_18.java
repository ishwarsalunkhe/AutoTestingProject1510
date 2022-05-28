package testPack1510;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage1510.HRM_Log_18;
import pomPackage1510.HRM_Req18;

p
ublic class ActOnHTRM_18 {
	
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\ISHWAR S DATA\\Automation\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void loginIntoTheHRM() throws InterruptedException 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 HRM_Log_18 object= new HRM_Log_18(driver);
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		 
		 object.sendUserName();
		 object.sendPassword();
		 object.clickOnLoginBtn();
		 Thread.sleep(3000);
	}
	
	
	@Test
	public void gettext()
	{
		String url =driver.getCurrentUrl();
		if(url.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
		{
				System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}
	
	@Test
	public void clickOnReruitement() throws InterruptedException 
	{
		 HRM_Req18 req = new  HRM_Req18(driver);
		 req.clickOnRecruitButton();
		 
		
	}
	
	
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		driver.close();
		Thread.sleep(3000);
	}
		
		
	

}

