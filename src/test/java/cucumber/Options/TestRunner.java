package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        
        features = "src/test/java/features",  plugin = "json:target/jsonReports/cucumber-report.json",
        glue = { "stepDefinitions","utilities"},
        monochrome = true, publish = true

        
        
        /*{

                "html:target/cucumber-report.html",

                "json:target/cucumber.json",

                "junit:target/cucumber.xml" 

        },*/

        
       
)

public class TestRunner {

}