package com.cybertek.step_definitions;

import com.cybertek.pages.ExpensesAnalysisPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();
    ExpensesAnalysisPage expensesAnalysisPage= new ExpensesAnalysisPage();

    @Given("user is on the login page")

    public void user_is_on_the_login_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in using {string} and {string}")
      public void user_logs_in_using_and(String email, String password) {

        loginPage.logIn(email, password);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3);
        wait.until(ExpectedConditions.visibilityOf(loginPage.ExpensesButton));
    }


    @Then("Expenses title should be displayed")
    public void expenses_title_should_be_displayed() {

        BrowserUtils.verifyElementDisplayed(loginPage.ExpensesButton);
    }

    @Then("user should click Expenses button")
    public void user_should_click_Expenses_button() {
        loginPage.ExpensesButton.click();

    }

    @Given("User logs in with manager credentials and reach ExpensesAnalysis page")
    public void user_logs_in_with_manager_credentials_and_reach_ExpensesAnalysis_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.email.sendKeys("in_ex_manager2@info.com");
        loginPage.password.sendKeys("LLighg89");
        loginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3);
        wait.until(ExpectedConditions.visibilityOf(loginPage.ExpensesButton));
        loginPage.ExpensesButton.click();
        expensesAnalysisPage.ExpensesAnalysis.click();


    }
}
