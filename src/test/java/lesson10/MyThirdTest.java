package lesson10;

import lesson10.pages.HomePage;
import lesson10.pages.LoginPage;

public class MyThirdTest {
    public static void main(String[] args) {
        HomePage homepage = new HomePage();
        LoginPage login = new LoginPage();
        homepage.startPage("https://www.forumcinemas.lv/");
        homepage.pressLoginPage();
        login.setLoginAndPassword("goldshark@inbox.lv", "rocky2015");
        login.submit();

        homepage.stopDriver();

    }
}