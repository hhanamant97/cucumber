package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="./src/main/java/feature/active.feature",		
		glue= {"step"},
		tags= {"@TC_Login_page, @TC_url"},
		plugin= {"pretty", "json:target/cucumber.json", "html:target/cucumber_h.html"}
		)


public class TestRunner {

}
