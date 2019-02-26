package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ExpensesToSummitPage extends CreatePage {

    public ExpensesToSummitPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/ul/li)[6]")
    public WebElement ExpensesToSummit;

    @FindBy(xpath = "(//div[@class='oe_secondary_menu']/div)[8]")
    public WebElement MyExpenses;

    @FindBy(xpath ="//*[@accesskey='c']" )
    public  WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_list_buttons']/button)[2]")
    public WebElement importButton;


    @FindBy(xpath = "//div[@class='o_cp_buttons']/div/button")
    public List<WebElement> buttonList;// it includes import, create,save, discard button

    @FindBy(xpath = "//input[@id='o_field_input_21']")
    public WebElement quantityNm;



    public List<String> checktitle() {

        List<String > functions = new ArrayList<>();

        functions.add(ExpensesToSummit.getText());
        functions.add(MyExpenses.getText());
        functions.add(createButton.getText());
        functions.add(importButton.getText());


        return functions;

    }
    public  void   buttonList(String links) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

        switch (links){
            case "Create":
                BrowserUtils.waitForClickablility(createButton,5);
                createButton.click();
                // Driver.getDriver().navigate().back();
                break;
            case "Import":

                wait.until(ExpectedConditions.visibilityOf(importButton));
                importButton.click();
                // Driver.getDriver().navigate().back();
                break;
        }




    }



}
