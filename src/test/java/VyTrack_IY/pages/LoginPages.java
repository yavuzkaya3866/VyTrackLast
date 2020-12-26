package VyTrack_IY.pages;

import VyTrack_IY.utilities.ConfigurationReader;
import VyTrack_IY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    public LoginPages(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id="prependedInput2")
    public WebElement passwordBox;

    @FindBy(id="_submit")
    public  WebElement submitButton;

    public void login(String user) throws InterruptedException {
        switch (user) {
            case "driver":
                usernameBox.sendKeys(ConfigurationReader.get("driver_username"));
                passwordBox.sendKeys(ConfigurationReader.get("driver_password"));
                submitButton.click();
                Thread.sleep(2000);
                break;
            case "sales manager":
                usernameBox.sendKeys(ConfigurationReader.get("sales_manager_username"));
                passwordBox.sendKeys(ConfigurationReader.get("sales_manager_password"));
                submitButton.click();
                Thread.sleep(2000);
                break;
            case "store manager":
                usernameBox.sendKeys(ConfigurationReader.get("store_manager_username"));
                passwordBox.sendKeys(ConfigurationReader.get("store_manager_password"));
                submitButton.click();
                Thread.sleep(2000);
                break;
            default:
                System.out.println("user name or password does not match");
                break;
        }



    }

}
