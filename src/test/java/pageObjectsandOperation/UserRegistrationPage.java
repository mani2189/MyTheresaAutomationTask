package pageObjectsandOperation;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import UtilityPackage.CommonMethods;

public class UserRegistrationPage
{
	public static String generatedpwd;
	
	@FindBy(xpath ="//a[@id='myaccount']")
	private WebElement Myaccount;  
	
	@FindBy(xpath ="//button[@type='button']")
	private WebElement CreateAccount;
	
	@FindBy(xpath ="//select[@id='suffix']")
	private WebElement SuffixSelection; 
	
	@FindBy(xpath ="//input[@id='prefix_Mr.']")
	private WebElement RadiobuttonSelection; 
	
	@FindBy(xpath =" //a[@class='logout']")
	private WebElement Logout; 
	
	@FindBy(xpath ="//h1[@class='hs1']")
	private WebElement LogouttextElement; 
	
	public WebElement getLogouttextElement(){
		return LogouttextElement;
	}

	@FindBy(xpath ="//input[@id='firstname']")
	private WebElement FirstName;
	@FindBy(xpath ="//input[@id='lastname']")
	private WebElement Lastname;
	
	@FindBy(xpath ="//input[@id='email_address']")
	private WebElement emailaddress;
	
	@FindBy(xpath ="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath ="//input[@id='confirmation']")
	private WebElement Confirmpassword;
	
	@FindBy(xpath ="//button[@id='qa-registration-form-register-button']")
	private WebElement Register;
	
	@FindBy(xpath ="//button[@class='rc-button-default goog-inline-block']")
	private WebElement CaptachaSkip;
	
	
	@FindBy(xpath ="//span[normalize-space()='Thank you for registering with mytheresa.com.']")
	private WebElement SuccessRegistration;
	
	public WebElement getMyaccount(){
		return Myaccount;
	}

	public WebElement getCreateAccount(){
		return CreateAccount;
	}
	
	public WebElement getSuccessRegistration(){
		return SuccessRegistration;
	}

	public WebElement getRadiobuttonSelection()
	{
		return RadiobuttonSelection;
	}

	public WebElement getLogout(){
		return Logout;
	}

	public WebElement getSuffixSelection(){
		return SuffixSelection;
	}


	public WebElement getFirstName(){
		return FirstName;
	}

	public void setFirstName()
	{
		CommonMethods.sendKeys(FirstName,CommonMethods.randomestring());
	}

	public WebElement getLastname()
	{
		return Lastname;
	}

	public void setLastname(){
		CommonMethods.sendKeys(Lastname,CommonMethods.randomestring());
	}

	public WebElement getEmailaddress(){
		return emailaddress;
	}

	public void setEmailaddress()
	{
		 
		CommonMethods.sendKeys(emailaddress, EmailCreationOperation.Expectedemail);
	}

	public WebElement getPassword()
	{
		return password;
	}

	public void setPassword()
	{
		 generatedpwd =CommonMethods.passwordGeneration();
		 CommonMethods.sendKeys(getPassword(),generatedpwd);
	}

	public WebElement getConfirmpassword(){
		return Confirmpassword;
	}

	public void setConfirmpassword(){
		CommonMethods.sendKeys(Confirmpassword,generatedpwd);
	}

	public WebElement getRegister()
	{
		return Register;
	}
	
	public WebElement getCaptachaSkip(){
		return CaptachaSkip;
	}

}
