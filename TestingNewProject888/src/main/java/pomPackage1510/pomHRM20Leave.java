package pomPackage1510;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomHRM20Leave {
	
	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	private WebElement leave;
	
	@FindBy(xpath = "//input[@id='calFromDate']")
	private WebElement calender;
	
	@FindBy(xpath = "data-handler=\"selectMonth\"")
	private WebElement month;
	
	@FindBy(xpath ="(//a[@class='ui-state-default'])[27]")
	private WebElement date;
	
	@FindBy(xpath ="//select[@data-handler='selectYear'] ")
	private WebElement Year;
	
	public pomHRM20Leave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnLeave()
	{
		leave.click();
	}
	
	public void Selectcalender()
	{
		calender.click();
	}
	
	public void SelectMonth()
	{
		month.click();
	}
	

}
