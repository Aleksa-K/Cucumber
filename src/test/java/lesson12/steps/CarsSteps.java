package lesson12.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lesson10.pages.CarsPage;
import lesson10.pages.HomePage;

public class CarsSteps {
    HomePage page = new HomePage();
    CarsPage cars = new CarsPage();


    @When("Open cars category")
    public void openCarsCategory() {
        page.chooseCarType();
    }


    @Then("^I choose min and max price$")
    public void iChooseMinPrice() {
        cars.setPrice("6000", "10000");
    }


    @And("^I select min year$")
    public void iChooseYearFrom() {
        cars.selectMinYear("2001");

    }

    @And("^I set engine type$")
    public void iSetEngineType() {
        cars.selectEngineCapacity("3.0");

    }

    @And("^I select color$")
    public void iSelectColor() {
        cars.selectColor("6318");


    }

    @And("^I press search button$")
    public void iPressSearchButton() {
        cars.pressSearchButton();
        page.stopDriver();
    }
}
