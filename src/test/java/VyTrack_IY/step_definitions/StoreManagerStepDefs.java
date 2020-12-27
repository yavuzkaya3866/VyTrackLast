package VyTrack_IY.step_definitions;

import VyTrack_IY.pages.StoreManagerPages;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class StoreManagerStepDefs {

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOption) {

        List<String> actualOption = new StoreManagerPages().getUserMenu();
        for (String s : menuOption) {
            System.out.println("s = " + s);
            Assert.assertTrue(menuOption.contains(s));

        }

    }
}
