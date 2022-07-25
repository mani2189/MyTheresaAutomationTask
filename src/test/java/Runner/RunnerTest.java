package Runner;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import UtilityPackage.CommonMethods;
import UtilityPackage.DriverFactory;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/Features/MyTheresaUserValidation.feature", 
		glue = {"Stepdefs"}, dryRun =false,
		monochrome =true, 
        plugin = {"html:test-output", "json:target/cucumber.json"}
        
						
						)
 

public class RunnerTest
{

	  @AfterClass public static void quitDriver() 
	  { 
		  DriverFactory.getDriver().quit();
	  }
	 
	 
  
}
  