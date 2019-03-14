package com.cybertek.step_definitions;

import com.cybertek.pages.ExpenseReportstoApprovePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.DataBaseUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ExpesesReportToApproveDatabaseStepDefinitions {
    ExpenseReportstoApprovePage Expo = new ExpenseReportstoApprovePage();

    @Then("user click on Expenses Report to Approve")
    public void user_click_on_Expenses_Report_to_Approve() {
//BrowserUtils.wait(10);
        //BrowserUtils.waitForVisibility(Expo.ExpenseReportsToApp,  3);
        BrowserUtils.waitForClickablility(Expo.ExpenseReportsToApp, 5);
        Expo.ExpenseReportsToApp.click();

    }

    @Then("Expenses Report to Approve should display")
    public void expenses_Report_to_Approve_should_display() {
        Expo.ExpenseReportsToApp.isDisplayed();
    }

    @Then("user click on create button")
    public void user_click_on_create_button() {
        BrowserUtils.wait(5);
        Expo.create.click();
    }

    @When("user click and run the epmloyees dropdown")
    public void user_click_and_run_the_epmloyees_dropdown() {
        BrowserUtils.wait(5);
        Expo.eployee.click();
    }

    @Then("the following employees  should be in database")
    public void the_following_employees_should_be_in_database( List<String> database) {
//BrowserUtils.wait(5);
        List<String> mylist = database;
        System.out.println(database);

        String sql = "select name from hr_employee;";
//BrowserUtils.wait(5);
        List<Object> nameFormData = DataBaseUtility.getColumnData(sql, "name");

        System.out.println(nameFormData);

        for (String s : mylist) {

            Assert.assertTrue(nameFormData.toString().contains(s));
        }
        System.out.println("it is passed");

    }

    @Given("user should enter the Expense Summary Report {string}")
    public void user_should_enter_the_Expense_Summary_Report(String box) {
        Expo.summarybox.sendKeys(box);

    }

    @Given("user click and sellect from the Employee box")
    public void user_click_and_sellect_from_the_Employee_box() {
        Expo.eployee.click();
        Expo.demouser.click();
    }


    @Given("user click on save buttonThen all the following should be in database")
    public void user_click_on_save_buttonThen_all_the_following_should_be_in_database
            (List<String>box1) {
        List<String>mybox = box1;


        String sql="select * from hr_expense;";
        for (String s:mybox){
            System.out.println(s);
            List<Object> datafromDB = DataBaseUtility.getColumnData(sql,"name");
            Assert.assertTrue(datafromDB.toString().contains(s));
        }

    }



}



