package UtilityPackage;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory extends BrowserHandlingOperation{
	private static WebDriver driver;
	
	
	public static WebDriver getDriver(){
		return driver;
	}
	

	public static void launchBrowser() {
		try{
			switch(CommonMethods.BROWSER_TYPE){
			case "chrome":
				WebDriverManager.chromedriver().browserVersion("101.0.4951.54").setup();
				chromeOptionsSettings();
				driver=new ChromeDriver(options);	
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().browserVersion("102.0.1").setup();
				//fireFoxoptionsSettings();
				driver=new FirefoxDriver();
				CommonMethods.maximizeBrowser();
				//System.out.println("driver:"+driver);
				break;
			default:
				throw new Exception("No such browser is present to be initialize. Browser name:"+CommonMethods.BROWSER_TYPE);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
