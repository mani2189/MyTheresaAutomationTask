package pageObjectsandOperation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import UtilityPackage.CommonMethods;

public class MyTheresaLoginPage extends UserRegistrationPage
{
	
	@FindBy(xpath ="//input[@id='email']")
	private WebElement emaillogintextbox;
	
	@FindBy(xpath ="//div[@id='customer_flyout_login_input']//input[@id='pass']")
	private WebElement passwordtextbox;
	
	@FindBy(xpath ="//button[@id='send2']")
	private WebElement LoginButton;
	
	@FindBy(xpath ="//button[text()='Accept all and continue']/ancestor::div[@class='modal-dialog modal-cat3']")
	private WebElement ConsentAgree;
	

	@FindBy(xpath ="//h1[@class='hs3'][contains(text(),'Welcome!')]")
	private WebElement WelcomeUserText;
	
	public WebElement getEmaillogintextbox(){
		return emaillogintextbox;
	}

	public void setEmaillogintextbox()
	{
		CommonMethods.sendKeys(emaillogintextbox, EmailCreationOperation.Expectedemail);
	}

	public WebElement getPasswordtextbox(){
		return passwordtextbox;
	}

	public void setPasswordtextbox()
	{   
		CommonMethods.sendKeys(passwordtextbox,generatedpwd);
	}

	public WebElement getLoginButton(){
		return LoginButton;
	}
	
	public WebElement getWelcomeUserText(){
		return WelcomeUserText;
	}

	public WebElement getConsentAgree(){
		return ConsentAgree;
	}

}
