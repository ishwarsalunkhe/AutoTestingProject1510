package testPack1510;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage1510.LoginPage;

public class ActionOnFbLogin {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\ISHWAR S DATA\\Automation\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.sendUserName();
	loginPage.sendpassWord();
	loginPage.clickOnLoginButton();
	
	
	} 
	
	
}
