package tests;

import static com.codeborne.selenide.Selenide.$x;

public class LoginSuccessSelenide {

    private String LoginSuccess = "//h1[text()='Login Success']";


  public boolean isLoginSuccess() {
        return $x(LoginSuccess).isDisplayed();
  }
}