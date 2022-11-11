package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{


    @FindBy(id ="user")
    public WebElement inputUsername;

    @FindBy(id ="password")
    public WebElement inputPassword;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath= "//*[@id=\"expand\"]/div/img")
    public WebElement dropdownButton;

    @FindBy(xpath= "//img [@src = '/apps/settings/img/admin.svg?v=c77e0e80']")
    public WebElement SettingButton;
    @FindBy(xpath= "//div[@class='profile__header']")
    public WebElement Access;
    @FindBy(xpath= "//a[@class='primary profile__header__container__edit-button']")
    public WebElement Edit;


    @FindBy(xpath= "//a[@aria-label='Change privacy level of profile picture']")
    public WebElement ProfileButton;

    @FindBy(xpath= "//span[.='Synchronize to trusted servers and the global and public address book']")
    public WebElement publicButton;
    @FindBy(xpath= "//*[@id=\"expanddiv\"]/ul/li[5]/a\t")
    public WebElement logout;



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
}
