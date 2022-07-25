package pageObjectsandOperation;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import UtilityPackage.CommonMethods;
import UtilityPackage.DriverFactory;

public class EmailCreationOperation extends EmailCreationPage
{
	
	public static String Expectedemail="";
	public static String Actualemail;
	

	public void createEmail()
	{
		try{
			setRandomEmail();
			 Expectedemail = email +"@maildrop.cc";
			CommonMethods.clickElement(getInbox());
			 Actualemail = getInboxtitle().getText();
			Assert.assertEquals(Actualemail,Expectedemail);
			System.out.println("EmailAddress Matched and Created Successfully");
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
}
