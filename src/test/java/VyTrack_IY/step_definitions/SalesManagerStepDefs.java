package VyTrack_IY.step_definitions;

import VyTrack_IY.pages.DriverPage;
import VyTrack_IY.pages.SalesManagerPage;
import VyTrack_IY.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesManagerStepDefs {

    WebDriverWait wait = new WebDriverWait(Driver.get(),10);
    SalesManagerPage salesManagerPage = new SalesManagerPage();

    @When("user navigate to {string} and {string}")
    public void user_navigate_to_and(String tab, String module) throws InterruptedException {

        salesManagerPage.navigateToModule(tab, module);

    }


    @When("user create a new car")
    public void userCreateANewCar() {
        salesManagerPage.createCar();
    }

    @When("user create a car and cancel creating the car")
    public void userCreateACarAndCancelCreatingTheCar() {

        new DriverPage().waitUntilLoaderScreenDisappear();
        salesManagerPage.createCarButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesManagerPage.plateBox));

        salesManagerPage.cancelButton.click();
        wait.until(ExpectedConditions.titleIs("All - Car - Entities - System - Car - Entities - System"));


    }




    @And("user push the Create Vehicles Model button and verify by title")
    public void userPushTheCreateVehiclesModelButtonAndVerifyByTitle() {
       salesManagerPage.createModelAndVerify();
    }
}
