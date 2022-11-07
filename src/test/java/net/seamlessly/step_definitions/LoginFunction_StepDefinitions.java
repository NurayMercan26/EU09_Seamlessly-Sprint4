package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.LoginPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.ConfigurationReader;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunction_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the Seamlessly login page")
    public void user_is_on_the_seamlessly_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly_login_page"));
    }

    @When("user types valid username {string}")
    public void userTypesValidUsername(String userName) {
        loginPage.username.sendKeys(userName);
    }


    @When("user types valid password to {string}")
    public void user_types_valid_password_to(String password) {
        loginPage.password.sendKeys(password);
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(loginPage.user_should_see_the_dashboard());
    }

//    @Then("user should log out")
//    public void userShouldLogOut() {
//        loginPage.settingsMenu.click();
//        BrowserUtils.sleep(2);
//        loginPage.logOutButton.click();
//    }

    @When("User types invalid username {string}")
    public void user_types_invalid_username(String username) {
        loginPage.username.sendKeys(username);
    }

    @When("User types invalid password to {string}")
    public void user_types_invalid_password_to(String password) {
        loginPage.password.sendKeys(password);
    }

    @When("user should see Wrong username or password warning")
    public void user_should_see_wrong_username_or_password_warning() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.wrongUsernameOrPasswordMessage));
        Assert.assertTrue(loginPage.wrongUsernameOrPasswordMessage.isDisplayed());
    }

    @When("User types empty username {string}")
    public void user_types_invalid_empty_username(String username) {
        loginPage.username.sendKeys(username);
    }
    @When("User types empty password to {string}")
    public void user_types_invalid_empty_password_to(String password) {
        loginPage.password.sendKeys(password);
    }

    @Then("Verify that user sees {string}")
    public void verifyThatUserSees(String errorOrAlertMessage) {

        loginPage.verifyErrorOrAlertMessage(errorOrAlertMessage);

    }

    @When("User types any value to password {string}")
    public void user_types_any_value_to_password(String password) {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("validPass"));
    }

    @Then("Verify that the password is invisible")
    public void verifyThatThePasswordIsInvisible() {
        Assert.assertTrue(loginPage.password.getAttribute("type").contains("password"));
    }


    @And("user clicks on log in button or press enter {string}")
    public void userClicksOnLogInButtonOrPressEnter(String buttonType){
        loginPage.userClicksOnLogInButtonOrPressEnter(buttonType);
    }

    @And("user press enter")
    public void userPressEnter() {
        loginPage.loginButton.sendKeys(Keys.ENTER);
    }

    @And("user should see a warning message {string}")
    public void userShouldSeeAWarningMessage(String expectedMessage) {
        loginPage.wrongUsernameOrPasswordMessage(expectedMessage);
    }

    @And("User clicks on the visible button next to the password placeholder")
    public void userClicksOnTheVisibleButtonNextToThePasswordPlaceholder() {
        loginPage.makeVisibleButton.click();
    }

    @Then("Verify that the password is visible")
    public void verifyThatThePasswordIsVisible() {

        String textType = loginPage.password.getAttribute("type");
        Assert.assertTrue(textType.equalsIgnoreCase("text"));
    }

    @When("User should see the Forgot Password link")
    public void user_should_see_the_forgot_password_link() {
        Assert.assertTrue(loginPage.forgotPasswordLink.isDisplayed());
    }
    @When("User clicks on the Forgot Password link")
    public void user_clicks_on_the_forgot_password_link() {
        loginPage.forgotPasswordLink.click();
    }
    @Then("User should see the Reset Password button")
    public void user_should_see_the_reset_password_button() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(loginPage.resetPasswordButton.isDisplayed());

    }

    @When("Verify that Username placeholder is displayed as expected")
    public void verifyThatUsernamePlaceholderIsDisplayedAsExpected() {
        Assert.assertEquals(loginPage.expectedUsernamePlaceholder,loginPage.username.getAttribute("placeholder"));
    }

    @Then("Verify that Password placeholder is displayed as expected")
    public void verifyThatPasswordPlaceholderIsDisplayedAsExpected() {
        Assert.assertEquals(loginPage.expectedPasswordPlaceholder,loginPage.password.getAttribute("placeholder"));
    }

    @Then("user clicks on log in button and lands on the dashboard page")
    public void userClicksOnLogInButtonAndLandsOnTheDashboardPage() {
        loginPage.loginButton.click();
        Assert.assertEquals("Dashboard - Seamlessly",Driver.getDriver().getTitle());
    }
}
