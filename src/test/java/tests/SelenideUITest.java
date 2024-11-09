package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelenideUITest {
    LoginPageSelenide loginPage = new LoginPageSelenide();
    LoginSuccessSelenide successPage = new LoginSuccessSelenide();
    @BeforeEach
    public void start(){
        open(ConfProperties.getProperty("loginpage"));
        getWebDriver().manage().window().maximize();
    }

    @Test
    @Tag("ui-auth-selenide")
    @DisplayName("Selenide: auth")
    public void userCanLoginByUsername() {
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.click();
        assertTrue(successPage.isLoginSuccess());
    }
}
