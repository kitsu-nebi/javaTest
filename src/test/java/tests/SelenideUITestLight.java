package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelenideUITestLight {
    @BeforeEach
    public void start(){
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;
        open("https://authenticationtest.com/simpleFormAuth/");
        getWebDriver().manage().window().maximize();
    }

    @Test
    @Tag("ui-auth-selenide-light")
    @DisplayName("Selenide: auth")
    public void userCanLoginByUsernameLight() {
        $x("//input[@name='email']").setValue("simpleForm@authenticationtest.com");
        $x("//input[@name='password']").setValue("pa$$w0rd");
        $x("//input[@type='submit']").click();
        assertTrue($x("//h1[text()='Login Success']").isDisplayed());
    }
}
