package com.cybertek.pages;

import com.cybertek.utilities.DataBaseUtility;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExpenseDescriptionpage {
    public ExpenseDescriptionpage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='o_input_dropdown']")
    public WebElement product;

//
  @FindBy(xpath = "//*[@id='o_field_input_27']")
  public WebElement Employe;
  @FindBy(xpath = "//*[@id='ui-id-6']/li")
  public List<WebElement> EmployeeList;
//


    @FindBy(xpath = "//*[@id='o_field_input_18']")
    public WebElement lunch;
    @FindBy(xpath = "//input[@id='o_field_input_21']")
    public WebElement quantityNm;

    @FindBy(xpath = "//input[@id='o_field_input_20']")
    public WebElement unitPrice;
    @FindBy(xpath = "//*[@id='ui-id-3']/li")
    public List<WebElement> productList;
    @FindBy(xpath = "(//*[@class='o_form_buttons_edit']/button)[1]")
    public WebElement save;
    @FindBy(xpath ="//div/h1/span" )
    public WebElement Laetan;
    ////*[@id='o_field_input_734']

    @FindBy(xpath = "(//*[@id='ui-id-3']/li)[9]")
    public WebElement createAndEdit;

    @FindBy(xpath = "(//*[@id='ui-id-6']/li)[8]")
    public WebElement searchMore;

    @FindBy(xpath = "//*[@class='ui-sortable']/tr/td[4]")
    public List<WebElement> DepartmaneList;


    public WebElement selectRandomTextList(List<WebElement> ListName) {
        Random random = new Random();
        List<WebElement> weblist =ListName;
        int optionIndex = 1 + random.nextInt(weblist.size() - 3);


        return weblist.get(optionIndex);
    }


    }