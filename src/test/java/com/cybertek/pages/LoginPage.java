package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Sign in")
    public WebElement signInBtn;

    @FindBy(linkText = "BriteErpDemo")
    public WebElement demo;

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//button)[2]")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[6]")
    public WebElement ExpensesButton;


    public void logIn(String email,String password) {

        //demo.click();
       this.email.sendKeys(email);
       this.password.sendKeys(password);
       loginButton.click();

    }
}