package net.seamlessly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.Dashboard_Page;
import net.seamlessly.pages.LoginPage;
import net.seamlessly.utilities.ConfigurationReader;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;

public class LogOut_StepDefinitions {

    Dashboard_Page dashboardPage = new Dashboard_Page();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        Driver.getDriver().get("https://qa.seamlessly.net/");
        loginPage.loginSeamlessly("usernameOrMail", "validPass");
        Assert.assertTrue(dashboardPage.dashboardText.getText().contains(ConfigurationReader.getProperty("user4")));
    }

    @When("User clicks on profile menu button")
    public void user_clicks_on_profile_menu_button() {
        dashboardPage.settingsMenu.click();
    }

    @When("User clicks on log out button")
    public void user_clicks_on_log_out_button() {
        dashboardPage.logOutButton.click();
    }

    @Then("User should end up in login page")
    public void user_should_end_up_in_login_page() {
        Assert.assertTrue(new LoginPage().loginButton.isDisplayed());
    }

    @When("User clicks on the step back button")
    public void user_clicks_on_the_step_back_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("User should be still on the login page")
    public void user_should_be_still_on_the_login_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }



}
