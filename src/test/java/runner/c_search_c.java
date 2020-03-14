package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/main/resources/feature/testcase.feature",
		tags= {"@tc03_c_searchlogin_3"},
		glue= {"steps"},
		monochrome = true 
		)
public class c_search_c {

}
