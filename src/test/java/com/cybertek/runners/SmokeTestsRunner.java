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
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions"
        , dryRun =false
<<<<<<< HEAD
        , tags = "@fun"
=======
        , tags = "@smoke"
>>>>>>> ff419d85e818117bf939abedefdc9d5cadda3120

)

public class SmokeTestsRunner {
}
