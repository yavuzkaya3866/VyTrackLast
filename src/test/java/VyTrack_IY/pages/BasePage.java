package VyTrack_IY.pages;

import VyTrack_IY.utilities.Driver;
import VyTrack_IY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.get(),10);


   //LOADER MASK
    @FindBy(css = ".loader-mask")
    public WebElement loaderMask;

    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);

            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //SUBTITLE
    @FindBy(css = ".oro-subtitle")
    public WebElement subtitle;

    public String getSubtitle() {
        waitUntilLoaderScreenDisappear();
        return subtitle.getText();
    }




    //USER MENU /DROPDOWN
    @FindBy(id = "#user-menu")
    public List<WebElement>userMenu;


    public List<String>getUserMenu(){
        List<String> userMenuList = new ArrayList<>();
        for (WebElement menu : userMenu) {
            userMenuList.add(menu.getText());
        }
        return userMenuList;
    }

    //MAIL ICON
    @FindBy(className = "mail-icon")
    public WebElement mailIcon;





}














