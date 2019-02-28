package com.cybertek.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features/searchFunctionality",
        glue = "com/cybertek/step_definitions"
        , dryRun = true
        , tags = "@an"

)

public class SmokeTestsRunner {
}
