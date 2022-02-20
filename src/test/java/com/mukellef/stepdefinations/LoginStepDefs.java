package com.mukellef.stepdefinations;

import com.mukellef.pages.DashBoardMenuPage;
import com.mukellef.pages.LoginPage;
import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.ConfigurationReader;
import com.mukellef.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDefs {

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
       String url = ConfigurationReader.get("url");
       Driver.get().get(url);
    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
       new LoginPage().loginWithValid();
        BrowserUtils.wait(3);
    }

    @Then("Mukelef  panel page should be displayed")
    public void mukelef_panel_page_should_be_displayed(String expectedTitle) {
        BrowserUtils.wait(2);
        String actualTitle=Driver.get().getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
        BrowserUtils.wait(2);
        System.out.println("username :" + new LoginPage().getUsername());

    }
}
