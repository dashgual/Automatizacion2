package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features="src/test/resources/Features/Falabella.feature", glue= {"definitions"}, snippets= SnippetType.CAMELCASE, tags= "@tag1")
public class RunnerFalabella {
	

}
