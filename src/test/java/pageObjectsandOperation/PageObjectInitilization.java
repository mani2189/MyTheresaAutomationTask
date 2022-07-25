package pageObjectsandOperation;

import org.openqa.selenium.support.PageFactory;

import UtilityPackage.DriverFactory;

public class PageObjectInitilization extends DriverFactory
{
	public static EmailCreationOperation emailoperation;
	public static TS02_UserRegistrationOperations Registrationoperation;
	public static TS01_LoginPageOperation loginpage;
	public static UserLogoutValidationandRedirection logoutpage;
	
	public static void initeWebElements()
	{
		emailoperation=PageFactory.initElements(getDriver(),EmailCreationOperation.class);
		Registrationoperation=PageFactory.initElements(getDriver(),TS02_UserRegistrationOperations.class);
		loginpage=PageFactory.initElements(getDriver(),TS01_LoginPageOperation.class);
		logoutpage=PageFactory.initElements(getDriver(),UserLogoutValidationandRedirection.class);
	}
}
