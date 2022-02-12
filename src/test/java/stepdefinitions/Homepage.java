package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Step;
import org.testng.Assert;
import utility.DriverHolder;

public class Homepage {


    @Given("When user open url: {string}")
    public void whenUserOpenUrl(String url) {
        DriverHolder.getDriver().get(url);
    }

    @Then("validate youtube page is loaded properly")
    public void validateYoutubePageIsLoadedProperly() {
        Assert.assertEquals(DriverHolder.getDriver().getTitle().contains("YouTube"), true);
    }
}
