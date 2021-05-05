package TESTRUN;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

                        ( 
                        		features =".\\FEATURE\\Hooks.feature",
                        		glue = "STEPDEFINITION",
                                dryRun =true,
                                monochrome = true, 
                                plugin = {"pretty","html:test-output"}
                        
                        		
                                
                        		
                        
                        		
                        		) 


public class Testrunner {

}
    