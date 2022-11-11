package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{



    @FindBy(id="displayname")
    public WebElement fullName;


    @FindBy(xpath = "//*[@id=\"phoneform\"]/h3/a")
    public WebElement menuItem;

    @FindBy(xpath = "//div/ul//a[@class='menuitem action action-v2-private permanent active']")
    public WebElement privateButton;


    @FindBy(id="phone")
    public WebElement phone;

    @FindBy(id="localeinput")
    public WebElement LocaleInput;


    @FindBy(xpath = "//a[@class='federation-menu']//ul//Li//a")
    public WebElement btnPrivate;


   @FindBy(xpath = "//label[@for='displayname']")
    public WebElement nameHolder;


   @FindBy(xpath = "//label[@for='email']")
    public WebElement emailTrue;

   @FindBy(xpath = "//*[@id=\"personal-settings-avatar-container\"]/div[2]/h3")
    public WebElement ProfilePicture;
}
