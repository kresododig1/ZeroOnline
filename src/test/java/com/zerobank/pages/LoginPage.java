package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "input#user_login")
    public WebElement loginBox;

    @FindBy (css = "input#user_password")
    public WebElement passwordBox;

    @FindBy (css = "input.btn.btn-primary")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;


}
