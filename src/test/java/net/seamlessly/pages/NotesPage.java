package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage extends BasePage{

@FindBy(xpath = "//*[@id='appmenu']/li[7]/a")
    public WebElement pencilIcon;

@FindBy(id = "notes_new_note")
    public WebElement newNoteModule;

   @FindBy(xpath = "//pre[@role='presentation'][1]")
   public WebElement noteWritingPage;


}
