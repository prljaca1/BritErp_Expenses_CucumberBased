package com.cybertek.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                 features ="@target/rerun.txt",
                 plugin = {
                          "html:target/default-cucumber-reports",
                          "json:target/cucumber.json",
                          "rerun:target/rerun.txt"
        }
)
public class FailedScenariosTestsRunner {
}
