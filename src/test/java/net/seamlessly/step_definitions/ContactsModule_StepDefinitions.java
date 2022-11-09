package net.seamlessly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.ContactsModule_Page;

public class ContactsModule_StepDefinitions {

    ContactsModule_Page contactsModule_page = new ContactsModule_Page();

    //module name finds the modules on the dashboard
    @When("User clicks on {string} module")
    public void userClicksOnModule(String moduleName) {
        contactsModule_page.navigateToModule(moduleName);
    }

    @Then("User clicks on {string} module from the right side")
    public void userClicksOnModuleFromTheRightSide(String moduleName) {
        contactsModule_page.navigateToRightSideModules(moduleName);
    }

    @Then("User clicks on {string} button from profile menu")
    public void userClicksOnButtonFromProfileMenu(String moduleName) {
        contactsModule_page.settingsMenu(moduleName);
    }
}
