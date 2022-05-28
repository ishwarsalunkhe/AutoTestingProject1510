package crossBrowserSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver openChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\ISHWAR S DATA\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
   public static WebDriver openFireFoxBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\ISHWAR S DATA\\Automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	
		
	

}
