
package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature" },
        glue = { "stepdefination"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true,
        monochrome=true,
        tags = {}

)
public class Runner extends AbstractTestNGCucumberTests {



}
