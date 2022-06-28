package TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfig;



public class BaseClass {
ReadConfig rc=new ReadConfig();
	public String baseURL=rc.getAPPURL();


	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",rc.Chromepath());
		System.out.println("setting path");
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    
	    
	     logger=Logger.getLogger("zebraDomainq");
	    PropertyConfigurator.configure("log4j.properties");
	}
	
	/*
	 * @AfterClass public void tearDown() { driver.quit(); }
	 */
	
}
