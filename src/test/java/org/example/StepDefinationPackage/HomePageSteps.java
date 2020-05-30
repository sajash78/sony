package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.HomeClassPackage.Homepage;

public class HomePageSteps {
    Homepage homepage= new Homepage();
    @Given("^user is on the sony website and searches play station$")
    public void user_is_on_the_sony_website_and_searches_play_station() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user is on the play station page$")
    public void user_is_on_the_play_station_page() throws Throwable {
        Thread.sleep(4000);
        homepage.games();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should be abe to see all relevant products$")
    public void user_should_be_abe_to_see_all_relevant_products() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}
