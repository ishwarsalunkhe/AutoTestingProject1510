package pomPackage1510;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

     @FindBy (xpath ="//input[@id='email']")
	    private WebElement userName;
     
     @FindBy (xpath ="//input[@id='pass']")
	    private WebElement passWord;
     
     @FindBy (xpath ="//button[text()='Log In']")
	    private WebElement loginButton;
     
     //Constructor
     public LoginPage(WebDriver driver1)
     {
    	 PageFactory.initElements(driver1, this);
     }
  
     
     public void sendUserName() {
    	 userName.sendKeys("7798434366");
     }
     
     public void sendpassWord() {
    	 passWord.sendKeys("Ishwar@123");
     }
     
     public void clickOnLoginButton() {
    	 loginButton.click();
    	 
     }
  
		
		
		
	}


