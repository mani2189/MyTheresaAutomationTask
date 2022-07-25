package pageObjectsandOperation;

import UtilityPackage.CommonMethods;
import UtilityPackage.DriverFactory;

public class LaunchApplication extends CommonMethods
{
public static void launchEmailCreationURL(){
		
	DriverFactory.getDriver().get(EMAILCREATION_URL);
	
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void launchTheresaAppURL(){
		try{
			navigateToURL();
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
}


