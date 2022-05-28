package pomPackage1510;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HRM_Req18 {
	
	@FindBy(xpath = "(//a[@class='firstLevelMenu'])[5]")
	private WebElement recruitButton;
	
	@FindBy(xpath ="//select[@id='candidateSearch_jobTitle']")
	private WebElement jobTitle;
	
	
	public HRM_Req18(WebDriver driver) 
	
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnRecruitButton() throws InterruptedException
	{
		recruitButton.click();
		Thread.sleep(3000);
	}
	
	public void dropDownHandle()
	{
		Select s = new Select(jobTitle);
		
		s.deselectByValue("26");
		
		
	}
	

}
