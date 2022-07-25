package UtilityPackage;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserHandlingOperation
{
	public static ChromeOptions options;
	//public static FirefoxOptions Firefoxoptions;
	
	public static void chromeOptionsSettings()
	{
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-web-security");
		options.addArguments("--disable-notifications");
		options.addArguments("--no-proxy-server");
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		String user_agent="Chrome/101.0.4951.54";
		options.addArguments(String.format(user_agent));
		options.setExperimentalOption("prefs", prefs);
	}
	
	/*
	 * public static void fireFoxoptionsSettings() {
	 * 
	 * //DesiredCapabilities capabilities = DesiredCapabilities. firefox();
	 * //capabilities. setCapability("marionette",true); Firefoxoptions = new
	 * FirefoxOptions(); //capabilities.merge(Firefoxoptions);
	 * 
	 * Firefoxoptions.addPreference("signon.rememberSignons", false);
	 * Firefoxoptions.addArguments("--start-maximized");
	 * Firefoxoptions.addArguments("--disable-web-security");
	 * Firefoxoptions.addArguments("--no-proxy-server");
	 * Firefoxoptions.addArguments("--disable-blink-features=AutomationControlled");
	 * Firefoxoptions.addPreference("useAutomationExtension", false);
	 * //Firefoxoptions.set("excludeSwitches", new String[]{"enable-automation"});
	 * String user_agent="Mozilla/5.0";
	 * Firefoxoptions.addArguments(String.format(user_agent));
	 * 
	 * 
	 * }
	 */
}
