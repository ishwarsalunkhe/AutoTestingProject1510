package pomPackage1510;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_Log_18 {
	
	@FindBy(xpath ="//input[@name='txtUsername']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private  WebElement passWord;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement loginButton;
	
	
   public  HRM_Log_18(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void sendUserName()
   {
	   userName.sendKeys("Admin");
   }
   
   public void sendPassword()
   {
	   passWord.sendKeys("admin123");
   }
   
   public void clickOnLoginBtn()
   {
	   loginButton.click(); 
   }


}

