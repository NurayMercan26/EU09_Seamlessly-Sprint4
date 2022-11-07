package net.seamlessly.step_definitions;

import io.cucumber.java.en.When;
import net.seamlessly.pages.ContactsModule_Page;

public class ContactsModule_StepDefinitions {

    ContactsModule_Page contactsModule_page = new ContactsModule_Page();

    @When("User clicks on {string} module")
    public void userClicksOnModule(String moduleName) {

        contactsModule_page.navigateToModule(moduleName);

    }
}
