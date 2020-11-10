package lesson12.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import lesson10.pages.HomePage;



public class ComonSteps {
    HomePage page = new HomePage();

    @Given("Open Chrome browser")
    public void iOpenChromeBrowser() {
        System.out.println("I am here");


    }

    @And("^I open (.*)$")
    public void iOpenHttpsWwwSsCom(String url) {
        page.startPage(url);
    }

}