package VyTrack_IY.step_definitions;

import VyTrack_IY.pages.LogoutPage;
import io.cucumber.java.en.When;

public class logoutStepDefs {

    @When("user logged out")
    public void user_logged_out() {

       new LogoutPage().logout();

    }

}
