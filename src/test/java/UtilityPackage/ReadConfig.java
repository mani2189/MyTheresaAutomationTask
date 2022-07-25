package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig

{
	private String browser;
	private String appurl;
	private String navigatedURl;
    

	Properties properties;
	
	public ReadConfig()
	{
		FileReader reader = null;
		try{
			// reader = new FileReader("Config.Properties");		 
			 properties= new Properties();
			 properties.load(getClass().getResourceAsStream("/Config.Properties"));
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public String getBrowser()
	{   
		String browser = properties.getProperty("browser");
		return browser;
	}
	public String getQAAppurl()
	{  String url = properties.getProperty("Qa_Appurl");
		return url;
	}
	
	public String getTestAppurl()
	{  String url = properties.getProperty("Test");
		return url;
	}
	
	public String getStagingAppurl()
	{  String url = properties.getProperty("Staging");
		return url;
	}
	
	public String getLocalAppurl()
	{  String url = properties.getProperty("Local");
		return url;
	}
	
	public String getEmailCreationAppurl()
	{  String url = properties.getProperty("emailcreationUrl");
		return url;
	}
	
	public String getEnvironment()
	{   
		String environment = properties.getProperty("Environment");
		return environment;
	}
	
	public String getNavigatedURl()
	{   
		String navigatedURl = properties.getProperty("afterlogout_navigateUrl");
		return navigatedURl;
	}
	
}
