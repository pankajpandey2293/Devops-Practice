package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feautres",glue={"stepdefinition","help"} , tags="  @sanity" ,
plugin = "html:target/testReport/test.html")
public class Testrunner {
 
//junit //TestNg
	
	// tags="@Smoke"
}
