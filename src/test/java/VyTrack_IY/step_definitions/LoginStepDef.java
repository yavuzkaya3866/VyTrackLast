package VyTrack_IY.step_definitions;

import VyTrack_IY.pages.LoginPages;
import VyTrack_IY.utilities.ConfigurationReader;
import VyTrack_IY.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user logged in as {string}")
    public void the_user_logged_in_as(String user) throws InterruptedException {

        LoginPages loginPages = new LoginPages();
        loginPages.login(user);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String title) {

        Assert.assertEquals(Driver.get().getTitle(),title);

    }
}
