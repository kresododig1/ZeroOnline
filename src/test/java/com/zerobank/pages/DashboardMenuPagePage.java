package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardMenuPagePage {

    public DashboardMenuPagePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(className = "active")
    public WebElement selectedMenu;

    @FindBy (css = "a.dropdown-toggle ")
    public WebElement settingsAvatar;

}
