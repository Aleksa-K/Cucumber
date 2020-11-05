package lesson10;

import lesson10.pages.CarsPage;
import lesson10.pages.HomePage;

public class MyFirstTest {
    public static void main(String[] args) {
        HomePage homepage = new HomePage();
        CarsPage cars = new CarsPage();
        homepage.startPage("https://www.ss.com/");
        homepage.chooseCarType();
        cars.setPrice("6000", "10000");
        cars.selectMinYear("2001");
        cars.selectEngineCapacity("3.0");
        cars.selectColor("6318");
        cars.pressSearchButton();


        homepage.stopDriver();


    }
}
