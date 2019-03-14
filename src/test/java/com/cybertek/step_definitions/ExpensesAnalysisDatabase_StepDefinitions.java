package com.cybertek.step_definitions;


import com.cybertek.pages.ExpensesAnalysisPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.DataBaseUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExpensesAnalysisDatabase_StepDefinitions {
    ExpensesAnalysisPage expensesAnalysisPage=new ExpensesAnalysisPage();



    @Given("user click on List Icon")
    public void user_click_on_List_Icon() {
        expensesAnalysisPage.ListIcon.click();
    }
    @When("user fills the fileds{string},{string},{string},{string},{string} on expense description")
    public void user_fills_the_fileds_on_expense_description(String ExpenseDescription, String Product, String UnitPrice, String Quantity, String Employee) {

          expensesAnalysisPage.ExpenseDescription.sendKeys(ExpenseDescription);
          //BrowserUtils.waitForVisibility(expensesAnalysisPage.Product,2);

          //expensesAnalysisPage.Product.sendKeys(Product);
          expensesAnalysisPage.Product.click();
          expensesAnalysisPage.productName.click();

          BrowserUtils.waitForVisibility(expensesAnalysisPage.UnitPrice,2);
          expensesAnalysisPage.UnitPrice.clear();
          expensesAnalysisPage.UnitPrice.sendKeys(UnitPrice);

          BrowserUtils.waitForVisibility(expensesAnalysisPage.Quantity,2);
          expensesAnalysisPage.Quantity.clear();
          expensesAnalysisPage.Quantity.sendKeys(Quantity);

          expensesAnalysisPage.Employee.sendKeys(Employee);
          BrowserUtils.doubleClick(expensesAnalysisPage.Employee);

          //expensesAnalysisPage.Employee.click();
         // expensesAnalysisPage.employeeName.click();




    }
    @When("click Save button")
    public void click_Company_button_and_save_button() {
        expensesAnalysisPage.SaveButton.click();

    }
    @Then("verify {string} in Database")
        public void verify_in_Database(String Expense_Description) {
        String sql="Select * from hr_expense";

       List<List<Object>> data= DataBaseUtility.getQueryResultList(sql);
 //        List<Object> namesList=new ArrayList<>();
           boolean found=false;
           for(List l:data)
           {
               if (found=l.contains(Expense_Description))
                   break;
               //  System.out.println("Contains :"+l.contains(Expense_Description));
           }

              Assert.assertTrue(found);
        }
}








