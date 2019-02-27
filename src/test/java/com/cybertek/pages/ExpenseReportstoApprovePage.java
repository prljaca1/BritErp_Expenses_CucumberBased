package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExpenseReportstoApprovePage {

    public ExpenseReportstoApprovePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //@FindBy(linkText = "Expenses")
    //public WebElement expense;

    //@FindBy(linkText = "Expense Reports To Approve")
    //public WebElement ExpenseReportsToApp;
    //@FindBy(xpath = "(//span[@class='oe_menu_text'])[25]")
    @FindBy(xpath = "(//li/a/span)[23]")
    public WebElement ExpenseReportsToApp;
    //@FindBy(linkText = "(//span[@class='oe_menu_text'])[25]")
    // public WebElement Expensesummit;


    @FindBy(xpath = "//button[@accesskey='c']")
    //@FindBy(linkText = "Create")
    //@FindBy(xpath = "//div[@class='o_list_buttons']/button[@accesskey='c']")
    public WebElement create;

    //@FindBy(xpath = "(//button[contains(text(),'Import']")
    //@FindBy(xpath = "(//button [@type='button'])[22]")
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement Impo;

    @FindBy(className = "o_searchview_input")
    public WebElement Search;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement save;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement summarybox;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement eployee;
    //@FindBy(xpath = "//button [@class='btn btn-sm btn-default'][1]")

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default oe_highlight o_expense_sheet_approve']")
    public WebElement approve;

    @FindBy(linkText = "Demo User")
    public WebElement demouser;

    // @FindBy(xpath = "//button [@class='btn btn-sm btn-default'][5]")
    @FindBy(xpath = "//div[@class='o_statusbar_" +
            "status o_field_widget o_readonly_modifier o_required_modifier']")
    public WebElement refused;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement edit;
    @FindBy(xpath = "(//button[@class='fa fa-external-link " +
            "btn btn-default o_external_button'])[1]")
    public WebElement icon;
    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discard;

    @FindBy(xpath ="//input[@name='reason']")
    public WebElement refusebox;


    @FindBy(xpath = "//button[@name='expense_refuse_reason']")
    public WebElement refusesecond;

    @FindBy(xpath = "//div[@class='fa fa-sm fa-remove o_facet_remove']")
    public WebElement xbutton;
    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchbox;

    @FindBy (xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button")
    public List<WebElement> allboxes;
    @FindBy(xpath = "//p[@class='oe_view_nocontent_create']")
    public WebElement searchresult;

    //public void Expense() {
    // expense.click();

    // }
    public void ExpenseReportsToApp()
    {
        //ExpenseReportsToApp.click();
    }

}





