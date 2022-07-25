package pageObjectsandOperation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import UtilityPackage.CommonMethods;

public class EmailCreationPage
{ 
	public String email=null;
	
	@FindBy(xpath ="//div[@class='nav-right']//input[@placeholder='view-this-inbox']")
	private WebElement randomEmail;
	
	
	@FindBy(xpath ="//div[@class='nav-right']//button")
	private WebElement ViewInbox;
	
	@FindBy(xpath ="//h1[@class='inbox-title']")
	private WebElement Inboxtitle;
	
	
	public void setRandomEmail()
	{   email = CommonMethods.randomestring().toLowerCase();
		CommonMethods.sendKeys(randomEmail,email);
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public  WebElement getRandomEmail(){
		return randomEmail;
	}
	
	public WebElement getInbox()
	{   
		return ViewInbox;
	}
	
	public WebElement getInboxtitle()
	{
		return Inboxtitle;
	}
}

