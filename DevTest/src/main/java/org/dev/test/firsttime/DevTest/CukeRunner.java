package org.dev.test.firsttime.DevTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/html",
		"json:target/cucumber.json" }, features = "src/test/resources", tags = "@Login1")
public class CukeRunner {

}
