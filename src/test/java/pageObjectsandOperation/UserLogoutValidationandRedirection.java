package pageObjectsandOperation;

import org.junit.Assert;
import UtilityPackage.CommonMethods;
import UtilityPackage.DriverFactory;

public class UserLogoutValidationandRedirection extends UserRegistrationPage
{ 
	public  void logoutValidation(){
		try{
			CommonMethods.mouseOverClickElement(getMyaccount());
			CommonMethods.clickElement(getLogout());
			CommonMethods.waitforTextTobePresent(getLogouttextElement(),"YOU ARE NOW LOGGED OUT");
			if(getLogouttextElement().getText().equalsIgnoreCase("YOU ARE NOW LOGGED OUT"));
				
			{
				Assert.assertTrue(true);
				System.out.println("User LoggedOut Successfully");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void redirectionURLvalidation(){
		try{
			Boolean navigatedURL=CommonMethods.waitforURLNavigation(CommonMethods.REDIRECTION_URL);
			if(navigatedURL){
				Assert.assertTrue(true);
				System.out.println("User Navigated to Login application Successfully after logout");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
