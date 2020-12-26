package VyTrack_IY.pages;

import VyTrack_IY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class LogoutPage extends BasePage {

    public LogoutPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//li[@id='user-menu']")
    public WebElement logoutMenu;

    @FindBy(xpath = "//a[@class='no-hash']")
    public WebElement logoutButton;


    public void logout(){

        logoutMenu.click();

        Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(logoutButton));

        logoutButton.click();

    }

}
