package lesson10.pages;

import lesson10.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarsPage extends Common {

    private By minYear = By.id("f_o_18_min");
    private By minPrice = By.id("f_o_8_min");
    private By maxPrice = By.id("f_o_8_max");
    private By color = By.id("f_o_17");
    private By engine = By.id("f_o_15_min");
    private By searchButton = By.xpath("//input[@class='b s12']");


    public void selectMinYear(String year) {
        Select minYearSelector = new Select(driver.findElement(minYear));
        minYearSelector.selectByValue(year);

    }

    public void setPrice(String minP, String maxP) {
        driver.findElement(minPrice).sendKeys(minP);
        driver.findElement(maxPrice).sendKeys(maxP);
    }

    public void selectEngineCapacity(String engineCapacity) {
        Select engineSelector = new Select(driver.findElement(engine));
        engineSelector.selectByValue(engineCapacity);
    }

    public void selectColor(String colorID) {
        Select colorSelector = new Select(driver.findElement(color));
        colorSelector.selectByValue(colorID);

    }


    public void pressSearchButton() {
        driver.findElement(searchButton).click();
    }
}

