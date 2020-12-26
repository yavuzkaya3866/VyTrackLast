package VyTrack_IY.step_definitions;

import VyTrack_IY.pages.LoginPages;
import VyTrack_IY.pages.LoginTestPages;
import io.cucumber.java.en.When;

public class LoginTest {

    @When("user enter {string} {string}")
    public void user_enter(String username, String password) throws InterruptedException {
      new LoginTestPages().loginTest(username, password);

    }

}
