package testPack1510;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class PracticeOrangeHRM {
	
	WebDriver driver;
	
	
	@BeforeClass	
	public void launchTheBrouser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\ISHWAR S DATA\\Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void loginToApplication()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		
	}
	
	


}