package VyTrack_IY.pages;

import VyTrack_IY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DriverPage extends BasePage{

    public DriverPage() {
        PageFactory.initElements(Driver.get(), this);
    }


public void verifyMenu(){

    List<String> expectedList = new ArrayList<>();
    expectedList.add("Fleet");
    expectedList.add("Customers");
    expectedList.add("Activities");
    expectedList.add("System");

    System.out.println(expectedList);

}
    //ThreeLines Button
    @FindBy(className = "oro-dropdown-toggle")
    public WebElement threeLines;

    //Three Lines Menu
    @FindBy(css = ".nav.nav-tabs>li")
    public List<WebElement>threeLineMenu;

    public List<String> getThreeLineMenu(){

        List<String> actualThreeMenu = new ArrayList<>();

        for (WebElement lineMenu : threeLineMenu) {
            actualThreeMenu.add(lineMenu.getText());
        }
        return actualThreeMenu;
    }


    public void verifyThreeLine(List<String> expectedThree){


        assert expectedThree.containsAll(getThreeLineMenu());


    }

    }





