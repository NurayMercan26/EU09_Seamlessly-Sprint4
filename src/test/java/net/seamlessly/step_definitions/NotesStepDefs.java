package net.seamlessly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.seamlessly.pages.NotesPage;

public class NotesStepDefs {

    NotesPage notesPage = new NotesPage();
    @Given("User click on the pencil icon top of the dashboard page")
    public void user_click_on_the_pencil_icon_top_of_the_dashboard_page() {
      notesPage.pencilIcon.click();
    }
    @When("User clicks on the New Note module")
    public void user_clicks_on_the_new_note_module() {
        notesPage.newNoteModule.click();
    }

   /*
    @Then("User can write notes on the page")
    public void user_can_write_notes_on_the_page() {

        notesPage.noteWritingPage.isDisplayed();
    }

    */


}
