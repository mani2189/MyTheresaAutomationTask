package pageObjectsandOperation;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import UtilityPackage.CommonMethods;
import UtilityPackage.DriverFactory;
public class TS02_UserRegistrationOperations extends UserRegistrationPage{
	
	public String Expectedtext="Thank you for registering with mytheresa.com.";
	
	
	public void accountCreation(){
		try{
			CommonMethods.mouseOverClickElement(getMyaccount());
			CommonMethods.clickElement(getCreateAccount());
			CommonMethods.clickElement(getRadiobuttonSelection());
			CommonMethods.SelectDropDownValue(getSuffixSelection(),"value","Dr.");
			setFirstName();
			setLastname();
			setEmailaddress();
			setPassword();
			setConfirmpassword();
			Thread.sleep(5000);
			CommonMethods.clickElement(getRegister());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void validationRegistration(){
		try{
			CommonMethods.waitforElement(getSuccessRegistration());
			if(getSuccessRegistration().isDisplayed()){
				String ActualText=getSuccessRegistration().getText();
				Assert.assertEquals(Expectedtext,ActualText);
				System.out.println("UserRegistration is Success");
			}
		}catch(Exception e){
		}
	}
	
}
