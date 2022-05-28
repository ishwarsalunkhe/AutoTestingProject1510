package pomPackage1510;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Login {
	
	@FindBy (xpath ="//input[@id='txtUsername']")
	private WebElement userName;
	
	@FindBy (xpath ="//input[@id='txtPassword']")
	private WebElement passWord;
	
	@FindBy (xpath ="//input[@id='btnLogin']")
	private WebElement loginButton;
	
	
	public OrangeHRM_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void sendUsername()
	{
		userName.sendKeys("Admin");
	}
	
	public void sendPassword()
	{
		passWord.sendKeys("admin123");
	}
	
	public void clickOnLogin()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	

	

}
