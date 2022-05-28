package pomPackage1510;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPractice123 {
	
	
	
	@FindBy (xpath ="//b[text()='My Info']")
	private WebElement myInfo;
	
	@FindBy (xpath ="//input[@id='btnSave']")
	private WebElement editButton;
	
	@FindBy (xpath ="//input[@id='personal_txtEmpFirstName']")
	private WebElement FirstName;
	
	@FindBy (xpath ="//input[@id='personal_txtEmpMiddleName']")
	private WebElement MiddleName;
	
	@FindBy (xpath ="//input[@id='personal_txtEmpLastName']")
	private WebElement LastName;
	

	
	public  OrgPractice123(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnMyInfotab()
	{
		myInfo.click();
	}
	
	public void clickOnEditButton()
	{
		editButton.click();
	}
	
	public void isEnable()
	{
		boolean result =editButton.isEnabled();
		
		if(result==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}	
	
	
	public void sendFirstName()
	{
		 FirstName.sendKeys("kabir");
	}
	
	
	public void sendmiddleName()
	{
		MiddleName.sendKeys("vitthal");
	}
	
	public void sendlastName()
	{
		LastName.sendKeys("singh");
	}
	
	
	
	
	
	
	
	
	
	


}
