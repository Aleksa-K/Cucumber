package lesson10;

import lesson10.pages.DogsPage;
import lesson10.pages.HomePage;

public class MySecondTest {
    public static void main(String[] args) {
        HomePage homepage = new HomePage();
        DogsPage dogs = new DogsPage();
        homepage.startPage("https://www.ss.com/");
        homepage.chooseDogsType();
        dogs.setAge("3", "25");
        dogs.pressSearchButton();


        homepage.stopDriver();
    }
}
