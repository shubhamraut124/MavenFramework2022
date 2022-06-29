package MavenFrameWork.MavenFrameWork;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.ReadConfig;
import PageObjectDetails.*;



public class LoginTC001 extends BaseClass {

	@Test(priority = 1)
	public void login() {
		
		driver.get(BaseClass.baseURL);
		driver.get(baseURL);

		LoginPage lp = new LoginPage(driver);
		lp.sendUserName(BaseClass.username);
		lp.sendPasswor(BaseClass.pwd);
		lp.ClickCubmit();
		
}
}