package com.cybertek.step_definitions;

import com.cybertek.pages.ExpenseDescriptionpage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.DataBaseUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

public class ExpensesToSummitDB_step_definitions {
    ExpenseDescriptionpage expenseDescriptionpage=new ExpenseDescriptionpage();

    @Then("user should Randomly enter product from dropdown")
    public void user_should_Randomly_enter_product_from_dropdown() {
        BrowserUtils.wait(5);
        expenseDescriptionpage.product.click();

        System.out.println( BrowserUtils.getElementsText(expenseDescriptionpage.productList));

        expenseDescriptionpage.selectRandomTextList(expenseDescriptionpage.productList).click();
    }


//    @When("user should be able to send following product to the {string} and {string}")
//    public void user_should_be_able_to_send_following_product_to_the_and(String lunchProduct, String quantity,String unitPrice) {
//        expenseDescriptionpage.lunch.sendKeys(lunchProduct);
//        expenseDescriptionpage.quantityNm.clear();
//        expenseDescriptionpage.quantityNm.sendKeys(quantity);
//        expenseDescriptionpage.quantityNm.clear();
//        expenseDescriptionpage.unitPrice.sendKeys(unitPrice);
//
//    }

    @When("user should be able to send following product to the {string} and {string} and {string}")
    public void user_should_be_able_to_send_following_product_to_the_and_and(String lunchProduct, String quantity,String unitPrice) {
        expenseDescriptionpage.lunch.sendKeys(lunchProduct);

        BrowserUtils.waitForVisibility(expenseDescriptionpage.unitPrice,3);

        //expenseDescriptionpage.unitPrice2.sendKeys(unitPrice);

        expenseDescriptionpage.quantityNm.clear();
        expenseDescriptionpage.quantityNm.sendKeys(quantity);


     //expenseDescriptionpage.unitPrice.clear();
        //expenseDescriptionpage.unitPrice.sendKeys(unitPrice);
        //Driver.getDriver().findElement(By.xpath("//div[@class='o_field_monetary o_field_number o_input o_field_widget o_required_modifier']")).sendKeys(unitPrice);
    }
    @When("user should Rendomly enter Employee name from dropdown")
    public void user_should_Rendomly_enter_Employee_name_from_dropdown() {

        expenseDescriptionpage.Employe.click();
        expenseDescriptionpage.selectRandomTextList(expenseDescriptionpage.EmployeeList).click();
    }
    @When("user should be able to click save button")
    public void user_should_be_able_to_click_save_button() {
       expenseDescriptionpage.save.click();
    }

    @Then("lunch Product information should match database records")
    public void lunch_Product_information_should_match_database_records() throws Exception {
//     String sql="Select distinct name from hr_expense" +
//        "where name in ('Laetan', '6 ne');";
       String sql= "name from hr_expense";
        System.out.println(expenseDescriptionpage.Laetan.getText());

        List<Object> List=DataBaseUtility.getColumnData(sql, "name");
        System.out.println(List);

        System.out.println("===================");
//        Map<String, Object> userInfo=DataBaseUtility.getRowMap(sql);
//        System.out.println(userInfo);


    }

}
