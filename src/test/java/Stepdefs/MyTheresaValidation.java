package Stepdefs;
import org.openqa.selenium.support.PageFactory;
import UtilityPackage.CommonMethods;
import UtilityPackage.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectsandOperation.LaunchApplication;
import pageObjectsandOperation.PageObjectInitilization;
public class MyTheresaValidation extends CommonMethods{
	
	@Before
	public void beforeScenario(Scenario scenario){
		System.out.println("Scenario name is "+scenario.getName());
	}
	
	@Given("User launches the EmailCreation application")
	public void user_launches_the_email_creation_application(){
		DriverFactory.launchBrowser();
		CommonMethods.maximizeBrowser();
		PageObjectInitilization.initeWebElements();
		LaunchApplication.launchEmailCreationURL();
	}
	
	@Then("User enters the random email address and click on view inbox")
	public void user_enters_the_random_email_address_and_click_on_view_inbox(){
		System.out.println("/**************Scenario1********************");
		PageObjectInitilization.emailoperation.createEmail();
	}
	
	@When("User navigates to MyTheresa login application")
	public void user_navigates_to_my_theresa_login_application(){
		LaunchApplication.launchTheresaAppURL();
	}
	
	@Then("User Clicks on My account and Create an Account")
	public void user_clicks_on_my_account_and_create_an_account(){
		PageObjectInitilization.Registrationoperation.accountCreation();
	}
	
	@Then("User validates the account Registration")
	public void user_validates_the_account_registration(){
		PageObjectInitilization.Registrationoperation.validationRegistration();
	}
	
	@Then("User logs out from the application")
	public void user_logs_out_from_the_application(){
		try{
			PageObjectInitilization.logoutpage.logoutValidation();
			PageObjectInitilization.logoutpage.redirectionURLvalidation();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Then("User validates the Login with Emailaddress and Password")
	public void user_validates_the_login_with_emailaddress_and_password()
	{
		System.out.println("/**************Scenario2********************");
		PageObjectInitilization.loginpage.validateLogin();
	}
}