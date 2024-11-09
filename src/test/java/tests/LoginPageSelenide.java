package tests;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPageSelenide {
    private String login = "//input[@name='email']";
    private String password = "//input[@name='password']";
    private String submit = "//input[@type='submit']";


    public void inputLogin(String username) {
        $x(login).setValue(username);
    }

    public void inputPassword(String pass) {
        $x(password).setValue(pass);
    }

    public void click() {
        $x(submit).click();
    }
}