package lesson10.pages;

import lesson10.Common;
import org.openqa.selenium.By;

public class LoginPage extends Common {

    private By login = By.xpath("//input[@placeholder='Lietotājvārds']");
    private By password = By.xpath("//input[@placeholder='Parole']");


    public void setLoginAndPassword(String name, String pass) {
        driver.findElement(login).sendKeys(name);
        driver.findElement(password).sendKeys(pass);
    }


    public void submit() {
        driver.findElement(password).submit();
    }


}
