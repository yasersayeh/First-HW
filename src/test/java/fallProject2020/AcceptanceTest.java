package fallProject2020;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import cucumber.api.*;

@RunWith(Cucumber.class)
@CucumberOptions(features ="uses_cases",
 plugin = { "html:target/cucumber/wikipedia.html"},
 monochrome=true,
 snippets = SnippetType.CAMELCASE,
 glue = { "fallProject2020"},
 strict=true
 )
public class AcceptanceTest {

	
}

