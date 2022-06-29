package PageObjectDetails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath = ("//input[@type='text' and @placeholder='Username']"))
	public
	WebElement txtUserName;

	@FindBy(xpath="//input[@type='password' and @placeholder='Password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@class='submit-button btn_action']")
	public
	WebElement btnLogin;
	
	public void sendUserName(String UserName) 
	{
		
		txtUserName.sendKeys(UserName);
	}
	
	public void sendPasswor(String pwd) 
	{
		txtPassword.sendKeys(pwd);
	}

	public void ClickCubmit() 
	{
		
		//ewait.until(ExpectedConditions.visibilityOf(btnLogin));
			btnLogin.click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

}
