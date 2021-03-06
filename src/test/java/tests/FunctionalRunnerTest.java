package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //glue = "src/test/java/se/cucumberTests/selenium/glue/*Definitions",
        //monochrome = true,
        format = {"pretty", "html:target/report/cucumber-report", "json:target/report/jsonReport/cucumber-report.json"},
        features = {"src/test/resources/features"},
        tags = {"@Login"}
)
public class FunctionalRunnerTest extends Fixture {

}
