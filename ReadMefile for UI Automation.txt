Project Structure and its Explanation:

Framework Used : Cucumber BDD and PageObjectModel ( I have implemented Simple Cucumber BDD framework and PageObject Model)
PageFactory - To Initialize all the webelements
Runwith : JUnit Test



Project and Code Structure:

 1. UtilityPackage -
            -CommonMethodsClass- (Common Action Methods) 
            -DriverFactoryClass- Driverobject initialization for the multiple browser
            -ReadConfiguration - Read the configuration details
            -BrowserOperations - Operation related to controlling the browsers

2. PageobjecCass - Contains Action Methods on Webelements 
 
3. PageOperations-  Code logics implemented using Corresponding pageWebelements
4. StepDefinition Class - All Test scernarios ( Note: This class Contains Only method calling from PageOperations.
5. RunnerClass - Contains the Cucumber Options such as features,glue,dryRun,monochrome and plugin
6. FeatureFile - This holds the Test scenarios and TestSteps with the BDD style
7. Configuration file - URL,Browser related information will be present (src/test/resources/Config.Properties)
    
    features - This holds the local path of Feature file present
    glue - This connects the Feature file and StepDefinition 
    dryrun - It Checks and Ensure whether all the Step Definitions are defined from Feature file (Always sets to false While     Executing the script)
    monoChrome - To provide good look and feel on the outputconsole (Always Sets to True)
    plugin - All Reports generated  


How to Run the Program:
1. Download the Project as Zip into local system 
2. Go to Eclipse Click->File->Import as MavenProject (Eclipse Latest version recommended)
3. Right Click Project GoTo->Maven->UpdateProject to make sure all the Depedencies are downloaded from pom.xml file
4. Go to Runner.java File (MyTeresaAutomationTask/src/test/java/Runner/RunnerTest.java)
5. RightClick-> run as JUnit-Test 
6. Once the program run completed successfully, Go to Console and See the Validation results printed in the console 


Software and Plugins Versions used:

1. Eclipse Version: 2020-06 (4.16.0)
2. Selenium version :3.141.0
2. Junit4
3. CucumberVersion 6.6.0 (io.cucumber)
4. webdrivermanager 5.0.3
5. Java 1.8
6. CucumberEclipsePlugin : 1.0.0.2