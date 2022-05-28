package testPack1510;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage1510.OrangeHRMLogin;
import pomPackage1510.OrangeHRM_Login;
import pomPackage1510.OrgPractice123;

public class OrangeAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\ISHWAR S DATA\\Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		OrangeHRMLogin orangeHRM = new OrangeHRMLogin(driver);
		
		orangeHRM.sendUserName();
		orangeHRM.sendUserPassword();
		orangeHRM.clickOnButton();
		
		
		OrgPractice123 org = new OrgPractice123(driver);
		org.clickOnMyInfotab();
		org.clickOnEditButton();
		org.isEnable();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
