package lesson12.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lesson10.pages.DogsPage;
import lesson10.pages.HomePage;

public class DogsSteps {
    HomePage page = new HomePage();
    DogsPage dogs = new DogsPage();


    @Then("Open dogs category")
    public void openDogsCategory() {
        page.chooseDogsType();
    }

    @And("^I set dogs min and max age$")
    public void iSetDogsMinAndMaxAge() {
        dogs.setAge("3", "25");
    }
}
