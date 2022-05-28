package pomPackage1510;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin {

	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement password;
	

	@FindBy(xpath = "//input[@id='btnLogin']")
	private WebElement loginButton;
	
	
	public OrangeHRMLogin(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void sendUserName() {
		userName.sendKeys("Admin");
		}
		
	public void sendUserPassword() {
		password.sendKeys("admin123");
		}
	
	public void clickOnButton() {
		loginButton.click();
		}
		
		
		
		
	
		
	}

	

