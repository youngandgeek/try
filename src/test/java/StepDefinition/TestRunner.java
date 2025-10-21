package StepDefinition;
import io.cucumber.core.gherkin.Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={
        "src/test/resources/Features/GoogleSearch.feature",
        "src/test/resources/Features/Login.feature"

},
        glue = {"StepDefinition"},monochrome = true,
        plugin ={"html:target/HtmlReports/cucumber-html-report.html",
        "json:target/JsonReports/cucumber-json-report.json"}
        //tags = "@SmokeTest"

)

public class TestRunner {
}
