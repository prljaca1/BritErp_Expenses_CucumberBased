package com.cybertek.step_definitions;

import com.cybertek.pages.ExpensesToSummitPage;
import com.cybertek.pages.LoginPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ExpensesToSummit_Step_Definition {
   LoginPage loginPage=new LoginPage();

   ExpensesToSummitPage ExpensesToSummit= new ExpensesToSummitPage();

    @Then("following title should be Display:")
    public void following_title_should_be_Display(List<String> titles) {

        //System.out.println(titles);
//        List<String> aa= ExpensesToSummit.checktitle();
//        for(String bb:aa){
//            System.out.println(bb);

//        }

        Assert.assertEquals(ExpensesToSummit.checktitle(), titles);

    }

    @Then("user should be able to click Expenses to Submit   Button")
    public void user_should_be_able_to_click_Expenses_to_Submit_Button() {
        ExpensesToSummit.ExpensesToSummit.click();

    }

    @Then("user should be able to click {string} button")
    public void user_should_be_able_to_click_button(String Create) {
        ExpensesToSummit.buttonList(Create);
    }

    @Then("following title should be Display on the createPage:")
    public void following_title_should_be_Display_on_the_createPage(List<String> CreatePagesTitles) {
        Assert.assertEquals(ExpensesToSummit.createTitle(), CreatePagesTitles);
        // System.out.println("=========================================");
        System.out.println(ExpensesToSummit.quantityNm.getText());
        ExpensesToSummit.quantityNm.clear();
        ExpensesToSummit.quantityNm.sendKeys("200.000");

    }
}
