package lesson10.pages;

import lesson10.Common;
import org.openqa.selenium.By;

public class DogsPage extends Common {

    private By dogsMinAge = By.id("f_o_1276_min");
    private By dogsMaxAge = By.id("f_o_8_max");
    private By searchButton = By.xpath("//input[@class='b s12']");

    public void setAge(String min, String max) {
        driver.findElement(dogsMinAge).sendKeys(min);
        driver.findElement(dogsMaxAge).sendKeys(max);
    }

    public void pressSearchButton() {
        driver.findElement(searchButton).click();
    }
}
