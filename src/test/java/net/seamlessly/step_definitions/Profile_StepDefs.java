package net.seamlessly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.ProfilePage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profile_StepDefs {
     ProfilePage profilePage = new ProfilePage();


    @When("user see fullname {string}")
    public void user_see_fullname(String string) {
        Driver.getDriver().get("https://qa.seamlessly.net/index.php/settings/user");
        BrowserUtils.waitFor(10);
        Assert.assertTrue(profilePage.nameHolder.getText().contains("Nuray Mercan"));
    }
    @When("user see email {string}")
    public void user_see_email(String string) {
        BrowserUtils.waitFor(10);
        Assert.assertTrue(profilePage.Email.getText().contains("nuraymercan26@gmail.com"));
    }
    @When("user see phone number {string}")
    public void user_see_phone_number(String string) {
        profilePage.phone.sendKeys(string);
        BrowserUtils.waitFor(10);
        Assert.assertTrue(profilePage.hiddenPhone.getText().contains("05064251472"));
    }

    @Then("user see verify that  titles inside personal info")
    public void user_see_verify_that_titles_inside_personal_info() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("settings"));
        BrowserUtils.verifyURLContains("settings");
        System.out.println("user see verify that  titles inside personal info");
    }

    @When("user go to profile info page")
    public void user_go_to_profile_info_page() {
        Driver.getDriver().get("https://qa.seamlessly.net/index.php/settings/user");
    }
    @When("user clear old full name")
    public void user_clear_old_full_name() {
       profilePage.fullName.clear();
    }
    @When("user change  full name {string}")
    public void user_change_full_name(String string) {
        profilePage.fullName.sendKeys(string);
    }
    @Then("user see verify that  new full name")
    public void user_see_verify_that_new_full_name() {
        Assert.assertTrue(profilePage.fullName.getText().contains("HoneyBee"));
        System.out.println("user see verify that  new full name");
    }

    @When("user click private button on phone number button")
    public void user_click_private_button_on_phone_number_button() {
        Driver.getDriver().get("https://qa.seamlessly.net/index.php/settings/user");
        profilePage.menuItem.click();
        profilePage.privateButton.click();
    }

    @When("user write phone number {string}")
    public void user_write_phone_number(String string) {
        profilePage.phone.sendKeys("string");
    }

    @Then("user see verify that phone number info as private under Profile Settings page")
    public void user_see_verify_that_phone_number_info_as_private_under_profile_settings_page() {
        Assert.assertTrue(profilePage.phone.getText().contains("05064251472"));
        System.out.println("user see verify that phone number info as private under Profile Settings page");

    }

    @When("user select local time under the local dropdown")
    public void user_select_local_time_under_the_local_dropdown() {
        Driver.getDriver().get("https://qa.seamlessly.net/index.php/settings/user");

    }
    @Then("user see verify that current local time {string} under the Local dropdown")
    public void user_see_verify_that_current_local_time_under_the_local_dropdown(String string) {
        WebElement Locale = profilePage.LocaleInput;
        Select MultiLocale = new Select(Locale);
        MultiLocale.selectByVisibleText("Turkish");
        BrowserUtils.waitFor(10);
        Assert.assertTrue(profilePage.LocaleInput.getText().contains("Turkish"));
    }
}
