package lesson12.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TattooSteps {
    private ChromeDriver driver = null;

    @Given("^Open the Chrome browser$")
    public void openTheChromeBrowser() {
        String driverpath = "C:\\Users\\Windows\\IdeaProjects\\GradleTestProject\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Then("^Go to (.*)$")
    public void goToHttpsWwwAliexpressCom(String url) {
        driver.navigate().to(url);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("^I enter search term$")
    public void iEnterSearchTermTattoo() {
        driver.findElement(By.id("search-key")).sendKeys("Tattoo");


    }

    @And("^Turn off popup windows$")
    public void turnOffPopupWindows() {
        driver.switchTo().frame("pc_1455_24317_20201110");
        driver.findElements(By.xpath("//img[@class='rax-image ']")).get(1).click();
        driver.switchTo().defaultContent();
    }

    @When("^I press search$")
    public void iDoSearch() {
        driver.findElement(By.xpath("//input[@class='search-button']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @And("^I set min price$")
    public void iSetMinAndMaxPrice() {
        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
    }

    @And("^I set max price$")
    public void iSetMaxPrice() {
        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
    }


    @And("^I press ok$")
    public void iPressOk() {
        driver.findElement(By.xpath("//a[@href='javascript:void(0);']")).click();

    }

    @Then("^I turn off another popup window$")
    public void iTurnOffAnotherPopupWindow() {
        driver.switchTo().frame("next-dialog-body");
        driver.findElements(By.xpath("//a[@class='next-dialog-close']")).get(1).click();
        driver.switchTo().defaultContent();
    }


}