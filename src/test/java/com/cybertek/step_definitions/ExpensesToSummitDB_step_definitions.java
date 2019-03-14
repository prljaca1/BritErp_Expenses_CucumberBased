package com.cybertek.step_definitions;

import com.cybertek.pages.ExpenseDescriptionpage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.DataBaseUtility;
import com.cybertek.utilities.ExcelUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.File;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.Object;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsCollectionContaining.hasItems;


public class ExpensesToSummitDB_step_definitions {
    ExpenseDescriptionpage expenseDescriptionpage = new ExpenseDescriptionpage();

    @Then("user should Randomly enter product from dropdown")
    public void user_should_Randomly_enter_product_from_dropdown() {
        BrowserUtils.wait(5);
        expenseDescriptionpage.product.click();

        System.out.println(BrowserUtils.getElementsText(expenseDescriptionpage.productList));

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
    public void user_should_be_able_to_send_following_product_to_the_and_and(String lunchProduct, String quantity, String unitPrice) {
        expenseDescriptionpage.lunch.sendKeys(lunchProduct);

        BrowserUtils.waitForVisibility(expenseDescriptionpage.unitPrice, 3);

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
    public void lunch_Product_information_should_match_database_records() {
        // String sql="Select distinct name from hr_expense" +
        // "where name in ('Laetan', '6 ne');";
        String myname = expenseDescriptionpage.Laetan.getText();
        System.out.println(expenseDescriptionpage.Laetan.getText());
        String sql = "Select name from hr_expense;";


        List<Object> List = DataBaseUtility.getColumnData(sql, "name");
        System.out.println(List);
        for (Object o : List) {
            System.out.println(o.toString());
            System.out.println(expenseDescriptionpage.Laetan.getText());
            // Assert.assertTrue(o.equals(expenseDescriptionpage.Laetan));
            System.out.println("==============================");


            if (o.toString().equals(expenseDescriptionpage.Laetan.getText())) {
                System.out.println("*********************************************");
                Assert.assertTrue(o.toString().equals(expenseDescriptionpage.Laetan.getText()));
                System.out.println("*********************************************");
                break;
            }
        }


    }

    @Then("user should be able to click Searh more buttun under the employe")
    public void user_should_be_able_to_click_Searh_more_buttun_under_the_employe() {
        expenseDescriptionpage.Employe.click();
        expenseDescriptionpage.searchMore.click();

    }

    @Then("verify that Depaertmants under the Employe list is mactches at the data base")
    public void verify_that_Depaertmants_under_the_Employe_list_is_mactches_at_the_data_base() {
        System.out.println(BrowserUtils.getElementsText(expenseDescriptionpage.DepartmaneList));
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
        String sql = "Select * from hr_department;";
        List<Object> DepartmenList = DataBaseUtility.getColumnData(sql, "name");
        System.out.println(DepartmenList);
        Set<String> list = new HashSet<>(BrowserUtils.getElementsText(expenseDescriptionpage.DepartmaneList));

        System.out.println(list);
        for (String k : list) {

            assertThat(DepartmenList, hasItems(k));

            System.out.println("uhuuuuuuuuuuuuuuuuu it worked");
        }
    }

    @Then("User should be able to verify that employe name from excel file is visiable at the data base")
    public void user_should_be_able_to_verify_that_employe_name_from_excel_file_is_visiable_at_the_data_base() {
        String file = "./src/test/resources/features/Workbook1.xls";
        String sheet = "Sheet1";
        ExcelUtility userdata = new ExcelUtility(file, sheet);
        System.out.println(new File(file).exists());
        List<Map<String, String>> name = userdata.getDataList();
        for (Map<String, String> S : name) {
            System.out.println(S.get("name"));

            String sql = "Select name from hr_employee;";
            System.out.println("************************************");
            List<Object> List = DataBaseUtility.getColumnData(sql, "name");
            System.out.println(List);
            assertThat(List, hasItems(S.get("name")));

            System.out.println("************************************");
        }

    }

    @Then("User should be able to verify that Department name from excel file is visiable at the data base")
    public void user_should_be_able_to_verify_that_Department_name_from_excel_file_is_visiable_at_the_data_base() {
        String file = "./src/test/resources/features/Workbook1.xls";
        String sheet = "Sheet1";
        ExcelUtility userdata = new ExcelUtility(file, sheet);
        List<Map<String, String>> Department = userdata.getDataList();
        for (Map<String, String> Dep : Department) {
            System.out.println(Dep.get("department"));

            String sql = "Select * from hr_employee_category;";
            System.out.println("*****************Sule*******************");
            List<Object> List = DataBaseUtility.getColumnData(sql, "name");
            for (Object L : List) {
                //System.out.println(List);
            assertThat(List, hasItems(L));
            }
        }
    }
}