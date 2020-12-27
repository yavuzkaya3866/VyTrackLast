package VyTrack_IY.pages;

import VyTrack_IY.utilities.BrowserUtils;
import VyTrack_IY.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    Random rn = new Random();

    WebDriverWait wait = new WebDriverWait(Driver.get(),10);


   //LOADER MASK
   @FindBy(css = "div[class='loader-mask shown']")
   @CacheLookup
   protected WebElement loaderMask;

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



  public void navigateToModule(String tab, String module) {

      String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
      String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";

      WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
      WebElement moduleElement = Driver.get().findElement(By.xpath(moduleLocator));

      new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
      wait.until(ExpectedConditions.visibilityOf(moduleElement));

      new Actions(Driver.get()).moveToElement(moduleElement).pause(200).doubleClick(moduleElement).build().perform();
      BrowserUtils.waitFor(5);


      System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());


  }


}














