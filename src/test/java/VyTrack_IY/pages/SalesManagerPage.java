package VyTrack_IY.pages;

import VyTrack_IY.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SalesManagerPage extends BasePage {

public SalesManagerPage(){PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath = "//a[@title='Create Car']")
    public WebElement createCarButton;

    @FindBy(xpath = "//*[@data-name='field__license-plate']")
    public WebElement plateBox;

    @FindBy(xpath = "//*[@data-name='field__tags']")
    public List<WebElement>tagField;

    @FindBy(xpath = "//*[@data-name='field__driver']")
    public WebElement driverBox;

    @FindBy(xpath = "//*[@class='btn-success btn dropdown-toggle']")
    public WebElement dropdownButton;

    @FindBy(xpath = "//div[@class='btn-group pull-right open']/ul/li")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//a[ @title='Edit Car']")
    public WebElement editCarButton;

    @FindBy(xpath = "//a[ @title='Delete Car']")
    public WebElement deleteCarButton;

    @FindBy(xpath = "//*[@title='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//a[@title='Create Vehicles Model']")
    public WebElement createVehicleModelButton;

public void createModelAndVerify(){

    Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    createVehicleModelButton.click();
    String title ="Dashboard";
    Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Assert.assertTrue(title.equals(Driver.get().getTitle()));
}


public void createCar(){
    createCarButton.click();

    wait.until(ExpectedConditions.visibilityOf(plateBox));
    plateBox.sendKeys(rn.toString());
    driverBox.sendKeys(rn.toString());

    dropdownButton.click();

    wait.until(ExpectedConditions.visibilityOf(saveAndCloseButton));

    saveAndCloseButton.click();

    wait.until(ExpectedConditions.visibilityOf(editCarButton));


}



}
