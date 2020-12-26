package VyTrack_IY.step_definitions;

import VyTrack_IY.pages.LogoutPage;
import VyTrack_IY.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class logoutStepDefs {

    @When("user logged out")
    public void user_logged_out() {

       new LogoutPage().logout();

    }

    @Then("verify that title is {string}")
    public void verifyThatTitleIs(String title) {

        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(Driver.get().getTitle(),title);
    }
}
