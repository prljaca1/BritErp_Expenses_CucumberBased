package com.cybertek.step_definitions;

import com.cybertek.pages.ExpensesAnalysisPage;
import com.cybertek.utilities.BrowserUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class ExpensesAnalysisStepDefinitions {
    ExpensesAnalysisPage expensesAnalysisPage = new ExpensesAnalysisPage();

     //BRIT-4045
    @And("system displays Expenses Analysis title")
    public void system_displays_Expenses_Analysis_title() {
        BrowserUtils.verifyElementDisplayed(expensesAnalysisPage.ExpensesAnalysis);

    }

    @Then("user should click Expenses Analysis title")
    public void user_should_click_Expenses_Analysis_title() {
        expensesAnalysisPage.ExpensesAnalysis.click();
    }

    // @BRIT-4253
    @Then("system displays Measure dropdown")
    public void system_displays_Measure_dropdown() {
        BrowserUtils.verifyElementDisplayed(expensesAnalysisPage.MeasureButton);
    }

    @Then("user should click Measure button")
    public void user_should_click_Measure_button() {
        expensesAnalysisPage.MeasureButton.click();
    }

    @Then("Measure button's menu has following options")
    public void measure_button_s_menu_has_following_options(List<String> tablemenulist) {
        //List<String> menulist= BrowserUtils.getElementsText(expensesAnalysisPage.MeasureMenu);
        //System.out.println(menulist);

        Assert.assertTrue(BrowserUtils.getElementsText(expensesAnalysisPage.MeasureMenu).containsAll(tablemenulist));
        System.out.println("Verify");
    }
     //BRIT-4296
   @When("system displays three graphic icons next to Measure button")
   public void system_displays_three_graphic_icons_next_to_Measure_button(List<String>iconNames) {

        List<WebElement> icons = new ArrayList<>();
        List<String> nameIcons = new ArrayList<>();

        for(int i=1; i < 4; i++){
            icons.add(expensesAnalysisPage.GraphicsIcons.get(i));
       }

        for(WebElement icon : icons){
           System.out.println(icon.getAttribute("data-original-title"));
           nameIcons.add(icon.getAttribute("data-original-title"));
        }

        Assert.assertTrue(nameIcons.containsAll(iconNames));
        System.out.println("Verify");
   }

   @Then("user should click graphic icons")
    public void user_should_click_graphic_icons() {

        List<WebElement> MyGraphicsIcons = expensesAnalysisPage.GraphicsIcons;
        System.out.println(MyGraphicsIcons.size());

        for (WebElement icon : MyGraphicsIcons) {
            icon.click();
        }
    }

     //BRIT-4297
    @When("system displays four actions under Filter functionality")
    public void system_displays_four_actions_under_Filter_functionality(List<String>actionNames) {

        List<WebElement> actions = expensesAnalysisPage.FourActions;
        List<String> nameActions = new ArrayList<>();

        for (WebElement action : actions){
            System.out.println(action.getAttribute("data-original-title"));
            nameActions.add(action.getAttribute("data-original-title"));
        }
       Assert.assertTrue(nameActions.containsAll(actionNames));
        System.out.println("Verify");
    }

    @Then("user should click four actions")
    public void user_should_click_four_actions() {

        List<WebElement>myActions=expensesAnalysisPage.FourActions;
        System.out.println(myActions.size());

        for (WebElement action : myActions){
            action.click();
        }
    }






}












