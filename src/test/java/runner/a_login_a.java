package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/main/resources/feature/testcase1.feature",
		tags= "@tc01_a_login_1",
		glue= "stepdefinition",
		monochrome = true 
		)
public class a_login_a {

}
