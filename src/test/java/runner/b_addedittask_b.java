package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/main/resources/feature/testcase.feature",
		tags= {"@tc02_b_addedittask_2"},
		glue= {"steps"},
		monochrome = true 
		)
public class b_addedittask_b {

}
