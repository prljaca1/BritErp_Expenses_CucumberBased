package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesAnalysisPage {
    public ExpensesAnalysisPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/div)[10]")
    public WebElement ReportingTitle;

    //@FindBy(xpath = "(//a[@class='oe_menu_leaf'])[17]")
    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/ul/li)[10]")
    public WebElement ExpensesAnalysis;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm dropdown-toggle']/span)")
    //@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button")
    public WebElement MeasureButton;

    @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list']")
    public WebElement ListIcon;

    @FindBy(xpath = "(//div[@class='o_list_buttons']/button[1])")
    //@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement CreateButton;

    @FindBy(xpath = "//div[@class='o_form_sheet_bg']")
    public WebElement ExpenseForm;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement ExpenseDescription;

    @FindBy(xpath = "//div[@name='product_id']")
    public WebElement Product;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'][1]/li[2]/a")
    public WebElement MenuItemExpense;

    @FindBy(xpath = "//div[@name='employee_id']")
    public WebElement Employee;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'][4]/li[4]/a")
    public WebElement MenuItemEmployee;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement SaveButton;


}
