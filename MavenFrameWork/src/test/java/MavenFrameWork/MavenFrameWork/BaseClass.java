package MavenFrameWork.MavenFrameWork;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://www.saucedemo.com";
    

 
    driver.get(baseUrl);
    driver.manage().window().maximize();
 
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    System.out.println(driver.getPageSource());
  
    

	
	
}
}