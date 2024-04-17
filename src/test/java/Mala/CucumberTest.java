package Mala;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"StepDef"},
        features = {"src/test/resources"},
        plugin = {"pretty", "html:reports/cucumber.html", "json:reports/cucumber.json"}
        //plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
        //monochrome = true
)
public class CucumberTest {
}