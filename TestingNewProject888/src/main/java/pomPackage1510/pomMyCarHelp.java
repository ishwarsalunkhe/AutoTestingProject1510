package pomPackage1510;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pomMyCarHelp {
	
	@FindBy(xpath="//a[text()='Calculator']")
	private WebElement calculator;
	
	@FindBy(xpath = "//select[@id='brand']")
	private WebElement dropDown;
	
	@FindBy(xpath="(//select[@id='model'])[1]")
	private WebElement model;

	public pomMyCarHelp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnCalculator() 
	{
		calculator.click();
	}
	
	
	public void selectDropDown()
	{
		dropDown.click();
		
		Select make = new Select(dropDown);
		make.selectByValue("3");
	}
	
	public void modelDropDown()
	{
		Select md = new Select(model);
		md.selectByVisibleText("Amaze");
		
	}
	
	public void screenShot()
	{
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\ISHWAR S DATA\\Automation\\SS\\myCar.jpeg");
		FileHandler.copy(source, dest);
		
	}
	
			
	
	

}
