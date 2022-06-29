package Utilities;

	

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig()
	{
		File src= new File("./Configuration/config.properties");
		 try {
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception is "+e.getMessage());
		}
		
	}
	
	public String getAPPURL() {
		String URL=pro.getProperty("baseURL");
		return URL;
	}
	public String Chromepath() {
		String cp=pro.getProperty("chromepath");
		return cp;
	}
	

}
