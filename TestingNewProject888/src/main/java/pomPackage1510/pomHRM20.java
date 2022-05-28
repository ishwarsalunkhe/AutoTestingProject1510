package pomPackage1510;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomHRM20 {
	
	@FindBy(xpath= "//input[@name='txtUsername']")
	private WebElement userName;
	
	@FindBy(xpath= "//input[@id='txtPassword']")
	private WebElement passWord;
	
	@FindBy(xpath= "//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath= "//a[@id='welcome']")
	private WebElement logoutDropdown;
	
	@FindBy(xpath= "//a[@href='/index.php/auth/logout']")
	private WebElement logoutBtn;
	
	
	
	public pomHRM20(WebDriver driver)
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
	
	public void clickOnLoginButton() throws InterruptedException
	{
		loginButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnDropdown()
	{
		logoutDropdown.click();
	}
	
	public void clickOnlogout()
	{
		logoutBtn.click();
	}
	
	
}
