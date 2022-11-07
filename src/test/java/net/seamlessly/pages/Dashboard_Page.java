package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Page extends BasePage{

    @FindBy(xpath = "(//div[@id='app-dashboard']//h2)[1]")
    public WebElement dashboardText;
}
