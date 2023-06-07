package com.zerobank.step_definitions;

import com.zerobank.pages.DashboardMenuPagePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginStepDefinition {

    LoginPage loginPage = new LoginPage();
    DashboardMenuPagePage dashboardMenuPagePage = new DashboardMenuPagePage();

    @Given("I am on the Login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get("http://zero.webappsecurity.com/index.html");
        WebElement signInButton = Driver.getDriver().findElement(By.cssSelector("button#signin_button"));
        signInButton.click();

    }
    @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {

        loginPage.loginBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);
        loginPage.signInButton.click();
        Driver.getDriver().navigate().back();
    }
    @Then("the Account Summary page should be displayed")
    public void the_Account_summary_page_should_be_displayed() {

        System.out.println("dashboardMenuPagePage.usernameAvatar.getText() = " + dashboardMenuPagePage.settingsAvatar.getText());
        Assert.assertTrue(dashboardMenuPagePage.settingsAvatar.isDisplayed());
    }

    @Then("Error message {string} should be displayed.")
    public void errorMessageShouldBeDisplayed(String errorMessage) {

        String expectedErrorMessage = errorMessage;
        String actualErrorMessage = loginPage.errorMessage.getText();

        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @When("I login with username {string} and password {string}.")
    public void iLoginWithUsernameAndPassword(String username, String password) {

        loginPage.loginBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);
        loginPage.signInButton.click();
    }
}
