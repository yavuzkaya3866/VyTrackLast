package VyTrack_IY.pages;

import VyTrack_IY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestPages {

    public LoginTestPages(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id="prependedInput2")
    public WebElement passwordBox;

    @FindBy(id="_submit")
    public  WebElement submitButton;

    public void loginTest(String username, String password) throws InterruptedException {

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();
        Thread.sleep(3000);
    }

}
