package net.seamlessly.pages;

import net.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logOutButton;

    @FindBy(id = "settings")
    public WebElement settingsMenu;

    @FindBy(xpath = "//*[@id='appmenu']/li[1]")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@id='appmenu']/li[2]")
    public WebElement filesModule;

    @FindBy(xpath = "//*[@id='appmenu']/li[3]")
    public WebElement photosModule;

    @FindBy(xpath = "//*[@id='appmenu']/li[3]")
    public WebElement activityModule;

    @FindBy(xpath = "(//li[@data-id='contacts'])[1]")
    public WebElement contactsModuleButton;

    @FindBy(xpath = "(//li[@data-id='contacts'])[1]/following-sibling::li[1]")
    public WebElement calendarModule;

    @FindBy(xpath = "(//li[@data-id='contacts'])[1]/following-sibling::li[2]")
    public WebElement notesModule;

    @FindBy(xpath = "(//li[@data-id='contacts'])[1]/following-sibling::li[3]")
    public WebElement deckModule;

    @FindBy(xpath = "(//li[@data-id='contacts'])[1]/following-sibling::li[4]")
    public WebElement tasksModule;


    public void navigateToModule(String moduleName){
        WebElement moduleButton = Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//li[@data-id='"+moduleName.toLowerCase()+"']"));
        moduleButton.click();
    }

    public void navigateToRightSideModules(String moduleName) {
        WebElement moduleButton = Driver.getDriver().findElement(By.xpath("//div[@class='header-right']//div//div[@aria-label='" + moduleName + "']"));
        moduleButton.click();
    }

        public void settingsMenu(String moduleName){

            if(moduleName.equals(" View profile ".trim())){
                WebElement viewProfile = Driver.getDriver().findElement(By.xpath("//a[@class='user-status-menu-item__header']"));
                viewProfile.click();
            } else {
                WebElement menuElement= Driver.getDriver().findElement(By.xpath("//nav//li[@data-id='"+moduleName.toLowerCase()+"']"));
                menuElement.click();
                //Settings, About, Help and Log out buttons can be called with this method
            }


        }
    }


