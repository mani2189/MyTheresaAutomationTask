package UtilityPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectsandOperation.EmailCreationOperation;
import pageObjectsandOperation.TS01_LoginPageOperation;
import pageObjectsandOperation.UserLogoutValidationandRedirection;
import pageObjectsandOperation.TS02_UserRegistrationOperations;
public class CommonMethods extends DriverFactory{
	
	public static JavascriptExecutor js;
	
	public static ReadConfig readconfig=new ReadConfig();
	public static String BROWSER_TYPE=readconfig.getBrowser();
	public static String environment=readconfig.getEnvironment();
	public static String QA_URL=readconfig.getQAAppurl();
	public static String TEST_URL=readconfig.getTestAppurl();
	public static String LOCAL_URL=readconfig.getLocalAppurl();
	public static String STAGING_URL=readconfig.getStagingAppurl();
	public static String EMAILCREATION_URL=readconfig.getEmailCreationAppurl();
	public static String REDIRECTION_URL=readconfig.getNavigatedURl();
	
	public static String randomestring()
	{
		String generatedString1=org.apache.commons.lang.RandomStringUtils.randomAlphabetic(3);
		return generatedString1;
	}
	public static String passwordGeneration(){
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		String pwd=org.apache.commons.lang.RandomStringUtils.random(15,characters);
		return pwd;
	}
	public static void closeDriver(){
		getDriver().close();
	}
	public static void mouseOverClickElement(WebElement element){
		Actions act=new Actions(getDriver());
		act.moveToElement(element).perform();
		waitforElement(element);
	}
	public static void quitDriver(){
		getDriver().quit();
	}
	
	public static void navigateToURL(){
		try{
			switch(environment){
			case "QA":
				getDriver().get(QA_URL);
				System.out.println(QA_URL);
				break;
			case "STAGING":
				getDriver().get(STAGING_URL);
				break;
			case "TEST":
				getDriver().get(TEST_URL);
				break;
			case "LOCAL":
				getDriver().get(LOCAL_URL);
				break;
			default:
				throw new Exception("No Environment is present to be initialize. Environment name:"+environment);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void maximizeBrowser(){
		getDriver().manage().window().maximize();
	}
	public static void waitforElement(WebElement element){
		WebDriverWait wait=new WebDriverWait(getDriver(),30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void waitforTextTobePresent(WebElement element,String Expectedlogouttext){
		WebDriverWait wait=new WebDriverWait(getDriver(),30);
		wait.until(ExpectedConditions.textToBePresentInElement(element,Expectedlogouttext));
	}
	public static Boolean waitforURLNavigation(String url){
		WebDriverWait wait=new WebDriverWait(getDriver(),30);
		return wait.until(ExpectedConditions.urlToBe(url));
	}
	public static void sendKeys(WebElement element,String value){
		try{
			elementTobeClickable(element,30);
			element.sendKeys(value);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void elementTobeClickable(WebElement element,int WaitSeconds) throws Exception{
		try{
			WebDriverWait waits=new WebDriverWait(getDriver(),WaitSeconds);
			waits.until(ExpectedConditions.elementToBeClickable(element));
		}catch(Exception e){
		}
	}
	public static void listofElementspresence(String xpath,int WaitSeconds) throws Exception{
		try{
			WebDriverWait waits=new WebDriverWait(getDriver(),WaitSeconds);
			waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}catch(Exception e){
		}
	}
	public static void elementClick(WebElement element){
		try{
			waitforElement(element);
			elementTobeClickable(element,10);
			js=(JavascriptExecutor)getDriver();
			js.executeScript("arguments[0].click();",element);
		}catch(Exception e){
			element.click();
		}
	}
	public static void clickElement(WebElement element) throws Exception{
		elementTobeClickable(element,10);
		try{
			js=(JavascriptExecutor)getDriver();
			js.executeScript("arguments[0].scrollIntoView(true);",element);
			js.executeScript("arguments[0].click();",element);
		}catch(Exception e){
			element.click();
		}
	}
	public static void SelectDropDownValue(WebElement dropdownwebelement,String type,String value){
		Select drop=new Select(dropdownwebelement);
		switch(type){
		case "index":
			drop.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			drop.selectByValue(value);
		case "visibletext":
			drop.selectByVisibleText(value);
			break;
		default:
			System.out.println("Please pass the correct selection");
			break;
		}
	}
}
