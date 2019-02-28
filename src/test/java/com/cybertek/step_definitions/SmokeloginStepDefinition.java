package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SmokeloginStepDefinition {
    LoginPage loginPage=new LoginPage();


    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

//  here is 2.step defined and implemented in LoginStepDefinitions class
//  that's why we don't need to implement here again

    @Then("the title should be {string}")
    public void the_title_should_be(String expectedTitle) {
        BrowserUtils.waitForPageToLoad(3);
        Assert.assertTrue(expectedTitle.contains(Driver.getDriver().getTitle()));
    }

}
