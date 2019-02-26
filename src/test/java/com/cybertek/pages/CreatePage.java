package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CreatePage {

    public CreatePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='o_statusbar_buttons']")
    public WebElement submitToManagar;



    @FindBy(xpath = "//div[@class='oe_title']/label")
    public WebElement ExpenseDescription;

    @FindBy(xpath = "(//div[@class='o_form_buttons_edit']/button)[1]")
    public WebElement save;

    @FindBy(xpath = "//span[@class='o_stat_text']")
    public WebElement document;



    @FindBy(xpath = "(//div[@class='o_form_buttons_edit']/button)[2]")
    public WebElement discard;

    public List<String> createTitle(){
        List<String > nameList = new ArrayList<>();
        nameList.add(submitToManagar.getText());
        nameList.add(ExpenseDescription.getText());
        nameList.add(save.getText());
        nameList.add(discard.getText());
        nameList.add(document.getText());
        return nameList;
    }
}
