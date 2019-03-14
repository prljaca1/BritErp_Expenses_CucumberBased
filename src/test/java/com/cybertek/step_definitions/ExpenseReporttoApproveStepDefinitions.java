package com.cybertek.step_definitions;

import com.cybertek.pages.ExpenseReportstoApprovePage;
import com.cybertek.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ExpenseReporttoApproveStepDefinitions {
    ExpenseReportstoApprovePage Expo =new ExpenseReportstoApprovePage();

    @Then("user click on Expenses Report to Approve")
    public void user_click_on_Expenses_Report_to_Approve() {
        //BrowserUtils.wait(10);
        //BrowserUtils.waitForVisibility(Expo.ExpenseReportsToApp,  3);
        BrowserUtils.waitForClickablility(Expo.ExpenseReportsToApp,5);
        Expo.ExpenseReportsToApp.click();

    }

    @Then("Expenses Report to Approve should display")
    public void expenses_Report_to_Approve_should_display() {
        Expo.ExpenseReportsToApp.isDisplayed();
    }
    @Then("user click on create button")
    public void user_click_on_create_button() {

        BrowserUtils.wait(10);
        Expo.create.click();
        System.out.println("create button is clicked and");

    }

    @Then("create page should display")
    public void create_page_should_display() {

        BrowserUtils.verifyElementDisplayed(Expo.create);
        System.out.println("create button is verified");
    }


    @Then("user click and sellect from the Employee box")
    public void user_click_and_sellect_from_the_Employee_box() {

        BrowserUtils.wait(5);
        Expo.eployee.click();
        BrowserUtils.wait(5);
        Expo.demouser.click();

    }

    @Then("user should fill the Expense Summary Report box")
    public void user_should_fill_the_Expense_Summary_Report_box() {
        Expo.summarybox.sendKeys("airline expenses");
    }

    @Then("user should fill the Expense Summary Report boxs{string}")
    public void user_should_fill_the_Expense_Summary_Report_boxs(String box) {
        Expo.summarybox.sendKeys(box);

    }



    @Then("user click on Approve button")
    public void user_click_on_Approve_button() {

        Expo.approve.click();
        BrowserUtils.verifyElementDisplayed(Expo.approve);
        System.out.println("approve button is clicked and it passed");

    }


    @Then("user click on save button")
    public void user_click_on_save_button() {

        BrowserUtils.wait(5);
        Expo.save.click();
        System.out.println("clicked on save");

    }



    @Then("the title should be Save")
    public void the_title_should_be_Save() {

        String actualtitle = Expo.save.getText();
        String expectedtitle = "Save";
        Assert.assertEquals(expectedtitle,actualtitle);
        System.out.println("and the title is Save");
        System.out.println("and it passed");


    }

    @Then("user click on edit button")
    public void user_click_on_edit_button() {


        BrowserUtils.wait(5);
        Expo.edit.click();
        System.out.println("clicked on edit");
    }

    @Then("the title should be none")
    public void the_title_should_be_none() {

        String actualtitle = Expo.edit.getText();
        String expectedtitle = "";
        Assert.assertEquals(expectedtitle,actualtitle);
        System.out.println("and it passed");


    }
    @Then("user click on refuse button")
    public void user_click_on_refuse_button()
    {
        Expo.refused.click();
    }

    @Then("user click on x button")
    public void user_click_on_x_button() {
        Expo.xbutton.click();
    }


    @Then("user enter {string} on search box and click")
    public void user_enter_on_search_box_and_click(String word) {
        Expo.searchbox.sendKeys(word+ Keys.ENTER);
    }

    @Then("a new expenses page should display")
    public void a_new_expenses_page_should_display() {
        Expo.searchresult.isDisplayed();
        System.out.println("it passed");
    }



}



