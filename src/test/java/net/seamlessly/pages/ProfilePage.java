package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{



    @FindBy(id="displayname")
    public WebElement fullName;

    @FindBy(id="email")
    public WebElement Email;

    @FindBy(xpath = "//span[@class='icon-federation-menu icon-link']")
    public WebElement menuItem;

    @FindBy(xpath = "//span[.='Only visible to people matched via phone number integration through Talk on mobile']")
    public WebElement privateButton;

    @FindBy(id="phone")
    public WebElement phone;

    @FindBy(id="localeinput")
    public WebElement LocaleInput;

    @FindBy(xpath = "//span[@class=\"icon-checkmark hidden\"]")
    public WebElement hiddenPhone;

   @FindBy(xpath = "//div[@class='displayname__actions-container']")
    public WebElement nameHolder;
   //
}
