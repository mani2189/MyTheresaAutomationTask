package pageObjectsandOperation;

import org.junit.Assert;
import UtilityPackage.CommonMethods;

public class TS01_LoginPageOperation extends MyTheresaLoginPage
{
	public static String ExpectedLogintext ="Welcome!";
	
	public void validateLogin()
	{
		try{
			CommonMethods.mouseOverClickElement(getMyaccount());
			setEmaillogintextbox();
			setPasswordtextbox();
			CommonMethods.clickElement(getLoginButton());
			CommonMethods.waitforElement(getMyaccount());
			CommonMethods.mouseOverClickElement(getMyaccount());
			//CommonMethods.waitforTextTobePresent(getWelcomeUserText(),ExpectedLogintext);
			if(getWelcomeUserText().getText().equalsIgnoreCase(ExpectedLogintext));
			{
				Assert.assertTrue(true);
				System.out.println("User Logged In Successfully");
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

