package StepDefinition;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.core.backend.StepDefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.Plugin;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",
        glue = {"StepDefinition"},monochrome = true,
        plugin ={"html:target/HtmlReports/cucumber-html-report.html",
        "json:target/JsonReports/cucumber-json-report.json"},
        tags = "@SmokeTest"

)

public class TestRunner {
}
