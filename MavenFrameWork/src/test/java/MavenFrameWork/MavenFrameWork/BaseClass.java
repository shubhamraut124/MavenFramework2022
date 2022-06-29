package MavenFrameWork.MavenFrameWork;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfig;

import org.testng.annotations.*;


public class BaseClass {
	
	static ReadConfig rc=new ReadConfig();
	public static WebDriver driver;
	public static String baseURL=rc.getAPPURL();
	public static String username=rc.GetUSerN();
	public static String pwd=rc.GetPASS();
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",rc.Chromepath());
		System.out.println("setting path");
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    
	    
	    
	     
	}

}